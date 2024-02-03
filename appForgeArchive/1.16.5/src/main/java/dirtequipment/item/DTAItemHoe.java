package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemGroup;

public class DTAItemHoe extends HoeItem {
	public DTAItemHoe() {
		super(DTAToolMaterials.DIRT, -3, 0.0f, new Item.Properties().tab(ItemGroup.TAB_TOOLS));
	}
}
