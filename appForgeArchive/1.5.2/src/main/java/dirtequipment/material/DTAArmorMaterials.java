package dirtequipment.material;

import net.minecraft.block.Block;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;

public class DTAArmorMaterials {
	public static final EnumArmorMaterial DIRT = EnumHelper.addArmorMaterial("dirt", 33, new int[]{3, 6, 8, 3}, 10);

	static {
		DIRT.customCraftingMaterial = new ItemStack(Block.dirt).getItem();
	}

	private DTAArmorMaterials() {
	}
}