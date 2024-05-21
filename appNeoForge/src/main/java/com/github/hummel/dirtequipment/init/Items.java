package com.github.hummel.dirtequipment.init;

import com.github.hummel.dirtequipment.item.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@SuppressWarnings({"WeakerAccess", "unused"})
public class Items {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, "dirtequipment");

	public static final DeferredHolder<Item, Item> DIRT_SWORD = REGISTRY.register("dirt_sword", ItemDirtSword::new);

	public static final DeferredHolder<Item, Item> DIRT_HELMET = REGISTRY.register("dirt_helmet", () -> new ItemDirtArmor(ArmorItem.Type.HELMET));
	public static final DeferredHolder<Item, Item> DIRT_CHESTPLATE = REGISTRY.register("dirt_chestplate", () -> new ItemDirtArmor(ArmorItem.Type.CHESTPLATE));
	public static final DeferredHolder<Item, Item> DIRT_LEGGINGS = REGISTRY.register("dirt_leggings", () -> new ItemDirtArmor(ArmorItem.Type.LEGGINGS));
	public static final DeferredHolder<Item, Item> DIRT_BOOTS = REGISTRY.register("dirt_boots", () -> new ItemDirtArmor(ArmorItem.Type.BOOTS));

	public static final DeferredHolder<Item, Item> DIRT_SHOVEL = REGISTRY.register("dirt_shovel", ItemDirtShovel::new);
	public static final DeferredHolder<Item, Item> DIRT_PICKAXE = REGISTRY.register("dirt_pickaxe", ItemDirtPickaxe::new);
	public static final DeferredHolder<Item, Item> DIRT_AXE = REGISTRY.register("dirt_axe", ItemDirtAxe::new);
	public static final DeferredHolder<Item, Item> DIRT_HOE = REGISTRY.register("dirt_hoe", ItemDirtHoe::new);

	private Items() {
	}

	public static void register(IEventBus modEventBus) {
		REGISTRY.register(modEventBus);
	}
}