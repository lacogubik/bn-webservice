(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.5"]                 
                 [org.thymeleaf/thymeleaf "2.0.8"]
                 [dieter "0.4.1"]
                 [ring/ring-jetty-adapter "1.1.7"]
                 [liberator "0.9.0"]
                 [cheshire "5.2.0"]
                 [clj-http "0.7.3"]
                 [clj-time "0.5.1"]
                 [conf-er "1.0.1"]

                 [mysql/mysql-connector-java "5.1.6"]
                 [korma "0.3.0-RC5"]
                 [com.googlecode.flyway/flyway-core "2.2"]

                 [org.slf4j/slf4j-simple "1.6.1"]
                 [org.clojure/tools.logging "0.2.6"]
                 [log4j/log4j "1.2.16" :exclusions [javax.mail/mail
                                                    javax.jms/jms
                                                    com.sun.jdmk/jmxtools
                                                    com.sun.jmx/jmxri]]]
  :plugins [[lein-ring "0.8.5"]]
  :ring {:handler {{name}}.core/handler :port 4000}
  :jvm-opts ["-Dconfig=application.conf"]
  :main {{name}}.core
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.5"]
                        [midje "1.5.1"]
                        [ring/ring-devel "1.1.7"]]
         :plugins [[lein-midje "3.1.1"]]}})