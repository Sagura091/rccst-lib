(ns rccst-ui-component.technologies.overview.next-jdbc
  (:require [rccst-ui-component.technologies.overview.overview :as o]))

(defn overview []
      [o/overview
       "next.jdbc"
       "The next generation Clojure wrapper around JDBC.  The team uses this library for database access.

Visit the next.jdbc Git repository [here.](https://github.com/seancorfield/next-jdbc)

You will find links to more detailed documentation at the bottom of the repo page."])

