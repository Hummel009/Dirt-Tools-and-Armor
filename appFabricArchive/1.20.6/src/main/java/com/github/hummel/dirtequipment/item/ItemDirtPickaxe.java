package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.ToolMaterials;
import net.minecraft.world.item.PickaxeItem;

public class ItemDirtPickaxe extends PickaxeItem {
	public ItemDirtPickaxe() {
		super(ToolMaterials.DIRT, new Properties().attributes(createAttributes(ToolMaterials.DIRT, 1.0f, -2.8f)));
	}
}