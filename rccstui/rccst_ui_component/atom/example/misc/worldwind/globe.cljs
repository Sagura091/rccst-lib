(ns rccst-ui-component.atom.example.misc.worldwind.globe
  (:require [ui-component.atom.worldwind.globe :as globe]
            [ui-component.utils.helpers :as h]
            [woolybear.ad.layout :as layout]
            [woolybear.ad.catalog.utils :as acu]))


(defn example []
  (let [container-id "worldwind-globe-demo"]
    (acu/demo "Worldwind Globe"
      "A 3D globe based on [Nasa WorldWind](https://github.com/WorldWindEarth/worldwindjs)."
      [layout/centered ;{:extra-classes :width-50}
       [globe/globe
        :layers globe/sample-data
        :component-id (h/path->keyword container-id "ww-globe")
        :container-id container-id]])))