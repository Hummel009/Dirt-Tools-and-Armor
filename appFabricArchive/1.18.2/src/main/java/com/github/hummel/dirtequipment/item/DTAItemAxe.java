package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.DTAToolMaterials;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.CreativeModeTab;

public class DTAItemAxe extends AxeItem {
	public DTAItemAxe() {
		super(DTAToolMaterials.DIRT, 5.0f, -3.0f, new Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
