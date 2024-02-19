package com.github.hummel.dirtequipment.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static com.github.hummel.dirtequipment.init.Items.*;

@SuppressWarnings("WeakerAccess")
public class Recipes {
	private Recipes() {
	}

	public static void preInit() {
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