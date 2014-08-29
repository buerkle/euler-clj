(ns euler.p24
  (:require [clojure.math.combinatorics :as combo]))

(defn run
  ([] (run 1000000))
  ([n] (apply str (-> (combo/permutations (range 10))
                      (nth (dec n))))))
