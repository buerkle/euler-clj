(ns euler.p20)

(defn factorial [n]
  (reduce #(* (bigint %) %2) (range 1 n)))

(defn run
  ([] (run 100))
  ([n] (reduce + (map #(Character/getNumericValue %) (str (factorial n))))))
