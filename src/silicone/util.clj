(ns silicone.util)

(defn import-polymer [path]
  [:link {:rel "import" :href (clojure.string/join [path "/polymer/polymer.html"])}])
