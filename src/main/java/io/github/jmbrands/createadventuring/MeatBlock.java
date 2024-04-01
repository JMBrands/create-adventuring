package io.github.jmbrands.createadventuring;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class MeatBlock extends Block {

    public MeatBlock(Properties properties) {
        super(properties);
    }
    public static void registerRenders() {

    }

    public static void registerRender(BlockItem item) {
        Minecraft.getInstance().getItemRenderer().getItemModelShaper().register(item, new  ModelResourceLocation(CreateAdventuring.MODID, "beef_block","inventory"));
    }


}
