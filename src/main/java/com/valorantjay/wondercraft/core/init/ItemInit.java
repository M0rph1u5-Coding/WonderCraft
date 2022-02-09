package com.valorantjay.wondercraft.core.init;

import com.valorantjay.wondercraft.WonderCraft;
import com.valorantjay.wondercraft.common.material.CustomArmorMaterial;
import com.valorantjay.wondercraft.common.material.CustomToolMaterial;
import com.valorantjay.wondercraft.core.itemgroup.WonderCraftBlocksItemGroup;
import com.valorantjay.wondercraft.core.itemgroup.WonderCraftFoodsItemGroup;
import com.valorantjay.wondercraft.core.itemgroup.WonderCraftItemsItemGroup;
import com.valorantjay.wondercraft.core.itemgroup.WonderCraftToolsItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
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

	// Armour / Tools
	public static final RegistryObject<Item> UNDERITE_AXE = ITEMS.register("underite_axe",
			() -> new AxeItem(CustomToolMaterial.UNDERITE_TOOL, 5, -1f,
					new Item.Properties().group(WonderCraftToolsItemGroup.WONDER_CRAFT_TOOLS)));
	public static final RegistryObject<Item> UNDERITE_PICKAXE = ITEMS.register("underite_pickaxe",
			() -> new PickaxeItem(CustomToolMaterial.UNDERITE_TOOL, 5, -1f,
					new Item.Properties().group(WonderCraftToolsItemGroup.WONDER_CRAFT_TOOLS)));
	public static final RegistryObject<Item> UNDERITE_SHOVEL = ITEMS.register("underite_shovel",
			() -> new ShovelItem(CustomToolMaterial.UNDERITE_TOOL, 5, -1f,
					new Item.Properties().group(WonderCraftToolsItemGroup.WONDER_CRAFT_TOOLS)));
	public static final RegistryObject<Item> UNDERITE_HOE = ITEMS.register("underite_hoe",
			() -> new HoeItem(CustomToolMaterial.UNDERITE_TOOL, 5, -1f,
					new Item.Properties().group(WonderCraftToolsItemGroup.WONDER_CRAFT_TOOLS)));
	public static final RegistryObject<Item> UNDERITE_SWORD = ITEMS.register("underite_sword",
			() -> new SwordItem(CustomToolMaterial.UNDERITE_TOOL, 5, -1f,
					new Item.Properties().group(WonderCraftToolsItemGroup.WONDER_CRAFT_TOOLS)));

	public static final RegistryObject<Item> UNDERITE_HELMET = ITEMS.register("underite_helmet",
			() -> new ArmorItem(CustomArmorMaterial.UNDERITE_ARMOR, EquipmentSlotType.HEAD,
					new Item.Properties().group(WonderCraftToolsItemGroup.WONDER_CRAFT_TOOLS)));
	public static final RegistryObject<Item> UNDERITE_CHESTPLATE = ITEMS.register("underite_chestplate",
			() -> new ArmorItem(CustomArmorMaterial.UNDERITE_ARMOR, EquipmentSlotType.CHEST,
					new Item.Properties().group(WonderCraftToolsItemGroup.WONDER_CRAFT_TOOLS)));
	public static final RegistryObject<Item> UNDERITE_LEGGINGS = ITEMS.register("underite_leggings",
			() -> new ArmorItem(CustomArmorMaterial.UNDERITE_ARMOR, EquipmentSlotType.LEGS,
					new Item.Properties().group(WonderCraftToolsItemGroup.WONDER_CRAFT_TOOLS)));
	public static final RegistryObject<Item> UNDERITE_BOOTS = ITEMS.register("underite_boots",
			() -> new ArmorItem(CustomArmorMaterial.UNDERITE_ARMOR, EquipmentSlotType.FEET,
					new Item.Properties().group(WonderCraftToolsItemGroup.WONDER_CRAFT_TOOLS)));

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
	public static final RegistryObject<BlockItem> QUARRY = ITEMS.register("quarry",
			() -> new BlockItem(BlockInit.QUARRY.get(),
					new Item.Properties().group(WonderCraftBlocksItemGroup.WONDER_CRAFT_BLOCKS)));
}
