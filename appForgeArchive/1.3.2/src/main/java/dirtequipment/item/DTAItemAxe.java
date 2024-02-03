package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemAxe;

public class DTAItemAxe extends ItemAxe {
	public DTAItemAxe(int id) {
		super(id, DTAToolMaterials.DIRT);
		setCreativeTab(CreativeTabs.tabTools);
	}
}
