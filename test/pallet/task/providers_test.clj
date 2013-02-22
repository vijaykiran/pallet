(ns pallet.task.providers-test
  (:use
   clojure.test
   pallet.task.providers))

(deftest providers-output-test
  (let [out (with-out-str (providers))]
    (is (.contains out "node-list"))
    (is (.contains out "hybrid"))
    (is (.contains out "localhost"))))
