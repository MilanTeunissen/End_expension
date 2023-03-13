
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endexpension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.endexpension.item.EndswordSwordItem;
import net.mcreator.endexpension.item.EndswordShovelItem;
import net.mcreator.endexpension.item.EndswordPickaxeItem;
import net.mcreator.endexpension.item.EndswordAxeItem;
import net.mcreator.endexpension.EndExpensionMod;

public class EndExpensionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EndExpensionMod.MODID);
	public static final RegistryObject<Item> ENDSWORD_AXE = REGISTRY.register("endsword_axe", () -> new EndswordAxeItem());
	public static final RegistryObject<Item> ENDSWORD_PICKAXE = REGISTRY.register("endsword_pickaxe", () -> new EndswordPickaxeItem());
	public static final RegistryObject<Item> ENDSWORD_SWORD = REGISTRY.register("endsword_sword", () -> new EndswordSwordItem());
	public static final RegistryObject<Item> ENDSWORD_SHOVEL = REGISTRY.register("endsword_shovel", () -> new EndswordShovelItem());
}
