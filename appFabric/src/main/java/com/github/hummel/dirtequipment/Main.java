package com.github.hummel.dirtequipment;

import com.github.hummel.dirtequipment.handler.FabricEventHandler;
import com.github.hummel.dirtequipment.init.ArmorMaterials;
import com.github.hummel.dirtequipment.init.Items;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "111229022024";

	@Override
	public void onInitialize() {
		ArmorMaterials.forceClassLoad();
		Items.register();

		FabricEventHandler.handle();
	}
}