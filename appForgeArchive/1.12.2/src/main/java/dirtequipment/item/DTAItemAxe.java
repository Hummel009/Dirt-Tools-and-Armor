package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class DTAItemAxe extends ItemAxe {
	public DTAItemAxe() {
		super(DTAToolMaterials.DIRT, 8.0f, -3.0f);
		setCreativeTab(CreativeTabs.TOOLS);
	}
}
