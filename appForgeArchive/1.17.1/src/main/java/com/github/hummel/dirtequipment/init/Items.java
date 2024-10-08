package com.github.hummel.dirtequipment.init;

import com.github.hummel.dirtequipment.item.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings({"WeakerAccess", "unused"})
public class Items {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "dirtequipment");

	public static final RegistryObject<Item> DIRT_SWORD = REGISTRY.register("dirt_sword", ItemDirtSword::new);

	public static final RegistryObject<Item> DIRT_HELMET = REGISTRY.register("dirt_helmet", () -> new ItemDirtArmor(EquipmentSlot.HEAD));
	public static final RegistryObject<Item> DIRT_CHESTPLATE = REGISTRY.register("dirt_chestplate", () -> new ItemDirtArmor(EquipmentSlot.CHEST));
	public static final RegistryObject<Item> DIRT_LEGGINGS = REGISTRY.register("dirt_leggings", () -> new ItemDirtArmor(EquipmentSlot.LEGS));
	public static final RegistryObject<Item> DIRT_BOOTS = REGISTRY.register("dirt_boots", () -> new ItemDirtArmor(EquipmentSlot.FEET));

	public static final RegistryObject<Item> DIRT_SHOVEL = REGISTRY.register("dirt_shovel", ItemDirtShovel::new);
	public static final RegistryObject<Item> DIRT_PICKAXE = REGISTRY.register("dirt_pickaxe", ItemDirtPickaxe::new);
	public static final RegistryObject<Item> DIRT_AXE = REGISTRY.register("dirt_axe", ItemDirtAxe::new);
	public static final RegistryObject<Item> DIRT_HOE = REGISTRY.register("dirt_hoe", ItemDirtHoe::new);

	private Items() {
	}

	public static void register(IEventBus modEventBus) {
		REGISTRY.register(modEventBus);
	}
}