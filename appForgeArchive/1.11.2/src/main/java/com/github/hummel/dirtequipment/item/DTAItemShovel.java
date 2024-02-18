package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.DTAToolMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class DTAItemShovel extends ItemSpade {
	public DTAItemShovel() {
		super(DTAToolMaterials.DIRT);
		setCreativeTab(CreativeTabs.TOOLS);
	}
}
