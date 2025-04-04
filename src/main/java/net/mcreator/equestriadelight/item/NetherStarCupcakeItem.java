
package net.mcreator.equestriadelight.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

public class NetherStarCupcakeItem extends Item {
    public NetherStarCupcakeItem() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}