(ns rccst-ui-component.molecule.example.composite.multi-chart-widget
  (:require [ui-component.molecule.composite.multi-chart :as widget]
            [ui-component.atom.chart.utils :as chart-utils]
            [ui-component.utils :as ui-utils]
            [ui-component.molecule.grid-container :as grid]
            [ui-component.utils.helpers :as h]
            [reagent.core :as r]
            [re-com.core :as rc]
            [taoensso.timbre :as log]
            [woolybear.ad.catalog.utils :as acu]
            [woolybear.ad.layout :as layout]))


(log/info "rccst-ui-component.molecule.example.composite.multi-chart-widget")


(defn- data-tools [data]
  (let [old-data (ui-utils/subscribe-local data [])]

    ;(log/info "data-tools" data "//" @old-data)

    (fn []
      [rc/h-box :src (rc/at)
       :gap "10px"
       :style {:border     "1px solid" :border-radius "3px"
               :box-shadow "5px 5px 5px 2px"
               :margin     "5px" :padding "5px"}
       :children [[:label.h5 "Input Data:"]

                  [rc/button :on-click #(h/handle-change-path data [] []) :label "Empty"]

                  [rc/button :on-click #(h/handle-change-path data [] widget/sample-data)
                   :label "Default"]

                  [rc/button :on-click #(h/handle-change-path data []
                                          (assoc-in @old-data [:data 0 :uv] 10000))
                   :label "A -> 10000"]

                  [rc/button :on-click #(h/handle-change-path data []
                                          (assoc @old-data :data
                                                           (conj (:data @old-data)
                                                             {:name "Page Q" :uv 1100
                                                              :pv   1100 :tv 1100 :amt 1100})))
                   :label "Add 'Q'"]

                  [rc/button :on-click #(h/handle-change-path data []
                                          (assoc @old-data :data
                                                           (into [] (drop-last 2 (:data @old-data)))))
                   :label "Drop Last 2"]

                  [rc/button :on-click #(h/handle-change-path data []
                                          (-> @old-data
                                            (assoc-in [:metadata :fields :new-item] :number)
                                            (assoc :data (into []
                                                           (map (fn [x]
                                                                  (assoc x :new-item (rand-int 7000)))
                                                             (:data @old-data))))))
                   :label "Add :new-item"]]])))


(defn- data-update-example [& {:keys [widget component-id] :as params}]
  ;(log/info "data-update-example (params)" params)

  [rc/v-box :src (rc/at)
   :gap "10px"
   :width "100%"
   :height "100%"
   :children [[:div.chart-part {:style {:width "100%"}}     ;:height "90%"}}
               widget]

              [rc/v-box :src (rc/at)
               :gap "8px"
               :children [[data-tools [component-id :blackboard :topic.data]]]]]])


(defn example []
  (let [container-id "multi-chart-widget"
        component-id (h/path->keyword container-id "widget")]

    (fn []
      (acu/demo "Multiple Charts in a Widget"
        "This example provides a 'widget' (collection of UI Components) organized into a digraph (Event Model) that
          describes the flow of data from sources (remote or local) into and out-of the UI.

> In this example the configuration is presented as part of the widget, rather than separately as in
> the example above"
        [layout/frame
         ;;
         ;; NOTE: the :height MUST be specified here since the ResponsiveContainer down in bowels of the chart needs a height
         ;; in order to actually draw the Recharts components. just saying "100%" doesn't work, since the
         ;; that really means "be as big as you need" and ResponsiveContainer then doesn't know what to do.
         ;;
         [:div {:style {:width "100%" :min-height "400px"}}
          [data-update-example
           :widget [grid/component
                    :data (r/atom widget/ui-definition)
                    :component-id component-id
                    :resizable true
                    :tools true]
           :component-id component-id]]]
        widget/source-code))))
