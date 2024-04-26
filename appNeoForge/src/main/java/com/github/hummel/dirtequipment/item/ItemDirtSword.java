package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.ToolMaterials;
import net.minecraft.world.item.SwordItem;

public class ItemDirtSword extends SwordItem {
	public ItemDirtSword() {
		super(ToolMaterials.DIRT, new Properties().attributes(createAttributes(ToolMaterials.DIRT, 3, -2.4f)));
	}
}