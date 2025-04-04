
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
				tabData.accept(EquestriaDelightModItems.ROCK_SOUP.get());
				tabData.accept(EquestriaDelightModItems.UNCOOKED_ROCK_SOUP.get());
				tabData.accept(EquestriaDelightModItems.DIAMOND_CUPCAKE.get());
				tabData.accept(EquestriaDelightModItems.AMETHYST_CUPCAKE.get());
				tabData.accept(EquestriaDelightModItems.NETHER_STAR_CUPCAKE.get());
				tabData.accept(EquestriaDelightModItems.ECHO_SHARD_CUPCAKE.get());
				tabData.accept(EquestriaDelightModItems.EMERALD_CUPCAKE.get());
				tabData.accept(EquestriaDelightModItems.CUPCAKE.get());
				tabData.accept(EquestriaDelightModItems.LAPIS_CUPCAKE.get());
				tabData.accept(EquestriaDelightModItems.NETHER_QUARTZ_CUPCAKE.get());
			}).build());
}
