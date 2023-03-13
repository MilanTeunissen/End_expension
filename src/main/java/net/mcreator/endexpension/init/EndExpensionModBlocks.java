
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endexpension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.endexpension.block.SapphireOreBlock;
import net.mcreator.endexpension.block.SapphireBlockBlock;
import net.mcreator.endexpension.EndExpensionMod;

public class EndExpensionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EndExpensionMod.MODID);
	public static final RegistryObject<Block> SAPPHIRE_BLOCK = REGISTRY.register("sapphire_block", () -> new SapphireBlockBlock());
	public static final RegistryObject<Block> SAPPHIRE_ORE = REGISTRY.register("sapphire_ore", () -> new SapphireOreBlock());
}
