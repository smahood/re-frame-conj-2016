(re-frame/reg-event-fx
  :slideshow/initialize
  (fn [{:keys [db]}]
    {:db initial-state}))

#_(re-frame/dispatch
    [:slideshow/initialize])
