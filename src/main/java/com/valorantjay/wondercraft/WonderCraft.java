package com.valorantjay.wondercraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.valorantjay.wondercraft.core.init.BlockInit;
import com.valorantjay.wondercraft.core.init.FeatureInit;
import com.valorantjay.wondercraft.core.init.ItemInit;
import com.valorantjay.wondercraft.core.init.TileEntityTypesInit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("wondercraft")
@Mod.EventBusSubscriber(modid = WonderCraft.MOD_ID, bus = Bus.MOD)
public class WonderCraft {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "wondercraft";

	public WonderCraft() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		TileEntityTypesInit.TILE_ENTITY_TYPE.register(bus);
		BlockInit.BLOCKS.register(bus);

		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FeatureInit::addOres);
		MinecraftForge.EVENT_BUS.register(this);
	}
}
