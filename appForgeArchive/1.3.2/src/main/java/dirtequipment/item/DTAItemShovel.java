package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemSpade;

public class DTAItemShovel extends ItemSpade {
	public DTAItemShovel(int id) {
		super(id, DTAToolMaterials.DIRT);
		setCreativeTab(CreativeTabs.tabTools);
	}
}
