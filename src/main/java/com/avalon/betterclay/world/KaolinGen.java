package com.avalon.betterclay.world;

import com.avalon.betterclay.core.init.BlockInit;

import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class KaolinGen {
	@SubscribeEvent
	public static void generateOres(final BiomeLoadingEvent event) {
      if (!(
    		  //Biomas en los que NO pueden aparecer.
    		  event.getCategory().equals(Biome.Category.EXTREME_HILLS) ||
    		  event.getCategory().equals(Biome.Category.SWAMP) ||
    		  event.getCategory().equals(Biome.Category.TAIGA) || 
    		  event.getCategory().equals(Biome.Category.ICY) || 
    		  event.getCategory().equals(Biome.Category.SAVANNA) || 
    		  event.getCategory().equals(Biome.Category.PLAINS) || 
    		  event.getCategory().equals(Biome.Category.OCEAN) || 
    		  event.getCategory().equals(Biome.Category.MESA) || 
    		  event.getCategory().equals(Biome.Category.DESERT) || 
    		  event.getCategory().equals(Biome.Category.BEACH) ||
    		  event.getCategory().equals(Biome.Category.JUNGLE)))  {
				generateOre(event.getGeneration(), ClayFeatureConfig.FillerBlockType.KAOLINGEN,
						BlockInit.KAOLIN_CLAY.get().getDefaultState(), 10, 40, 80, 15);}
	}
	
	     
	private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state,
			int veinSize, int minHeight, int maxHeight, int amount) {
		settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
				Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, veinSize))
						.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
						.square().func_242731_b(amount));
	}
	
	
	
}
	
