package com.github.hummel.dirtequipment.handler;

import com.github.hummel.dirtequipment.init.Items;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.bus.api.SubscribeEvent;

public class ModEventHandler {
	@SubscribeEvent
	public void addCreativeTab(BuildCreativeModeTabContentsEvent event) {
		if (event.getTabKey() == CreativeModeTabs.COMBAT) {
			event.accept(Items.DIRT_SWORD.get());
			event.accept(Items.DIRT_HELMET.get());
			event.accept(Items.DIRT_CHESTPLATE.get());
			event.accept(Items.DIRT_LEGGINGS.get());
			event.accept(Items.DIRT_BOOTS.get());
		}
		if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			event.accept(Items.DIRT_PICKAXE.get());
			event.accept(Items.DIRT_AXE.get());
			event.accept(Items.DIRT_SHOVEL.get());
			event.accept(Items.DIRT_HOE.get());
		}
	}
}