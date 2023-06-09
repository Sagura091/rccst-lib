(ns rccst-ui-component.technologies.overview.overview
  (:require [woolybear.ad.layout :as layout]
            [woolybear.ad.images :as images]
            [re-com.core :as rc]))


(defn overview [title description-md & logo-img]
  [:<>
   [:h2 title]
   [rc/h-box
    :children [[rc/box
                :size "auto"
                :child [layout/markdown-block description-md]]
               [rc/box
                :child [layout/padded
                        [images/image
                         {:src (or logo-img "/imgs/clojure-logo-large.png")
                          :extra-classes #{:adc-width-20 :is-96x96}}]]]]]])