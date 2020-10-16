package com.github.purofle.content

import com.github.purofle.world.blocks.environment.WallPanel
import mindustry.content.Items
import mindustry.ctype.ContentList
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.meta.BuildVisibility

class Blocks : ContentList {

    companion object {
        var BigWall: WallPanel? = null
    }

    override fun load() {
        BigWall = object : WallPanel("大墙") {
            init {
                requirements(Category.defense, ItemStack.with(Items.lead, 5, Items.silicon, 5))
                isConductor = true
                health = 100
                size = 1
                buildVisibility = BuildVisibility.sandboxOnly
            }
        }
    }
}