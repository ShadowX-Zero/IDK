
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.redsguns.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.redsguns.item.DaItem;
import net.mcreator.redsguns.RedsGunsMod;

public class RedsGunsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RedsGunsMod.MODID);
	public static final RegistryObject<Item> DA = REGISTRY.register("da", () -> new DaItem());
	// Start of user code block custom items
	// End of user code block custom items
}
