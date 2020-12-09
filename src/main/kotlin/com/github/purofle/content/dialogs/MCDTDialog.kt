package com.github.purofle.content.dialogs

import mindustry.gen.Icon
import mindustry.ui.dialogs.BaseDialog

class MCDTDialog : BaseDialog("MCDTDialog") {
    init {
        clearChildren()
        addCloseListener() //监听返回 包括esc,手机返回键

        buttons.defaults().size(160f, 64f)

        buttons.button("@back", Icon.left, this::hide).name("back")
        //TODO
    }
}