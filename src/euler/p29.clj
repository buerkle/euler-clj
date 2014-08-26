(ns euler.p29
  (:require [clojure.math.numeric-tower :as math]))

(defn run
  ([] (run 100))
  ([exp] (count
          (distinct
           (for [a (range 2 (inc exp))
                 b (range 2 (inc exp))]
             (math/expt a b))))))
