;; To use Midje, you need only :use it in the namespace declaration at
;; the top of the file:

(ns checkers.core-test
  (:use midje.sweet
        checkers.core))

;; Midje's metaphor is that testing involves claiming facts about
;; Clojure functions, facts which Midje then checks. Here's a fact
;; about the `+` function:

(fact (+ 1 1) => 2)

;; To check a fact, type this to the command prompt:
;;
;;   % lein midje
;;
;; 
