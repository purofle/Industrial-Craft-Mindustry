package com.github.purofle.content

import arc.graphics.Color
import mindustry.content.Bullets
import mindustry.content.Fx
import mindustry.content.Items
import mindustry.ctype.ContentList
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.type.ItemStack.with
import mindustry.world.Block
import mindustry.world.blocks.defense.turrets.ItemTurret
import mindustry.world.blocks.environment.OreBlock
import mindustry.world.blocks.production.GenericSmelter

class MCBlocks : ContentList {

    companion object {
        // 矿物
        /**
         * OreIron: 铁矿
         */
        var oreIron: Block? = null
        // 制作增加
        /**
         * beater: 铜磨
         */
        var beater: Block? = null
        // 炮台
        /**
         * CB: 铁质炮台
         */
        var CB: Block? = null
    }

    override fun load() {
        oreIron = object : OreBlock(MCItems.Iron) {
            init {
                oreDefault = true
                oreThreshold = 0.8f
                oreScale = 23.95f
            }
        }

        beater = object : GenericSmelter("beater") {
            init {
                requirements(Category.crafting, with(Items.copper, 50))
                craftEffect = Fx.smeltsmoke
                outputItem = ItemStack(MCItems.iron_nugget, 1)
                craftTime = 40f
                size = 2
                hasPower = true
                hasLiquids = false
                flameColor = Color.valueOf("ffef99")

                consumes.items(ItemStack(MCItems.Iron, 1))
                consumes.power(0.50f)
            }
        }
        CB = object : ItemTurret("CB") {
            init {
                requirements(Category.crafting, with(MCItems.Iron, 50))
                ammo(
                        MCItems.iron_nugget, Bullets.damageLightningGround
                )
                spread = 4.3f
                shots = 2
                alternate = true
                reloadTime = 20f
                restitution = 0.03f
                range = 90f
                shootCone = 15f
                ammoUseEffect = Fx.generatespark
                health = 250
                inaccuracy = 2f
                rotateSpeed = 10f
            }
        }
    }
}