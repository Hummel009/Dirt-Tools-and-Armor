package dirtequipment.proxy;

import dirtequipment.DTA;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DTAClientProxy extends DTACommonProxy {
	@Override
	@SideOnly(Side.CLIENT)
	public void onInit() {
		for (Item item : DTA.CONTENT) {
			ResourceLocation itemName = item.getRegistryName();
			ModelResourceLocation model = new ModelResourceLocation(itemName, "inventory");
			ModelBakery.registerItemVariants(item, model);
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, model);
		}
	}
}