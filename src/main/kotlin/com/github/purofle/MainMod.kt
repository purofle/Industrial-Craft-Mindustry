package com.github.purofle

import arc.Core
import arc.Events
import arc.Net
import arc.util.Log
import com.github.purofle.content.MCItems
import com.github.purofle.content.blocks.MCBlocks
import mindustry.game.EventType.ClientLoadEvent
import mindustry.mod.Mod
import mindustry.ui.dialogs.BaseDialog

class MainMod : Mod() {
    init {
        Log.info("加载MOD中")
        Events.on(ClientLoadEvent::class.java) {
            Core.net.httpGet("https://baidu.com", {
                if (it.status != Net.HttpStatus.OK) {
                    Log.warn("连接失败")
                } else {
                    val dialog = BaseDialog("Welcome!")
                    dialog.cont.add("欢迎使用本MOD~${it.resultAsString}").row()
                    dialog.cont.button("确定", dialog::hide).size(100f, 50f)
                    dialog.show()
                }
            }, {
                Log.warn(it.localizedMessage)
            })
        }
        }

    override fun loadContent() {
        MCItems().load()
        MCBlocks().load()
    }
}
