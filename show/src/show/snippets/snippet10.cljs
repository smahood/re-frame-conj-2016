(re-frame/reg-event-fx
  :slideshow/next-slide
  (fn [context]
    (re-frisk/add-data
      :slideshow/next-slide
      {:context context})
    {}))

