(defproject show "0.1.0-SNAPSHOT"
  :description "re-frame Slideshow for Clojure Conj 2016"
  :url "https://github.com/smahood/re-frame-conj-2016"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :min-lein-version "2.6.1"

  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [org.clojure/clojurescript "1.9.293"]
                 [org.clojure/core.async "0.2.395"
                  :exclusions [org.clojure/tools.reader]]
                 [reagent "0.6.0"]
                 [re-frame "0.8.0"]
                 [re-frisk "0.3.1"]
                 [garden "1.3.2"]]

  :plugins [[lein-figwheel "0.5.8"]
            [lein-ancient "0.6.10"]
            [lein-garden "0.3.0"]
            [lein-cljsbuild "1.1.4" :exclusions [[org.clojure/clojure]]]]

  :source-paths ["src"]

  :clean-targets ^{:protect false} ["resources/public/js/compiled" "target"]

  :cljsbuild {:builds
              [{:id           "dev"
                :source-paths ["src"]
                :figwheel     {:on-jsload "show.core/on-jsload"
                               :open-urls ["http://localhost:3461/index.html"]}
                :compiler     {:main                 show.core
                               :asset-path           "js/compiled/out"
                               :output-to            "resources/public/js/compiled/show.js"
                               :output-dir           "resources/public/js/compiled/out"
                               :source-map-timestamp true
                               :external-config      {:re-frisk {:enabled     true
                                                                 :script-path "js/compiled/show.js"}}
                               :preloads             [devtools.preload]}}
               {:id           "min"
                :source-paths ["src"]
                :compiler     {:output-to     "resources/public/js/compiled/show.js"
                               :main          show.core
                               :optimizations :advanced
                               :pretty-print  false}}]}

  :figwheel {:server-port 3461
             :css-dirs    ["resources/public/css"]}


  :garden {:builds [{:id           "screen"
                     :source-paths ["src"]
                     :stylesheet   show.styles/screen
                     :compiler     {:output-to     "resources/public/css/screen.css"
                                    :pretty-print? true}}]}

  :profiles {:dev {:dependencies [[binaryage/devtools "0.8.3"]
                                  [figwheel-sidecar "0.5.8"]
                                  [com.cemerick/piggieback "0.2.1"]]
                   :source-paths ["src"]
                   :repl-options {
                                  :init             (set! *print-length* 50)
                                  :nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}}})


