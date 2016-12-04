(defn ^:export run []
  (re-frame/dispatch-sync
    [:slideshow/initialize])
  (re-frisk/enable-re-frisk!
    {:x 0 :y 0})
  (mount-root))
