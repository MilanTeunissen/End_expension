
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endexpension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.endexpension.world.features.ores.SapphireOreFeature;
import net.mcreator.endexpension.EndExpensionMod;

@Mod.EventBusSubscriber
public class EndExpensionModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, EndExpensionMod.MODID);
	public static final RegistryObject<Feature<?>> SAPPHIRE_ORE = REGISTRY.register("sapphire_ore", SapphireOreFeature::feature);
}
