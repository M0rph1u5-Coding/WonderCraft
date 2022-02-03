package com.valorantjay.wondercraft.core.itemgroup;

import com.valorantjay.wondercraft.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class WonderCraftItemsItemGroup extends ItemGroup {

	public static final WonderCraftItemsItemGroup WONDER_CRAFT_ITEMS = new WonderCraftItemsItemGroup(ItemGroup.GROUPS.length,
			"wonder_craft_items");

	public WonderCraftItemsItemGroup(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ItemInit.EXAMPLE_ITEM.get());
	}

}
