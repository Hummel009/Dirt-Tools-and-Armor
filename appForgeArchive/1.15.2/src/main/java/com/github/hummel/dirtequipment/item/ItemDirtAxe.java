package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.ToolMaterials;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemGroup;

public class ItemDirtAxe extends AxeItem {
	public ItemDirtAxe() {
		super(ToolMaterials.DIRT, 5.0f, -3.0f, new Properties().tab(ItemGroup.TAB_TOOLS));
	}
}