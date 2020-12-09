package com.github.purofle.content.blocks

import arc.scene.ui.layout.Table
import com.github.purofle.content.dialogs.MCDTDialog
import mindustry.gen.Building
import mindustry.gen.Icon
import mindustry.ui.Styles
import mindustry.world.Block
import mindustry.world.meta.BlockGroup

open class MCDT(name: String) : Block(name) {
    override fun init() {
        super.init()
        update = true
        solid = true
        configurable = true
        group = BlockGroup.logic
    }

    class MCDTbuild : Building() {
        override fun buildConfiguration(table: Table) {
            table.button(Icon.book, Styles.clearTransi) {
                MCDTDialog().show()
            }
        }
    }
}