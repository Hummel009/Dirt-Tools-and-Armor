package com.github.hummel.dirtequipment.init;

import com.github.hummel.dirtequipment.item.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;

@SuppressWarnings("WeakerAccess")
public class Items {
	public static final Item DIRT_SWORD = new ItemDirtSword();

	public static final Item DIRT_HELMET = new ItemDirtArmor(ArmorItem.Type.HELMET);
	public static final Item DIRT_CHESTPLATE = new ItemDirtArmor(ArmorItem.Type.CHESTPLATE);
	public static final Item DIRT_LEGGINGS = new ItemDirtArmor(ArmorItem.Type.LEGGINGS);
	public static final Item DIRT_BOOTS = new ItemDirtArmor(ArmorItem.Type.BOOTS);

	public static final Item DIRT_SHOVEL = new ItemDirtShovel();
	public static final Item DIRT_PICKAXE = new ItemDirtPickaxe();
	public static final Item DIRT_AXE = new ItemDirtAxe();
	public static final Item DIRT_HOE = new ItemDirtHoe();

	private Items() {
	}

	public static void register() {
		register(DIRT_SWORD, "dirt_sword");

		register(DIRT_HELMET, "dirt_helmet");
		register(DIRT_CHESTPLATE, "dirt_chestplate");
		register(DIRT_LEGGINGS, "dirt_leggings");
		register(DIRT_BOOTS, "dirt_boots");

		register(DIRT_SHOVEL, "dirt_shovel");
		register(DIRT_PICKAXE, "dirt_pickaxe");
		register(DIRT_AXE, "dirt_axe");
		register(DIRT_HOE, "dirt_hoe");
	}

	private static void register(Item item, String name) {
		Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath("dirtequipment", name), item);
	}
}