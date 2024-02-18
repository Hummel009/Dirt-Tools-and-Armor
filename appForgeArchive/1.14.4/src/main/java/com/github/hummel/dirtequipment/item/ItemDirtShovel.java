package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.ToolMaterials;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;

public class ItemDirtShovel extends ShovelItem {
	public ItemDirtShovel() {
		super(ToolMaterials.DIRT, 1.5f, -3.0f, new Properties().tab(ItemGroup.TAB_TOOLS));
	}
}