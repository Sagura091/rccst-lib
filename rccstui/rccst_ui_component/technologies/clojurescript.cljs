(ns rccst-ui-component.technologies.clojurescript
  (:require [rccst-ui-component.technologies.overview.atom-design :as atomic-design]
            [rccst-ui-component.technologies.overview.hiccup :as hiccup]
            [rccst-ui-component.technologies.overview.re-com :as re-com]
            [rccst-ui-component.technologies.overview.re-frame :as re-frame]
            [rccst-ui-component.technologies.overview.reagent :as reagent]
            [rccst-ui-component.technologies.overview.recharts :as recharts]
            [rccst-ui-component.technologies.overview.woolybear :as woolybear]
            [re-com.core :as rc]
            [woolybear.ad.layout :as layout]))


(defn page []

  [layout/page {:extra-classes :is-fluid}
   [:h2.has-text-info "Clojurescript"]
   [layout/markdown-block "[ClojureScript](https://github.com/clojure/clojurescript) is a compiler for Clojure that
      targets JavaScript. It emits JavaScript code which is compatible with the advanced compilation mode of the Google Closure
      optimizing compiler to provide the most powerful language for programming the web. [Clojurescript](https://clojurescript.org/)
      is a robust, practical, and fast programming language with a set of useful features that together form a simple, coherent,
      and powerful tool.

> See also:
>
>[Clojurescript](https://clojurescript.org/)"]
   [rc/gap :size "8px"]

   [layout/frame {:extra-classes :is-fluid}
    [atomic-design/overview]]

   [layout/frame {:extra-classes :is-fluid}
    [reagent/overview]]

   [layout/frame {:extra-classes :is-fluid}
    [hiccup/overview]]

   [layout/frame {:extra-classes :is-fluid}
    [re-frame/overview]]

   [layout/frame {:extra-classes :is-fluid}
    [re-com/overview]]

   [layout/frame {:extra-classes :is-fluid}
    [woolybear/overview]]

   [layout/frame {:extra-classes :is-fluid}
    [recharts/overview]]])
