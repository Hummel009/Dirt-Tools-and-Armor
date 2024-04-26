package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.ToolMaterials;
import net.minecraft.world.item.AxeItem;

public class ItemDirtAxe extends AxeItem {
	public ItemDirtAxe() {
		super(ToolMaterials.DIRT, new Properties().attributes(createAttributes(ToolMaterials.DIRT, 5.0f, -3.0f)));
	}
}