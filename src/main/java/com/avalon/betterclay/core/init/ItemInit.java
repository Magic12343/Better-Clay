package com.avalon.betterclay.core.init;

import com.avalon.betterclay.BetterClay;


import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			BetterClay.MOD_ID);


	//Items
	
	static final RegistryObject<Item> STONEWARE_BRICK = ITEMS.register("stoneware_brick", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> ADOBE_BRICK = ITEMS.register("adobe_brick", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> EARTHENWARE_BRICK = ITEMS.register("earthenware_brick", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> PORCELAIN_BRICK = ITEMS.register("porcelain_brick", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	public static final RegistryObject<Item> ADOBE_BALL = ITEMS.register("adobe_ball", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> EARTHENWARE_CHUNK = ITEMS.register("earthenware_chunk", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> KAOLIN_CHUNK = ITEMS.register("kaolin_chunk", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	// Block Items
	
	//Clay 
	public static final RegistryObject<BlockItem> BROKEN_BRICKS = ITEMS.register("broken_bricks",
			() -> new BlockItem(BlockInit.BROKEN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BROKEN_BRICKS_SLAB = ITEMS.register("broken_bricks_slab",
			() -> new BlockItem(BlockInit.BROKEN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BROKEN_BRICKS_STAIRS = ITEMS.register("broken_bricks_stairs",
			() -> new BlockItem(BlockInit.BROKEN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> DIRTY_BRICKS = ITEMS.register("dirty_bricks",
			() -> new BlockItem(BlockInit.DIRTY_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIRTY_BRICKS_SLAB = ITEMS.register("dirty_bricks_slab",
			() -> new BlockItem(BlockInit.DIRTY_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIRTY_BRICKS_STAIRS = ITEMS.register("dirty_bricks_stairs",
			() -> new BlockItem(BlockInit.DIRTY_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> BIGGER_BRICKS = ITEMS.register("bigger_bricks",
			() -> new BlockItem(BlockInit.BIGGER_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIGGER_BRICKS_SLAB = ITEMS.register("bigger_bricks_slab",
			() -> new BlockItem(BlockInit.BIGGER_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIGGER_BRICKS_STAIRS = ITEMS.register("bigger_bricks_stairs",
			() -> new BlockItem(BlockInit.BIGGER_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> CRACKED_BIGGER_BRICKS = ITEMS.register("cracked_bigger_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));	
	public static final RegistryObject<BlockItem> CRACKED_BIGGER_BRICKS_SLAB = ITEMS.register("cracked_bigger_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CRACKED_BIGGER_BRICKS_STAIRS = ITEMS.register("cracked_bigger_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> DIRTY_BIGGER_BRICKS = ITEMS.register("dirty_bigger_bricks",
			() -> new BlockItem(BlockInit.DIRTY_BIGGER_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIRTY_BIGGER_BRICKS_SLAB = ITEMS.register("dirty_bigger_bricks_slab",
			() -> new BlockItem(BlockInit.DIRTY_BIGGER_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIRTY_BIGGER_BRICKS_STAIRS = ITEMS.register("dirty_bigger_bricks_stairs",
			() -> new BlockItem(BlockInit.DIRTY_BIGGER_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> CHISELED_BRICKS = ITEMS.register("chiseled_bricks",
			() -> new BlockItem(BlockInit.CHISELED_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> BIG_BRICK = ITEMS.register("big_brick",
			() -> new BlockItem(BlockInit.BIG_BRICK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> BROKEN_BRICKS_WALL = ITEMS.register("broken_bricks_wall",
			() -> new BlockItem(BlockInit.BROKEN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> DIRTY_BRICKS_WALL = ITEMS.register("dirty_bricks_wall",
			() -> new BlockItem(BlockInit.DIRTY_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> BIGGER_BRICKS_WALL = ITEMS.register("bigger_bricks_wall",
			() -> new BlockItem(BlockInit.BIGGER_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> CRACKED_BIGGER_BRICKS_WALL = ITEMS.register("cracked_bigger_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> DIRTY_BIGGER_BRICKS_WALL = ITEMS.register("dirty_bigger_bricks_wall",
			() -> new BlockItem(BlockInit.DIRTY_BIGGER_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	//Stoneware
	
	public static final RegistryObject<BlockItem> STONEWARE = ITEMS.register("stoneware",
			() -> new BlockItem(BlockInit.STONEWARE.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> STONEWARE_BRICKS = ITEMS.register("stoneware_bricks",
			() -> new BlockItem(BlockInit.STONEWARE_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> STONEWARE_BRICKS_SLAB = ITEMS.register("stoneware_bricks_slab",
			() -> new BlockItem(BlockInit.STONEWARE_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> STONEWARE_BRICKS_STAIRS = ITEMS.register("stoneware_bricks_stairs",
			() -> new BlockItem(BlockInit.STONEWARE_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> CRACKED_STONEWARE_BRICKS = ITEMS.register("cracked_stoneware_bricks",
			() -> new BlockItem(BlockInit.CRACKED_STONEWARE_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CRACKED_STONEWARE_BRICKS_SLAB = ITEMS.register("cracked_stoneware_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_STONEWARE_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CRACKED_STONEWARE_BRICKS_STAIRS = ITEMS.register("cracked_stoneware_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_STONEWARE_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> DIRTY_STONEWARE_BRICKS = ITEMS.register("dirty_stoneware_bricks",
			() -> new BlockItem(BlockInit.DIRTY_STONEWARE_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIRTY_STONEWARE_BRICKS_SLAB = ITEMS.register("dirty_stoneware_bricks_slab",
			() -> new BlockItem(BlockInit.DIRTY_STONEWARE_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIRTY_STONEWARE_BRICKS_STAIRS = ITEMS.register("dirty_stoneware_bricks_stairs",
			() -> new BlockItem(BlockInit.DIRTY_STONEWARE_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> BIGGER_STONEWARE_BRICKS = ITEMS.register("bigger_stoneware_bricks",
			() -> new BlockItem(BlockInit.BIGGER_STONEWARE_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIGGER_STONEWARE_BRICKS_SLAB = ITEMS.register("bigger_stoneware_bricks_slab",
			() -> new BlockItem(BlockInit.BIGGER_STONEWARE_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIGGER_STONEWARE_BRICKS_STAIRS = ITEMS.register("bigger_stoneware_bricks_stairs",
			() -> new BlockItem(BlockInit.BIGGER_STONEWARE_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> CRACKED_BIGGER_STONEWARE_BRICKS = ITEMS.register("cracked_bigger_stoneware_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_STONEWARE_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CRACKED_BIGGER_STONEWARE_BRICKS_SLAB = ITEMS.register("cracked_bigger_stoneware_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_STONEWARE_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CRACKED_BIGGER_STONEWARE_BRICKS_STAIRS = ITEMS.register("cracked_bigger_stoneware_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_STONEWARE_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> DIRTY_BIGGER_STONEWARE_BRICKS = ITEMS.register("dirty_bigger_stoneware_bricks",
			() -> new BlockItem(BlockInit.DIRTY_BIGGER_STONEWARE_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIRTY_BIGGER_STONEWARE_BRICKS_SLAB = ITEMS.register("dirty_bigger_stoneware_bricks_slab",
			() -> new BlockItem(BlockInit.DIRTY_BIGGER_STONEWARE_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIRTY_BIGGER_STONEWARE_BRICKS_STAIRS = ITEMS.register("dirty_bigger_stoneware_bricks_stairs",
			() -> new BlockItem(BlockInit.DIRTY_BIGGER_STONEWARE_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> STONEWARE_CHISELED_BRICKS = ITEMS.register("stoneware_chiseled_bricks",
			() -> new BlockItem(BlockInit.STONEWARE_CHISELED_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> BIG_STONEWARE_BRICK = ITEMS.register("big_stoneware_brick",
			() -> new BlockItem(BlockInit.BIG_STONEWARE_BRICK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> STONEWARE_BRICKS_WALL = ITEMS.register("stoneware_bricks_wall",
			() -> new BlockItem(BlockInit.STONEWARE_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> CRACKED_STONEWARE_BRICKS_WALL = ITEMS.register("cracked_stoneware_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_STONEWARE_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> DIRTY_STONEWARE_BRICKS_WALL = ITEMS.register("dirty_stoneware_bricks_wall",
			() -> new BlockItem(BlockInit.DIRTY_STONEWARE_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> BIGGER_STONEWARE_BRICKS_WALL = ITEMS.register("bigger_stoneware_bricks_wall",
			() -> new BlockItem(BlockInit.BIGGER_STONEWARE_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> CRACKED_BIGGER_STONEWARE_BRICKS_WALL = ITEMS.register("cracked_bigger_stoneware_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_STONEWARE_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> DIRTY_BIGGER_STONEWARE_BRICKS_WALL = ITEMS.register("dirty_bigger_stoneware_bricks_wall",
			() -> new BlockItem(BlockInit.DIRTY_BIGGER_STONEWARE_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	//Adobe
	
	public static final RegistryObject<BlockItem> ADOBE_BRICKS = ITEMS.register("adobe_bricks",
			() -> new BlockItem(BlockInit.ADOBE_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> ADOBE_BRICKS_SLAB = ITEMS.register("adobe_bricks_slab",
			() -> new BlockItem(BlockInit.ADOBE_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> ADOBE_BRICKS_STAIRS = ITEMS.register("adobe_bricks_stairs",
			() -> new BlockItem(BlockInit.ADOBE_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> CRACKED_ADOBE_BRICKS = ITEMS.register("cracked_adobe_bricks",
			() -> new BlockItem(BlockInit.CRACKED_ADOBE_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CRACKED_ADOBE_BRICKS_SLAB = ITEMS.register("cracked_adobe_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_ADOBE_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CRACKED_ADOBE_BRICKS_STAIRS = ITEMS.register("cracked_adobe_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_ADOBE_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> DIRTY_ADOBE_BRICKS = ITEMS.register("dirty_adobe_bricks",
			() -> new BlockItem(BlockInit.DIRTY_ADOBE_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIRTY_ADOBE_BRICKS_SLAB = ITEMS.register("dirty_adobe_bricks_slab",
			() -> new BlockItem(BlockInit.DIRTY_ADOBE_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIRTY_ADOBE_BRICKS_STAIRS = ITEMS.register("dirty_adobe_bricks_stairs",
			() -> new BlockItem(BlockInit.DIRTY_ADOBE_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> BIGGER_ADOBE_BRICKS = ITEMS.register("bigger_adobe_bricks",
			() -> new BlockItem(BlockInit.BIGGER_ADOBE_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIGGER_ADOBE_BRICKS_SLAB = ITEMS.register("bigger_adobe_bricks_slab",
			() -> new BlockItem(BlockInit.BIGGER_ADOBE_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIGGER_ADOBE_BRICKS_STAIRS = ITEMS.register("bigger_adobe_bricks_stairs",
			() -> new BlockItem(BlockInit.BIGGER_ADOBE_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> CRACKED_BIGGER_ADOBE_BRICKS = ITEMS.register("cracked_bigger_adobe_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_ADOBE_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CRACKED_BIGGER_ADOBE_BRICKS_SLAB = ITEMS.register("cracked_bigger_adobe_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_ADOBE_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CRACKED_BIGGER_ADOBE_BRICKS_STAIRS = ITEMS.register("cracked_bigger_adobe_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_ADOBE_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> DIRTY_BIGGER_ADOBE_BRICKS = ITEMS.register("dirty_bigger_adobe_bricks",
			() -> new BlockItem(BlockInit.DIRTY_BIGGER_ADOBE_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIRTY_BIGGER_ADOBE_BRICKS_SLAB = ITEMS.register("dirty_bigger_adobe_bricks_slab",
			() -> new BlockItem(BlockInit.DIRTY_BIGGER_ADOBE_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIRTY_BIGGER_ADOBE_BRICKS_STAIRS = ITEMS.register("dirty_bigger_adobe_bricks_stairs",
			() -> new BlockItem(BlockInit.DIRTY_BIGGER_ADOBE_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> CHISELED_ADOBE_BRICKS = ITEMS.register("chiseled_adobe_bricks",
			() -> new BlockItem(BlockInit.CHISELED_ADOBE_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> BIG_ADOBE_BRICK = ITEMS.register("big_adobe_brick",
			() -> new BlockItem(BlockInit.BIG_ADOBE_BRICK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> ADOBE_BRICKS_WALL = ITEMS.register("adobe_bricks_wall",
			() -> new BlockItem(BlockInit.ADOBE_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> CRACKED_ADOBE_BRICKS_WALL = ITEMS.register("cracked_adobe_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_ADOBE_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> DIRTY_ADOBE_BRICKS_WALL = ITEMS.register("dirty_adobe_bricks_wall",
			() -> new BlockItem(BlockInit.DIRTY_ADOBE_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> BIGGER_ADOBE_BRICKS_WALL = ITEMS.register("bigger_adobe_bricks_wall",
			() -> new BlockItem(BlockInit.BIGGER_ADOBE_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> CRACKED_BIGGER_ADOBE_BRICKS_WALL = ITEMS.register("cracked_bigger_adobe_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_ADOBE_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> DIRTY_BIGGER_ADOBE_BRICKS_WALL = ITEMS.register("dirty_bigger_adobe_bricks_wall",
			() -> new BlockItem(BlockInit.DIRTY_BIGGER_ADOBE_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	//Earthenware
	
	public static final RegistryObject<BlockItem> EARTHENWARE = ITEMS.register("earthenware",
			() -> new BlockItem(BlockInit.EARTHENWARE.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> EARTHENWARE_BRICKS = ITEMS.register("earthenware_bricks",
			() -> new BlockItem(BlockInit.EARTHENWARE_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> EARTHENWARE_BRICKS_SLAB = ITEMS.register("earthenware_bricks_slab",
			() -> new BlockItem(BlockInit.EARTHENWARE_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> EARTHENWARE_BRICKS_STAIRS = ITEMS.register("earthenware_bricks_stairs",
			() -> new BlockItem(BlockInit.EARTHENWARE_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> CRACKED_EARTHENWARE_BRICKS = ITEMS.register("cracked_earthenware_bricks",
			() -> new BlockItem(BlockInit.CRACKED_EARTHENWARE_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CRACKED_EARTHENWARE_BRICKS_SLAB = ITEMS.register("cracked_earthenware_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_EARTHENWARE_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CRACKED_EARTHENWARE_BRICKS_STAIRS = ITEMS.register("cracked_earthenware_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_EARTHENWARE_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> DIRTY_EARTHENWARE_BRICKS = ITEMS.register("dirty_earthenware_bricks",
			() -> new BlockItem(BlockInit.DIRTY_EARTHENWARE_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIRTY_EARTHENWARE_BRICKS_SLAB = ITEMS.register("dirty_earthenware_bricks_slab",
			() -> new BlockItem(BlockInit.DIRTY_EARTHENWARE_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIRTY_EARTHENWARE_BRICKS_STAIRS = ITEMS.register("dirty_earthenware_bricks_stairs",
			() -> new BlockItem(BlockInit.DIRTY_EARTHENWARE_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> BIGGER_EARTHENWARE_BRICKS = ITEMS.register("bigger_earthenware_bricks",
			() -> new BlockItem(BlockInit.BIGGER_EARTHENWARE_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIGGER_EARTHENWARE_BRICKS_SLAB = ITEMS.register("bigger_earthenware_bricks_slab",
			() -> new BlockItem(BlockInit.BIGGER_EARTHENWARE_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIGGER_EARTHENWARE_BRICKS_STAIRS = ITEMS.register("bigger_earthenware_bricks_stairs",
			() -> new BlockItem(BlockInit.BIGGER_EARTHENWARE_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> CRACKED_BIGGER_EARTHENWARE_BRICKS = ITEMS.register("cracked_bigger_earthenware_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_EARTHENWARE_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CRACKED_BIGGER_EARTHENWARE_BRICKS_SLAB = ITEMS.register("cracked_bigger_earthenware_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_EARTHENWARE_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CRACKED_BIGGER_EARTHENWARE_BRICKS_STAIRS = ITEMS.register("cracked_bigger_earthenware_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_EARTHENWARE_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> DIRTY_BIGGER_EARTHENWARE_BRICKS = ITEMS.register("dirty_bigger_earthenware_bricks",
			() -> new BlockItem(BlockInit.DIRTY_BIGGER_EARTHENWARE_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIRTY_BIGGER_EARTHENWARE_BRICKS_SLAB = ITEMS.register("dirty_bigger_earthenware_bricks_slab",
			() -> new BlockItem(BlockInit.DIRTY_BIGGER_EARTHENWARE_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIRTY_BIGGER_EARTHENWARE_BRICKS_STAIRS = ITEMS.register("dirty_bigger_earthenware_bricks_stairs",
			() -> new BlockItem(BlockInit.DIRTY_BIGGER_EARTHENWARE_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> CHISELED_EARTHENWARE_BRICKS = ITEMS.register("chiseled_earthenware_bricks",
			() -> new BlockItem(BlockInit.CHISELED_EARTHENWARE_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> BIG_EARTHENWARE_BRICK = ITEMS.register("big_earthenware_brick",
			() -> new BlockItem(BlockInit.BIG_EARTHENWARE_BRICK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> EARTHENWARE_BRICKS_WALL = ITEMS.register("earthenware_bricks_wall",
			() -> new BlockItem(BlockInit.EARTHENWARE_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> CRACKED_EARTHENWARE_BRICKS_WALL = ITEMS.register("cracked_earthenware_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_EARTHENWARE_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> DIRTY_EARTHENWARE_BRICKS_WALL = ITEMS.register("dirty_earthenware_bricks_wall",
			() -> new BlockItem(BlockInit.DIRTY_EARTHENWARE_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> BIGGER_EARTHENWARE_BRICKS_WALL = ITEMS.register("bigger_earthenware_bricks_wall",
			() -> new BlockItem(BlockInit.BIGGER_EARTHENWARE_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> CRACKED_BIGGER_EARTHENWARE_BRICKS_WALL = ITEMS.register("cracked_bigger_earthenware_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_EARTHENWARE_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> DIRTY_BIGGER_EARTHENWARE_BRICKS_WALL = ITEMS.register("dirty_bigger_earthenware_bricks_wall",
			() -> new BlockItem(BlockInit.DIRTY_BIGGER_EARTHENWARE_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	//Porcelain
	
	public static final RegistryObject<BlockItem> KAOLIN_CLAY = ITEMS.register("kaolin_clay",
			() -> new BlockItem(BlockInit.KAOLIN_CLAY.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> PORCELAIN_BRICKS = ITEMS.register("porcelain_bricks",
			() -> new BlockItem(BlockInit.PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> PORCELAIN_BRICKS_SLAB = ITEMS.register("porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> PORCELAIN_BRICKS_STAIRS = ITEMS.register("porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> PORCELAIN_BRICKS_WALL = ITEMS.register("porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    
    public static final RegistryObject<BlockItem> CRACKED_PORCELAIN_BRICKS = ITEMS.register("cracked_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CRACKED_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    
    public static final RegistryObject<BlockItem> DIRTY_PORCELAIN_BRICKS = ITEMS.register("dirty_porcelain_bricks",
			() -> new BlockItem(BlockInit.DIRTY_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIRTY_PORCELAIN_BRICKS_SLAB = ITEMS.register("dirty_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.DIRTY_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> DIRTY_PORCELAIN_BRICKS_STAIRS = ITEMS.register("dirty_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.DIRTY_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> DIRTY_PORCELAIN_BRICKS_WALL = ITEMS.register("dirty_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.DIRTY_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	//Colored Porcelain
	
    public static final RegistryObject<BlockItem> GRAY_PORCELAIN_BRICKS = ITEMS.register("gray_porcelain_bricks",
			() -> new BlockItem(BlockInit.GRAY_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> GRAY_PORCELAIN_BRICKS_SLAB = ITEMS.register("gray_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.GRAY_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> GRAY_PORCELAIN_BRICKS_STAIRS = ITEMS.register("gray_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.GRAY_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> GRAY_PORCELAIN_BRICKS_WALL = ITEMS.register("gray_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.GRAY_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> LIGHT_GRAY_PORCELAIN_BRICKS = ITEMS.register("light_gray_porcelain_bricks",
			() -> new BlockItem(BlockInit.LIGHT_GRAY_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> LIGHT_GRAY_PORCELAIN_BRICKS_SLAB = ITEMS.register("light_gray_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.LIGHT_GRAY_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> LIGHT_GRAY_PORCELAIN_BRICKS_STAIRS = ITEMS.register("light_gray_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.LIGHT_GRAY_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> LIGHT_GRAY_PORCELAIN_BRICKS_WALL = ITEMS.register("light_gray_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.LIGHT_GRAY_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> GREEN_PORCELAIN_BRICKS = ITEMS.register("green_porcelain_bricks",
			() -> new BlockItem(BlockInit.GREEN_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> GREEN_PORCELAIN_BRICKS_SLAB = ITEMS.register("green_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.GREEN_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> GREEN_PORCELAIN_BRICKS_STAIRS = ITEMS.register("green_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.GREEN_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> GREEN_PORCELAIN_BRICKS_WALL = ITEMS.register("green_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.GREEN_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> YELLOW_PORCELAIN_BRICKS = ITEMS.register("yellow_porcelain_bricks",
			() -> new BlockItem(BlockInit.YELLOW_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> YELLOW_PORCELAIN_BRICKS_SLAB = ITEMS.register("yellow_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.YELLOW_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> YELLOW_PORCELAIN_BRICKS_STAIRS = ITEMS.register("yellow_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.YELLOW_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> YELLOW_PORCELAIN_BRICKS_WALL = ITEMS.register("yellow_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.YELLOW_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> RED_PORCELAIN_BRICKS = ITEMS.register("red_porcelain_bricks",
			() -> new BlockItem(BlockInit.RED_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> RED_PORCELAIN_BRICKS_SLAB = ITEMS.register("red_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.RED_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> RED_PORCELAIN_BRICKS_STAIRS = ITEMS.register("red_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.RED_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> RED_PORCELAIN_BRICKS_WALL = ITEMS.register("red_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.RED_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> PURPLE_PORCELAIN_BRICKS = ITEMS.register("purple_porcelain_bricks",
			() -> new BlockItem(BlockInit.PURPLE_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> PURPLE_PORCELAIN_BRICKS_SLAB = ITEMS.register("purple_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.PURPLE_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> PURPLE_PORCELAIN_BRICKS_STAIRS = ITEMS.register("purple_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.PURPLE_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> PURPLE_PORCELAIN_BRICKS_WALL = ITEMS.register("purple_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.PURPLE_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> PINK_PORCELAIN_BRICKS = ITEMS.register("pink_porcelain_bricks",
			() -> new BlockItem(BlockInit.PINK_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> PINK_PORCELAIN_BRICKS_SLAB = ITEMS.register("pink_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.PINK_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> PINK_PORCELAIN_BRICKS_STAIRS = ITEMS.register("pink_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.PINK_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> PINK_PORCELAIN_BRICKS_WALL = ITEMS.register("pink_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.PINK_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> ORANGE_PORCELAIN_BRICKS = ITEMS.register("orange_porcelain_bricks",
			() -> new BlockItem(BlockInit.ORANGE_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> ORANGE_PORCELAIN_BRICKS_SLAB = ITEMS.register("orange_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.ORANGE_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> ORANGE_PORCELAIN_BRICKS_STAIRS = ITEMS.register("orange_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.ORANGE_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> ORANGE_PORCELAIN_BRICKS_WALL = ITEMS.register("orange_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.ORANGE_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> MAGENTA_PORCELAIN_BRICKS = ITEMS.register("magenta_porcelain_bricks",
			() -> new BlockItem(BlockInit.MAGENTA_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> MAGENTA_PORCELAIN_BRICKS_SLAB = ITEMS.register("magenta_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.MAGENTA_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> MAGENTA_PORCELAIN_BRICKS_STAIRS = ITEMS.register("magenta_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.MAGENTA_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> MAGENTA_PORCELAIN_BRICKS_WALL = ITEMS.register("magenta_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.MAGENTA_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> LIME_PORCELAIN_BRICKS = ITEMS.register("lime_porcelain_bricks",
			() -> new BlockItem(BlockInit.LIME_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> LIME_PORCELAIN_BRICKS_SLAB = ITEMS.register("lime_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.LIME_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> LIME_PORCELAIN_BRICKS_STAIRS = ITEMS.register("lime_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.LIME_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> LIME_PORCELAIN_BRICKS_WALL = ITEMS.register("lime_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.LIME_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> LIGHT_BLUE_PORCELAIN_BRICKS = ITEMS.register("light_blue_porcelain_bricks",
			() -> new BlockItem(BlockInit.LIGHT_BLUE_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> LIGHT_BLUE_PORCELAIN_BRICKS_SLAB = ITEMS.register("light_blue_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.LIGHT_BLUE_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> LIGHT_BLUE_PORCELAIN_BRICKS_STAIRS = ITEMS.register("light_blue_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.LIGHT_BLUE_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> LIGHT_BLUE_PORCELAIN_BRICKS_WALL = ITEMS.register("light_blue_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.LIGHT_BLUE_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    
    public static final RegistryObject<BlockItem> CYAN_PORCELAIN_BRICKS = ITEMS.register("cyan_porcelain_bricks",
			() -> new BlockItem(BlockInit.CYAN_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CYAN_PORCELAIN_BRICKS_SLAB = ITEMS.register("cyan_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CYAN_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CYAN_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cyan_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CYAN_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CYAN_PORCELAIN_BRICKS_WALL = ITEMS.register("cyan_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CYAN_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> BROWN_PORCELAIN_BRICKS = ITEMS.register("brown_porcelain_bricks",
			() -> new BlockItem(BlockInit.BROWN_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BROWN_PORCELAIN_BRICKS_SLAB = ITEMS.register("brown_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.BROWN_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BROWN_PORCELAIN_BRICKS_STAIRS = ITEMS.register("brown_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.BROWN_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BROWN_PORCELAIN_BRICKS_WALL = ITEMS.register("brown_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.BROWN_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> BLUE_PORCELAIN_BRICKS = ITEMS.register("blue_porcelain_bricks",
			() -> new BlockItem(BlockInit.BLUE_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BLUE_PORCELAIN_BRICKS_SLAB = ITEMS.register("blue_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.BLUE_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BLUE_PORCELAIN_BRICKS_STAIRS = ITEMS.register("blue_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.BLUE_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BLUE_PORCELAIN_BRICKS_WALL = ITEMS.register("blue_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.BLUE_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> BLACK_PORCELAIN_BRICKS = ITEMS.register("black_porcelain_bricks",
			() -> new BlockItem(BlockInit.BLACK_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BLACK_PORCELAIN_BRICKS_SLAB = ITEMS.register("black_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.BLACK_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BLACK_PORCELAIN_BRICKS_STAIRS = ITEMS.register("black_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.BLACK_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BLACK_PORCELAIN_BRICKS_WALL = ITEMS.register("black_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.BLACK_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    
    //Cracked Colored Porcelain
    
    public static final RegistryObject<BlockItem> CRACKED_GRAY_PORCELAIN_BRICKS = ITEMS.register("cracked_gray_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_GRAY_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_GRAY_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_gray_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_GRAY_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_GRAY_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_gray_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_GRAY_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_GRAY_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_gray_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_GRAY_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> CRACKED_LIGHT_GRAY_PORCELAIN_BRICKS = ITEMS.register("cracked_light_gray_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_LIGHT_GRAY_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_LIGHT_GRAY_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_light_gray_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_LIGHT_GRAY_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_LIGHT_GRAY_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_light_gray_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_LIGHT_GRAY_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_LIGHT_GRAY_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_light_gray_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_LIGHT_GRAY_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> CRACKED_GREEN_PORCELAIN_BRICKS = ITEMS.register("cracked_green_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_GREEN_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_GREEN_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_green_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_GREEN_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_GREEN_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_green_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_GREEN_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_GREEN_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_green_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_GREEN_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> CRACKED_YELLOW_PORCELAIN_BRICKS = ITEMS.register("cracked_yellow_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_YELLOW_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_YELLOW_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_yellow_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_YELLOW_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_YELLOW_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_yellow_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_YELLOW_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_YELLOW_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_yellow_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_YELLOW_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> CRACKED_RED_PORCELAIN_BRICKS = ITEMS.register("cracked_red_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_RED_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_RED_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_red_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_RED_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_RED_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_red_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_RED_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_RED_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_red_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_RED_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> CRACKED_PURPLE_PORCELAIN_BRICKS = ITEMS.register("cracked_purple_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_PURPLE_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_PURPLE_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_purple_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_PURPLE_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_PURPLE_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_purple_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_PURPLE_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_PURPLE_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_purple_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_PURPLE_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> CRACKED_PINK_PORCELAIN_BRICKS = ITEMS.register("cracked_pink_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_PINK_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_PINK_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_pink_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_PINK_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_PINK_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_pink_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_PINK_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_PINK_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_pink_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_PINK_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> CRACKED_ORANGE_PORCELAIN_BRICKS = ITEMS.register("cracked_orange_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_ORANGE_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_ORANGE_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_orange_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_ORANGE_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_ORANGE_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_orange_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_ORANGE_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_ORANGE_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_orange_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_ORANGE_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> CRACKED_MAGENTA_PORCELAIN_BRICKS = ITEMS.register("cracked_magenta_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_MAGENTA_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_MAGENTA_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_magenta_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_MAGENTA_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_MAGENTA_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_magenta_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_MAGENTA_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_MAGENTA_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_magenta_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_MAGENTA_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> CRACKED_LIME_PORCELAIN_BRICKS = ITEMS.register("cracked_lime_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_LIME_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_LIME_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_lime_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_LIME_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_LIME_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_lime_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_LIME_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_LIME_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_lime_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_LIME_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> CRACKED_LIGHT_BLUE_PORCELAIN_BRICKS = ITEMS.register("cracked_light_blue_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_LIGHT_BLUE_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_LIGHT_BLUE_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_light_blue_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_LIGHT_BLUE_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_LIGHT_BLUE_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_light_blue_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_LIGHT_BLUE_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_LIGHT_BLUE_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_light_blue_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_LIGHT_BLUE_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    
    public static final RegistryObject<BlockItem> CRACKED_CYAN_PORCELAIN_BRICKS = ITEMS.register("cracked_cyan_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_CYAN_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_CYAN_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_cyan_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_CYAN_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_CYAN_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_cyan_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_CYAN_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_CYAN_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_cyan_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_CYAN_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> CRACKED_BROWN_PORCELAIN_BRICKS = ITEMS.register("cracked_brown_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BROWN_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BROWN_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_brown_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BROWN_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BROWN_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_brown_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BROWN_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BROWN_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_brown_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BROWN_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> CRACKED_BLUE_PORCELAIN_BRICKS = ITEMS.register("cracked_blue_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BLUE_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BLUE_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_blue_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BLUE_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BLUE_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_blue_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BLUE_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BLUE_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_blue_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BLUE_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
					
    public static final RegistryObject<BlockItem> CRACKED_BLACK_PORCELAIN_BRICKS = ITEMS.register("cracked_black_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BLACK_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BLACK_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_black_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BLACK_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BLACK_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_black_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BLACK_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BLACK_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_black_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BLACK_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
    //Bigger Porcelain Bricks
    
    public static final RegistryObject<BlockItem> BIGGER_PORCELAIN_BRICKS = ITEMS.register("bigger_porcelain_bricks",
			() -> new BlockItem(BlockInit.BIGGER_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_GRAY_PORCELAIN_BRICKS = ITEMS.register("bigger_gray_porcelain_bricks",
			() -> new BlockItem(BlockInit.BIGGER_GRAY_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_LIGHT_GRAY_PORCELAIN_BRICKS = ITEMS.register("bigger_light_gray_porcelain_bricks",
			() -> new BlockItem(BlockInit.BIGGER_LIGHT_GRAY_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_GREEN_PORCELAIN_BRICKS = ITEMS.register("bigger_green_porcelain_bricks",
			() -> new BlockItem(BlockInit.BIGGER_GREEN_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_YELLOW_PORCELAIN_BRICKS = ITEMS.register("bigger_yellow_porcelain_bricks",
			() -> new BlockItem(BlockInit.BIGGER_YELLOW_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_RED_PORCELAIN_BRICKS = ITEMS.register("bigger_red_porcelain_bricks",
			() -> new BlockItem(BlockInit.BIGGER_RED_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_PURPLE_PORCELAIN_BRICKS = ITEMS.register("bigger_purple_porcelain_bricks",
			() -> new BlockItem(BlockInit.BIGGER_PURPLE_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_PINK_PORCELAIN_BRICKS = ITEMS.register("bigger_pink_porcelain_bricks",
			() -> new BlockItem(BlockInit.BIGGER_PINK_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_ORANGE_PORCELAIN_BRICKS = ITEMS.register("bigger_orange_porcelain_bricks",
			() -> new BlockItem(BlockInit.BIGGER_ORANGE_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_MAGENTA_PORCELAIN_BRICKS = ITEMS.register("bigger_magenta_porcelain_bricks",
			() -> new BlockItem(BlockInit.BIGGER_MAGENTA_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_LIME_PORCELAIN_BRICKS = ITEMS.register("bigger_lime_porcelain_bricks",
			() -> new BlockItem(BlockInit.BIGGER_LIME_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_LIGHT_BLUE_PORCELAIN_BRICKS = ITEMS.register("bigger_light_blue_porcelain_bricks",
			() -> new BlockItem(BlockInit.BIGGER_LIGHT_BLUE_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_CYAN_PORCELAIN_BRICKS = ITEMS.register("bigger_cyan_porcelain_bricks",
			() -> new BlockItem(BlockInit.BIGGER_CYAN_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_BROWN_PORCELAIN_BRICKS = ITEMS.register("bigger_brown_porcelain_bricks",
			() -> new BlockItem(BlockInit.BIGGER_BROWN_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_BLUE_PORCELAIN_BRICKS = ITEMS.register("bigger_blue_porcelain_bricks",
			() -> new BlockItem(BlockInit.BIGGER_BLUE_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_BLACK_PORCELAIN_BRICKS = ITEMS.register("bigger_black_porcelain_bricks",
			() -> new BlockItem(BlockInit.BIGGER_BLACK_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_PORCELAIN_BRICKS = ITEMS.register("cracked_bigger_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_GRAY_PORCELAIN_BRICKS = ITEMS.register("cracked_bigger_gray_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_GRAY_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_LIGHT_GRAY_PORCELAIN_BRICKS = ITEMS.register("cracked_bigger_light_gray_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_LIGHT_GRAY_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_GREEN_PORCELAIN_BRICKS = ITEMS.register("cracked_bigger_green_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_GREEN_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_YELLOW_PORCELAIN_BRICKS = ITEMS.register("cracked_bigger_yellow_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_YELLOW_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_RED_PORCELAIN_BRICKS = ITEMS.register("cracked_bigger_red_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_RED_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_PURPLE_PORCELAIN_BRICKS = ITEMS.register("cracked_bigger_purple_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_PURPLE_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_PINK_PORCELAIN_BRICKS = ITEMS.register("cracked_bigger_pink_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_PINK_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_ORANGE_PORCELAIN_BRICKS = ITEMS.register("cracked_bigger_orange_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_ORANGE_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_MAGENTA_PORCELAIN_BRICKS = ITEMS.register("cracked_bigger_magenta_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_MAGENTA_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_LIME_PORCELAIN_BRICKS = ITEMS.register("cracked_bigger_lime_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_LIME_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_LIGHT_BLUE_PORCELAIN_BRICKS = ITEMS.register("cracked_bigger_light_blue_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_LIGHT_BLUE_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_CYAN_PORCELAIN_BRICKS = ITEMS.register("cracked_bigger_cyan_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_CYAN_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_BROWN_PORCELAIN_BRICKS = ITEMS.register("cracked_bigger_brown_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_BROWN_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_BLUE_PORCELAIN_BRICKS = ITEMS.register("cracked_bigger_blue_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_BLUE_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_BLACK_PORCELAIN_BRICKS = ITEMS.register("cracked_bigger_black_porcelain_bricks",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_BLACK_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    
    public static final RegistryObject<BlockItem> BIGGER_PORCELAIN_BRICKS_SLAB = ITEMS.register("bigger_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.BIGGER_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_GRAY_PORCELAIN_BRICKS_SLAB = ITEMS.register("bigger_gray_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.BIGGER_GRAY_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_LIGHT_GRAY_PORCELAIN_BRICKS_SLAB = ITEMS.register("bigger_light_gray_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.BIGGER_LIGHT_GRAY_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_GREEN_PORCELAIN_BRICKS_SLAB = ITEMS.register("bigger_green_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.BIGGER_GREEN_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_YELLOW_PORCELAIN_BRICKS_SLAB = ITEMS.register("bigger_yellow_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.BIGGER_YELLOW_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_RED_PORCELAIN_BRICKS_SLAB = ITEMS.register("bigger_red_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.BIGGER_RED_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_PURPLE_PORCELAIN_BRICKS_SLAB = ITEMS.register("bigger_purple_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.BIGGER_PURPLE_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_PINK_PORCELAIN_BRICKS_SLAB = ITEMS.register("bigger_pink_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.BIGGER_PINK_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_ORANGE_PORCELAIN_BRICKS_SLAB = ITEMS.register("bigger_orange_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.BIGGER_ORANGE_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_MAGENTA_PORCELAIN_BRICKS_SLAB = ITEMS.register("bigger_magenta_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.BIGGER_MAGENTA_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_LIME_PORCELAIN_BRICKS_SLAB = ITEMS.register("bigger_lime_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.BIGGER_LIME_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_LIGHT_BLUE_PORCELAIN_BRICKS_SLAB = ITEMS.register("bigger_light_blue_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.BIGGER_LIGHT_BLUE_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_CYAN_PORCELAIN_BRICKS_SLAB = ITEMS.register("bigger_cyan_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.BIGGER_CYAN_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_BROWN_PORCELAIN_BRICKS_SLAB = ITEMS.register("bigger_brown_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.BIGGER_BROWN_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_BLUE_PORCELAIN_BRICKS_SLAB = ITEMS.register("bigger_blue_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.BIGGER_BLUE_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_BLACK_PORCELAIN_BRICKS_SLAB = ITEMS.register("bigger_black_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.BIGGER_BLACK_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_bigger_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_GRAY_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_bigger_gray_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_GRAY_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_LIGHT_GRAY_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_bigger_light_gray_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_LIGHT_GRAY_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_GREEN_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_bigger_green_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_GREEN_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_YELLOW_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_bigger_yellow_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_YELLOW_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_RED_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_bigger_red_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_RED_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_PURPLE_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_bigger_purple_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_PURPLE_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_PINK_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_bigger_pink_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_PINK_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_ORANGE_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_bigger_orange_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_ORANGE_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_MAGENTA_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_bigger_magenta_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_MAGENTA_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_LIME_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_bigger_lime_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_LIME_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_LIGHT_BLUE_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_bigger_light_blue_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_LIGHT_BLUE_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_CYAN_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_bigger_cyan_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_CYAN_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_BROWN_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_bigger_brown_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_BROWN_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_BLUE_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_bigger_blue_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_BLUE_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_BLACK_PORCELAIN_BRICKS_SLAB = ITEMS.register("cracked_bigger_black_porcelain_bricks_slab",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_BLACK_PORCELAIN_BRICKS_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    
    public static final RegistryObject<BlockItem> BIGGER_PORCELAIN_BRICKS_STAIRS = ITEMS.register("bigger_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.BIGGER_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_GRAY_PORCELAIN_BRICKS_STAIRS = ITEMS.register("bigger_gray_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.BIGGER_GRAY_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_LIGHT_GRAY_PORCELAIN_BRICKS_STAIRS = ITEMS.register("bigger_light_gray_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.BIGGER_LIGHT_GRAY_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_GREEN_PORCELAIN_BRICKS_STAIRS = ITEMS.register("bigger_green_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.BIGGER_GREEN_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_YELLOW_PORCELAIN_BRICKS_STAIRS = ITEMS.register("bigger_yellow_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.BIGGER_YELLOW_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_RED_PORCELAIN_BRICKS_STAIRS = ITEMS.register("bigger_red_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.BIGGER_RED_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_PURPLE_PORCELAIN_BRICKS_STAIRS = ITEMS.register("bigger_purple_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.BIGGER_PURPLE_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_PINK_PORCELAIN_BRICKS_STAIRS = ITEMS.register("bigger_pink_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.BIGGER_PINK_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_ORANGE_PORCELAIN_BRICKS_STAIRS = ITEMS.register("bigger_orange_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.BIGGER_ORANGE_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_MAGENTA_PORCELAIN_BRICKS_STAIRS = ITEMS.register("bigger_magenta_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.BIGGER_MAGENTA_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_LIME_PORCELAIN_BRICKS_STAIRS = ITEMS.register("bigger_lime_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.BIGGER_LIME_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_LIGHT_BLUE_PORCELAIN_BRICKS_STAIRS = ITEMS.register("bigger_light_blue_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.BIGGER_LIGHT_BLUE_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_CYAN_PORCELAIN_BRICKS_STAIRS = ITEMS.register("bigger_cyan_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.BIGGER_CYAN_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_BROWN_PORCELAIN_BRICKS_STAIRS = ITEMS.register("bigger_brown_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.BIGGER_BROWN_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_BLUE_PORCELAIN_BRICKS_STAIRS = ITEMS.register("bigger_blue_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.BIGGER_BLUE_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_BLACK_PORCELAIN_BRICKS_STAIRS = ITEMS.register("bigger_black_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.BIGGER_BLACK_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_bigger_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_GRAY_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_bigger_gray_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_GRAY_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_LIGHT_GRAY_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_bigger_light_gray_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_LIGHT_GRAY_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_GREEN_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_bigger_green_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_GREEN_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_YELLOW_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_bigger_yellow_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_YELLOW_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_RED_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_bigger_red_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_RED_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_PURPLE_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_bigger_purple_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_PURPLE_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_PINK_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_bigger_pink_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_PINK_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_ORANGE_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_bigger_orange_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_ORANGE_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_MAGENTA_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_bigger_magenta_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_MAGENTA_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_LIME_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_bigger_lime_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_LIME_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_LIGHT_BLUE_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_bigger_light_blue_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_LIGHT_BLUE_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_CYAN_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_bigger_cyan_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_CYAN_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_BROWN_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_bigger_brown_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_BROWN_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_BLUE_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_bigger_blue_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_BLUE_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_BLACK_PORCELAIN_BRICKS_STAIRS = ITEMS.register("cracked_bigger_black_porcelain_bricks_stairs",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_BLACK_PORCELAIN_BRICKS_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    
    public static final RegistryObject<BlockItem> BIGGER_GRAY_PORCELAIN_BRICKS_WALL = ITEMS.register("bigger_gray_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.BIGGER_GRAY_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_LIGHT_GRAY_PORCELAIN_BRICKS_WALL = ITEMS.register("bigger_light_gray_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.BIGGER_LIGHT_GRAY_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_GREEN_PORCELAIN_BRICKS_WALL = ITEMS.register("bigger_green_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.BIGGER_GREEN_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_YELLOW_PORCELAIN_BRICKS_WALL = ITEMS.register("bigger_yellow_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.BIGGER_YELLOW_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_RED_PORCELAIN_BRICKS_WALL = ITEMS.register("bigger_red_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.BIGGER_RED_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_PURPLE_PORCELAIN_BRICKS_WALL = ITEMS.register("bigger_purple_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.BIGGER_PURPLE_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_PINK_PORCELAIN_BRICKS_WALL = ITEMS.register("bigger_pink_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.BIGGER_PINK_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_ORANGE_PORCELAIN_BRICKS_WALL = ITEMS.register("bigger_orange_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.BIGGER_ORANGE_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_MAGENTA_PORCELAIN_BRICKS_WALL = ITEMS.register("bigger_magenta_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.BIGGER_MAGENTA_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_LIME_PORCELAIN_BRICKS_WALL = ITEMS.register("bigger_lime_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.BIGGER_LIME_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_LIGHT_BLUE_PORCELAIN_BRICKS_WALL = ITEMS.register("bigger_light_blue_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.BIGGER_LIGHT_BLUE_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_CYAN_PORCELAIN_BRICKS_WALL = ITEMS.register("bigger_cyan_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.BIGGER_CYAN_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_BROWN_PORCELAIN_BRICKS_WALL = ITEMS.register("bigger_brown_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.BIGGER_BROWN_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_BLUE_PORCELAIN_BRICKS_WALL = ITEMS.register("bigger_blue_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.BIGGER_BLUE_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BIGGER_BLACK_PORCELAIN_BRICKS_WALL = ITEMS.register("bigger_black_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.BIGGER_BLACK_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    
    public static final RegistryObject<BlockItem> BIGGER_PORCELAIN_BRICKS_WALL = ITEMS.register("bigger_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.BIGGER_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_bigger_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_GRAY_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_bigger_gray_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_GRAY_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_LIGHT_GRAY_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_bigger_light_gray_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_LIGHT_GRAY_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_GREEN_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_bigger_green_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_GREEN_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_YELLOW_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_bigger_yellow_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_YELLOW_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_RED_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_bigger_red_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_RED_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_PURPLE_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_bigger_purple_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_PURPLE_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_PINK_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_bigger_pink_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_PINK_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_ORANGE_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_bigger_orange_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_ORANGE_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_MAGENTA_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_bigger_magenta_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_MAGENTA_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_LIME_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_bigger_lime_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_LIME_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_LIGHT_BLUE_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_bigger_light_blue_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_LIGHT_BLUE_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_CYAN_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_bigger_cyan_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_CYAN_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_BROWN_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_bigger_brown_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_BROWN_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_BLUE_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_bigger_blue_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_BLUE_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CRACKED_BIGGER_BLACK_PORCELAIN_BRICKS_WALL = ITEMS.register("cracked_bigger_black_porcelain_bricks_wall",
			() -> new BlockItem(BlockInit.CRACKED_BIGGER_BLACK_PORCELAIN_BRICKS_WALL.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    
    public static final RegistryObject<BlockItem> CHISELED_PORCELAIN_BRICKS = ITEMS.register("chiseled_porcelain_bricks",
			() -> new BlockItem(BlockInit.CHISELED_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CHISELED_GRAY_PORCELAIN_BRICKS = ITEMS.register("chiseled_gray_porcelain_bricks",
			() -> new BlockItem(BlockInit.CHISELED_GRAY_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CHISELED_LIGHT_GRAY_PORCELAIN_BRICKS = ITEMS.register("chiseled_light_gray_porcelain_bricks",
			() -> new BlockItem(BlockInit.CHISELED_LIGHT_GRAY_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CHISELED_GREEN_PORCELAIN_BRICKS = ITEMS.register("chiseled_green_porcelain_bricks",
			() -> new BlockItem(BlockInit.CHISELED_GREEN_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CHISELED_YELLOW_PORCELAIN_BRICKS = ITEMS.register("chiseled_yellow_porcelain_bricks",
			() -> new BlockItem(BlockInit.CHISELED_YELLOW_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CHISELED_RED_PORCELAIN_BRICKS = ITEMS.register("chiseled_red_porcelain_bricks",
			() -> new BlockItem(BlockInit.CHISELED_RED_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CHISELED_PURPLE_PORCELAIN_BRICKS = ITEMS.register("chiseled_purple_porcelain_bricks",
			() -> new BlockItem(BlockInit.CHISELED_PURPLE_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CHISELED_PINK_PORCELAIN_BRICKS = ITEMS.register("chiseled_pink_porcelain_bricks",
			() -> new BlockItem(BlockInit.CHISELED_PINK_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CHISELED_ORANGE_PORCELAIN_BRICKS = ITEMS.register("chiseled_orange_porcelain_bricks",
			() -> new BlockItem(BlockInit.CHISELED_ORANGE_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CHISELED_MAGENTA_PORCELAIN_BRICKS = ITEMS.register("chiseled_magenta_porcelain_bricks",
			() -> new BlockItem(BlockInit.CHISELED_MAGENTA_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CHISELED_LIME_PORCELAIN_BRICKS = ITEMS.register("chiseled_lime_porcelain_bricks",
			() -> new BlockItem(BlockInit.CHISELED_LIME_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CHISELED_LIGHT_BLUE_PORCELAIN_BRICKS = ITEMS.register("chiseled_light_blue_porcelain_bricks",
			() -> new BlockItem(BlockInit.CHISELED_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CHISELED_CYAN_PORCELAIN_BRICKS = ITEMS.register("chiseled_cyan_porcelain_bricks",
			() -> new BlockItem(BlockInit.CHISELED_CYAN_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CHISELED_BROWN_PORCELAIN_BRICKS = ITEMS.register("chiseled_brown_porcelain_bricks",
			() -> new BlockItem(BlockInit.CHISELED_BROWN_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CHISELED_BLUE_PORCELAIN_BRICKS = ITEMS.register("chiseled_blue_porcelain_bricks",
			() -> new BlockItem(BlockInit.CHISELED_BLUE_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CHISELED_BLACK_PORCELAIN_BRICKS = ITEMS.register("chiseled_black_porcelain_bricks",
			() -> new BlockItem(BlockInit.CHISELED_PORCELAIN_BRICKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> BIG_GRAY_PORCELAIN_BRICK = ITEMS.register("big_gray_porcelain_brick",
			() -> new BlockItem(BlockInit.BIG_GRAY_PORCELAIN_BRICK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIG_LIGHT_GRAY_PORCELAIN_BRICK = ITEMS.register("big_light_gray_porcelain_brick",
			() -> new BlockItem(BlockInit.BIG_LIGHT_GRAY_PORCELAIN_BRICK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIG_GREEN_PORCELAIN_BRICK = ITEMS.register("big_green_porcelain_brick",
			() -> new BlockItem(BlockInit.BIG_GREEN_PORCELAIN_BRICK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIG_YELLOW_PORCELAIN_BRICK = ITEMS.register("big_yellow_porcelain_brick",
			() -> new BlockItem(BlockInit.BIG_YELLOW_PORCELAIN_BRICK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIG_RED_PORCELAIN_BRICK = ITEMS.register("big_red_porcelain_brick",
			() -> new BlockItem(BlockInit.BIG_RED_PORCELAIN_BRICK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIG_PURPLE_PORCELAIN_BRICK = ITEMS.register("big_purple_porcelain_brick",
			() -> new BlockItem(BlockInit.BIG_PURPLE_PORCELAIN_BRICK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIG_PINK_PORCELAIN_BRICK = ITEMS.register("big_pink_porcelain_brick",
			() -> new BlockItem(BlockInit.BIG_PINK_PORCELAIN_BRICK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIG_ORANGE_PORCELAIN_BRICK = ITEMS.register("big_orange_porcelain_brick",
			() -> new BlockItem(BlockInit.BIG_ORANGE_PORCELAIN_BRICK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIG_MAGENTA_PORCELAIN_BRICK = ITEMS.register("big_magenta_porcelain_brick",
			() -> new BlockItem(BlockInit.BIG_MAGENTA_PORCELAIN_BRICK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIG_LIME_PORCELAIN_BRICK = ITEMS.register("big_lime_porcelain_brick",
			() -> new BlockItem(BlockInit.BIG_LIME_PORCELAIN_BRICK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIG_LIGHT_BLUE_PORCELAIN_BRICK = ITEMS.register("big_light_blue_porcelain_brick",
			() -> new BlockItem(BlockInit.BIG_LIGHT_BLUE_PORCELAIN_BRICK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIG_CYAN_PORCELAIN_BRICK = ITEMS.register("big_cyan_porcelain_brick",
			() -> new BlockItem(BlockInit.BIG_CYAN_PORCELAIN_BRICK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIG_BROWN_PORCELAIN_BRICK = ITEMS.register("big_brown_porcelain_brick",
			() -> new BlockItem(BlockInit.BIG_BROWN_PORCELAIN_BRICK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIG_BLUE_PORCELAIN_BRICK = ITEMS.register("big_blue_porcelain_brick",
			() -> new BlockItem(BlockInit.BIG_BLUE_PORCELAIN_BRICK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIG_BLACK_PORCELAIN_BRICK = ITEMS.register("big_black_porcelain_brick",
			() -> new BlockItem(BlockInit.BIG_BLACK_PORCELAIN_BRICK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    
    
    

}
