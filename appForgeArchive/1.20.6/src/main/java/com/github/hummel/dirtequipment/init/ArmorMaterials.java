package com.github.hummel.dirtequipment.init;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.EnumMap;
import java.util.List;

@SuppressWarnings({"WeakerAccess", "unused"})
public class ArmorMaterials {
	public static final DeferredRegister<ArmorMaterial> REGISTRY = DeferredRegister.create(Registries.ARMOR_MATERIAL, "dirtequipment");

	public static final RegistryObject<ArmorMaterial> DIRT = REGISTRY.register("dirt", () -> material("dirt", new int[]{3, 6, 8, 3, 11}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0f, 0.0f, Ingredient.of(Items.DIRT)));

	private ArmorMaterials() {
	}

	public static void register(IEventBus modEventBus) {
		REGISTRY.register(modEventBus);
	}

	private static ArmorMaterial material(String name, int[] protection, int i, Holder<SoundEvent> holder, float f, float g, Ingredient ingredient) {
		var map = new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class);
		map.put(ArmorItem.Type.BOOTS, protection[0]);
		map.put(ArmorItem.Type.LEGGINGS, protection[1]);
		map.put(ArmorItem.Type.CHESTPLATE, protection[2]);
		map.put(ArmorItem.Type.HELMET, protection[3]);
		map.put(ArmorItem.Type.BODY, protection[4]);
		return new ArmorMaterial(map, i, holder, () -> ingredient, List.of(new ArmorMaterial.Layer(new ResourceLocation("dirtequipment", name))), f, g);
	}
}