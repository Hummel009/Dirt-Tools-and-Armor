package com.github.hummel.dirtequipment;

import com.github.hummel.dirtequipment.init.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("dirtequipment")
@SuppressWarnings("UtilityClassWithPublicConstructor")
public class Main {
	@SuppressWarnings("unused")
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "111229022024";

	public Main() {
		var modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		Items.register(modEventBus);
	}
}