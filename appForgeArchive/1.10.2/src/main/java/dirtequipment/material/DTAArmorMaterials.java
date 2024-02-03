package dirtequipment.material;

import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class DTAArmorMaterials {
	public static final ItemArmor.ArmorMaterial DIRT = EnumHelper.addArmorMaterial("dirt", "dirt", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 2.0F);

	static {
		DIRT.customCraftingMaterial = new ItemStack(Blocks.DIRT).getItem();
	}

	private DTAArmorMaterials() {
	}
}