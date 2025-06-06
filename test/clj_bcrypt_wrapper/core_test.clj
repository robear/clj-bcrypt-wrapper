(ns clj-bcrypt-wrapper.core-test
  (:require [clojure.test :refer [deftest testing is]]
        [clj-bcrypt-wrapper.core :as bcrypt]))

(deftest compare-hashed-to-plain
  (testing "Ensure a hashed password is equal to itself."
    (is (= true (bcrypt/check-password "1234567890" (bcrypt/encrypt "1234567890"))))))
