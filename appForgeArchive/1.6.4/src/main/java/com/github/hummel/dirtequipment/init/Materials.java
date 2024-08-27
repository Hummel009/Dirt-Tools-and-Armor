package com.github.hummel.dirtequipment.init;

import net.minecraft.block.Block;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;

@SuppressWarnings("WeakerAccess")
public class Materials {
	public static final EnumArmorMaterial DIRT_ARMOR;
	public static final EnumToolMaterial DIRT_TOOL;

	private Materials() {
	}

	static {
		DIRT_ARMOR = EnumHelper.addArmorMaterial("dirt", 33, new int[]{3, 6, 8, 3}, 10);
		DIRT_ARMOR.customCraftingMaterial = new ItemStack(Block.dirt).getItem();
		DIRT_TOOL = EnumHelper.addToolMaterial("dirt", 3, 1561, 8.0f, 3.0f, 10);
		DIRT_TOOL.customCraftingMaterial = new ItemStack(Block.dirt).getItem();
	}
}