package com.github.hummel.dirtequipment.init;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class Langs {
	private Langs() {
	}

	public static void preInit() {
		LanguageRegistry instance = LanguageRegistry.instance();

		instance.loadLocalization("/assets/dirtequipment/lang/en_US.lang", "en_US", false);
		instance.loadLocalization("/assets/dirtequipment/lang/ru_RU.lang", "ru_RU", false);
		instance.loadLocalization("/assets/dirtequipment/lang/uk_UA.lang", "uk_UA", false);
		instance.loadLocalization("/assets/dirtequipment/lang/zh_CN.lang", "zh_CN", false);
	}
}