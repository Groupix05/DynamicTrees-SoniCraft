package com.wenxin2.dt_sonicraft.tree;

import com.ferreusveritas.dynamictrees.api.registry.TypedRegistry;
import com.ferreusveritas.dynamictrees.block.branch.BranchBlock;
import com.ferreusveritas.dynamictrees.tree.family.Family;
import com.wenxin2.dt_sonicraft.block.BeanstalkBranchBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class BeanstalkFamily extends Family {
    public static final TypedRegistry.EntryType<Family> TYPE = TypedRegistry.newType(BeanstalkFamily::new);
    public static final String BRANCH_BOTTOM = "branch_bottom";

    public BeanstalkFamily(ResourceLocation registryName) {
        super(registryName);
    }

    public MapColor getDefaultBranchMapColor() {
        return MapColor.PLANT;
    }

    public SoundType getDefaultBranchSoundType() {
        return SoundType.STEM;
    }

    protected BranchBlock createBranchBlock(ResourceLocation name) {
        return new BeanstalkBranchBlock(name, this.getProperties());
    }

    public int getPrimaryThickness() {
        return 6;
    }

    public int getSecondaryThickness() {
        return 4;
    }
}
