package com.github.hummel.dirtequipment.handler;

import com.github.hummel.dirtequipment.init.Items;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;

public class FabricEventHandler {
	private FabricEventHandler() {
	}

	public static void handle() {
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(populator -> {
			populator.accept(Items.DIRT_SWORD);
			populator.accept(Items.DIRT_HELMET);
			populator.accept(Items.DIRT_CHESTPLATE);
			populator.accept(Items.DIRT_LEGGINGS);
			populator.accept(Items.DIRT_BOOTS);
		});

		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(populator -> {
			populator.accept(Items.DIRT_SHOVEL);
			populator.accept(Items.DIRT_PICKAXE);
			populator.accept(Items.DIRT_AXE);
			populator.accept(Items.DIRT_HOE);
		});
	}
}