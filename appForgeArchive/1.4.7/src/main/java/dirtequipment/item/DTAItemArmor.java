package dirtequipment.item;

import dirtequipment.material.DTAArmorMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class DTAItemArmor extends ItemArmor implements IArmorTextureProvider {
	public DTAItemArmor(int id, int equipmentSlot) {
		super(id, DTAArmorMaterials.DIRT, equipmentSlot == 2 ? 2 : 1, equipmentSlot);
		setCreativeTab(CreativeTabs.tabCombat);
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		return "/assets/dirtequipment/textures/models/armor/dirt_layer_" + (armorType == 2 ? 2 : 1) + ".png";
	}
}
