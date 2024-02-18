package com.github.hummel.dirtequipment;

import com.github.hummel.dirtequipment.item.*;
import dirtequipment.item.*;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod("dirtequipment")
@SuppressWarnings("WeakerAccess")
public class DTA {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems("dirtequipment");

	public static final DeferredItem<Item> DIRT_SWORD = ITEMS.register("dirt_sword", DTAItemSword::new);

	public static final DeferredItem<Item> DIRT_HELMET = ITEMS.register("dirt_helmet", () -> new DTAItemArmor(ArmorItem.Type.HELMET));
	public static final DeferredItem<Item> DIRT_CHESTPLATE = ITEMS.register("dirt_chestplate", () -> new DTAItemArmor(ArmorItem.Type.CHESTPLATE));
	public static final DeferredItem<Item> DIRT_LEGGINGS = ITEMS.register("dirt_leggings", () -> new DTAItemArmor(ArmorItem.Type.LEGGINGS));
	public static final DeferredItem<Item> DIRT_BOOTS = ITEMS.register("dirt_boots", () -> new DTAItemArmor(ArmorItem.Type.BOOTS));

	public static final DeferredItem<Item> DIRT_SHOVEL = ITEMS.register("dirt_shovel", DTAItemShovel::new);
	public static final DeferredItem<Item> DIRT_PICKAXE = ITEMS.register("dirt_pickaxe", DTAItemPickaxe::new);
	public static final DeferredItem<Item> DIRT_AXE = ITEMS.register("dirt_axe", DTAItemAxe::new);
	public static final DeferredItem<Item> DIRT_HOE = ITEMS.register("dirt_hoe", DTAItemHoe::new);

	public DTA(IEventBus eventBus) {
		eventBus.addListener(DTACreativeTabs::addCreativeTab);
		ITEMS.register(eventBus);
	}
}
