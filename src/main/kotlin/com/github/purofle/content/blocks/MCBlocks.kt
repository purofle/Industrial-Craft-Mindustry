package com.github.purofle.content.blocks

import arc.graphics.Color
import com.github.purofle.content.MCItems
import mindustry.content.Fx
import mindustry.content.Items
import mindustry.ctype.ContentList
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.type.ItemStack.with
import mindustry.world.blocks.environment.OreBlock
import mindustry.world.blocks.production.GenericSmelter

class MCBlocks : ContentList {

    override fun load() {
        object : OreBlock(MCItems.Iron) {
            init {
                oreDefault = true
                oreThreshold = 0.8f
                oreScale = 23.95f
            }
        }

        object : GenericSmelter("beater") {
            init {
                requirements(Category.crafting, with(Items.copper, 50, Items.lead, 200))
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
        }
    }