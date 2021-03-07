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

}
