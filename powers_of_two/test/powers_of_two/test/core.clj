(ns powers_of_two.test.core
  (:use [powers_of_two.core])
  (:use [clojure.test])
  (:require [clojure.contrib.math :as math]))

(defn test_beginning_of_powers_of_two [f]
  (is (= [1 2 4 8 16] (take 5 (f)))))

(defn test_very_large_powers_of_two [f]
  (is (== (math/expt 2 500N) (nth (f) 500N))))

(deftest powers_of_two_test
  (do
    (test_beginning_of_powers_of_two powers_of_two)
    (test_very_large_powers_of_two powers_of_two)))

(deftest powers_of_two_improved_test
  (do
    (test_beginning_of_powers_of_two powers_of_two_improved)
    (test_very_large_powers_of_two powers_of_two_improved)))

