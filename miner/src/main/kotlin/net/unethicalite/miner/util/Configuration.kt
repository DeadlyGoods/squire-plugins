package net.unethicalite.miner.util

import net.runelite.api.ItemID


enum class Rock(val item: Int, var rockId: IntArray) {
    IRON(ItemID.IRON_ORE, intArrayOf(11364, 11365)),
     TIN(ItemID.TIN_ORE, intArrayOf(11360, 11361)),
      COPPER(ItemID.COPPER_ORE, intArrayOf(10943, 11161));
    
}
