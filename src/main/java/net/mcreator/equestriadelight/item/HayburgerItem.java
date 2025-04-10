
package net.mcreator.equestriadelight.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import com.mojang.blaze3d.shaders.Effect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class HayburgerItem extends Item {
	public HayburgerItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(11).saturationMod(0.3f).effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 3600, 0), 1.0F).build()));
	}
}
