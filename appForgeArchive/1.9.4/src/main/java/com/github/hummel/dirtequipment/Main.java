package com.github.hummel.dirtequipment;

import com.github.hummel.dirtequipment.init.Items;
import com.github.hummel.dirtequipment.init.Recipes;
import com.github.hummel.dirtequipment.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@SuppressWarnings({"PublicField", "WeakerAccess"})
@Mod(modid = "dirtequipment", useMetadata = true)
public class Main {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "111229022024";

	@SidedProxy(clientSide = "com.github.hummel.dirtequipment.proxy.ClientProxy", serverSide = "com.github.hummel.dirtequipment.proxy.ServerProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Items.preInit();
		Recipes.preInit();
	}

	@Mod.EventHandler
	public void onInit(FMLInitializationEvent event) {
		proxy.onInit();
	}
}