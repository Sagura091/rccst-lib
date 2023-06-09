(ns rccst-ui-component.molecule.example.login
  (:require [woolybear.ad.catalog.utils :as acu]
            [woolybear.ad.layout :as layout]

            [ui-component.atom.re-com.login :as login]))


(defn example []
  (acu/demo "Login"
    "A simple login page (user id & password). Calls the server for validation."
    [layout/centered {:extra-classes :width-50}
     [login/login]]
    '[]))

