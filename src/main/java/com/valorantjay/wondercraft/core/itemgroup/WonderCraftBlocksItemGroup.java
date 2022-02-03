package com.valorantjay.wondercraft.core.itemgroup;

import com.valorantjay.wondercraft.core.init.BlockInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class WonderCraftBlocksItemGroup extends ItemGroup {

	public static final WonderCraftBlocksItemGroup WONDER_CRAFT_BLOCKS = new WonderCraftBlocksItemGroup(ItemGroup.GROUPS.length,
			"wonder_craft_blocks");

	public WonderCraftBlocksItemGroup(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(BlockInit.EXAMPLE_BLOCK.get());
	}

}
