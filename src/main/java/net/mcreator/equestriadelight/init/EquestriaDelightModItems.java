
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.equestriadelight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.equestriadelight.item.UncookedRockSoupItem;
import net.mcreator.equestriadelight.item.RockSoupItem;
import net.mcreator.equestriadelight.item.NetherStarCupcakeItem;
import net.mcreator.equestriadelight.item.NetherQuartzCupcakeItem;
import net.mcreator.equestriadelight.item.LapisCupcakeItem;
import net.mcreator.equestriadelight.item.EmeraldCupcakeItem;
import net.mcreator.equestriadelight.item.EchoShardCupcakeItem;
import net.mcreator.equestriadelight.item.DiamondCupcakeItem;
import net.mcreator.equestriadelight.item.DaisySandwichItem;
import net.mcreator.equestriadelight.item.CupcakeItem;
import net.mcreator.equestriadelight.item.ChoppedDaisyItem;
import net.mcreator.equestriadelight.item.AmethystCupcakeItem;
import net.mcreator.equestriadelight.EquestriaDelightMod;

public class EquestriaDelightModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EquestriaDelightMod.MODID);
	public static final RegistryObject<Item> DAISY_SANDWICH = REGISTRY.register("daisy_sandwich", () -> new DaisySandwichItem());
	public static final RegistryObject<Item> CHOPPED_DAISY = REGISTRY.register("chopped_daisy", () -> new ChoppedDaisyItem());
	public static final RegistryObject<Item> ROCK_SOUP = REGISTRY.register("rock_soup", () -> new RockSoupItem());
	public static final RegistryObject<Item> UNCOOKED_ROCK_SOUP = REGISTRY.register("uncooked_rock_soup", () -> new UncookedRockSoupItem());
	public static final RegistryObject<Item> DIAMOND_CUPCAKE = REGISTRY.register("diamond_cupcake", () -> new DiamondCupcakeItem());
	public static final RegistryObject<Item> AMETHYST_CUPCAKE = REGISTRY.register("amethyst_cupcake", () -> new AmethystCupcakeItem());
	public static final RegistryObject<Item> NETHER_STAR_CUPCAKE = REGISTRY.register("nether_star_cupcake", () -> new NetherStarCupcakeItem());
	public static final RegistryObject<Item> ECHO_SHARD_CUPCAKE = REGISTRY.register("echo_shard_cupcake", () -> new EchoShardCupcakeItem());
	public static final RegistryObject<Item> EMERALD_CUPCAKE = REGISTRY.register("emerald_cupcake", () -> new EmeraldCupcakeItem());
	public static final RegistryObject<Item> CUPCAKE = REGISTRY.register("cupcake", () -> new CupcakeItem());
	public static final RegistryObject<Item> LAPIS_CUPCAKE = REGISTRY.register("lapis_cupcake", () -> new LapisCupcakeItem());
	public static final RegistryObject<Item> NETHER_QUARTZ_CUPCAKE = REGISTRY.register("nether_quartz_cupcake", () -> new NetherQuartzCupcakeItem());
	public static final RegistryObject<Item> POT_OF_ROCK_SOUP = block(EquestriaDelightModBlocks.POT_OF_ROCK_SOUP);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
