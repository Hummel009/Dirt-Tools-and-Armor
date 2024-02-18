package com.github.hummel.dirtequipment.material;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class DTAArmorMaterials {
	public static final ItemArmor.ArmorMaterial DIRT = EnumHelper.addArmorMaterial("dirt", 33, new int[]{3, 6, 8, 3}, 10);

	static {
		DIRT.customCraftingMaterial = new ItemStack(Blocks.dirt).getItem();
	}

	private DTAArmorMaterials() {
	}
}