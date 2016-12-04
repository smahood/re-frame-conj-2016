(re-frame/reg-sub
  :slideshow/current-slide
  (fn [db _]
    (:slideshow/current-slide db)))
