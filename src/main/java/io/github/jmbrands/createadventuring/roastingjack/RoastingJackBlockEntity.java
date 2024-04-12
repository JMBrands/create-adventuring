package io.github.jmbrands.createadventuring.roastingjack;

import com.simibubi.create.content.contraptions.AbstractContraptionEntity;
import com.simibubi.create.content.contraptions.AssemblyException;
import com.simibubi.create.content.contraptions.ControlledContraptionEntity;
import com.simibubi.create.content.contraptions.IDisplayAssemblyExceptions;
import com.simibubi.create.content.contraptions.bearing.IBearingBlockEntity;
import com.simibubi.create.content.kinetics.base.GeneratingKineticBlockEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class RoastingJackBlockEntity extends GeneratingKineticBlockEntity
        implements IBearingBlockEntity, IDisplayAssemblyExceptions {

    public RoastingJackBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Override
    public boolean isAttachedTo(AbstractContraptionEntity contraption) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isAttachedTo'");
    }

    @Override
    public void attach(ControlledContraptionEntity contraption) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attach'");
    }

    @Override
    public void onStall() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onStall'");
    }

    @Override
    public boolean isValid() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isValid'");
    }

    @Override
    public BlockPos getBlockPosition() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBlockPosition'");
    }

    @Override
    public AssemblyException getLastAssemblyException() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLastAssemblyException'");
    }

    @Override
    public float getInterpolatedAngle(float partialTicks) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getInterpolatedAngle'");
    }

    @Override
    public boolean isWoodenTop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isWoodenTop'");
    }

    @Override
    public void setAngle(float forcedAngle) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAngle'");
    }

}
