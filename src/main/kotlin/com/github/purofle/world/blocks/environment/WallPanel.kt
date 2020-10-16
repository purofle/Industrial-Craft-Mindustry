package com.github.purofle.world.blocks.environment

import mindustry.world.blocks.defense.Wall
import mindustry.world.meta.BlockStat

open class WallPanel(name: String?) : Wall(name) {
    var isConductor = false
    override fun setStats() {
        super.setStats()
        stats.remove(BlockStat.health)
    }

    override fun setBars() {
        super.setBars()
        bars.remove("health")
    }

    inner class WallPanelBuild : WallBuild() {
        override fun handleDamage(amount: Float): Float {
            return 0f
        }
    }

    init {
        health = 1
        flashHit = false
        deflect = false
    }
}