package com.valorantjay.wondercraft.core.init;

import com.valorantjay.wondercraft.WonderCraft;
import com.valorantjay.wondercraft.common.te.QuarryTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypesInit {
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE = DeferredRegister
			.create(ForgeRegistries.TILE_ENTITIES, WonderCraft.MOD_ID);

	public static final RegistryObject<TileEntityType<QuarryTileEntity>> QUARRY_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
			.register("quarry",
					() -> TileEntityType.Builder.create(QuarryTileEntity::new, BlockInit.QUARRY.get()).build(null));
}
