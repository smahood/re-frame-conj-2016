(def log-to-re-frisk
  (re-frame/->interceptor
    :id :log-to-re-frisk
    :before (fn [context]
              (re-frisk/add-in-data
                [:event-log
                 (first (get-in context [:coeffects :event]))
                 :before] context)
              context)
    :after (fn [context]
             (re-frisk/add-in-data
               [:event-log
                (first (get-in context [:coeffects :event]))
                :before] context)
             context)))


(re-frame/reg-event-fx
  :slideshow/next-slide
  [log-to-re-frisk]
  (fn [{:keys [db event] :as context}]
    (if
      (check-int-spec
        (:slideshow/current-slide db))
      {:db
       (assoc db
         :slideshow/current-slide
         (if (< (:slideshow/current-slide db)
                (count slides))
           (+ 1 (:slideshow/current-slide db))
           (:slideshow/current-slide db)))}
      {:db
       (assoc db
         :spec/error {:event   (first event)
                      :message ":slideshow/current-slide is not a valid int"})})))

(re-frame/reg-event-fx
  :slideshow/prev-slide
  [log-to-re-frisk]
  (fn [{:keys [db event] :as context}]
    (if
      (check-int-spec
        (:slideshow/current-slide db))
      {:db
       (assoc db
         :slideshow/current-slide
         (if (> (:slideshow/current-slide db) 0)
           (- (:slideshow/current-slide db) 1)
           (:slideshow/current-slide db)))}
      {:db
       (assoc-in db
                 :spec/error {:event   (first event)
                              :message ":slideshow/current-slide is not a valid int"})})))

