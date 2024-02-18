package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.ToolMaterials;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class ItemDirtSword extends SwordItem {
	public ItemDirtSword() {
		super(ToolMaterials.DIRT, 3, -2.4f, new Properties().tab(ItemGroup.TAB_COMBAT));
	}
}