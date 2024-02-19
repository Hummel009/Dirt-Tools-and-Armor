package com.github.hummel.dirtequipment.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@SuppressWarnings("WeakerAccess")
public class Materials {
	public static final ItemArmor.ArmorMaterial DIRT_ARMOR;
	public static final Item.ToolMaterial DIRT_TOOL;

	private Materials() {
	}

	static {
		DIRT_ARMOR = EnumHelper.addArmorMaterial("dirt", 33, new int[]{3, 6, 8, 3}, 10);
		DIRT_ARMOR.customCraftingMaterial = new ItemStack(Blocks.dirt).getItem();
		DIRT_TOOL = EnumHelper.addToolMaterial("dirt", 3, 1561, 8.0f, 3.0f, 10);
		DIRT_TOOL.setRepairItem(new ItemStack(Blocks.dirt));
	}
}