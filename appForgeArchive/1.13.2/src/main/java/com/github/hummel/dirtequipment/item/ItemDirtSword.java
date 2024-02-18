package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.ToolMaterials;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemSword;

public class ItemDirtSword extends ItemSword {
	public ItemDirtSword() {
		super(ToolMaterials.DIRT, 3, -2.4f, new Properties().group(ItemGroup.COMBAT));
	}
}