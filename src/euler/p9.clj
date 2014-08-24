(ns euler.p9)

(defn triplet? [value x y z]
  (and (< x y z)
       (= (+ (* x x) (* y y)) (* z z))))

(defn run [target]
  (first (for [x (range target)
               y (range target)
               :let [z (- target x y)]
               :when (triplet? target x y z)]
           [x y z (* x y z)])))
