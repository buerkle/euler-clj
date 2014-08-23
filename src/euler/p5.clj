(ns euler.core)

(defn gcd
  [^long a ^long b]
  ;; Euclidean algorithm
  (let [smaller (min a b)
        diff (Math/abs (- a b))]
    (if (= smaller diff)
      smaller
      (recur smaller diff))))

(defn lcm [a b]
  (/ (* a b) (gcd a b)))

(defn p5 [a b]
  (reduce lcm (range a (inc b))))
