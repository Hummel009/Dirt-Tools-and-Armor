package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemHoe;

public class DTAItemHoe extends ItemHoe {
	public DTAItemHoe() {
		super(DTAToolMaterials.DIRT, 0.0f, new Item.Properties().group(ItemGroup.TOOLS));
	}
}
