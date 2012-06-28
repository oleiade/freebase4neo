(ns cmdline
    (:gen-class)
    (:use clojure.contrib.command-line))

(defn parse-cmdline [& args]
    (with-command-line args
        "Command line parser"
        [[test1 "This is the test1 description" 1]
         [test2 "This is the test2 desxription" 2]
         remaining]
         (println "test1 " test1)
         (println "test2 " test2)
         (println "remaining " remaining)))