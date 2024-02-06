package dirtequipment;

import dirtequipment.item.*;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod("dirtequipment")
@SuppressWarnings("WeakerAccess")
public class DTA {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "dirtequipment");

	public static final RegistryObject<Item> DIRT_SWORD = ITEMS.register("dirt_sword", DTAItemSword::new);

	public static final RegistryObject<Item> DIRT_HELMET = ITEMS.register("dirt_helmet", () -> new DTAItemArmor(ArmorItem.Type.HELMET));
	public static final RegistryObject<Item> DIRT_CHESTPLATE = ITEMS.register("dirt_chestplate", () -> new DTAItemArmor(ArmorItem.Type.CHESTPLATE));
	public static final RegistryObject<Item> DIRT_LEGGINGS = ITEMS.register("dirt_leggings", () -> new DTAItemArmor(ArmorItem.Type.LEGGINGS));
	public static final RegistryObject<Item> DIRT_BOOTS = ITEMS.register("dirt_boots", () -> new DTAItemArmor(ArmorItem.Type.BOOTS));

	public static final RegistryObject<Item> DIRT_SHOVEL = ITEMS.register("dirt_shovel", DTAItemShovel::new);
	public static final RegistryObject<Item> DIRT_PICKAXE = ITEMS.register("dirt_pickaxe", DTAItemPickaxe::new);
	public static final RegistryObject<Item> DIRT_AXE = ITEMS.register("dirt_axe", DTAItemAxe::new);
	public static final RegistryObject<Item> DIRT_HOE = ITEMS.register("dirt_hoe", DTAItemHoe::new);

	public DTA() {
		var fmlBus = FMLJavaModLoadingContext.get().getModEventBus();
		fmlBus.addListener(DTACreativeTabs::addCreativeTab);
		ITEMS.register(fmlBus);
	}
}
