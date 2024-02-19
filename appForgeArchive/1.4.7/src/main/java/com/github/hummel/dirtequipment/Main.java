package com.github.hummel.dirtequipment;

import com.github.hummel.dirtequipment.init.Items;
import com.github.hummel.dirtequipment.init.Langs;
import com.github.hummel.dirtequipment.init.Recipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "dirtequipment", useMetadata = true)
public class Main {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	@Mod.PreInit
	public void preInit(FMLPreInitializationEvent event) {
		Config.preInit(event);

		Items.preInit();
		Langs.preInit();
		Recipes.preInit();
	}
}