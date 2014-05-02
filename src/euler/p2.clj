(ns euler.core)

; http://en.wikibooks.org/wiki/Clojure_Programming/Examples/Lazy_Fibonacci
(defn fib-step [[a b]]
  [b (+ a b)])

(defn fib []
  (map first (iterate fib-step [0 1])))

(defn p2 []
  (let [values (take-while #(< % 4000000) (fib))]
    (reduce +
            (filter even? values))))
