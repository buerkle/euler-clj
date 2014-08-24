(ns euler.p10
  (:require [euler.util :refer :all]))

(defn run [target]
  (reduce + (filter prime? (range target))))
