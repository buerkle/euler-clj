(ns euler.p10
  (:require [euler.util :refer :all]))

(defn run
  ([] (run 2000000))
  ([target] (reduce + (filter prime? (range target)))))
