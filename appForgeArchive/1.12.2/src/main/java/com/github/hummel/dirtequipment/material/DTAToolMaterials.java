package com.github.hummel.dirtequipment.material;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class DTAToolMaterials {
	public static final Item.ToolMaterial DIRT = EnumHelper.addToolMaterial("dirt", 3, 1561, 8.0f, 3.0f, 10).setRepairItem(new ItemStack(Blocks.DIRT));

	private DTAToolMaterials() {
	}
}