package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.ArmorMaterials;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;

public class ItemDirtArmor extends ArmorItem {
	public ItemDirtArmor(Type type) {
		super(ArmorMaterials.DIRT, type, new Properties());
	}

	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity, EquipmentSlot equipmentSlot, String layer) {
		return "dirtequipment:textures/models/armor/dirt_layer_" + (equipmentSlot == EquipmentSlot.LEGS ? 2 : 1) + ".png";
	}
}