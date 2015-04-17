(ns skillz.core
  (:require [ring.adapter.jetty :as jetty])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (jetty/run-jetty (fn [req] {:status 200 :body "OK" :headers {}})
                   {:port (Long. (System/getenv "PORT"))}))
