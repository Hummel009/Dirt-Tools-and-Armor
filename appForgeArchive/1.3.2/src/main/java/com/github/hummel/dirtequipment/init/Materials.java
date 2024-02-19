package com.github.hummel.dirtequipment.init;

import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

@SuppressWarnings("WeakerAccess")
public class Materials {
	public static final EnumArmorMaterial DIRT_ARMOR = EnumHelper.addArmorMaterial("dirt", 33, new int[]{3, 6, 8, 3}, 10);
	public static final EnumToolMaterial DIRT_TOOL = EnumHelper.addToolMaterial("dirt", 3, 1561, 8.0f, 3, 10);

	private Materials() {
	}
}