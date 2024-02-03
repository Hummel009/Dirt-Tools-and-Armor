package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemSword;

public class DTAItemSword extends ItemSword {
	public DTAItemSword() {
		super(DTAToolMaterials.DIRT, 3, -2.4f, new Item.Properties().group(ItemGroup.COMBAT));
	}
}
