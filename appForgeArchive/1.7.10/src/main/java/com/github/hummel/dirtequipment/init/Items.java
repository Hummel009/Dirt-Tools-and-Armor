package com.github.hummel.dirtequipment.init;

import com.github.hummel.dirtequipment.item.*;
import com.google.common.base.CaseFormat;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({"WeakerAccess", "PublicField"})
public class Items {
	public static final Collection<Item> CONTENT = new ArrayList<>();

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
		dirtSword = new ItemDirtSword();

		dirtHelmet = new ItemDirtArmor(0);
		dirtChestplate = new ItemDirtArmor(1);
		dirtLeggings = new ItemDirtArmor(2);
		dirtBoots = new ItemDirtArmor(3);

		dirtShovel = new ItemDirtShovel();
		dirtPickaxe = new ItemDirtPickaxe();
		dirtAxe = new ItemDirtAxe();
		dirtHoe = new ItemDirtHoe();

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
		item.setUnlocalizedName(itemName);
		item.setTextureName("dirtequipment:" + itemName);
		GameRegistry.registerItem(item, itemName);
		CONTENT.add(item);
	}
}