(ns atoms
  (:require [ui-component.atom.bhui.tabbed-panel :as tabbed-panel]
            [rccst-ui-component.atom.all :as all-demo]
            [rccst-ui-component.atom.astrouxds :as astro-demo]
            [rccst-ui-component.atom.buttons :as buttons-demo]
            [rccst-ui-component.atom.cards :as cards-demo]

            [rccst-ui-component.atom.charts :as charts-demo]
            [rccst-ui-component.atom.containers :as containers-demo]
            [rccst-ui-component.atom.diagrams :as diagrams-demo]
            [rccst-ui-component.atom.experimental :as experimental]
            [rccst-ui-component.atom.forms :as forms-demo]
            [rccst-ui-component.atom.icons :as icons-demo]
            [rccst-ui-component.atom.layouts :as layout-demo]
            [rccst-ui-component.atom.miscellaneous :as misc]
            [rccst-ui-component.atom.re-com :as re-com-demo]

            [woolybear.ad.layout :as layout]))


(def atom-navbar [[:atoms/layouts "Layout" [layout-demo/examples]]
                  [:atoms/containers "Containers" [containers-demo/examples]]
                  [:atoms/cards "Cards" [cards-demo/examples]]
                  [:atoms/charts "Charts" [charts-demo/page]]
                  [:atoms/diagrams "Diagrams" [diagrams-demo/examples]]
                  [:atoms/icons "Icons / Images" [icons-demo/examples]]
                  [:atoms/buttons "Buttons" [buttons-demo/examples]]
                  [:atoms/forms "Forms" [forms-demo/examples]]
                  [:atoms/re-com "Re-com" [re-com-demo/examples]]
                  [:atoms/astro "AstroUXDS" [astro-demo/examples]]
                  [:atoms/misc "Misc." [misc/examples]]
                  [:atoms/experimental "Experimental" [experimental/examples]]
                  [:atoms/all "All" [all-demo/examples]]])


(defn page
  "Top-level AD Atom page"
  []

  [layout/page {:extra-classes :is-fluid}

   ;[layout/page-header {:extra-classes :is-fluid}
   ; [:h1.has-text-info "'Atoms'"]]

   [tabbed-panel/tabbed-panel
    :extra-classes {:extra-classes :is-fluid
                    :height        "85vh"}
    :title ""
    :short-name "atoms"
    :description ""
    :children atom-navbar
    :start-panel :atoms/layouts]])



