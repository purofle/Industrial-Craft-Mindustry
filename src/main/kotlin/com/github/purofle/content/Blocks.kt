package com.github.purofle.content

import mindustry.content.Bullets
import mindustry.content.Fx
import mindustry.content.Items
import mindustry.ctype.ContentList
import mindustry.type.Category
import mindustry.type.ItemStack.with
import mindustry.world.blocks.defense.turrets.ItemTurret

class Blocks : ContentList {

    companion object {
        var ST: ItemTurret? = null
    }

    override fun load() {
        ST = object : ItemTurret("st") {
            init {
                requirements(Category.turret, with(Items.copper, 50), true)
                ammo(
                        Items.copper, Bullets.standardCopper
                )

                spread = 4f
                shots = 2
                alternate = true
                reloadTime = 20f
                restitution = 0.01f
                range = 200f
                shootCone = 20f
                ammoUseEffect = Fx.shellEjectSmall
                health = 200
                inaccuracy = 2f
                rotateSpeed = 10f
            }
        }
    }
}