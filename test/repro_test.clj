(ns repro-test
  (:require [clojure.test :refer [deftest is]]
            [repro :as repro]))

(deftest x
  (is (= repro/x 3)))
