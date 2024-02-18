package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.ToolMaterials;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;

public class ItemDirtPickaxe extends PickaxeItem {
	public ItemDirtPickaxe() {
		super(ToolMaterials.DIRT, 1, -2.8f, new Properties().tab(ItemGroup.TAB_TOOLS));
	}
}