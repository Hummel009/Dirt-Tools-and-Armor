package com.github.hummel.dirtequipment.handler;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import static com.github.hummel.dirtequipment.init.Items.*;

public class FabricEventHandler {
	private FabricEventHandler() {
	}

	public static void handle() {
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(populator -> {
			populator.addAfter(DIRT_SWORD, new ItemStack(Items.NETHERITE_SWORD));
			populator.addAfter(DIRT_HELMET, new ItemStack(Items.NETHERITE_BOOTS));
			populator.addAfter(DIRT_CHESTPLATE, new ItemStack(Items.NETHERITE_BOOTS));
			populator.addAfter(DIRT_LEGGINGS, new ItemStack(Items.NETHERITE_BOOTS));
			populator.addAfter(DIRT_BOOTS, new ItemStack(Items.NETHERITE_BOOTS));
		});

		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(populator -> {
			populator.addAfter(DIRT_HOE, new ItemStack(Items.NETHERITE_HOE));
			populator.addAfter(DIRT_AXE, new ItemStack(Items.NETHERITE_HOE));
			populator.addAfter(DIRT_PICKAXE, new ItemStack(Items.NETHERITE_HOE));
			populator.addAfter(DIRT_SHOVEL, new ItemStack(Items.NETHERITE_HOE));
		});
	}
}