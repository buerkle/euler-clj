(ns euler.core)

(defn is_multiple [x]
  (or
   (zero? (rem x 3))
   (zero? (rem x 5))))

(defn p1
    []
    (reduce +
            (filter #(or (zero? (rem % 3)) (zero? (rem % 5)))
                    (range 1000))))

(defn p1.1 [n]
  {:pre [(number? n)]}
  (->> (range n)
       (filter is_multiple)
       (reduce +)))
