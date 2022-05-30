
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.cum.block.DraniumOreBlock;
import net.mcreator.cum.block.DraniumBlcokBlock;
import net.mcreator.cum.DraniumMod;

public class DraniumModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DraniumMod.MODID);
	public static final RegistryObject<Block> DRANIUM_BLOCK = REGISTRY.register("dranium_block", () -> new DraniumBlcokBlock());
	public static final RegistryObject<Block> DRANIUM_ORE = REGISTRY.register("dranium_ore", () -> new DraniumOreBlock());
}
