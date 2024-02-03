package dirtequipment.item;

import dirtequipment.material.DTAArmorMaterials;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemGroup;

public class DTAItemArmor extends ArmorItem {
	public DTAItemArmor(EquipmentSlot equipmentSlot) {
		super(DTAArmorMaterials.DIRT, equipmentSlot, new Settings().group(ItemGroup.COMBAT));
	}
}
