package com.github.hummel.dirtequipment.init;

import com.github.hummel.dirtequipment.Config;
import com.github.hummel.dirtequipment.item.*;
import com.google.common.base.CaseFormat;
import net.minecraft.src.Item;

@SuppressWarnings({"WeakerAccess", "PublicField"})
public class Items {
	public static Item dirtSword;

	public static Item dirtHelmet;
	public static Item dirtChestplate;
	public static Item dirtLeggings;
	public static Item dirtBoots;

	public static Item dirtShovel;
	public static Item dirtPickaxe;
	public static Item dirtAxe;
	public static Item dirtHoe;

	private Items() {
	}

	public static void preInit() {
		dirtSword = new ItemDirtSword(Config.idDirtSword - 256);

		dirtHelmet = new ItemDirtArmor(Config.idDirtHelmet - 256, 0);
		dirtChestplate = new ItemDirtArmor(Config.idDirtChestplate - 256, 1);
		dirtLeggings = new ItemDirtArmor(Config.idDirtLeggings - 256, 2);
		dirtBoots = new ItemDirtArmor(Config.idDirtBoots - 256, 3);

		dirtShovel = new ItemDirtShovel(Config.idDirtShovel - 256);
		dirtPickaxe = new ItemDirtPickaxe(Config.idDirtPickaxe - 256);
		dirtAxe = new ItemDirtAxe(Config.idDirtAxe - 256);
		dirtHoe = new ItemDirtHoe(Config.idDirtHoe - 256);

		int id = 0;
		dirtAxe.setIconIndex(id++);
		dirtBoots.setIconIndex(id++);
		dirtChestplate.setIconIndex(id++);
		dirtHelmet.setIconIndex(id++);
		dirtHoe.setIconIndex(id++);
		dirtLeggings.setIconIndex(id++);
		dirtPickaxe.setIconIndex(id++);
		dirtShovel.setIconIndex(id++);
		dirtSword.setIconIndex(id);

		register(dirtSword, "dirtSword");

		register(dirtHelmet, "dirtHelmet");
		register(dirtChestplate, "dirtChestplate");
		register(dirtLeggings, "dirtLeggings");
		register(dirtBoots, "dirtBoots");

		register(dirtShovel, "dirtShovel");
		register(dirtPickaxe, "dirtPickaxe");
		register(dirtAxe, "dirtAxe");
		register(dirtHoe, "dirtHoe");
	}

	private static void register(Item item, String name) {
		String itemName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
		item.setTextureFile("/assets/dirtequipment/textures/items/sprite.png");
		item.setItemName(itemName);
	}
}