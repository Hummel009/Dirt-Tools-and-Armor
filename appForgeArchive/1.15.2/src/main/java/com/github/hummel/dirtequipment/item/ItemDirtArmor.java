package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.ArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemDirtArmor extends ArmorItem {
	public ItemDirtArmor(EquipmentSlotType equipmentSlotType) {
		super(ArmorMaterials.DIRT, equipmentSlotType, new Properties().tab(ItemGroup.TAB_COMBAT));
	}

	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity, EquipmentSlotType equipmentSlotType, String layer) {
		return "dirtequipment:textures/models/armor/dirt_layer_" + (equipmentSlotType == EquipmentSlotType.LEGS ? 2 : 1) + ".png";
	}
}