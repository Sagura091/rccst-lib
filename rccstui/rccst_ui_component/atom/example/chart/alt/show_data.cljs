(ns rccst-ui-component.atom.example.chart.alt.show-data
  (:require [ui-component.utils.helpers :as h]
            [re-com.core :as rc]
            [taoensso.timbre :as log]))


(log/info "rccst-ui-component.atom.example.chart.alt.show-data")


(defn show-data [data]
  (let [d (h/resolve-value data)]
    (fn []

      ;(log/info "show-data" data "//" d "//" @d)

      [rc/h-box :src (rc/at)
       :gap "10px"
       :style {:border     "1px solid" :border-radius "3px"
               :background "#808080"
               :box-shadow "5px 5px 5px 2px"
               :margin     "5px" :padding "5px"}
       :children [[:p {:style {:color "white" :overflow :auto
                               :max-height "100px" :min-height "100px"}}
                   (str @d)]]])))


(defn show-config [config-data]
  (let [d (h/resolve-value config-data)]
    (fn []

      ;(log/info "show-data" data "//" d "//" @d)

      [rc/h-box :src (rc/at)
       :gap "10px"
       :style {:border     "1px solid" :border-radius "3px"
               :background "#808080"
               :box-shadow "5px 5px 5px 2px"
               :margin     "5px" :padding "5px"}
       :children [[:p {:style {:color "white"}}
                   (str @d)]]])))
