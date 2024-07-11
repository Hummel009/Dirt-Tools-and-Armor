package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.ToolMaterials;
import net.minecraft.world.item.ShovelItem;

public class ItemDirtShovel extends ShovelItem {
	public ItemDirtShovel() {
		super(ToolMaterials.DIRT, new Properties().attributes(createAttributes(ToolMaterials.DIRT, 1.5f, -3.0f)));
	}
}