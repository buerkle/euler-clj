(ns euler.core)

(defn max-prime
  [x]
  (loop [n x
         factor 2]
    (if (= n factor)
      n
      (if (zero? (mod n factor))
        (recur (/ n factor) factor)
        (recur n (inc factor))))))

(defn p3 [n]
  (max-prime n))
