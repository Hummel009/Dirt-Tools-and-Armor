package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemPickaxe;

public class DTAItemPickaxe extends ItemPickaxe {
	public DTAItemPickaxe(int id) {
		super(id, DTAToolMaterials.DIRT);
		setCreativeTab(CreativeTabs.tabTools);
	}
}
