package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.DTAArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;

public class DTAItemArmor extends ArmorItem {
	public DTAItemArmor(EquipmentSlot equipmentSlot) {
		super(DTAArmorMaterials.DIRT, equipmentSlot, new Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
