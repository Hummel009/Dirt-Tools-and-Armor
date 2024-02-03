package dirtequipment.material;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public enum DTAArmorMaterials implements ArmorMaterial {
	DIRT("dirt", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 2.0F, 0, Ingredient.ofItems(Items.DIRT));

	private static final int[] DURABILITY = new int[]{13, 15, 16, 11};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] protectionAmount;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final Ingredient repairIngredient;
	private final float knockbackResistance;

	DTAArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmount, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Ingredient repairIngredient) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.protectionAmount = protectionAmount;
		this.enchantability = enchantability;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = repairIngredient;
	}

	@Override
	public int getProtectionAmount(EquipmentSlot equipmentSlot) {
		return protectionAmount[equipmentSlot.getEntitySlotId()];
	}

	@Override
	public int getDurability(EquipmentSlot equipmentSlot) {
		return DURABILITY[equipmentSlot.getEntitySlotId()] * durabilityMultiplier;
	}

	@Override
	public int getEnchantability() {
		return enchantability;
	}

	@Override
	public SoundEvent getEquipSound() {
		return equipSound;
	}

	@Override
	public float getKnockbackResistance() {
		return knockbackResistance;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return repairIngredient;
	}

	@Override
	public float getToughness() {
		return toughness;
	}
}
