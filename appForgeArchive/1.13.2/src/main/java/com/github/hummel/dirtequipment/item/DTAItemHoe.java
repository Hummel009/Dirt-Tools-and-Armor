package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.DTAToolMaterials;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemHoe;

public class DTAItemHoe extends ItemHoe {
	public DTAItemHoe() {
		super(DTAToolMaterials.DIRT, 0.0f, new Properties().group(ItemGroup.TOOLS));
	}
}
