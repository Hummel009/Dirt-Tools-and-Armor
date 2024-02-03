package dirtequipment.item;

import dirtequipment.material.DTAToolMaterials;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;

public class DTAItemPickaxe extends PickaxeItem {
	public DTAItemPickaxe() {
		super(DTAToolMaterials.DIRT, 1, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
