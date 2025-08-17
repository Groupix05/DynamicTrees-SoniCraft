package com.wenxin2.dt_sonicraft.block;

import com.ferreusveritas.dynamictreesplus.block.CactusBranchBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class BeanstalkBranchBlock extends CactusBranchBlock {
    public BeanstalkBranchBlock(ResourceLocation name, Properties properties) {
        super(name, properties);
    }

    @Override
    public void entityInside(BlockState state, Level worldIn, BlockPos pos, Entity entity) {}
}
