package dirtequipment;

import com.google.common.base.CaseFormat;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dirtequipment.item.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

@SuppressWarnings({"WeakerAccess", "PublicField"})
@Mod(modid = "dirtequipment", useMetadata = true)
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

	private static void register(Item item, String name) {
		String itemName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
		item.setUnlocalizedName(itemName);
		GameRegistry.registerItem(item, itemName);
	}

	@Mod.Init
	public void onInit(FMLInitializationEvent event) {
		dirtSword = new DTAItemSword(DTAConfig.idDirtSword - 256);

		dirtHelmet = new DTAItemArmor(DTAConfig.idDirtHelmet - 256, 0);
		dirtChestplate = new DTAItemArmor(DTAConfig.idDirtChestplate - 256, 1);
		dirtLeggings = new DTAItemArmor(DTAConfig.idDirtLeggings - 256, 2);
		dirtBoots = new DTAItemArmor(DTAConfig.idDirtBoots - 256, 3);

		dirtShovel = new DTAItemShovel(DTAConfig.idDirtShovel - 256);
		dirtPickaxe = new DTAItemPickaxe(DTAConfig.idDirtPickaxe - 256);
		dirtAxe = new DTAItemAxe(DTAConfig.idDirtAxe - 256);
		dirtHoe = new DTAItemHoe(DTAConfig.idDirtHoe - 256);

		register(dirtSword, "dirtSword");

		register(dirtHelmet, "dirtHelmet");
		register(dirtChestplate, "dirtChestplate");
		register(dirtLeggings, "dirtLeggings");
		register(dirtBoots, "dirtBoots");

		register(dirtShovel, "dirtShovel");
		register(dirtPickaxe, "dirtPickaxe");
		register(dirtAxe, "dirtAxe");
		register(dirtHoe, "dirtHoe");

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dirtSword), "D", "D", "/", 'D', Block.dirt, '/', Item.stick));

		GameRegistry.addRecipe(new ItemStack(dirtHelmet), "DDD", "D D", 'D', Block.dirt);
		GameRegistry.addRecipe(new ItemStack(dirtChestplate), "D D", "DDD", "DDD", 'D', Block.dirt);
		GameRegistry.addRecipe(new ItemStack(dirtLeggings), "DDD", "D D", "D D", 'D', Block.dirt);
		GameRegistry.addRecipe(new ItemStack(dirtBoots), "D D", "D D", 'D', Block.dirt);

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dirtShovel), "D", "/", "/", 'D', Block.dirt, '/', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dirtPickaxe), "DDD", " / ", " / ", 'D', Block.dirt, '/', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dirtAxe), "DD", "D/", " /", 'D', Block.dirt, '/', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dirtHoe), "DD", " /", " /", 'D', Block.dirt, '/', Item.stick));

		LanguageRegistry.instance().loadLocalization("/lang/en_US.lang", "en_US", false);
		LanguageRegistry.instance().loadLocalization("/lang/ru_RU.lang", "ru_RU", false);
		LanguageRegistry.instance().loadLocalization("/lang/uk_UA.lang", "uk_UA", false);
	}

	@Mod.PreInit
	public void preInit(FMLPreInitializationEvent event) {
		DTAConfig.preInit(event);
	}
}
