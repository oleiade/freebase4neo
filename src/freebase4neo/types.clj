(ns freebase4neo.types
	(:require [clojure.contrib.string :as string]))

(defprotocol GraphRepr
	"A simple protocol helping to find out
	what is the best graph representation of
	an assertion"
	(property? [this] "Assertion is about a property?")
	(relationship? [this] "Assertion is about a relationship?"))

(defrecord Assertion [source
					  property
					  destination
					  value]
	GraphRepr
	(property? [this] (if (string/blank? (:value this)) false true))
	(relationship? [this] (if (string/blank? (:value this)) true false)))
