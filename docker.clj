(ns docker
  "Docker build for babashka"
  (:require [babashka.tasks :as tasks]))

(println "Creating deps.jar")
(tasks/shell "bb uberjar deps.jar")

(println "Creating Docker image")
(tasks/shell "docker build .")

(println "Done!")
