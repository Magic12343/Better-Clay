package com.avalon.betterclay.core.init;

import com.avalon.betterclay.BetterClay;


import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChainBlock;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			BetterClay.MOD_ID);

	//Variant Bricks
		public static final RegistryObject<Block> BIG_BRICK = BLOCKS.register("big_brick", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> CHISELED_BRICKS = BLOCKS.register("chiseled_bricks", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));

		
		
		//Cracked Bricks 
		public static final RegistryObject<Block> BROKEN_BRICKS = BLOCKS.register("broken_bricks", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> BROKEN_BRICKS_SLAB = BLOCKS.register("broken_bricks_slab",
				() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> BROKEN_BRICKS_STAIRS = BLOCKS.register("broken_bricks_stairs",
				() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> BROKEN_BRICKS_WALL = BLOCKS.register("broken_bricks_wall",
				() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		
		//Dirty Bricks
		public static final RegistryObject<Block> DIRTY_BRICKS = BLOCKS.register("dirty_bricks", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE)));
		public static final RegistryObject<Block> DIRTY_BRICKS_SLAB = BLOCKS.register("dirty_bricks_slab",
				() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> DIRTY_BRICKS_STAIRS = BLOCKS.register("dirty_bricks_stairs",
				() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> DIRTY_BRICKS_WALL = BLOCKS.register("dirty_bricks_wall",
				() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		
		//Bigger Bricks
		public static final RegistryObject<Block> BIGGER_BRICKS = BLOCKS.register("bigger_bricks", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> BIGGER_BRICKS_SLAB = BLOCKS.register("bigger_bricks_slab",
				() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> BIGGER_BRICKS_STAIRS = BLOCKS.register("bigger_bricks_stairs",
				() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> BIGGER_BRICKS_WALL = BLOCKS.register("bigger_bricks_wall",
				() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		
		//Cracked Bigger Bricks
		public static final RegistryObject<Block> CRACKED_BIGGER_BRICKS = BLOCKS.register("cracked_bigger_bricks", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> CRACKED_BIGGER_BRICKS_SLAB = BLOCKS.register("cracked_bigger_bricks_slab",
				() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> CRACKED_BIGGER_BRICKS_STAIRS = BLOCKS.register("cracked_bigger_bricks_stairs",
				() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> CRACKED_BIGGER_BRICKS_WALL = BLOCKS.register("cracked_bigger_bricks_wall",
				() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		
		//Dirty Bigger Bricks
		public static final RegistryObject<Block> DIRTY_BIGGER_BRICKS = BLOCKS.register("dirty_bigger_bricks", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> DIRTY_BIGGER_BRICKS_SLAB = BLOCKS.register("dirty_bigger_bricks_slab",
				() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> DIRTY_BIGGER_BRICKS_STAIRS = BLOCKS.register("dirty_bigger_bricks_stairs",
				() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> DIRTY_BIGGER_BRICKS_WALL = BLOCKS.register("dirty_bigger_bricks_wall",
				() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		
		//Variant Stoneware Bricks
		
		public static final RegistryObject<Block> STONEWARE = BLOCKS.register("stoneware", 
				() -> new Block(Block.Properties.from(Blocks.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.GROUND)));
		public static final RegistryObject<Block> BIG_STONEWARE_BRICK = BLOCKS.register("big_stoneware_brick", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> STONEWARE_CHISELED_BRICKS = BLOCKS.register("stoneware_chiseled_bricks", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		
		//Stoneware Bricks

		public static final RegistryObject<Block> STONEWARE_BRICKS = BLOCKS.register("stoneware_bricks", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> STONEWARE_BRICKS_SLAB = BLOCKS.register("stoneware_bricks_slab",
				() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> STONEWARE_BRICKS_STAIRS = BLOCKS.register("stoneware_bricks_stairs",
				() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> STONEWARE_BRICKS_WALL = BLOCKS.register("stoneware_bricks_wall",
				() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		
		//Stoneware Cracked Bricks
		
		public static final RegistryObject<Block> CRACKED_STONEWARE_BRICKS = BLOCKS.register("cracked_stoneware_bricks", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> CRACKED_STONEWARE_BRICKS_SLAB = BLOCKS.register("cracked_stoneware_bricks_slab",
				() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> CRACKED_STONEWARE_BRICKS_STAIRS = BLOCKS.register("cracked_stoneware_bricks_stairs",
				() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> CRACKED_STONEWARE_BRICKS_WALL = BLOCKS.register("cracked_stoneware_bricks_wall",
				() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		
		//Stoneware Dirty Bricks
		
		public static final RegistryObject<Block> DIRTY_STONEWARE_BRICKS = BLOCKS.register("dirty_stoneware_bricks", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> DIRTY_STONEWARE_BRICKS_SLAB = BLOCKS.register("dirty_stoneware_bricks_slab",
				() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> DIRTY_STONEWARE_BRICKS_STAIRS = BLOCKS.register("dirty_stoneware_bricks_stairs",
				() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> DIRTY_STONEWARE_BRICKS_WALL = BLOCKS.register("dirty_stoneware_bricks_wall",
				() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		
		//Stoneware Bigger Bricks
		
		public static final RegistryObject<Block> BIGGER_STONEWARE_BRICKS = BLOCKS.register("bigger_stoneware_bricks", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> BIGGER_STONEWARE_BRICKS_SLAB = BLOCKS.register("bigger_stoneware_bricks_slab",
				() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> BIGGER_STONEWARE_BRICKS_STAIRS = BLOCKS.register("bigger_stoneware_bricks_stairs",
				() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> BIGGER_STONEWARE_BRICKS_WALL = BLOCKS.register("bigger_stoneware_bricks_wall",
				() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		
		//Stoneware Cracked Bigger Bricks
		
		public static final RegistryObject<Block> CRACKED_BIGGER_STONEWARE_BRICKS = BLOCKS.register("cracked_bigger_stoneware_bricks", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> CRACKED_BIGGER_STONEWARE_BRICKS_SLAB = BLOCKS.register("cracked_bigger_stoneware_bricks_slab",
				() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> CRACKED_BIGGER_STONEWARE_BRICKS_STAIRS = BLOCKS.register("cracked_bigger_stoneware_bricks_stairs",
				() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> CRACKED_BIGGER_STONEWARE_BRICKS_WALL = BLOCKS.register("cracked_bigger_stoneware_bricks_wall",
				() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		
		//Stoneware Dirty Bigger Bricks
		
		public static final RegistryObject<Block> DIRTY_BIGGER_STONEWARE_BRICKS = BLOCKS.register("dirty_bigger_stoneware_bricks", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> DIRTY_BIGGER_STONEWARE_BRICKS_SLAB = BLOCKS.register("dirty_bigger_stoneware_bricks_slab",
				() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> DIRTY_BIGGER_STONEWARE_BRICKS_STAIRS = BLOCKS.register("dirty_bigger_stoneware_bricks_stairs",
				() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> DIRTY_BIGGER_STONEWARE_BRICKS_WALL = BLOCKS.register("dirty_bigger_stoneware_bricks_wall",
				() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		
		//Variant Adobe Bricks
		
		public static final RegistryObject<Block> BIG_ADOBE_BRICK = BLOCKS.register("big_adobe_brick", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> CHISELED_ADOBE_BRICKS = BLOCKS.register("chiseled_adobe_bricks", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		
		//Adobe Bricks

		public static final RegistryObject<Block> ADOBE_BRICKS = BLOCKS.register("adobe_bricks", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> ADOBE_BRICKS_SLAB = BLOCKS.register("adobe_bricks_slab",
				() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> ADOBE_BRICKS_STAIRS = BLOCKS.register("adobe_bricks_stairs",
				() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> ADOBE_BRICKS_WALL = BLOCKS.register("adobe_bricks_wall",
				() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		
		//Adobe Cracked Bricks
		
		public static final RegistryObject<Block> CRACKED_ADOBE_BRICKS = BLOCKS.register("cracked_adobe_bricks", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> CRACKED_ADOBE_BRICKS_SLAB = BLOCKS.register("cracked_adobe_bricks_slab",
				() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> CRACKED_ADOBE_BRICKS_STAIRS = BLOCKS.register("cracked_adobe_bricks_stairs",
				() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> CRACKED_ADOBE_BRICKS_WALL = BLOCKS.register("cracked_adobe_bricks_wall",
				() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		
		//Adobe Dirty Bricks
		
		public static final RegistryObject<Block> DIRTY_ADOBE_BRICKS = BLOCKS.register("dirty_adobe_bricks", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> DIRTY_ADOBE_BRICKS_SLAB = BLOCKS.register("dirty_adobe_bricks_slab",
				() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> DIRTY_ADOBE_BRICKS_STAIRS = BLOCKS.register("dirty_adobe_bricks_stairs",
				() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> DIRTY_ADOBE_BRICKS_WALL = BLOCKS.register("dirty_adobe_bricks_wall",
				() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		
		//Adobe Bigger Bricks
		
		public static final RegistryObject<Block> BIGGER_ADOBE_BRICKS = BLOCKS.register("bigger_adobe_bricks", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> BIGGER_ADOBE_BRICKS_SLAB = BLOCKS.register("bigger_adobe_bricks_slab",
				() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> BIGGER_ADOBE_BRICKS_STAIRS = BLOCKS.register("bigger_adobe_bricks_stairs",
				() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> BIGGER_ADOBE_BRICKS_WALL = BLOCKS.register("bigger_adobe_bricks_wall",
				() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		
		//Adobe Cracked Bigger Bricks
		
		public static final RegistryObject<Block> CRACKED_BIGGER_ADOBE_BRICKS = BLOCKS.register("cracked_bigger_adobe_bricks", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> CRACKED_BIGGER_ADOBE_BRICKS_SLAB = BLOCKS.register("cracked_bigger_adobe_bricks_slab",
				() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> CRACKED_BIGGER_ADOBE_BRICKS_STAIRS = BLOCKS.register("cracked_bigger_adobe_bricks_stairs",
				() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> CRACKED_BIGGER_ADOBE_BRICKS_WALL = BLOCKS.register("cracked_bigger_adobe_bricks_wall",
				() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		
		//Adobe Dirty Bigger Bricks
		
		public static final RegistryObject<Block> DIRTY_BIGGER_ADOBE_BRICKS = BLOCKS.register("dirty_bigger_adobe_bricks", 
				() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> DIRTY_BIGGER_ADOBE_BRICKS_SLAB = BLOCKS.register("dirty_bigger_adobe_bricks_slab",
				() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> DIRTY_BIGGER_ADOBE_BRICKS_STAIRS = BLOCKS.register("dirty_bigger_adobe_bricks_stairs",
				() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		public static final RegistryObject<Block> DIRTY_BIGGER_ADOBE_BRICKS_WALL = BLOCKS.register("dirty_bigger_adobe_bricks_wall",
				() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));

		//Variant Earthenware Bricks
		
			public static final RegistryObject<Block> EARTHENWARE = BLOCKS.register("earthenware", 
					() -> new Block(Block.Properties.from(Blocks.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.GROUND)));
			public static final RegistryObject<Block> BIG_EARTHENWARE_BRICK = BLOCKS.register("big_earthenware_brick", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CHISELED_EARTHENWARE_BRICKS = BLOCKS.register("chiseled_earthenware_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> EARTHENWARE_BRICKS = BLOCKS.register("earthenware_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> EARTHENWARE_BRICKS_SLAB = BLOCKS.register("earthenware_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> EARTHENWARE_BRICKS_STAIRS = BLOCKS.register("earthenware_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> EARTHENWARE_BRICKS_WALL = BLOCKS.register("earthenware_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CRACKED_EARTHENWARE_BRICKS = BLOCKS.register("cracked_earthenware_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_EARTHENWARE_BRICKS_SLAB = BLOCKS.register("cracked_earthenware_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_EARTHENWARE_BRICKS_STAIRS = BLOCKS.register("cracked_earthenware_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_EARTHENWARE_BRICKS_WALL = BLOCKS.register("cracked_earthenware_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> DIRTY_EARTHENWARE_BRICKS = BLOCKS.register("dirty_earthenware_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> DIRTY_EARTHENWARE_BRICKS_SLAB = BLOCKS.register("dirty_earthenware_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> DIRTY_EARTHENWARE_BRICKS_STAIRS = BLOCKS.register("dirty_earthenware_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> DIRTY_EARTHENWARE_BRICKS_WALL = BLOCKS.register("dirty_earthenware_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> BIGGER_EARTHENWARE_BRICKS = BLOCKS.register("bigger_earthenware_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> BIGGER_EARTHENWARE_BRICKS_SLAB = BLOCKS.register("bigger_earthenware_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> BIGGER_EARTHENWARE_BRICKS_STAIRS = BLOCKS.register("bigger_earthenware_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> BIGGER_EARTHENWARE_BRICKS_WALL = BLOCKS.register("bigger_earthenware_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CRACKED_BIGGER_EARTHENWARE_BRICKS = BLOCKS.register("cracked_bigger_earthenware_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_BIGGER_EARTHENWARE_BRICKS_SLAB = BLOCKS.register("cracked_bigger_earthenware_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_BIGGER_EARTHENWARE_BRICKS_STAIRS = BLOCKS.register("cracked_bigger_earthenware_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_BIGGER_EARTHENWARE_BRICKS_WALL = BLOCKS.register("cracked_bigger_earthenware_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> DIRTY_BIGGER_EARTHENWARE_BRICKS = BLOCKS.register("dirty_bigger_earthenware_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> DIRTY_BIGGER_EARTHENWARE_BRICKS_SLAB = BLOCKS.register("dirty_bigger_earthenware_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> DIRTY_BIGGER_EARTHENWARE_BRICKS_STAIRS = BLOCKS.register("dirty_bigger_earthenware_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> DIRTY_BIGGER_EARTHENWARE_BRICKS_WALL = BLOCKS.register("dirty_bigger_earthenware_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
		
		//Porcelain Bricks
			
			public static final RegistryObject<Block> KAOLIN_CLAY = BLOCKS.register("kaolin_clay", 
					() -> new Block(Block.Properties.from(Blocks.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.GROUND)));
			
			public static final RegistryObject<Block> BIG_PORCELAIN_BRICK = BLOCKS.register("big_porcelain_brick", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CHISELED_PORCELAIN_BRICKS = BLOCKS.register("chiseled_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));	
			
			public static final RegistryObject<Block> PORCELAIN_BRICKS = BLOCKS.register("porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> PORCELAIN_BRICKS_SLAB = BLOCKS.register("porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> PORCELAIN_BRICKS_STAIRS = BLOCKS.register("porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> PORCELAIN_BRICKS_WALL = BLOCKS.register("porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CRACKED_PORCELAIN_BRICKS = BLOCKS.register("cracked_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_PORCELAIN_BRICKS_SLAB = BLOCKS.register("cracked_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("cracked_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_PORCELAIN_BRICKS_WALL = BLOCKS.register("cracked_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> DIRTY_PORCELAIN_BRICKS = BLOCKS.register("dirty_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> DIRTY_PORCELAIN_BRICKS_SLAB = BLOCKS.register("dirty_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> DIRTY_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("dirty_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> DIRTY_PORCELAIN_BRICKS_WALL = BLOCKS.register("dirty_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> BIGGER_PORCELAIN_BRICKS = BLOCKS.register("bigger_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> BIGGER_PORCELAIN_BRICKS_SLAB = BLOCKS.register("bigger_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> BIGGER_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("bigger_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> BIGGER_PORCELAIN_BRICKS_WALL = BLOCKS.register("bigger_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CRACKED_BIGGER_PORCELAIN_BRICKS = BLOCKS.register("cracked_bigger_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_BIGGER_PORCELAIN_BRICKS_SLAB = BLOCKS.register("cracked_bigger_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_BIGGER_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("cracked_bigger_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_BIGGER_PORCELAIN_BRICKS_WALL = BLOCKS.register("cracked_bigger_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> DIRTY_BIGGER_PORCELAIN_BRICKS = BLOCKS.register("dirty_bigger_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> DIRTY_BIGGER_PORCELAIN_BRICKS_SLAB = BLOCKS.register("dirty_bigger_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> DIRTY_BIGGER_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("dirty_bigger_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> DIRTY_BIGGER_PORCELAIN_BRICKS_WALL = BLOCKS.register("dirty_bigger_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			//Colored Porcelain
			
			public static final RegistryObject<Block> GRAY_PORCELAIN_BRICKS = BLOCKS.register("gray_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> GRAY_PORCELAIN = BLOCKS.register("gray_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> GRAY_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("gray_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> GRAY_PORCELAIN_BRICKS_WALL = BLOCKS.register("gray_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CRACKED_GRAY_PORCELAIN_BRICKS = BLOCKS.register("cracked_gray_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_GRAY_PORCELAIN_BRICKS_SLAB = BLOCKS.register("cracked_gray_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_GRAY_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("cracked_gray_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_GRAY_PORCELAIN_BRICKS_WALL = BLOCKS.register("cracked_gray_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> LIGHT_GRAY_PORCELAIN_BRICKS = BLOCKS.register("light_gray_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> LIGHT_GRAY_PORCELAIN_BRICKS_SLAB = BLOCKS.register("light_gray_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> LIGHT_GRAY_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("light_gray_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> LIGHT_GRAY_PORCELAIN_BRICKS_WALL = BLOCKS.register("light_gray_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CRACKED_LIGHT_GRAY_PORCELAIN_BRICKS = BLOCKS.register("cracked_light_gray_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_LIGHT_GRAY_PORCELAIN_BRICKS_SLAB = BLOCKS.register("cracked_light_gray_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_LIGHT_GRAY_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("cracked_light_gray_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_LIGHT_GRAY_PORCELAIN_BRICKS_WALL = BLOCKS.register("cracked_light_gray_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> GREEN_PORCELAIN_BRICKS = BLOCKS.register("green_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> GREEN_PORCELAIN_BRICKS_SLAB = BLOCKS.register("green_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> GREEN_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("green_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> GREEN_PORCELAIN_BRICKS_WALL = BLOCKS.register("green_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CRACKED_GREEN_PORCELAIN_BRICKS = BLOCKS.register("cracked_green_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_GREEN_PORCELAIN_BRICKS_SLAB = BLOCKS.register("cracked_green_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_GREEN_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("cracked_green_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_GREEN_PORCELAIN_BRICKS_WALL = BLOCKS.register("cracked_green_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> YELLOW_PORCELAIN_BRICKS = BLOCKS.register("yellow_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> YELLOW_PORCELAIN_BRICKS_SLAB = BLOCKS.register("yellow_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> YELLOW_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("yellow_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> YELLOW_PORCELAIN_BRICKS_WALL = BLOCKS.register("yellow_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CRACKED_YELLOW_PORCELAIN_BRICKS = BLOCKS.register("cracked_yellow_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_YELLOW_PORCELAIN_BRICKS_SLAB = BLOCKS.register("cracked_yellow_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_YELLOW_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("cracked_yellow_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_YELLOW_PORCELAIN_BRICKS_WALL = BLOCKS.register("cracked_yellow_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> RED_PORCELAIN_BRICKS = BLOCKS.register("red_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> RED_PORCELAIN_BRICKS_SLAB = BLOCKS.register("red_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> RED_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("red_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> RED_PORCELAIN_BRICKS_WALL = BLOCKS.register("red_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CRACKED_RED_PORCELAIN_BRICKS = BLOCKS.register("cracked_red_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_RED_PORCELAIN_BRICKS_SLAB = BLOCKS.register("cracked_red_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_RED_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("cracked_red_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_RED_PORCELAIN_BRICKS_WALL = BLOCKS.register("cracked_red_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> PURPLE_PORCELAIN_BRICKS = BLOCKS.register("purple_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> PURPLE_PORCELAIN_BRICKS_SLAB = BLOCKS.register("purple_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> PURPLE_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("purple_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> PURPLE_PORCELAIN_BRICKS_WALL = BLOCKS.register("purple_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CRACKED_PURPLE_PORCELAIN_BRICKS = BLOCKS.register("cracked_purple_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_PURPLE_PORCELAIN_BRICKS_SLAB = BLOCKS.register("cracked_purple_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_PURPLE_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("cracked_purple_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_PURPLE_PORCELAIN_BRICKS_WALL = BLOCKS.register("cracked_purple_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> PINK_PORCELAIN_BRICKS = BLOCKS.register("pink_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> PINK_PORCELAIN_BRICKS_SLAB = BLOCKS.register("pink_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> PINK_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("pink_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> PINK_PORCELAIN_BRICKS_WALL = BLOCKS.register("pink_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CRACKED_PINK_PORCELAIN_BRICKS = BLOCKS.register("cracked_pink_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_PINK_PORCELAIN_BRICKS_SLAB = BLOCKS.register("cracked_pink_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_PINK_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("cracked_pink_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_PINK_PORCELAIN_BRICKS_WALL = BLOCKS.register("cracked_pink_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> ORANGE_PORCELAIN_BRICKS = BLOCKS.register("orange_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> ORANGE_PORCELAIN_BRICKS_SLAB = BLOCKS.register("orange_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> ORANGE_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("orange_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> ORANGE_PORCELAIN_BRICKS_WALL = BLOCKS.register("orange_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CRACKED_ORANGE_PORCELAIN_BRICKS = BLOCKS.register("cracked_orange_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_ORANGE_PORCELAIN_BRICKS_SLAB = BLOCKS.register("cracked_orange_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_ORANGE_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("cracked_orange_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_ORANGE_PORCELAIN_BRICKS_WALL = BLOCKS.register("cracked_orange_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> MAGENTA_PORCELAIN_BRICKS = BLOCKS.register("magenta_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> MAGENTA_PORCELAIN_BRICKS_SLAB = BLOCKS.register("magenta_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> MAGENTA_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("magenta_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> MAGENTA_PORCELAIN_BRICKS_WALL = BLOCKS.register("magenta_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CRACKED_MAGENTA_PORCELAIN_BRICKS = BLOCKS.register("cracked_magenta_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_MAGENTA_PORCELAIN_BRICKS_SLAB = BLOCKS.register("cracked_magenta_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_MAGENTA_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("cracked_magenta_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_MAGENTA_PORCELAIN_BRICKS_WALL = BLOCKS.register("cracked_magenta_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> LIME_PORCELAIN_BRICKS = BLOCKS.register("lime_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> LIME_PORCELAIN_BRICKS_SLAB = BLOCKS.register("lime_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> LIME_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("lime_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> LIME_PORCELAIN_BRICKS_WALL = BLOCKS.register("lime_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CRACKED_LIME_PORCELAIN_BRICKS = BLOCKS.register("cracked_lime_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_LIME_PORCELAIN_BRICKS_SLAB = BLOCKS.register("cracked_lime_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_LIME_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("cracked_lime_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_LIME_PORCELAIN_BRICKS_WALL = BLOCKS.register("cracked_lime_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> LIGHT_BLUE_PORCELAIN_BRICKS = BLOCKS.register("light_blue_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> LIGHT_BLUE_PORCELAIN_BRICKS_SLAB = BLOCKS.register("light_blue_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> LIGHT_BLUE_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("light_blue_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> LIGHT_BLUE_PORCELAIN_BRICKS_WALL = BLOCKS.register("light_blue_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CRACKED_LIGHT_BLUE_PORCELAIN_BRICKS = BLOCKS.register("cracked_light_blue_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_LIGHT_BLUE_PORCELAIN_BRICKS_SLAB = BLOCKS.register("cracked_light_blue_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_LIGHT_BLUE_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("cracked_light_blue_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_LIGHT_BLUE_PORCELAIN_BRICKS_WALL = BLOCKS.register("cracked_light_blue_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CYAN_PORCELAIN_BRICKS = BLOCKS.register("cyan_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CYAN_PORCELAIN_BRICKS_SLAB = BLOCKS.register("cyan_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CYAN_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("cyan_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CYAN_PORCELAIN_BRICKS_WALL = BLOCKS.register("cyan_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CRACKED_CYAN_PORCELAIN_BRICKS = BLOCKS.register("cracked_cyan_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_CYAN_PORCELAIN_BRICKS_SLAB = BLOCKS.register("cracked_cyan_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_CYAN_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("cracked_cyan_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_CYAN_PORCELAIN_BRICKS_WALL = BLOCKS.register("cracked_cyan_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> BROWN_PORCELAIN_BRICKS = BLOCKS.register("brown_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> BROWN_PORCELAIN_BRICKS_SLAB = BLOCKS.register("brown_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> BROWN_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("brown_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> BROWN_PORCELAIN_BRICKS_WALL = BLOCKS.register("brown_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CRACKED_BROWN_PORCELAIN_BRICKS = BLOCKS.register("cracked_brown_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_BROWN_PORCELAIN_BRICKS_SLAB = BLOCKS.register("cracked_brown_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_BROWN_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("cracked_brown_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_BROWN_PORCELAIN_BRICKS_WALL = BLOCKS.register("cracked_brown_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> BLUE_PORCELAIN_BRICKS = BLOCKS.register("blue_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> BLUE_PORCELAIN_BRICKS_SLAB = BLOCKS.register("blue_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> BLUE_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("blue_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> BLUE_PORCELAIN_BRICKS_WALL = BLOCKS.register("blue_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CRACKED_BLUE_PORCELAIN_BRICKS = BLOCKS.register("cracked_blue_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_BLUE_PORCELAIN_BRICKS_SLAB = BLOCKS.register("cracked_blue_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_BLUE_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("cracked_blue_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_BLUE_PORCELAIN_BRICKS_WALL = BLOCKS.register("cracked_blue_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> BLACK_PORCELAIN_BRICKS = BLOCKS.register("black_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> BLACK_PORCELAIN_BRICKS_SLAB = BLOCKS.register("black_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> BLACK_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("black_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> BLACK_PORCELAIN_BRICKS_WALL = BLOCKS.register("black_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			
			public static final RegistryObject<Block> CRACKED_BLACK_PORCELAIN_BRICKS = BLOCKS.register("cracked_black_porcelain_bricks", 
					() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_BLACK_PORCELAIN_BRICKS_SLAB = BLOCKS.register("cracked_black_porcelain_bricks_slab", 
					() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_BLACK_PORCELAIN_BRICKS_STAIRS = BLOCKS.register("cracked_black_porcelain_bricks_stairs", 
					() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
			public static final RegistryObject<Block> CRACKED_BLACK_PORCELAIN_BRICKS_WALL = BLOCKS.register("cracked_black_porcelain_bricks_wall", 
					() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));


}
