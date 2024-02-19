package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.init.Materials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemDirtArmor extends ItemArmor {
	public ItemDirtArmor(EntityEquipmentSlot entityEquipmentSlot) {
		super(Materials.DIRT_ARMOR, entityEquipmentSlot == EntityEquipmentSlot.LEGS ? 2 : 1, entityEquipmentSlot);
		setCreativeTab(CreativeTabs.COMBAT);
	}

	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity, EntityEquipmentSlot entityEquipmentSlot, String layer) {
		return "dirtequipment:textures/models/armor/dirt_layer_" + (entityEquipmentSlot == EntityEquipmentSlot.LEGS ? 2 : 1) + ".png";
	}
}