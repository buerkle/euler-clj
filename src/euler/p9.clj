(ns euler.core)

(defn triplet? [value x y z]
  (and (= value (+ x y z))
       (< x y z)
       (= (+ (* x x) (* y y)) (* z z))))

(defn p9 [max]
  (first (for [x (range max)
               y (range max)
               z (range max)
               :when (triplet? max x y z)]
           (* x y z))))
