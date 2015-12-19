(set-env!
 :dependencies  '[[org.clojure/clojure       "1.7.0"]
                  [org.clojure/clojurescript "1.7.48"]
                  [adzerk/bootlaces          "0.1.13" :scope "test"]
                  [hoplon/boot-hoplon        "0.1.9"  :scope "test"]
                  [hoplon/hoplon             "6.0.0-alpha10"]
                  [degree9/lounge.boot       "0.1.0"  :scope "test"]
                  [degree9/boot-semver       "0.7.0"  :scope "test"]]
 :resource-paths   #{"src"})

(require
 '[adzerk.bootlaces :refer :all]
 '[boot-semver.core :refer :all]
 '[lounge.boot :refer :all])

(task-options!
 pom {:project 'degree9/silicone
      :description ""
      :url         ""
      :scm {:url ""}})
