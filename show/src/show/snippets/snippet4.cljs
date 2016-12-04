(defn on-jsload []
  (mount-root))

(defn ^:export run []
  (re-frisk/enable-re-frisk!
    {:x 0 :y 0})
  (mount-root))

