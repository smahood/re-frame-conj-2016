(defn intro-slide-1 []
  [:div.intro-slide
   [:div.slide-header "re-frame intro"]
   [:div.slide-body
    [:div.list "- Mutation is fundamental to SPAs"
     [:div.list "- Change the DOM"]
     [:div.list "- Change our application state"]
     [:div.list "- Change the World"
      [:div.list "- Local Storage"]
      [:div.list "- Cookies"]
      [:div.list "- APIs"]
      [:div.list "- Databases"]]]]
   [slide-footer ""]])

(defn intro-slide-2 []
  [:div.intro-slide
   [:div.slide-header "re-frame intro"]
   [:div.slide-body
    [:div.list "- But we want to program functionally"
     [:div.list "- To change the DOM"]
     [:div.list "- To change our application state"]
     [:div.list "- To change the World!"]
     [:br] [:br]
     [:div.list "re-frame can help us do this"]]]
   [slide-footer ""]])

(defn domino-1 []
  [:div.intro-slide
   [:div.slide-header "re-frame intro"]
   views/domino-1
   [slide-footer ""]])

(defn domino-2 []
  [:div.intro-slide
   [:div.slide-header "re-frame intro"]
   views/domino-2
   [slide-footer ""]])

(defn domino-3 []
  [:div.intro-slide
   [:div.slide-header "re-frame intro"]
   views/domino-3
   [slide-footer ""]])

(defn domino-4 []
  [:div.intro-slide
   [:div.slide-header "re-frame intro"]
   views/domino-4
   [slide-footer ""]])

(defn domino-5 []
  [:div.intro-slide
   [:div.slide-header "re-frame intro"]
   views/domino-5
   [slide-footer ""]])

(defn domino-6 []
  [:div.intro-slide
   [:div.slide-header "re-frame intro"]
   views/domino-6
   [slide-footer ""]])


(defn our-job []
  [:div.intro-slide
   [:div.slide-header "Getting Started"]
   [:div.slide-body
    [:div.list "- Define Views"]
    [:div.list "- Define the Initial Shape of App State"]
    [:div.list "- Register Events"]
    [:div.list "- Register Subscription Queries"]
    [:div.list "- Link Queries to Views"]
    [:div.list "- Link Events to Views"]]
   [slide-footer ""]])


(defn other-things []
  [:div.intro-slide
   [:div.slide-header "Growing Your App"]
   [:div.slide-body
    [:div.list "- Build Context with Coeffects"
     [:div.list [:a {:href "http://tomasp.net/coeffects/"}
                 "http://tomasp.net/coeffects/"]]]
    [:div.list "- Define your own effects"]
    [:div.list "- Interceptors (inspired by Pedestal)"]]
   [slide-footer ""]])

(defn ending-slide []
  [:div.intro-slide
   [:div.slide-header "Thank You!"]
   [:div.slide-body

    [:div.list [:a {:href "https://github.com/Day8/re-frame"}
                "https://github.com/Day8/re-frame"]]
    [:div.list [:a {:href "http://re-frame.org"}
                "http://re-frame.org"]]
    [:div.list "#re-frame on Clojurians Slack"]
    [:div.list "#re-frame on Conj Slack"]
    [:br] [:br] [:br] [:br]
    [:div.list "@shaun-mahood on Clojurians Slack"]
    ]
   [slide-footer ""]])

(def slides
  [title-slide
   intro-slide
   intro-slide-1
   intro-slide-2
   domino-1
   domino-2
   domino-3
   domino-4
   domino-5
   domino-6
   our-job
   other-things
   ending-slide])