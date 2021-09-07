(ns docker
  "Docker build for babashka"
  (:require [babashka.classpath :as cp]
            [babashka.fs :as fs]
            [babashka.tasks :as tasks]
            [clojure.string :as str]))

(def cp (->> (cp/get-classpath)
             (cp/split-classpath)
             (map #(if (fs/absolute? %)
                     (fs/relativize (fs/absolutize ".") %)
                     %))
             (str/join ":")))

(spit ".classpath" cp)
(tasks/shell "docker build .")
nil
