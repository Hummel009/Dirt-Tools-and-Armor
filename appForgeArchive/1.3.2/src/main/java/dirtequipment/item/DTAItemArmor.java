package dirtequipment.item;

import dirtequipment.material.DTAArmorMaterials;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
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
