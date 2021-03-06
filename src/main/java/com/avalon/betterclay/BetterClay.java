package com.avalon.betterclay;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.avalon.betterclay.core.init.BlockInit;
import com.avalon.betterclay.core.init.ItemInit;
import com.avalon.betterclay.world.OreGeneration;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BetterClay.MOD_ID)
public class BetterClay {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "betterclay";
	public static final ItemGroup BETTER_CLAY_UNUSED_TAB = new TutorialGroup("better_clay_unused_tab");

	public BetterClay() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);

		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
		
	}

	private void setup(final FMLCommonSetupEvent event) {

	}

	public static class TutorialGroup extends ItemGroup {

		public TutorialGroup(String label) {
			super(label);
		}

		@Override
		public ItemStack createIcon() {
			return ItemInit.BIG_BRICK.get().getDefaultInstance();
		}
	}
}
