package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.DTAToolMaterials;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemPickaxe;

public class DTAItemPickaxe extends ItemPickaxe {
	public DTAItemPickaxe() {
		super(DTAToolMaterials.DIRT, 1, -2.8f, new Properties().group(ItemGroup.TOOLS));
	}
}
