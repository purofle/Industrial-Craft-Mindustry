package com.github.purofle

import arc.Events
import arc.util.Log
import arc.util.Time
import com.github.purofle.content.Blocks
import mindustry.game.EventType.WorldLoadEvent
import mindustry.mod.Mod
import mindustry.ui.dialogs.BaseDialog

public class MainMod : Mod() {
    init {
        Log.info("插件开始加载")
        Events.on(WorldLoadEvent::class.java) {
            Time.runTask(10f) {
                val dialog = BaseDialog("欢迎使用本mod!")
                dialog.cont.add("[red]本mod目前尚未完善（")
                dialog.cont.button("给爷爬",dialog::hide).size(70f, 50f)
                dialog.show()
            }
        }
    }

    override fun loadContent() {
        Blocks().load()
    }
}