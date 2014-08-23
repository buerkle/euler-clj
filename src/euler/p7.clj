(ns euler.core)

(defn prime? [n]
  (loop [factor 2]
    (cond
     (= n factor) true
     (< n 2) false
     (zero? (mod n factor)) false
     :else (recur (inc factor)))))

(defn p7 [n]
  (if (< n 2)
    2
    (nth (filter prime? (range 1 Long/MAX_VALUE 2)) (- n 2))))
