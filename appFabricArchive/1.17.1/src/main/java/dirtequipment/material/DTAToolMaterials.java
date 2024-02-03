package dirtequipment.material;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public enum DTAToolMaterials implements ToolMaterial {
	DIRT(3, 1561, 8.0F, 3.0F, 10, Ingredient.ofItems(Items.DIRT));

	private final int miningLevel;
	private final int durability;
	private final float miningSpeedMultiplier;
	private final float attackDamage;
	private final int enchantability;
	private final Ingredient repairIngredient;

	DTAToolMaterials(int miningLevel, int durability, float miningSpeedMultiplier, float attackDamage, int enchantability, Ingredient repairIngredient) {
		this.miningLevel = miningLevel;
		this.durability = durability;
		this.miningSpeedMultiplier = miningSpeedMultiplier;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairIngredient = repairIngredient;
	}

	@Override
	public float getAttackDamage() {
		return attackDamage;
	}

	@Override
	public int getEnchantability() {
		return enchantability;
	}

	@Override
	public int getMiningLevel() {
		return miningLevel;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return repairIngredient;
	}

	@Override
	public float getMiningSpeedMultiplier() {
		return miningSpeedMultiplier;
	}

	@Override
	public int getDurability() {
		return durability;
	}
}
