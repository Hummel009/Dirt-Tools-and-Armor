package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.DTAToolMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class DTAItemAxe extends ItemAxe {
	public DTAItemAxe() {
		super(DTAToolMaterials.DIRT);
		setCreativeTab(CreativeTabs.tabTools);
	}
}
