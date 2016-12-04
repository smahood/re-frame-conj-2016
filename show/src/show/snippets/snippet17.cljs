(defn slideshow
  []
  [:div.slideshow-half-width
   [:div.slide
    [(nth slides
          @(re-frame/subscribe
             [:slideshow/current-slide]))]]])

