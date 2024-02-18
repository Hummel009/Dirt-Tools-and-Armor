package com.github.hummel.dirtequipment;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class DTACreativeTabs {
	private DTACreativeTabs() {
	}

	@SubscribeEvent
	public static void addCreativeTab(CreativeModeTabEvent.BuildContents event) {
		if (event.getTab() == CreativeModeTabs.COMBAT) {
			event.accept(DTA.DIRT_SWORD.get());
			event.accept(DTA.DIRT_HELMET.get());
			event.accept(DTA.DIRT_CHESTPLATE.get());
			event.accept(DTA.DIRT_LEGGINGS.get());
			event.accept(DTA.DIRT_BOOTS.get());
		}
		if (event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			event.accept(DTA.DIRT_PICKAXE.get());
			event.accept(DTA.DIRT_AXE.get());
			event.accept(DTA.DIRT_SHOVEL.get());
			event.accept(DTA.DIRT_HOE.get());
		}
	}
}
