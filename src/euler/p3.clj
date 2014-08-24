(ns euler.p3)

(defn max-prime
  [x]
  (loop [n x
         factor 2]
    (if (= n factor)
      n
      (if (zero? (mod n factor))
        (recur (/ n factor) factor)
        (recur n (inc factor))))))

(defn run
  ([] (run 600851475143))
  ([n] (max-prime n)))
