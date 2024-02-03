package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemGroup;

public class DTAItemAxe extends ItemAxe {
	public DTAItemAxe() {
		super(DTAToolMaterials.DIRT, 5.0f, -3.0f, new Item.Properties().group(ItemGroup.TOOLS));
	}
}
