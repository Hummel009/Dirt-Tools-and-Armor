package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.init.Materials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemDirtArmor extends ItemArmor {
	public ItemDirtArmor(int id, int slot) {
		super(id, Materials.DIRT_ARMOR, slot == 2 ? 2 : 1, slot);
		setCreativeTab(CreativeTabs.tabCombat);
	}

	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, int layer) {
		return "/assets/dirtequipment/textures/models/armor/dirt_layer_" + (slot == 2 ? 2 : 1) + ".png";
	}
}