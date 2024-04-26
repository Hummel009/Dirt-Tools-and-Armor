package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.ToolMaterials;
import net.minecraft.world.item.HoeItem;

public class ItemDirtHoe extends HoeItem {
	public ItemDirtHoe() {
		super(ToolMaterials.DIRT, new Properties().attributes(createAttributes(ToolMaterials.DIRT, -3.0f, 0.0f)));
	}
}