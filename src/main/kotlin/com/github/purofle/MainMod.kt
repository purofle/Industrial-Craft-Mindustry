package com.github.purofle

import arc.Events
import arc.util.Log
import com.github.purofle.content.MCBlocks
import com.github.purofle.content.MCItems
import mindustry.game.EventType.ClientLoadEvent
import mindustry.mod.Mod
import mindustry.ui.dialogs.BaseDialog

class MainMod : Mod() {
    init {
        Log.info("加载MOD中")
        Events.on(ClientLoadEvent::class.java) {
                val dialog = BaseDialog("Welcome!")
                dialog.cont.add("欢迎使用本MOD!").row()
                dialog.cont.button("确定", dialog::hide).size(100f, 50f)
                dialog.show()
            }
        }

    override fun loadContent() {
        MCItems().load()
        MCBlocks().load()
    }
}
