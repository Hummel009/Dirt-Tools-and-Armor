package com.github.hummel.dirtequipment.material;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

public enum ToolMaterials implements Tier {
	DIRT(3, 1561, 8.0f, 3.0f, 10, Ingredient.of(Blocks.DIRT));

	private final int level;
	private final int uses;
	private final float speed;
	private final float attackDamageBonus;
	private final int enchantmentValue;
	private final Ingredient repairIngredient;

	ToolMaterials(int level, int uses, float speed, float attackDamageBonus, int enchantmentValue, Ingredient repairIngredient) {
		this.level = level;
		this.uses = uses;
		this.speed = speed;
		this.attackDamageBonus = attackDamageBonus;
		this.enchantmentValue = enchantmentValue;
		this.repairIngredient = repairIngredient;
	}

	@Override
	public float getAttackDamageBonus() {
		return attackDamageBonus;
	}

	@Override
	public int getEnchantmentValue() {
		return enchantmentValue;
	}

	@Override
	public int getLevel() {
		return level;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return repairIngredient;
	}

	@Override
	public float getSpeed() {
		return speed;
	}

	@Override
	public int getUses() {
		return uses;
	}
}