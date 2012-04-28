The first step in using Midje is to add it to the
`project.clj` file in your root directory:

```clojure
(defproject checkers "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.3.0"]]
  :dev-dependencies [[midje "1.4.0"]])     ; <<<<====
```

Then you can ask Leiningen to download dependencies:

```shell
2477 $ lein deps
Copying 1 file to /Users/marick/src/Midje-quickstart/checkers/lib
Copying 11 files to /Users/marick/src/Midje-quickstart/checkers/lib/dev
2478 $ ls lib/dev/midje*
lib/dev/midje-1.4.0.jar
```
