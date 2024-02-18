package com.github.hummel.dirtequipment.proxy;

import com.github.hummel.dirtequipment.DTA;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DTAClientProxy extends DTACommonProxy {
	@Override
	@SideOnly(Side.CLIENT)
	public void onInit() {
		for (Item item : DTA.CONTENT) {
			String registryName = item.getRegistryName();
			ModelResourceLocation modelResourceLocation = new ModelResourceLocation(registryName, "inventory");
			ModelBakery.registerItemVariants(item, modelResourceLocation);
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, modelResourceLocation);
		}
	}
}