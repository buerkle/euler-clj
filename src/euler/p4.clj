(ns euler.core
  (:require
   [clojure.string :as string]))

(defn is-palindrome [n]
  (let [s (str n)]
    (=  s (string/reverse s))))

(defn p4 []
  (loop [result 0
         i 100
         j 100]
    (cond
     (= i 1000) result
     (= j 1000) (recur result (inc i) 100)
     :else
     (let [product (* i j)]
          (if (and (is-palindrome product) (> product result))
            (recur product i (inc j))
            (recur result i (inc j)))))))
