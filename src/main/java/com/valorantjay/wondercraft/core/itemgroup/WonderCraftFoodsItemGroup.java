package com.valorantjay.wondercraft.core.itemgroup;

import com.valorantjay.wondercraft.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class WonderCraftFoodsItemGroup extends ItemGroup {

	public static final WonderCraftFoodsItemGroup WONDER_CRAFT_FOODS = new WonderCraftFoodsItemGroup(ItemGroup.GROUPS.length,
			"wonder_craft_foods");

	public WonderCraftFoodsItemGroup(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ItemInit.EXAMPLE_FOOD.get());
	}

}
