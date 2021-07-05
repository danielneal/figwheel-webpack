(ns fw.demo
  (:require [fw.lib :as lib]
            [helix.core :refer [defnc $]]
            [helix.dom :as d]
            ["react"]
            ["react-dom" :as rdom]))

(defnc app []
  (d/div
    (d/h1 "Demo of SQA common lib in cljs")
    (d/span (lib/two))))

(rdom/render ($ app) (js/document.getElementById "app"))
