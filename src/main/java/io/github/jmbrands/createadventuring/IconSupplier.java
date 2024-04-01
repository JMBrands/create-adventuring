package io.github.jmbrands.createadventuring;

import com.google.common.base.Supplier;

import net.minecraft.world.item.ItemStack;

public class IconSupplier implements Supplier<ItemStack>{
    private ItemStack item;
    public IconSupplier(ItemStack item) {
        this.item = item;
    }

    @Override
    public ItemStack get() {
        return this.item;
    }

}
