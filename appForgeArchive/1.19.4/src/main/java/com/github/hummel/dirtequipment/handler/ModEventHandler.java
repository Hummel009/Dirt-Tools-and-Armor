package com.github.hummel.dirtequipment.handler;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static com.github.hummel.dirtequipment.init.Items.*;

public class ModEventHandler {
	@SubscribeEvent
	@SuppressWarnings("MethodMayBeStatic")
	public void addCreativeTab(CreativeModeTabEvent.BuildContents event) {
		if (event.getTab() == CreativeModeTabs.COMBAT) {
			event.getEntries().putAfter(new ItemStack(Items.NETHERITE_SWORD), new ItemStack(DIRT_SWORD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			event.getEntries().putAfter(new ItemStack(Items.NETHERITE_AXE), new ItemStack(DIRT_AXE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

			event.getEntries().putAfter(new ItemStack(Items.NETHERITE_BOOTS), new ItemStack(DIRT_BOOTS.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			event.getEntries().putAfter(new ItemStack(Items.NETHERITE_BOOTS), new ItemStack(DIRT_LEGGINGS.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			event.getEntries().putAfter(new ItemStack(Items.NETHERITE_BOOTS), new ItemStack(DIRT_CHESTPLATE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			event.getEntries().putAfter(new ItemStack(Items.NETHERITE_BOOTS), new ItemStack(DIRT_HELMET.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			event.getEntries().putAfter(new ItemStack(Items.NETHERITE_HOE), new ItemStack(DIRT_HOE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			event.getEntries().putAfter(new ItemStack(Items.NETHERITE_HOE), new ItemStack(DIRT_AXE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			event.getEntries().putAfter(new ItemStack(Items.NETHERITE_HOE), new ItemStack(DIRT_PICKAXE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			event.getEntries().putAfter(new ItemStack(Items.NETHERITE_HOE), new ItemStack(DIRT_SHOVEL.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
		}
	}
}