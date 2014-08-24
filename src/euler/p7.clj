(ns euler.p7
  (:require [euler.util :refer :all]))

(defn run [n]
  (if (< n 2)
    2
    (nth (filter prime? (range 1 Long/MAX_VALUE 2)) (- n 2))))
