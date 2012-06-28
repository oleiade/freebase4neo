(ns freebase4neo.core
	(:gen-class)
	(:require [borneo.core :as neo]
			  [freebase4neo.types :as types])
	(:import (freebase4neo.types Assertion)))


(defn -main
  "I don't do a whole lot."
  [& args]
  (let [A (types/Assertion. "a" "b" "c" "d")]
  	(types/property? A))
)
