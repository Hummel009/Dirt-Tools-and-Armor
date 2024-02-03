package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemSword;

public class DTAItemSword extends ItemSword {
	public DTAItemSword() {
		super(DTAToolMaterials.DIRT, 3, -2.4f, new Properties().group(ItemGroup.COMBAT));
	}
}
