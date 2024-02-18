package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.ToolMaterials;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.PickaxeItem;

public class ItemDirtPickaxe extends PickaxeItem {
	public ItemDirtPickaxe() {
		super(ToolMaterials.DIRT, 1, -2.8f, new Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}