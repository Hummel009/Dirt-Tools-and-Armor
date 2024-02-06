package dirtequipment.item;

import dirtequipment.material.DTAArmorMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class DTAItemArmor extends ItemArmor {
	public DTAItemArmor(EntityEquipmentSlot entityEquipmentSlot) {
		super(DTAArmorMaterials.DIRT, entityEquipmentSlot == EntityEquipmentSlot.LEGS ? 2 : 1, entityEquipmentSlot);
		setCreativeTab(CreativeTabs.COMBAT);
	}

	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity, EntityEquipmentSlot entityEquipmentSlot, String layer) {
		return "dirtequipment:textures/models/armor/dirt_layer_" + (entityEquipmentSlot == EntityEquipmentSlot.LEGS ? 2 : 1) + ".png";
	}
}
