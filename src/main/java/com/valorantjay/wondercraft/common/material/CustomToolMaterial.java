package com.valorantjay.wondercraft.common.material;

import java.util.function.Supplier;

import com.valorantjay.wondercraft.core.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum CustomToolMaterial implements IItemTier {
	
	UNDERITE_TOOL(4, 450, 15f, 2f, 17, () -> Ingredient.fromItems(ItemInit.UNDERITE_INGOT.get()));
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final Ingredient repairMaterial;
	
	CustomToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial.get();
	}
	
	@Override
	public int getMaxUses() {
		// TODO Auto-generated method stub
		return this.maxUses;
	}
	@Override
	public float getEfficiency() {
		// TODO Auto-generated method stub
		return this.efficiency;
	}
	@Override
	public float getAttackDamage() {
		// TODO Auto-generated method stub
		return this.attackDamage;
	}
	@Override
	public int getHarvestLevel() {
		// TODO Auto-generated method stub
		return this.harvestLevel;
	}
	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return this.enchantability;
	}
	@Override
	public Ingredient getRepairMaterial() {
		// TODO Auto-generated method stub
		return this.repairMaterial;
	}

}
