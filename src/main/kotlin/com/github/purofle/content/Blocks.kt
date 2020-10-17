package com.github.purofle.content

import mindustry.ctype.ContentList
import mindustry.world.blocks.environment.OreBlock

class Blocks : ContentList {

    companion object {
        var oreIron: OreBlock? = null
    }

    override fun load() {
        oreIron = object : OreBlock(Items.Iron) {
            init {
                oreDefault = true
                oreThreshold = 0.8f
                oreScale = 23.95f
            }
        }
    }
}