package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.DTAToolMaterials;
import net.minecraft.world.item.PickaxeItem;

public class DTAItemPickaxe extends PickaxeItem {
	public DTAItemPickaxe() {
		super(DTAToolMaterials.DIRT, 1, -2.8f, new Properties());
	}
}