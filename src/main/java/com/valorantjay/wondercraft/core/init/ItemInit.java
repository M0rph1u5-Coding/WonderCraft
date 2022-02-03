package com.valorantjay.wondercraft.core.init;

import com.valorantjay.wondercraft.WonderCraft;
import com.valorantjay.wondercraft.core.itemgroup.WonderCraftBlocksItemGroup;
import com.valorantjay.wondercraft.core.itemgroup.WonderCraftFoodsItemGroup;
import com.valorantjay.wondercraft.core.itemgroup.WonderCraftItemsItemGroup;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			WonderCraft.MOD_ID);
	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
			() -> new Item(new Item.Properties().group(WonderCraftItemsItemGroup.WONDER_CRAFT_ITEMS)));
	public static final RegistryObject<Item> EXAMPLE_FOOD = ITEMS.register("example_food",
			() -> new Item(new Item.Properties().group(WonderCraftFoodsItemGroup.WONDER_CRAFT_FOODS)
					.food(new Food.Builder().hunger(10).saturation(10f).setAlwaysEdible()
							.effect(() -> new EffectInstance(Effects.LEVITATION, 100, 2), 1.0f).fastToEat().build())));
	public static final RegistryObject<Item> UNDERITE_INGOT = ITEMS.register("underite_ingot",
			() -> new Item(new Item.Properties().group(WonderCraftItemsItemGroup.WONDER_CRAFT_ITEMS)));
	// Block Items
	public static final RegistryObject<BlockItem> EXAMPLE_BLOCK = ITEMS.register("example_block",
			() -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(),
					new Item.Properties().group(WonderCraftBlocksItemGroup.WONDER_CRAFT_BLOCKS)));
	public static final RegistryObject<BlockItem> EXAMPLE_ORE = ITEMS.register("example_ore",
			() -> new BlockItem(BlockInit.EXAMPLE_ORE.get(),
					new Item.Properties().group(WonderCraftBlocksItemGroup.WONDER_CRAFT_BLOCKS)));
	public static final RegistryObject<BlockItem> UNDERITE_ORE = ITEMS.register("underite_ore",
			() -> new BlockItem(BlockInit.UNDERITE_ORE.get(),
					new Item.Properties().group(WonderCraftBlocksItemGroup.WONDER_CRAFT_BLOCKS)));
	public static final RegistryObject<BlockItem> QUARRRY = ITEMS.register("",
			() -> new BlockItem(BlockInit.QUARRY.get(),
					new Item.Properties().group(WonderCraftBlocksItemGroup.WONDER_CRAFT_BLOCKS)));
}
