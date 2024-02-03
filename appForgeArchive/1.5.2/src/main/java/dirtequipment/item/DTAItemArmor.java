package dirtequipment.item;

import dirtequipment.material.DTAArmorMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class DTAItemArmor extends ItemArmor {
	public DTAItemArmor(int id, int equipmentSlot) {
		super(id, DTAArmorMaterials.DIRT, equipmentSlot == 2 ? 2 : 1, equipmentSlot);
		setCreativeTab(CreativeTabs.tabCombat);
	}

	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer) {
		return "/textures/models/armor/dirt_layer_" + (slot == 2 ? 2 : 1) + ".png";
	}
}
