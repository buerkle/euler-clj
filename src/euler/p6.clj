(ns euler.p6)

(defn run
  ([] (run 100))
  ([a]
     (let [sum (reduce + (range (inc a)))]
       (-
        (* sum sum)
        (reduce + (map #(* % %) (range (inc a))))))))
