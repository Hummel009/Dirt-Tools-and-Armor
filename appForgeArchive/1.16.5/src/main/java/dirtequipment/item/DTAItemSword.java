package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class DTAItemSword extends SwordItem {
	public DTAItemSword() {
		super(DTAToolMaterials.DIRT, 3, -2.4f, new Properties().tab(ItemGroup.TAB_COMBAT));
	}
}
