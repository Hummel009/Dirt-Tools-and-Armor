package com.github.hummel.dirtequipment.init;

import net.minecraft.item.Item;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;

@SuppressWarnings("WeakerAccess")
public class Recipes {
	private Recipes() {
	}

	public static void register() {
		for (Item item : Items.CONTENT) {
			CraftingHelper.register(item.getRegistryName(), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
		}
	}
}
