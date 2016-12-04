(defn intro-slide []
  [:div.intro-slide
   [:div.slide-header "marketing slide"]
   [:div.slide-body
    [:div.list "- Great for beginners and quick prototypes!"]
    [:div.list "- Great for large, complex apps!"]
    [:div.list "- Performant at scale!"]
    [:div.list "- Multiple production apps of 50,000 lines and more!"]]
   [slide-footer ""]])

(def slides
  [intro-slide])

