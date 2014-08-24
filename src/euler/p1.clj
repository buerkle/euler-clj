(ns euler.p1)

(defn is_multiple [x]
  (or
   (zero? (rem x 3))
   (zero? (rem x 5))))

(defn run
  ([] (run 1000))
  ([n]
     {:pre [(number? n)]}
     (->> (range n)
          (filter is_multiple)
          (reduce +))))
