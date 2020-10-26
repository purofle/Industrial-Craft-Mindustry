package com.github.purofle.content

import mindustry.content.Bullets
import mindustry.ctype.ContentList
import mindustry.entities.bullet.BasicBulletType
import mindustry.entities.bullet.BulletType

class MCBullets: ContentList {
    companion object {
        var ironBullets: BulletType? = null
    }
    override fun load() {
        ironBullets = object : BasicBulletType(2.8f, 8.5f) {
            init {
                width = 7f
                height = 9f

            }
        }
    }
}