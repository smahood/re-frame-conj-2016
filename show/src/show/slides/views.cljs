(ns show.slides.views)

(def primary "#2A3764")
(def secondary "#D36700")
(def secondary-bgcolor "#D7CFC3")
(def line-width 4)
(def font-size 32)

(defn h-line [x1 x2 y color arrow?]
  (if (<= x2 x1)
    [:g {:stroke color
         :fill   color}
     [:line {:x1           x1
             :x2           (+ x2 2)
             :y1           y
             :y2           y
             :stroke-width line-width}]
     (if arrow?
       [:polygon {:points [x2 y (+ x2 25) (- y 10) (+ x2 25) (+ y 10)]}])]

    [:g {:stroke color
         :fill   color}
     [:line {:x1           x1
             :x2           (- x2 2)
             :y1           y
             :y2           y
             :stroke-width line-width}]
     (if arrow?
       [:polygon {:points [x2 y (- x2 25) (- y 10) (- x2 25) (+ y 10)]}])]))

(defn v-line [y1 y2 x color arrow?]
  (if (<= y2 y1)
    [:g {:stroke color
         :fill   color}
     [:line {:x1           x
             :x2           x
             :y1           y1
             :y2           (+ y2 2)
             :stroke-width line-width}]
     (if arrow? [:polygon {:points [x y2 (- x 10) (+ y2 25) (+ x 10) (+ y2 25)]}])]
    [:g {:stroke color
         :fill   color}
     [:line {:x1           x
             :x2           x
             :y1           y1
             :y2           (- y2 2)
             :stroke-width line-width}]
     (if arrow? [:polygon {:points [x y2 (- x 10) (- y2 25) (+ x 10) (- y2 25)]}])]))

(defn rect-2 [x y width height text1 text2]
  [:g [:rect {:width        width
              :height       height
              :x            x
              :y            y
              :stroke-width line-width
              :stroke       primary
              :fill         secondary-bgcolor}]
   [:text {:x           (+ x (/ width 2))
           :y           (+ y (/ height 4) (/ font-size 2))
           :text-anchor "middle"
           :fill        primary}
    text1]
   [:text {:x           (+ x (/ width 2))
           :y           (+ y (* 3 (/ height 4)) 10)
           :text-anchor "middle"
           :fill        primary}
    text2]])

(def events-map
  {:domino-1 [rect-2 25 50 250 100 "Dispatch" "Event"]
   :domino-2 [rect-2 350 50 250 100 "Compute" "Effects"]
   :domino-3 [rect-2 350 225 250 100 "Realize" "Effects"]
   :domino-4 [rect-2 350 400 250 100 "Query" "App State"]
   :domino-5 [rect-2 25 400 250 100 "Compute" "Views"]
   :domino-6 [rect-2 25 225 250 100 "Realize" "Views"]
   :1->2     [h-line 275 350 100 primary true]
   :2->3     [v-line 150 225 450 primary true]
   :3->4     [v-line 327 398 450 secondary true]
   :4->5     [h-line 350 275 450 primary true]
   :5->6     [v-line 400 325 150 primary true]
   :6->1     [v-line 223 152 150 secondary true]})

(def domino-1
  [:div.slide-body {:style {:font-size    "40px"
                            :margin-left  0
                            :padding-left 0}}
   (let [width 1280
         height 600]
     [:svg {:width    width
            :height   height
            :view-box [0 0 1280 600]}
      [:g (:domino-1 events-map)]])])

(def domino-2
  [:div.slide-body {:style {:font-size    "40px"
                            :margin-left  0
                            :padding-left 0}}
   (let [width 1280
         height 600]
     [:svg {:width    width
            :height   height
            :view-box [0 0 1280 600]}
      [:g (:domino-1 events-map)
       (:domino-2 events-map)
       (:1->2 events-map)]])])

(def domino-3
  [:div.slide-body {:style {:font-size    "40px"
                            :margin-left  0
                            :padding-left 0}}
   (let [width 1280
         height 600]
     [:svg {:width    width
            :height   height
            :view-box [0 0 1280 600]}
      [:g (:domino-1 events-map)
       (:domino-2 events-map)
       (:domino-3 events-map)
       (:1->2 events-map)
       (:2->3 events-map)]])])

(def domino-4
  [:div.slide-body {:style {:font-size    "40px"
                            :margin-left  0
                            :padding-left 0}}
   (let [width 1280
         height 600]
     [:svg {:width    width
            :height   height
            :view-box [0 0 1280 600]}
      [:g (:domino-1 events-map)
       (:domino-2 events-map)
       (:domino-3 events-map)
       (:domino-4 events-map)
       (:1->2 events-map)
       (:2->3 events-map)
       (:3->4 events-map)]])])

(def domino-5
  [:div.slide-body {:style {:font-size    "40px"
                            :margin-left  0
                            :padding-left 0}}
   (let [width 1280
         height 600]
     [:svg {:width    width
            :height   height
            :view-box [0 0 1280 600]}
      [:g (:domino-1 events-map)
       (:domino-2 events-map)
       (:domino-3 events-map)
       (:domino-4 events-map)
       (:domino-5 events-map)
       (:1->2 events-map)
       (:2->3 events-map)
       (:3->4 events-map)
       (:4->5 events-map)]])])

(def domino-6
  [:div.slide-body {:style {:font-size    "40px"
                            :margin-left  0
                            :padding-left 0}}
   (let [width 1280
         height 600]
     [:svg {:width    width
            :height   height
            :view-box [0 0 1280 600]}
      [:g (:domino-1 events-map)
       (:domino-2 events-map)
       (:domino-3 events-map)
       (:domino-4 events-map)
       (:domino-5 events-map)
       (:domino-6 events-map)
       (:1->2 events-map)
       (:2->3 events-map)
       (:3->4 events-map)
       (:4->5 events-map)
       (:5->6 events-map)
       (:6->1 events-map)]])])