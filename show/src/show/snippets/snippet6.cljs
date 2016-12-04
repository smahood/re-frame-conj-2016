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
   [slide-footer "Clojure/conj 2016"]])

