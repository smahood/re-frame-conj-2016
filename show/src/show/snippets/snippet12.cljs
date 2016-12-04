(defn check-int-spec [val]
  (s/valid? (s/spec int?) val))

(re-frame/reg-event-fx
  :slideshow/next-slide
  (fn [{:keys [db event] :as context}]
    (re-frisk/add-data (first event)
      {:context context
       :db      db
       :event   event})
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
         :spec/error {:event (first event)
                      :message ":slideshow/current-slide is not a valid int"})})))

