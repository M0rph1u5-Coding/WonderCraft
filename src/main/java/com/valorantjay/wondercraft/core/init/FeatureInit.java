package com.valorantjay.wondercraft.core.init;

import net.minecraft.block.BlockState;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.feature.template.TagMatchRuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class FeatureInit {
	public static void addOres(final BiomeLoadingEvent event) {
		addOre(event, new TagMatchRuleTest(BlockTags.BASE_STONE_OVERWORLD),
				BlockInit.EXAMPLE_ORE.get().getDefaultState(), 3, 0, 14, 10);
		addOre(event, new TagMatchRuleTest(BlockTags.BASE_STONE_OVERWORLD), BlockInit.UNDERITE_ORE.get().getDefaultState(), 7, 0, 40, 40);
	}

	public static void addOre(final BiomeLoadingEvent event, RuleTest rule, BlockState state, int veinSize,
			int minHeight, int maxHeight, int amount) {
		event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
				Feature.ORE.withConfiguration(new OreFeatureConfig(rule, state, veinSize))
						.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
						.square().count(amount));
	}
}
