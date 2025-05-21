(ns script-test
  (:require [clojure.test :refer [deftest is]]
            [script]))

(deftest finds-clojure-files
  (is (pos? (script/count-clojure-files))))
