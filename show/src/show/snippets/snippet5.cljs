(defn slide-footer
  [footer-text]
  [:div.slide-footer
   [:span ""]
   [:span footer-text]
   [:span.controls
    [:i.material-icons.control.left
     {:on-click
      #(re-frame/dispatch
        [:slideshow/prev-slide])}
     "chevron_left"]
    [:i.material-icons.control.right
     {:on-click
      #(re-frame/dispatch
        [:slideshow/next-slide])}
     "chevron_right"]]])

