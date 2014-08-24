(ns euler.util)

(defn prime? [n]
  (cond
   (< n 2) false
   (= n 2) true
   (zero? (mod n 2)) false
   :else (let [sqrt (long (Math/sqrt n))]
           (loop [factor (if (even? sqrt) (dec sqrt) sqrt)]
             (cond
              (= factor 1) true
              (zero? (mod n factor)) false
              :else (recur (- factor 2)))))))
