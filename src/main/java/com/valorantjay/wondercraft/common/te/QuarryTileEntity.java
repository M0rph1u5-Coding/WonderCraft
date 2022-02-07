package com.valorantjay.wondercraft.common.te;

import com.valorantjay.wondercraft.core.init.TileEntityTypesInit;

import net.minecraft.block.Blocks;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class QuarryTileEntity extends TileEntity implements ITickableTileEntity{

	public QuarryTileEntity(TileEntityType<?> tileEntityTypeIn) {
		super(tileEntityTypeIn);
	}
	
	public QuarryTileEntity() {
		this(TileEntityTypesInit.QUARRY_TILE_ENTITY_TYPE.get());
	}

	@Override
	public void tick() {
		if (this.world.getBlockState(this.pos.down()) == Blocks.BEDROCK.getDefaultState()) {
			this.world.setBlockState(this.pos.down(), Blocks.AIR.getDefaultState());
		}
	}

}
