package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.item.AxeItem;

public class DTAItemAxe extends AxeItem {
	public DTAItemAxe() {
		super(DTAToolMaterials.DIRT, 5.0f, -3.0f, new Settings());
	}
}
