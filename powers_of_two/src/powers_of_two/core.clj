(ns powers_of_two.core)

(defn powers_of_two
  ([]
    (concat [1 2 4] (powers_of_two 4N)))
  ([last_value]
    (let [next_value (* last_value 2N)]
      (lazy-seq (cons next_value (powers_of_two next_value))))))

(defn powers_of_two_improved []
  (iterate (fn [v] (* v 2N)) 1))
