package dirtequipment;

import dirtequipment.item.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

@SuppressWarnings("WeakerAccess")
public class DTA implements ModInitializer {
	public static final Item DIRT_SWORD = new DTAItemSword();

	public static final Item DIRT_HELMET = new DTAItemArmor(ArmorItem.Type.HELMET);
	public static final Item DIRT_CHESTPLATE = new DTAItemArmor(ArmorItem.Type.CHESTPLATE);
	public static final Item DIRT_LEGGINGS = new DTAItemArmor(ArmorItem.Type.LEGGINGS);
	public static final Item DIRT_BOOTS = new DTAItemArmor(ArmorItem.Type.BOOTS);

	public static final Item DIRT_SHOVEL = new DTAItemShovel();
	public static final Item DIRT_PICKAXE = new DTAItemPickaxe();
	public static final Item DIRT_AXE = new DTAItemAxe();
	public static final Item DIRT_HOE = new DTAItemHoe();

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

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
			content.add(DIRT_SWORD);
			content.add(DIRT_HELMET);
			content.add(DIRT_CHESTPLATE);
			content.add(DIRT_LEGGINGS);
			content.add(DIRT_BOOTS);
		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
			content.add(DIRT_SHOVEL);
			content.add(DIRT_PICKAXE);
			content.add(DIRT_AXE);
			content.add(DIRT_HOE);
		});
	}

	private static void register(Item item, String name) {
		Registry.register(Registries.ITEM, new Identifier("dirtequipment", name), item);
	}
}