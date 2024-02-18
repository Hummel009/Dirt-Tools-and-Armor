package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.DTAArmorMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class DTAItemArmor extends ItemArmor implements IArmorTextureProvider {
	public DTAItemArmor(int id, int slot) {
		super(id, DTAArmorMaterials.DIRT, slot == 2 ? 2 : 1, slot);
		setCreativeTab(CreativeTabs.tabCombat);
	}

	@Override
	public String getArmorTextureFile(ItemStack itemStack) {
		return "/assets/dirtequipment/textures/models/armor/dirt_layer_" + (armorType == 2 ? 2 : 1) + ".png";
	}
}
