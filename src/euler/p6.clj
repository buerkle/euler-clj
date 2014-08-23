(ns euler.core)

(defn p6 [a]
  (let [sum (reduce + (range (inc a)))]
    (-
     (* sum sum)
     (reduce + (map #(* % %) (range (inc a)))))))
