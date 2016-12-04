(ns show.steps.step6
  (:require
    [reagent.core :as reagent]
    [re-frame.core :as re-frame]
    [re-frisk.core :as re-frisk]
    [cljs.spec :as s]
    [show.slides.views :as views]))

(declare slides)

(defn slideshow []
  [:div.slideshow-half-width
   [:div.slide
    [(nth slides 0)]]])

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

(def slides
  [title-slide])

(defn mount-root []
  (reagent/render
    [slideshow]
    (js/document.getElementById "app")))

(defn on-jsload []
  (mount-root))

(defn ^:export run []
  (re-frisk/enable-re-frisk!
    {:x 0 :y 0})
  (mount-root))
