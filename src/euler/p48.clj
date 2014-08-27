(ns euler.p48
  (:require [clojure.math.numeric-tower :as math]
            [clojure.string :as string]))

(defn sum
  [n]
  (->> (range 1 (inc n))
       (map #(math/expt % %))
       (reduce +)))

(defn run
  ([] (run 1000))
  ([n] (apply str (take-last 10 (.toString (sum n))))))
