package com.github.purofle

import arc.Core
import arc.Events
import arc.Net
import arc.util.Log
import arc.util.Time
import com.github.purofle.content.MCBlocks
import com.github.purofle.content.MCItems
import mindustry.game.EventType.WorldLoadEvent
import mindustry.mod.Mod
import mindustry.ui.dialogs.BaseDialog

public class MainMod : Mod() {
    init {
        var a:String? = null
        Log.info("加载")
        Events.on(WorldLoadEvent::class.java) {
            Time.runTask(10f) {
                Core.net.httpGet("124.70.189.178:5000", { res ->
                    if (res.status == Net.HttpStatus.OK) {
                        a = res.resultAsString
                        Log.info(a)
                    }
                },{})
                val dialog = BaseDialog("test")
                dialog.cont.add(a).row()
                dialog.cont.button("确定", dialog::hide).size(100f, 50f)
                dialog.show()
            }
        }
    }

    override fun loadContent() {
        MCItems().load()
        MCBlocks().load()
    }
}
