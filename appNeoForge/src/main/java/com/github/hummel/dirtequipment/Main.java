package com.github.hummel.dirtequipment;

import com.github.hummel.dirtequipment.handler.ModEventHandler;
import com.github.hummel.dirtequipment.init.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod("dirtequipment")
public class Main {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	public Main(IEventBus modEventBus) {
		var modEventHandler = new ModEventHandler();
		modEventBus.register(modEventHandler);

		Items.register(modEventBus);
	}
}