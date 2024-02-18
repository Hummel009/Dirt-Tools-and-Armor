package com.github.hummel.dirtequipment;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

import java.util.logging.Level;

@SuppressWarnings("PublicField")
public class DTAConfig {
	private static Configuration configuration;

	private static boolean loaded;

	public static int idDirtSword;

	public static int idDirtHelmet;
	public static int idDirtChestplate;
	public static int idDirtLeggings;
	public static int idDirtBoots;

	public static int idDirtShovel;
	public static int idDirtPickaxe;
	public static int idDirtAxe;
	public static int idDirtHoe;

	private DTAConfig() {
	}

	public static void preInit(FMLPreInitializationEvent event) {
		if (!loaded) {
			configuration = new Configuration(event.getSuggestedConfigurationFile());
			setDefaultValues();
		}
	}

	private static void setDefaultValues() {
		try {
			configuration.load();

			idDirtSword = configuration.get("item", "Dirt Sword", 920).getInt(920);

			idDirtHelmet = configuration.get("item", "Dirt Helmet", 921).getInt(921);
			idDirtChestplate = configuration.get("item", "Dirt Chestplate", 922).getInt(922);
			idDirtLeggings = configuration.get("item", "Dirt Leggings", 923).getInt(923);
			idDirtBoots = configuration.get("item", "Dirt Boots", 924).getInt(924);

			idDirtShovel = configuration.get("item", "Dirt Shovel", 925).getInt(925);
			idDirtPickaxe = configuration.get("item", "Dirt Pickaxe", 926).getInt(926);
			idDirtAxe = configuration.get("item", "Dirt Axe", 927).getInt(927);
			idDirtHoe = configuration.get("item", "Dirt Hoe", 928).getInt(928);
		} catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, "DTA has a problem loading it's configuration");
		} finally {
			configuration.save();
			loaded = true;
		}
	}
}