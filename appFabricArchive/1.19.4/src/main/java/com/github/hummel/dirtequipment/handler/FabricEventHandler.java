package com.github.hummel.dirtequipment.handler;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;

import static com.github.hummel.dirtequipment.init.Items.*;

public class FabricEventHandler {
	private FabricEventHandler() {
	}

	public static void handle() {
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(populator -> {
			populator.addAfter(Items.NETHERITE_SWORD, DIRT_SWORD);

			populator.addAfter(Items.NETHERITE_BOOTS, DIRT_BOOTS);
			populator.addAfter(Items.NETHERITE_BOOTS, DIRT_LEGGINGS);
			populator.addAfter(Items.NETHERITE_BOOTS, DIRT_CHESTPLATE);
			populator.addAfter(Items.NETHERITE_BOOTS, DIRT_HELMET);
		});

		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(populator -> {
			populator.addAfter(Items.NETHERITE_HOE, DIRT_HOE);
			populator.addAfter(Items.NETHERITE_HOE, DIRT_AXE);
			populator.addAfter(Items.NETHERITE_HOE, DIRT_PICKAXE);
			populator.addAfter(Items.NETHERITE_HOE, DIRT_SHOVEL);
		});
	}
}