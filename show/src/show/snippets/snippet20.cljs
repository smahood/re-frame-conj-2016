(def check-slide-specs
  (re-frame/->interceptor
    :id :check-slides-specs
    :before (fn [context]
              ;(let [current-slide (get-in context [:coeffects :db :slideshow/current-slide]) ; Success
              (let [current-slide (get-in context [:coeffects :db :slideshow/broken-slide]) ; Failure
                    spec-result (check-int-spec current-slide)]
                (println "Current Slide: " current-slide)
                (println "Spec Result: " spec-result)
                (if spec-result
                  (assoc-in context [:db :spec/success]
                            {:event   (first (get-in context [:coeffects :event]))
                             :message ":slideshow/current-slide is an int!"})
                  (assoc-in context [:queue]
                            []))))))


(re-frame/reg-event-fx
  :slideshow/next-slide
  [log-to-re-frisk check-slide-specs]
  (fn [{:keys [db]}]
    {:db (assoc db
           :slideshow/current-slide
           (if (< (:slideshow/current-slide db)
                  (count slides))
             (+ 1 (:slideshow/current-slide db))
             (:slideshow/current-slide db)))}))

(re-frame/reg-event-fx
  :slideshow/prev-slide
  [log-to-re-frisk check-slide-specs]
  (fn [{:keys [db _]}]
    {:db (assoc db
           :slideshow/current-slide
           (if (> (:slideshow/current-slide db) 0)
             (- (:slideshow/current-slide db) 1)
             (:slideshow/current-slide db)))}))
