(ns game.desktop-launcher
  ;; (:require [game.core :refer :all])
  (:require [game.core])
  (:import (game.core Game)
           [com.badlogic.gdx.backends.lwjgl3
            Lwjgl3ApplicationConfiguration
            Lwjgl3Application])
  (:gen-class))

(defn -main
  []
  (def config (Lwjgl3ApplicationConfiguration.)) ; let?
  (.setTitle config "game")
  (.setWindowedMode config 800 600)
  (Lwjgl3Application. (Game.) config))
