package dirtequipment.item;

import dirtequipment.material.DTAArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class DTAItemArmor extends ItemArmor {
	public DTAItemArmor(EntityEquipmentSlot equipmentSlot) {
		super(DTAArmorMaterials.DIRT, equipmentSlot, new Properties().group(ItemGroup.COMBAT));
	}

	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, EntityEquipmentSlot equipmentSlot, String layer) {
		return "dirtequipment:textures/models/armor/dirt_layer_" + (equipmentSlot == EntityEquipmentSlot.LEGS ? 2 : 1) + ".png";
	}
}
