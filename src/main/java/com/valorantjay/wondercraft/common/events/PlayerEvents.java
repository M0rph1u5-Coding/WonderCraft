package com.valorantjay.wondercraft.common.events;

import com.valorantjay.wondercraft.WonderCraft;
import com.valorantjay.wondercraft.core.init.ItemInit;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid=WonderCraft.MOD_ID, bus = Bus.FORGE)
public class PlayerEvents {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent event) {
		PlayerEntity player = event.player;
		if (player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == ItemInit.UNDERITE_BOOTS.get()) {
			player.abilities.allowFlying = true;
		}
		else {
			player.abilities.allowFlying = false;
		}
	}
}