package com.valorantjay.wondercraft.core.network.message;

import java.util.function.Supplier;

import net.minecraft.block.Blocks;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;

public class InputMessage {
	
	public int key;
	
	public InputMessage() {
	}

	public InputMessage(int key) {
		this.key = key;
	}
	
	public static void encode(InputMessage message, PacketBuffer buffer) {
		buffer.writeInt(message.key);
	}
	
	public static InputMessage decode(PacketBuffer buffer) {
		return new InputMessage(buffer.readInt());
	}
	
	public static void handle(InputMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			ServerPlayerEntity player = context.getSender();
			
			World world = player.getEntityWorld();
			world.setBlockState(player.getPosition().down(), Blocks.LAVA.getDefaultState());
			player.setPosition(player.getPosX(), player.getPosY() + 2, player.getPosZ());
		});
		context.setPacketHandled(true);
	}
}
