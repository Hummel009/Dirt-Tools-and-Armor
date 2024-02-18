package com.github.hummel.dirtequipment.material;

import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;

public enum ArmorMaterials implements IArmorMaterial {
	DIRT("dirt", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 2.0f, Ingredient.fromItems(Blocks.DIRT));

	private static final int[] DURABILITY = new int[]{13, 15, 16, 11};
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmount;
	private final int enchantability;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final Ingredient repairMaterial;

	ArmorMaterials(String name, int maxDamageFactor, int[] damageReductionAmount, int enchantability, SoundEvent soundEvent, float toughness, Ingredient repairMaterial) {
		this.name = name;
		this.maxDamageFactor = maxDamageFactor;
		this.damageReductionAmount = damageReductionAmount;
		this.enchantability = enchantability;
		this.soundEvent = soundEvent;
		this.toughness = toughness;
		this.repairMaterial = repairMaterial;
	}

	@Override
	public int getDamageReductionAmount(EntityEquipmentSlot entityEquipmentSlot) {
		return damageReductionAmount[entityEquipmentSlot.getIndex()];
	}

	@Override
	public int getDurability(EntityEquipmentSlot entityEquipmentSlot) {
		return DURABILITY[entityEquipmentSlot.getIndex()] * maxDamageFactor;
	}

	@Override
	public int getEnchantability() {
		return enchantability;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return repairMaterial;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return soundEvent;
	}

	@Override
	public float getToughness() {
		return toughness;
	}
}