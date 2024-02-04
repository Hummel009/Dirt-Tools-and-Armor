package dirtequipment.item;

import dirtequipment.material.DTAArmorMaterials;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class DTAItemArmor extends ArmorItem {
	public DTAItemArmor(Type type) {
		super(DTAArmorMaterials.DIRT, type, new Properties());
	}

	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, EquipmentSlot slot, String layer) {
		return "dirtequipment:textures/models/armor/dirt_layer_" + (slot == EquipmentSlot.LEGS ? 2 : 1) + ".png";
	}
}
