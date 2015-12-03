(set-env!
 :dependencies  '[[org.clojure/clojure       "1.7.0"]
                  [org.clojure/clojurescript "1.7.48"]
                  [adzerk/bootlaces          "0.1.13" :scope "test"]
                  [hoplon/boot-hoplon        "0.1.9"  :scope "test"]
                  [hoplon/hoplon             "6.0.0-alpha10"]]
 :resource-paths   #{"src"})

(require
 '[adzerk.bootlaces :refer :all]
 '[hoplon.boot-hoplon :refer :all])

(def +version+ "0.1.0")

(task-options!
 pom {:project 'degree9/silicone
      :version +version+
      :description ""
      :url         ""
      :scm {:url ""}})

(deftask pack
  "Package silicone as Hoplon lib"
  []
  (comp
   (hoplon :manifest true)
   (pom)
   (jar)))
