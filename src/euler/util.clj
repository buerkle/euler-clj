(ns euler.util)

(defn prime? [n]
  (if (or (= n 1) (zero? (mod n 2)))
    false
    (let [sqrt (long (Math/sqrt n))]
      (loop [factor (if (even? sqrt) (dec sqrt) sqrt)]
        (cond
         (= factor 1) true
         (zero? (mod n factor)) false
         :else (recur (- factor 2)))))))
