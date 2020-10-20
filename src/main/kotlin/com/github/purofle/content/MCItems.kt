package com.github.purofle.content

import mindustry.ctype.ContentList
import mindustry.type.Item

class MCItems : ContentList {
    companion object {
        var Iron: Item? = null
        var iron_nugget: Item? = null
    }
    override fun load() {
        Iron = object : Item("Iron") {
            init {
                alwaysUnlocked = true
            }
        }
    }
}