
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.equestriadelight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.equestriadelight.block.PotOfRockSoupBlock;
import net.mcreator.equestriadelight.EquestriaDelightMod;

public class EquestriaDelightModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EquestriaDelightMod.MODID);
	public static final RegistryObject<Block> POT_OF_ROCK_SOUP = REGISTRY.register("pot_of_rock_soup", () -> new PotOfRockSoupBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
