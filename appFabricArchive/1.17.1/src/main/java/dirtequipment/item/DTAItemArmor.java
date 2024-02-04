package dirtequipment.item;

import dirtequipment.material.DTAArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;

public class DTAItemArmor extends ArmorItem {
	public DTAItemArmor(EquipmentSlot type) {
		super(DTAArmorMaterials.DIRT, type, new Properties());
	}
}
