package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemPickaxe;

public class DTAItemPickaxe extends ItemPickaxe {
	public DTAItemPickaxe() {
		super(DTAToolMaterials.DIRT, 1, -2.8f, new Item.Properties().group(ItemGroup.TOOLS));
	}
}
