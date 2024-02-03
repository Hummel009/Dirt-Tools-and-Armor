package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;

public class DTAItemAxe extends AxeItem {
	public DTAItemAxe() {
		super(DTAToolMaterials.DIRT, 5.0f, -3.0f, new Item.Properties());
	}
}
