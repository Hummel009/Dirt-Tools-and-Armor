package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.ToolMaterials;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemGroup;

public class ItemDirtHoe extends HoeItem {
	public ItemDirtHoe() {
		super(ToolMaterials.DIRT, -3, 0.0f, new Properties().tab(ItemGroup.TAB_TOOLS));
	}
}