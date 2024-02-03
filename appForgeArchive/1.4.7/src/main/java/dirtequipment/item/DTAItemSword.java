package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class DTAItemSword extends ItemSword {
	public DTAItemSword(int id) {
		super(id, DTAToolMaterials.DIRT);
		setCreativeTab(CreativeTabs.tabCombat);
	}
}
