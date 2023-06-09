(ns rccst-ui-component.atom.all
  "atom and acu/demonstrations of all available UI components."
  (:require [re-com.core :as rc]

            [rccst-ui-component.atom.example.layout.page :as page]
            [rccst-ui-component.atom.example.layout.page-header :as page-header]
            [rccst-ui-component.atom.example.layout.page-title :as page-title]
            [rccst-ui-component.atom.example.layout.text-block :as text-block]
            [rccst-ui-component.atom.example.layout.centered-block :as centered-block]
            [rccst-ui-component.atom.example.layout.markdown-block :as markdown-block]
            [rccst-ui-component.atom.example.layout.frame :as frame]
            [rccst-ui-component.atom.example.layout.section :as section]

            [rccst-ui-component.atom.example.container.navbar :as navbar]

            [rccst-ui-component.atom.example.icons.simple-image :as simple-image]
            [rccst-ui-component.atom.example.icons.standard-icon :as standard-icon]
            [rccst-ui-component.atom.example.icons.colored-icon :as colored-icon]
            [rccst-ui-component.atom.example.icons.small-icon :as small-icon]
            [rccst-ui-component.atom.example.icons.medium-icon :as medium-icon]
            [rccst-ui-component.atom.example.icons.large-icon :as large-icon]
            [rccst-ui-component.atom.example.icons.brand-icon :as brand-icon]
            [rccst-ui-component.atom.example.icons.clickable-icon :as clickable-icon]

            [rccst-ui-component.atom.example.forms.simple-form-label :as simple-label]
            [rccst-ui-component.atom.example.forms.required-form-label :as required-label]
            [rccst-ui-component.atom.example.forms.text-input :as text-input]
            [rccst-ui-component.atom.example.forms.password-input :as pass-input]
            [rccst-ui-component.atom.example.forms.placeholder-text-input :as place-text-input]
            [rccst-ui-component.atom.example.forms.disabled-text-input :as disabled-text-input]
            [rccst-ui-component.atom.example.forms.error-text-input :as error-text-input]
            [rccst-ui-component.atom.example.forms.simple-select-input :as simple-select-input]
            [rccst-ui-component.atom.example.forms.custom-select-input :as custom-select-input]
            [rccst-ui-component.atom.example.forms.disabled-select-input :as disabled-select-input]
            [rccst-ui-component.atom.example.forms.multi-select-input :as multi-select-input]
            [rccst-ui-component.atom.example.forms.checkbox :as checkbox]
            [rccst-ui-component.atom.example.forms.disabled-checkbox :as disabled-checkbox]

            ;[rccst-ui-component.atom.example.chart.bar-chart :as bar-chart]
            ;[rccst-ui-component.atom.example.chart.line-chart :as line-chart]
            ;[rccst-ui-component.atom.example.chart.pie-chart :as pie-chart]
            ;[rccst-ui-component.atom.example.chart.colored-pie-chart :as colored-piechart]

            [rccst-ui-component.atom.example.re-com.table :as table]
            [rccst-ui-component.atom.example.re-com.alert-box :as alert-box]
            [rccst-ui-component.atom.example.re-com.line :as line]))


(defn examples
  []
  [:div

   [page/example]
   [page-header/example]
   [page-title/example]
   [section/example]
   [text-block/example]
   [centered-block/example]
   [markdown-block/example]
   [frame/example]
   [navbar/example]

   [rc/line :size "5px" :color "orange"]

   ;[bar-chart/example]
   ;[line-chart/simple-example]
   ;[pie-chart/example]
   ;[colored-piechart/example]

   [rc/line :size "5px" :color "orange"]

   [simple-label/example]
   [required-label/example]
   [text-input/example]
   [pass-input/example]
   [place-text-input/example]
   [disabled-text-input/example]
   [error-text-input/example]
   [simple-select-input/example]
   [custom-select-input/example]
   [disabled-select-input/example]
   [multi-select-input/example]
   [checkbox/example]
   [disabled-checkbox/example]

   [rc/line :size "2px" :color "orange"]

   [table/example]
   [alert-box/example]
   [line/example]
   [simple-image/example]
   [standard-icon/example]
   [colored-icon/example]
   [small-icon/example]
   [medium-icon/example]
   [large-icon/example]
   [brand-icon/example]
   [clickable-icon/example]])
