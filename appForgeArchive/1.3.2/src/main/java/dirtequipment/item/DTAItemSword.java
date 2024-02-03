package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemSword;

public class DTAItemSword extends ItemSword {
	public DTAItemSword(int id) {
		super(id, DTAToolMaterials.DIRT);
		setCreativeTab(CreativeTabs.tabCombat);
	}
}
