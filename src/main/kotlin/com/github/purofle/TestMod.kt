package com.github.purofle

import arc.Events
import arc.util.Log
import arc.util.Time
import mindustry.Vars
import mindustry.game.EventType
import mindustry.game.EventType.WorldLoadEvent
import mindustry.mod.Mod
import mindustry.ui.dialogs.BaseDialog

public class TestMod : Mod() {
    init {
        Log.info("插件开始加载")

        Events.on(WorldLoadEvent::class.java) {
            Time.runTask(20f) {
                Vars.ui.showErrorMessage("nmsl")
            }
        }
    }

    override fun loadContent() {
        Log.info("test")
    }
}