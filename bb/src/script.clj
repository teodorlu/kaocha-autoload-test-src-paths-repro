(ns script
  (:require [babashka.fs :as fs]))

(defn count-clojure-files []
  (count (fs/glob "." "**/*.clj")))
#_(count-clojure-files)
