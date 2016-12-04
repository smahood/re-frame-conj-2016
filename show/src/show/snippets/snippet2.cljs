(declare slides)

(defn slideshow []
  [:div.slideshow-half-width
   [:div.slide
    [(nth slides 0)]]])

(defn title-slide []
  [:div.title-slide
   [:div.slide-body
    [:br]
    [:div "Building a "]
    [:div "Presentation with"]
    [:img.re-frame-logo
     {:src   "img/re-frame-logo.png"
      :style {:margin-top "20px"}}]
    [:div "and"]
    [:img.cljs-logo
     {:src "img/cljs-logo.png"}]]
   [:div.slide-footer
    [:span ""]
    [:span "Clojure/conj 2016"]
    [:span ""]]])

(def slides
  [title-slide])

