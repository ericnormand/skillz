(ns skillz.core
  (:require
   [ring.adapter.jetty :as jetty]
   [ring.middleware.reload :refer [wrap-reload]]
   [yesql.core :refer [defqueries]]
   [compojure.core :refer :all]
   [compojure.route :as route])
  (:gen-class))

(def db (or (System/getenv "DATABASE_URL")
            "jdbc:postgresql://localhost/skillz"))

(defqueries "skillz/setup.sql")

(defroutes app
  (GET "/" [] "This is the homepage.")
  (GET "/skills/new" [] ""))

(defn -main
  [& args]
  (create-skill-table! db)
  (jetty/run-jetty
   app
   {:port (Long. (System/getenv "PORT"))}))

(defn dev-main
  [& args]
  (jetty/run-jetty
   (wrap-reload #'app)
   {:port (Long. (System/getenv "PORT"))}))
