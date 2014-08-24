(ns euler.p5)

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

(defn run
  ([] (run 1 20))
  ([a b] (reduce lcm (range a (inc b)))))
