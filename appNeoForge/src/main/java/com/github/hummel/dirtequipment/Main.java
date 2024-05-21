package com.github.hummel.dirtequipment;

import com.github.hummel.dirtequipment.handler.ModEventHandler;
import com.github.hummel.dirtequipment.init.ArmorMaterials;
import com.github.hummel.dirtequipment.init.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod("dirtequipment")
@SuppressWarnings("UtilityClassWithPublicConstructor")
public class Main {
	@SuppressWarnings("unused")
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "111229022024";

	public Main(IEventBus modEventBus) {
		var modEventHandler = new ModEventHandler();
		modEventBus.register(modEventHandler);

		ArmorMaterials.register(modEventBus);
		Items.register(modEventBus);
	}
}