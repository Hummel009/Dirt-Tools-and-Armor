package dirtequipment.material;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;

public class DTAToolMaterials {
	public static final EnumToolMaterial DIRT = EnumHelper.addToolMaterial("dirt", 3, 1561, 8.0f, 3, 10);

	static {
		DIRT.customCraftingMaterial = new ItemStack(Block.dirt).getItem();
	}

	private DTAToolMaterials() {
	}
}