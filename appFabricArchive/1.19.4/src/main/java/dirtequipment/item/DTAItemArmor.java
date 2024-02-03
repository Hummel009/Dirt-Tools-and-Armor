package dirtequipment.item;

import dirtequipment.material.DTAArmorMaterials;
import net.minecraft.item.ArmorItem;

public class DTAItemArmor extends ArmorItem {
	public DTAItemArmor(Type type) {
		super(DTAArmorMaterials.DIRT, type, new Settings());
	}
}
