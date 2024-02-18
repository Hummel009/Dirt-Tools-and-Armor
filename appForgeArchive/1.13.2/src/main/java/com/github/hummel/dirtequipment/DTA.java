package com.github.hummel.dirtequipment;

import com.google.common.base.CaseFormat;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings({"WeakerAccess", "PublicField", "UtilityClassWithoutPrivateConstructor"})
@Mod("dirtequipment")
public class DTA {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	public static Item dirtSword;

	public static Item dirtHelmet;
	public static Item dirtChestplate;
	public static Item dirtLeggings;
	public static Item dirtBoots;
	public static Item dirtShovel;

	public static Item dirtPickaxe;
	public static Item dirtAxe;
	public static Item dirtHoe;

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		private RegistryEvents() {
		}

		@SubscribeEvent
		public static void onItemRegistry(RegistryEvent.Register<Item> event) {
			dirtSword = new DTAItemSword();

			dirtHelmet = new DTAItemArmor(EntityEquipmentSlot.HEAD);
			dirtChestplate = new DTAItemArmor(EntityEquipmentSlot.CHEST);
			dirtLeggings = new DTAItemArmor(EntityEquipmentSlot.LEGS);
			dirtBoots = new DTAItemArmor(EntityEquipmentSlot.FEET);

			dirtShovel = new DTAItemShovel();
			dirtPickaxe = new DTAItemPickaxe();
			dirtAxe = new DTAItemAxe();
			dirtHoe = new DTAItemHoe();

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
			item.setRegistryName(itemName);
			ForgeRegistries.ITEMS.register(item);
		}
	}
}
