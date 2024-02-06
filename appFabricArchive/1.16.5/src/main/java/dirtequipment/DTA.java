package dirtequipment;

import dirtequipment.item.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;

@SuppressWarnings("WeakerAccess")
public class DTA implements ModInitializer {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	public static final Item DIRT_SWORD = new DTAItemSword();

	public static final Item DIRT_HELMET = new DTAItemArmor(EquipmentSlot.HEAD);
	public static final Item DIRT_CHESTPLATE = new DTAItemArmor(EquipmentSlot.CHEST);
	public static final Item DIRT_LEGGINGS = new DTAItemArmor(EquipmentSlot.LEGS);
	public static final Item DIRT_BOOTS = new DTAItemArmor(EquipmentSlot.FEET);

	public static final Item DIRT_SHOVEL = new DTAItemShovel();
	public static final Item DIRT_PICKAXE = new DTAItemPickaxe();
	public static final Item DIRT_AXE = new DTAItemAxe();
	public static final Item DIRT_HOE = new DTAItemHoe();

	private static void register(Item item, String name) {
		Registry.register(Registry.ITEM, new ResourceLocation("dirtequipment", name), item);
	}

	@Override
	public void onInitialize() {
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
}