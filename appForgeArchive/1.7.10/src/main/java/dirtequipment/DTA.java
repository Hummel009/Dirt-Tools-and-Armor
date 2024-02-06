package dirtequipment;

import com.google.common.base.CaseFormat;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import dirtequipment.item.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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
		item.setTextureName("dirtequipment:" + itemName);
		GameRegistry.registerItem(item, itemName);
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
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
