(ns freebase4neo.fs
    (:import java.io.File))


(defn ls
   "
   Extracts a list of files contained by submitted folder.
   "
    [d]
    (filter
      (fn [f] (.isFile f))
      (.listFiles (File. d))))


(defn tsv
    "Filters a list of file to only keep .tsv files"
    [files]
    (let [filenames (map #(.getName %) files)]
      (filter
        (fn [filename]
          (re-find #"[^\s+]\.tsv$" filename))
        filenames)))

