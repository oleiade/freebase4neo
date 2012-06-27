(ns freebase4neo.types)

(defprotocol GraphRepr
	"A simple protocol helping to find out
	what is the best graph representation of
	an assertion"
	(property? [this] "Assertion is about a property?")
	(outrel? [this] "Assertion is about an output relationship?")
	(inrel? [this] "Assertion is about an incoming relationship?"))

(defrecord Assertion [source
					  property
					  destination
					  value]
	GraphRepr
	(property? [this] (:value?))
	(outrel? [this] (if (= :source :destination) true false))
	(inrel? [this] (if (= :source :destination) false true)))

