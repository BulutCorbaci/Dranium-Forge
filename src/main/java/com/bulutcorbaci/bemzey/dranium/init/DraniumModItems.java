
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.bulutcorbaci.bemzey.dranium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import com.bulutcorbaci.bemzey.dranium.item.FrozenEndBreathItem;
import com.bulutcorbaci.bemzey.dranium.item.FreezingIceItem;
import com.bulutcorbaci.bemzey.dranium.item.EndBreathSwordItem;
import com.bulutcorbaci.bemzey.dranium.item.EndBreathShovelItem;
import com.bulutcorbaci.bemzey.dranium.item.EndBreathPickaxeItem;
import com.bulutcorbaci.bemzey.dranium.item.EndBreathHoeItem;
import com.bulutcorbaci.bemzey.dranium.item.EndBreathAxeItem;
import com.bulutcorbaci.bemzey.dranium.item.DraniumSwordItem;
import com.bulutcorbaci.bemzey.dranium.item.DraniumShovelItem;
import com.bulutcorbaci.bemzey.dranium.item.DraniumPickaxeItem;
import com.bulutcorbaci.bemzey.dranium.item.DraniumNuggetItem;
import com.bulutcorbaci.bemzey.dranium.item.DraniumItem;
import com.bulutcorbaci.bemzey.dranium.item.DraniumHoeItem;
import com.bulutcorbaci.bemzey.dranium.item.DraniumAxeItem;
import com.bulutcorbaci.bemzey.dranium.DraniumMod;

public class DraniumModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DraniumMod.MODID);
	public static final RegistryObject<Item> DRANIUM = REGISTRY.register("dranium", () -> new DraniumItem());
	public static final RegistryObject<Item> DRANIUM_BLOCK = block(DraniumModBlocks.DRANIUM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DRANIUM_NUGGET = REGISTRY.register("dranium_nugget", () -> new DraniumNuggetItem());
	public static final RegistryObject<Item> DRANIUM_ORE = block(DraniumModBlocks.DRANIUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DRANIUM_PICKAXE = REGISTRY.register("dranium_pickaxe", () -> new DraniumPickaxeItem());
	public static final RegistryObject<Item> DRANIUM_AXE = REGISTRY.register("dranium_axe", () -> new DraniumAxeItem());
	public static final RegistryObject<Item> DRANIUM_SWORD = REGISTRY.register("dranium_sword", () -> new DraniumSwordItem());
	public static final RegistryObject<Item> DRANIUM_SHOVEL = REGISTRY.register("dranium_shovel", () -> new DraniumShovelItem());
	public static final RegistryObject<Item> DRANIUM_HOE = REGISTRY.register("dranium_hoe", () -> new DraniumHoeItem());
	public static final RegistryObject<Item> END_BREATH_PICKAXE = REGISTRY.register("end_breath_pickaxe", () -> new EndBreathPickaxeItem());
	public static final RegistryObject<Item> END_BREATH_AXE = REGISTRY.register("end_breath_axe", () -> new EndBreathAxeItem());
	public static final RegistryObject<Item> END_BREATH_SWORD = REGISTRY.register("end_breath_sword", () -> new EndBreathSwordItem());
	public static final RegistryObject<Item> FREEZING_ICE = REGISTRY.register("freezing_ice", () -> new FreezingIceItem());
	public static final RegistryObject<Item> FROZEN_END_BREATH = REGISTRY.register("frozen_end_breath", () -> new FrozenEndBreathItem());
	public static final RegistryObject<Item> END_BREATH_SHOVEL = REGISTRY.register("end_breath_shovel", () -> new EndBreathShovelItem());
	public static final RegistryObject<Item> END_BREATH_HOE = REGISTRY.register("end_breath_hoe", () -> new EndBreathHoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
