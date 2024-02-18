package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.DTAToolMaterials;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemGroup;

public class DTAItemAxe extends ItemAxe {
	public DTAItemAxe() {
		super(DTAToolMaterials.DIRT, 5.0f, -3.0f, new Properties().group(ItemGroup.TOOLS));
	}
}
