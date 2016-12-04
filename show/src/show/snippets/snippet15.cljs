(re-frame/reg-event-fx
  :slideshow/prev-slide
  (fn [{:keys [db event] :as context}]
    (re-frisk/add-data
      (first event)
      {:context context
       :db      db
       :event   event})
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

#_(re-frame/dispatch
    [:slideshow/prev-slide])

