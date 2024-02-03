package dirtequipment.material;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

public enum DTAToolMaterials implements IItemTier {
	DIRT(3, 1561, 8.0F, 3.0F, 10, Ingredient.of(Items.DIRT));

	private final int level;
	private final int uses;
	private final float speed;
	private final float attackDamageBonus;
	private final int enchantmentValue;
	private final Ingredient repairIngredient;

	DTAToolMaterials(int level, int uses, float speed, float attackDamageBonus, int enchantmentValue, Ingredient repairIngredient) {
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
