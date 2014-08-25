(ns euler.p16)

(defn run
  ([] (run 1000))
  ([n] (reduce + (map #(Character/getNumericValue %) (.toString (.pow (BigInteger. "2") n))))))
