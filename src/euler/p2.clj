(ns euler.p2)

; http://en.wikibooks.org/wiki/Clojure_Programming/Examples/Lazy_Fibonacci
(defn fib-step [[a b]]
  [b (+ a b)])

(defn fib []
  (map first (iterate fib-step [0 1])))

(defn run
  ([] (run 4000000))
  ([terms]
     (let [values (take-while #(< % terms) (fib))]
       (reduce +
               (filter even? values)))))
