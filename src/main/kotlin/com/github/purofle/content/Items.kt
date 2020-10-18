package com.github.purofle.content

import mindustry.ctype.ContentList
import mindustry.type.Item

class Items : ContentList {
    companion object {
        var Iron: Item? = null
    }
    override fun load() {
        Iron = object : Item("Iron") {
            init {
                alwaysUnlocked = true
            }
        }
    }
}