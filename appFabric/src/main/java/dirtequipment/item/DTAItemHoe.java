package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.item.HoeItem;

public class DTAItemHoe extends HoeItem {
	public DTAItemHoe() {
		super(DTAToolMaterials.DIRT, -3, 0.0f, new Settings());
	}
}
