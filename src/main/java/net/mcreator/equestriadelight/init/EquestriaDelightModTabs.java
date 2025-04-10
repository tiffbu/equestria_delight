
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.equestriadelight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.equestriadelight.EquestriaDelightMod;

public class EquestriaDelightModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EquestriaDelightMod.MODID);
	public static final RegistryObject<CreativeModeTab> EQUESTRIA_DELIGHT = REGISTRY.register("equestria_delight",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.equestria_delight.equestria_delight")).icon(() -> new ItemStack(EquestriaDelightModItems.DAISY_SANDWICH.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EquestriaDelightModItems.DAISY_SANDWICH.get());
				tabData.accept(EquestriaDelightModItems.CHOPPED_DAISY.get());
				tabData.accept(EquestriaDelightModItems.CARROT_DOG.get());
				tabData.accept(EquestriaDelightModItems.PASTA_AND_POTATO_SANDWICHES_ON_GRILLED_SOURDOUGH.get());
				tabData.accept(EquestriaDelightModItems.ROCK_SOUP.get());
				tabData.accept(EquestriaDelightModItems.UNCOOKED_ROCK_SOUP.get());
				tabData.accept(EquestriaDelightModItems.CUPCAKE.get());
				tabData.accept(EquestriaDelightModItems.NETHER_QUARTZ_CUPCAKE.get());
				tabData.accept(EquestriaDelightModItems.DIAMOND_CUPCAKE.get());
				tabData.accept(EquestriaDelightModItems.EMERALD_CUPCAKE.get());
				tabData.accept(EquestriaDelightModItems.AMETHYST_CUPCAKE.get());
				tabData.accept(EquestriaDelightModItems.LAPIS_CUPCAKE.get());
				tabData.accept(EquestriaDelightModItems.ECHO_SHARD_CUPCAKE.get());
				tabData.accept(EquestriaDelightModItems.NETHER_STAR_CUPCAKE.get());
				tabData.accept(EquestriaDelightModItems.ROCK_CANDY_WHITE.get());
				tabData.accept(EquestriaDelightModItems.ROCK_CANDY_LIGHT_GRAY.get());
				tabData.accept(EquestriaDelightModItems.ROCK_CANDY_GRAY.get());
				tabData.accept(EquestriaDelightModItems.ROCK_CANDY_BLACK.get());
				tabData.accept(EquestriaDelightModItems.ROCK_CANDY_RED.get());
				tabData.accept(EquestriaDelightModItems.ROCK_CANDY_ORANGE.get());
				tabData.accept(EquestriaDelightModItems.ROCK_CANDY_YELLOW.get());
				tabData.accept(EquestriaDelightModItems.ROCK_CANDY_LIME.get());
				tabData.accept(EquestriaDelightModItems.ROCK_CANDY_GREEN.get());
				tabData.accept(EquestriaDelightModItems.ROCK_CANDY_LIGHT_BLUE.get());
				tabData.accept(EquestriaDelightModItems.ROCK_CANDY_CYAN.get());
				tabData.accept(EquestriaDelightModItems.ROCK_CANDY_BLUE.get());
				tabData.accept(EquestriaDelightModItems.ROCK_CANDY_PURPLE.get());
				tabData.accept(EquestriaDelightModItems.ROCK_CANDY_MAGENTA.get());
				tabData.accept(EquestriaDelightModItems.ROCK_CANDY_PINK.get());
				tabData.accept(EquestriaDelightModItems.ROCK_CANDY_BROWN.get());
				tabData.accept(EquestriaDelightModItems.CUPCAKE_WHITE_ROCK_CANDY.get());
				tabData.accept(EquestriaDelightModItems.CUPCAKE_GRAY_ROCK_CANDY.get());
				tabData.accept(EquestriaDelightModItems.CUPCAKE_LIGHT_GRAY_ROCK_CANDY.get());
				tabData.accept(EquestriaDelightModItems.CUPCAKE_BLACK_ROCK_CANDY.get());
				tabData.accept(EquestriaDelightModItems.CUPCAKE_RED_ROCK_CANDY.get());
				tabData.accept(EquestriaDelightModItems.CUPCAKE_ORANGE_ROCK_CANDY.get());
				tabData.accept(EquestriaDelightModItems.CUPCAKE_YELLOW_ROCK_CANDY.get());
				tabData.accept(EquestriaDelightModItems.CUPCAKE_LIME_ROCK_CANDY.get());
				tabData.accept(EquestriaDelightModItems.CUPCAKE_GREEN_ROCK_CANDY.get());
				tabData.accept(EquestriaDelightModItems.CUPCAKE_LIGHT_BLUE_ROCK_CANDY.get());
				tabData.accept(EquestriaDelightModItems.CUPCAKE_CYAN_ROCK_CANDY.get());
				tabData.accept(EquestriaDelightModItems.CUPCAKE_BLUE_ROCK_CANDY.get());
				tabData.accept(EquestriaDelightModItems.CUPCAKE_PURPLE_ROCK_CANDY.get());
				tabData.accept(EquestriaDelightModItems.CUPCAKE_MAGENTA_ROCK_CANDY.get());
				tabData.accept(EquestriaDelightModItems.CUPCAKE_PINK_ROCK_CANDY.get());
				tabData.accept(EquestriaDelightModItems.CUPCAKE_BROWN_ROCK_CANDY.get());
				tabData.accept(EquestriaDelightModItems.HAYBURGER.get());
				tabData.accept(EquestriaDelightModItems.POTATO_HORSESHOE.get());
				tabData.accept(EquestriaDelightModItems.POTATO_HORSESHOE_UNCOOKED.get());
			}).build());
}
