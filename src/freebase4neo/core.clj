(ns freebase4neo.core
	(:gen-class)
	(:require [borneo.core :as neo]
		        [freebase4neo.types :as types])
	(:import (freebase4neo.types Assertion))
  (:use [clojure.tools.cli :only (cli)]
        [freebase4neo.fs :only (ls tsv)]))

(defn -main
  "I don't do a whole lot."
  [& args]
  (let [[options args banner]
            (cli args
                ["-d" "--datas" "Path to freebase dump files" :default "./datas"]
                ["-g" "--graph" "Graph to update with datas" :default "./graph.db"]
                ["-h" "--help" "Display help" :default false :flag true])]
    (when (:help options)
      (println banner)
      (System/exit 0))
    (println (tsv
               (ls (:datas options))))))