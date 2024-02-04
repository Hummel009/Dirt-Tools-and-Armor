package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;

public class DTAItemHoe extends HoeItem {
	public DTAItemHoe() {
		super(DTAToolMaterials.DIRT, -3, 0.0f, new Properties());
	}
}
