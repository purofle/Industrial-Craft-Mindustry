package com.github.purofle.content

import mindustry.ctype.ContentList
import mindustry.type.Item

class MCItems : ContentList{
    companion object {
        val iron_nugget: Item? = null
        var Iron:Item? = null
    }
    override fun load() {
        Iron = object : Item("Iron") {
            init {
                alwaysUnlocked = true
            }
        }
        object : Item("iron_nugget") {
            init {
                alwaysUnlocked = true
            }
        }
    }
}