
package net.mcreator.equestriadelight.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PotatoHorseshoeItem extends Item {
	public PotatoHorseshoeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.3f).build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 16;
	}
}
