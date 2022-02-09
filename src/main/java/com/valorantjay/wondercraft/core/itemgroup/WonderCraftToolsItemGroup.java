package com.valorantjay.wondercraft.core.itemgroup;

import com.valorantjay.wondercraft.core.init.BlockInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class WonderCraftToolsItemGroup extends ItemGroup {

	public static final WonderCraftToolsItemGroup WONDER_CRAFT_TOOLS = new WonderCraftToolsItemGroup(
			ItemGroup.GROUPS.length, "wonder_craft_tools");

	public WonderCraftToolsItemGroup(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(BlockInit.EXAMPLE_BLOCK.get());
	}

}
