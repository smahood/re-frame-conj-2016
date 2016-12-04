(re-frame/reg-event-fx
  :slideshow/next-slide
  (fn [{:keys [db event] :as context}]
    (re-frisk/add-data
      :slideshow/next-slide
      {:context context
       :db      db
       :event   event})
    {}))

