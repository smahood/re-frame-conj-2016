(def initial-state
  {:slideshow/current-slide 0})

(re-frame/reg-event-fx
  :slideshow/next-slide
  (fn [context]
    {}))

#_(re-frame/dispatch
    [:slideshow/next-slide])

