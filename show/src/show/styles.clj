(ns show.styles
  (:require [garden.core :refer [css style]]
            [garden.def :refer [defstyles]]
            [garden.units :refer [px percent]]
            [garden.color :refer [hsl]]))

(def projector-width 1280)
(def projector-height 720)
(def half-width 640)

(def title-slide-height 599)
(def body-height 500)
(def footer-height 200)

(def h1-size 60)
(def h2-size 50)
(def h3-size 40)
(def font-size 32)

(def re-frame-primary "#2A3764")
(def link "#D36700")
(def primary-bgcolor "#EBE5DB")
(def secondary-bgcolor "#D7CFC3")

(def body
  [:body {:background-color primary-bgcolor
          :font-family      "'Ubuntu', regular"
          :color            re-frame-primary
          :min-width        (px half-width)
          :max-width        (px projector-width)
          :min-height       (px projector-height)
          :max-height       (px projector-height)
          :overflow         "hidden"
          :padding-top      (px 0)
          :margin-top       (px 0)}
   [:h1 {:font-size (px h1-size)}]
   [:h2 {:font-size (px h2-size)}]
   [:h3 {:font-size (px h3-size)}]
   [:.highlight {:background-color secondary-bgcolor}]])


(def slideshow
  [[:div.slideshow-full-width
    {:display    "inline-block"
     :min-height (px projector-height)
     :max-height (px projector-height)
     :min-width  (px projector-width)
     :max-width  (px projector-width)}]
   [:div.slideshow-half-width
    {:display    "inline-block"
     :min-height (px projector-height)
     :max-height (px projector-height)
     :min-width  (px half-width)
     :max-width  (px half-width)}]])

(def slide
  [:div.slide {:width "100%"}
   [:a {:color link}]

   [:div.slide-header {:font-size        (px h1-size)
                       :text-align       "center"
                       :padding-top      (px 20)
                       :padding-bottom   (px 10)
                       :margin-bottom    0
                       :border-bottom    "solid"
                       :border-color     re-frame-primary
                       :border-width     (px 2)
                       :background-color secondary-bgcolor}
    [:hr {:margin-bottom 0}]]

   [:div.slide-body {:height      (px body-height)
                     :padding-top (px 20)}
    [:div.list {:margin-top    (px 20)
                :margin-bottom (px 20)
                :margin-left   (px 50)
                :font-size     (px font-size)}]]
   [:div.slide-footer {:min-height      footer-height
                       :height          footer-height
                       :max-height      footer-height
                       :border-width    (px 2)
                       :padding-bottom  (px 35)
                       :padding-top     "22px"
                       :margin-bottom   "-50px"
                       :border-color    re-frame-primary
                       :font-size       (px h2-size)
                       :display         "flex"
                       :justify-content "space-between"}]

   [:div.title-slide {:height     "100%"
                      :width      "100%"
                      :font-size  (px h1-size)
                      :text-align "center"}
    [:div.slide-body {:height (px title-slide-height)}]

    [:img.re-frame-logo {:margin-top (px 100)
                         :height     (px 100)}]
    [:img.cljs-logo {:height (px 150)}]

    [:div.slide-footer {:border-top       "solid"
                        :min-height       footer-height
                        :height           footer-height
                        :max-height       footer-height
                        :border-width     (px 2)
                        :padding-bottom   (px 35)
                        :padding-top      "22px"
                        :margin-bottom    "-50px"
                        :border-color     re-frame-primary
                        :font-size        (px h2-size)
                        :background-color secondary-bgcolor
                        :display          "flex"
                        :justify-content  "space-between"}]]])

(def slide-controls
  [[:span.controls {:display       "flex"
                    :cursor        "pointer"
                    :margin-right  "10px"
                    :border        "solid 4px"
                    :color         re-frame-primary
                    :border-color  re-frame-primary
                    :border-radius (px 50)
                    :height        (px h3-size)}]
   [:i.material-icons.control {:display      "flex"
                               :cursor       "pointer"
                               :font-size    (px h3-size)
                               :border-color "primary"}]
   [:.left]
   [:.right {:border-left "solid 4px"}]])

(defstyles screen
           body
           slideshow
           slide
           slide-controls)