(defproject skillz "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring "1.3.2"]
                 [hiccup "1.0.5"]
                 [yesql "0.4.0"]
                 [org.postgresql/postgresql "9.4-1201-jdbc41"]
                 [compojure "1.3.3"]]
  :main ^:skip-aot skillz.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
