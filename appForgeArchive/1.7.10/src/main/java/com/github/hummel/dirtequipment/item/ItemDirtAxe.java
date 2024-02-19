package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.init.Materials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemDirtAxe extends ItemAxe {
	public ItemDirtAxe() {
		super(Materials.DIRT_TOOL);
		setCreativeTab(CreativeTabs.tabTools);
	}
}