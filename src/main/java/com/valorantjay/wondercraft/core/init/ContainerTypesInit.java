package com.valorantjay.wondercraft.core.init;

import com.valorantjay.wondercraft.WonderCraft;
import com.valorantjay.wondercraft.common.container.DisplayCaseContainer;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerTypesInit {
	public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = DeferredRegister
			.create(ForgeRegistries.CONTAINERS, WonderCraft.MOD_ID);
}
