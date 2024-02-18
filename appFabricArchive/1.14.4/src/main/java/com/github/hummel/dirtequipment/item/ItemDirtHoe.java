package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.ToolMaterials;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HoeItem;

public class ItemDirtHoe extends HoeItem {
	public ItemDirtHoe() {
		super(ToolMaterials.DIRT, 0.0f, new Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}