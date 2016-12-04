(defn mount-root []
  (reagent/render
    [slideshow]
    (js/document.getElementById "app")))

(mount-root)

