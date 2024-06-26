package com.github.hummel.dirtequipment.handler;

import com.github.hummel.dirtequipment.init.Items;
import com.github.hummel.dirtequipment.init.Recipes;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ForgeEventHandler {
	@SubscribeEvent
	@SuppressWarnings("MethodMayBeStatic")
	public void onItemRegistry(RegistryEvent.Register<Item> event) {
		Items.register();
		Recipes.register();
	}

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	@SuppressWarnings("MethodMayBeStatic")
	public void onModelRegistry(ModelRegistryEvent event) {
		for (Item item : Items.CONTENT) {
			String registryName = item.getRegistryName().toString();
			ModelResourceLocation modelResourceLocation = new ModelResourceLocation(registryName, "inventory");
			ModelLoader.setCustomModelResourceLocation(item, 0, modelResourceLocation);
		}
	}
}