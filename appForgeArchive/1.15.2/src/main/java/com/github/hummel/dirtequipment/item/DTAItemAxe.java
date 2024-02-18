package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.DTAToolMaterials;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemGroup;

public class DTAItemAxe extends AxeItem {
	public DTAItemAxe() {
		super(DTAToolMaterials.DIRT, 5.0f, -3.0f, new Properties().tab(ItemGroup.TAB_TOOLS));
	}
}
