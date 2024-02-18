package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.DTAToolMaterials;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HoeItem;

public class DTAItemHoe extends HoeItem {
	public DTAItemHoe() {
		super(DTAToolMaterials.DIRT, -3, 0.0f, new Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
