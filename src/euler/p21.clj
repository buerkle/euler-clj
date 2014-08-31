(ns euler.p21)

(defn divisors [n]
  (filter #(zero? (mod n %)) (range 1 n)))

(defn amicable? [n]
  (let [da (apply + (divisors n))
        db (apply + (divisors da))]
    (and (= n db) (not= da db))))

(defn run
  ([] (run 10000))
  ([n] (apply + (filter amicable? (range n)))))
