(ns freebase4neo.core
	(:require [borneo.core :as neo])
	(:import (freebase4neo.types Assertion)))


(defn -main
  "I don't do a whole lot."
  [& args]
  ((def a (Assertion. "a" "b" "c" "d"))
))
