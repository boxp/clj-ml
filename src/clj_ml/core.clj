(ns clj-ml.core
  (:use clojure.core.matrix)
  (:require [clatrix.core :as cl]))

(def A (cl/matrix [[0 1 2] [3 4 5]]))

(def B (matrix [[0 1 2] [3 4 5]]))

(defn square-mat
  "Creates a squre matrix of size n x n whose 
  elements are all e. Accepts an option argument
  for the matrix implementation
   全ての要素がeとなるn行 x n列の行列を生成する。
  行列の型をオプションで設定出来る"
  [n e & {:keys [implementation]
          :or {implementation :persistent-vector}}]
  (let [repeater #(repeat n %)]
    (matrix implementation (-> e repeater repeater))))
