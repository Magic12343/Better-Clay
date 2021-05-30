package com.avalon.betterclay.world;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;

public class ClayFeatureConfig extends OreFeatureConfig{

	public ClayFeatureConfig(RuleTest p_i241989_1_, BlockState state, int size) {
		super(p_i241989_1_, state, size);
	}
	
	public static final class FillerBlockType {
	      public static final RuleTest KAOLINGEN = new BlockMatchRuleTest(Blocks.GRAVEL);
	      public static final RuleTest EARTHENWAREGEN = new BlockMatchRuleTest(Blocks.DIRT);
	      
	   }

}
