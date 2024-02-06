package dirtequipment.material;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

public enum DTAArmorMaterials implements ArmorMaterial {
	DIRT("dirt", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_LEATHER, 2.0f, Ingredient.of(Blocks.DIRT));

	private static final int[] DURABILITY_FOR_SLOT = new int[]{13, 15, 16, 11};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] defenseForType;
	private final int enchantmentValue;
	private final SoundEvent equipSound;
	private final float toughness;
	private final Ingredient repairIngredient;

	DTAArmorMaterials(String name, int durabilityMultiplier, int[] defenseForType, int enchantmentValue, SoundEvent equipSound, float toughness, Ingredient repairIngredient) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.defenseForType = defenseForType;
		this.enchantmentValue = enchantmentValue;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.repairIngredient = repairIngredient;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlot equipmentSlot) {
		return defenseForType[equipmentSlot.getIndex()];
	}

	@Override
	public int getDurabilityForSlot(EquipmentSlot equipmentSlot) {
		return DURABILITY_FOR_SLOT[equipmentSlot.getIndex()] * durabilityMultiplier;
	}

	@Override
	public int getEnchantmentValue() {
		return enchantmentValue;
	}

	@Override
	public SoundEvent getEquipSound() {
		return equipSound;
	}

	@Override
	@Environment(EnvType.CLIENT)
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
