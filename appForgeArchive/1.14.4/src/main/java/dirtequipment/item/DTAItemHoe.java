package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

public class DTAItemHoe extends HoeItem {
	public DTAItemHoe() {
		super(DTAToolMaterials.DIRT, 0.0f, new Item.Properties().tab(ItemGroup.TAB_TOOLS));
	}
}
