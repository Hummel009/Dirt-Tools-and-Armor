package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class DTAItemAxe extends ItemAxe {
	public DTAItemAxe(int id) {
		super(id, DTAToolMaterials.DIRT);
		setCreativeTab(CreativeTabs.tabTools);
	}
}
