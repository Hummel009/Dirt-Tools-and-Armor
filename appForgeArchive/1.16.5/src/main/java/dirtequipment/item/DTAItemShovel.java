package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;

public class DTAItemShovel extends ShovelItem {
	public DTAItemShovel() {
		super(DTAToolMaterials.DIRT, 1.5f, -3.0f, new Item.Properties().tab(ItemGroup.TAB_TOOLS));
	}
}
