package com.valorantjay.wondercraft.core.init;

import com.valorantjay.wondercraft.WonderCraft;
import com.valorantjay.wondercraft.common.block.QuarryBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			WonderCraft.MOD_ID);
	public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS
			.register("example_block",
					() -> new Block(AbstractBlock.Properties.create(Material.WOOL, MaterialColor.PINK)
							.hardnessAndResistance(50f, 1200f).harvestTool(ToolType.PICKAXE).harvestLevel(4)
							.sound(SoundType.NETHERITE)));
	public static final RegistryObject<Block> EXAMPLE_ORE = BLOCKS.register("example_ore",
			() -> new Block(AbstractBlock.Properties.from(Blocks.DIAMOND_ORE).harvestLevel(3)));
	public static final RegistryObject<Block> UNDERITE_ORE = BLOCKS.register("underite_ore",
			() -> new Block(AbstractBlock.Properties.from(Blocks.IRON_ORE).harvestLevel(2)));
	public static final RegistryObject<Block> QUARRY = BLOCKS.register("quarry",
			() -> new QuarryBlock());
}
