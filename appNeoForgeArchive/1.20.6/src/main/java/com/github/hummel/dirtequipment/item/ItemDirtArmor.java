package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.init.ArmorMaterials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class ItemDirtArmor extends ArmorItem {
	public ItemDirtArmor(Type type) {
		super(ArmorMaterials.DIRT, type, new Properties().durability(type.getDurability(33)));
	}

	@Override
	public ResourceLocation getArmorTexture(ItemStack itemStack, Entity entity, EquipmentSlot equipmentSlot, ArmorMaterial.Layer layer, boolean innerModel) {
		return new ResourceLocation("dirtequipment", "textures/models/armor/dirt_layer_" + (equipmentSlot == EquipmentSlot.LEGS ? 2 : 1) + ".png");
	}
}