(ns freebase4neo.fs
    (:import java.io.File))

(defn ls [d]
;    "Usage : (ls (File. "."))"
    (println "Files in " (.getName d))
    (doseq [f (.listFiles d)]
        (if (.isDirectory f)
            (print "d ")
            (print "- "))
        (println (.getName f))))