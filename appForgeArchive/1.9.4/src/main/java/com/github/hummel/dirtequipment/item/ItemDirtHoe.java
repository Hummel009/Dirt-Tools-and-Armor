package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.init.Materials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemDirtHoe extends ItemHoe {
	public ItemDirtHoe() {
		super(Materials.DIRT_TOOL);
		setCreativeTab(CreativeTabs.TOOLS);
	}
}