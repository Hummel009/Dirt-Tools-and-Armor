package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.ArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;

public class ItemDirtArmor extends ArmorItem {
	public ItemDirtArmor(EquipmentSlot equipmentSlot) {
		super(ArmorMaterials.DIRT, equipmentSlot, new Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
