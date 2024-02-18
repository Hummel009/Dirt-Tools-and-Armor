package com.github.hummel.dirtequipment;

import com.google.common.base.CaseFormat;
import com.github.hummel.dirtequipment.proxy.DTACommonProxy;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({"WeakerAccess", "PublicField"})
@Mod(modid = "dirtequipment", useMetadata = true)
public class DTA {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	public static final Collection<Item> CONTENT = new ArrayList<>();

	@SidedProxy(serverSide = "com.github.hummel.dirtequipment.proxy.DTACommonProxy", clientSide = "com.github.hummel.dirtequipment.proxy.DTAClientProxy")
	public static DTACommonProxy proxy;

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
		item.setRegistryName(itemName);
		GameRegistry.registerItem(item, itemName);
		CONTENT.add(item);
	}

	@Mod.EventHandler
	public void onInit(FMLInitializationEvent event) {
		proxy.onInit();
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(proxy);

		dirtSword = new DTAItemSword();

		dirtHelmet = new DTAItemArmor(0);
		dirtChestplate = new DTAItemArmor(1);
		dirtLeggings = new DTAItemArmor(2);
		dirtBoots = new DTAItemArmor(3);

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

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dirtSword), "D", "D", "/", 'D', Blocks.dirt, '/', Items.stick));

		GameRegistry.addRecipe(new ItemStack(dirtHelmet), "DDD", "D D", 'D', Blocks.dirt);
		GameRegistry.addRecipe(new ItemStack(dirtChestplate), "D D", "DDD", "DDD", 'D', Blocks.dirt);
		GameRegistry.addRecipe(new ItemStack(dirtLeggings), "DDD", "D D", "D D", 'D', Blocks.dirt);
		GameRegistry.addRecipe(new ItemStack(dirtBoots), "D D", "D D", 'D', Blocks.dirt);

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dirtShovel), "D", "/", "/", 'D', Blocks.dirt, '/', Items.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dirtPickaxe), "DDD", " / ", " / ", 'D', Blocks.dirt, '/', Items.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dirtAxe), "DD", "D/", " /", 'D', Blocks.dirt, '/', Items.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dirtHoe), "DD", " /", " /", 'D', Blocks.dirt, '/', Items.stick));
	}
}
