package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.item.PickaxeItem;

public class DTAItemPickaxe extends PickaxeItem {
	public DTAItemPickaxe() {
		super(DTAToolMaterials.DIRT, 1, -2.8f, new Settings());
	}
}
