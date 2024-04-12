package io.github.jmbrands.createadventuring.roastingjack;

import com.simibubi.create.content.contraptions.bearing.BearingBlock;
import com.simibubi.create.foundation.block.IBE;

import net.minecraft.world.level.block.entity.BlockEntityType;

public class RoastingJackBlock extends BearingBlock implements IBE<RoastingJackBlockEntity> {

    public RoastingJackBlock(Properties properties) {
        super(properties);
    }

    @Override
    public Class<RoastingJackBlockEntity> getBlockEntityClass() {
        return RoastingJackBlockEntity.class;
    }

    @Override
    public BlockEntityType<? extends RoastingJackBlockEntity> getBlockEntityType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBlockEntityType'");
    }
}
