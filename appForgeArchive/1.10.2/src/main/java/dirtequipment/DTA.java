package dirtequipment;

import com.google.common.base.CaseFormat;
import dirtequipment.item.*;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({"WeakerAccess", "PublicField", "UtilityClassWithoutPrivateConstructor"})
@Mod(modid = "dirtequipment", useMetadata = true)
public class DTA {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "101129102023";

	public static final Collection<Item> CONTENT = new ArrayList<>();

	public static Item dirtSword;

	public static Item dirtHelmet;
	public static Item dirtChestplate;
	public static Item dirtLeggings;
	public static Item dirtBoots;

	public static Item dirtShovel;
	public static Item dirtPickaxe;
	public static Item dirtAxe;
	public static Item dirtHoe;

	@GameRegistry.ObjectHolder("dirtequipment")
	@Mod.EventBusSubscriber
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

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dirtSword), "D", "D", "/", 'D', Blocks.DIRT, '/', Items.STICK));

			GameRegistry.addRecipe(new ItemStack(dirtHelmet), "DDD", "D D", 'D', Blocks.DIRT);
			GameRegistry.addRecipe(new ItemStack(dirtChestplate), "D D", "DDD", "DDD", 'D', Blocks.DIRT);
			GameRegistry.addRecipe(new ItemStack(dirtLeggings), "DDD", "D D", "D D", 'D', Blocks.DIRT);
			GameRegistry.addRecipe(new ItemStack(dirtBoots), "D D", "D D", 'D', Blocks.DIRT);

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dirtShovel), "D", "/", "/", 'D', Blocks.DIRT, '/', Items.STICK));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dirtPickaxe), "DDD", " / ", " / ", 'D', Blocks.DIRT, '/', Items.STICK));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dirtAxe), "DD", "D/", " /", 'D', Blocks.DIRT, '/', Items.STICK));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dirtHoe), "DD", " /", " /", 'D', Blocks.DIRT, '/', Items.STICK));
		}

		@SubscribeEvent
		@SideOnly(Side.CLIENT)
		public static void onModelRegistry(ModelRegistryEvent event) {
			for (Item item : CONTENT) {
				ResourceLocation itemName = item.getRegistryName();
				ModelResourceLocation model = new ModelResourceLocation(itemName, "inventory");
				ModelBakery.registerItemVariants(item, model);
				ModelLoader.setCustomModelResourceLocation(item, 0, model);
			}
		}

		private static void register(Item item, String name) {
			String itemName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
			item.setUnlocalizedName(itemName);
			item.setRegistryName(itemName);
			ForgeRegistries.ITEMS.register(item);
			CONTENT.add(item);
		}
	}
}
