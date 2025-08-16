package com.wenxin2.dt_sonicraft.block;

import com.ferreusveritas.dynamictreesplus.block.CactusBranchBlock;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class BeanstalkBranchBlock extends CactusBranchBlock {
    public BeanstalkBranchBlock(ResourceLocation name, Properties properties) {
        super(name, properties);
    }

    @Override
    public void entityInside(BlockState state, Level worldIn, BlockPos pos, Entity entity) {}

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState returnState = this.defaultBlockState();
        boolean trunk = context.getClickedFace() == Direction.UP;
        return returnState.setValue(TRUNK_TYPE, trunk ? CactusThickness.TRUNK : CactusThickness.BRANCH).setValue(ORIGIN, context.getClickedFace() != Direction.DOWN ? context.getClickedFace().getOpposite() : Direction.DOWN);
    }
}
