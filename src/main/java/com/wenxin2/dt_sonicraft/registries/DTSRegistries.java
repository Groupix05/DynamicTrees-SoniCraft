package com.wenxin2.dt_sonicraft.registries;

import com.ferreusveritas.dynamictrees.api.registry.TypeRegistryEvent;
import com.ferreusveritas.dynamictrees.tree.family.Family;
import com.wenxin2.dt_sonicraft.DynamicTreesSoniCraft;
import com.wenxin2.dt_sonicraft.tree.BeanstalkFamily;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DTSRegistries {
    public static final ResourceLocation BEANSTALK = DynamicTreesSoniCraft.location("beanstalk");

    @SubscribeEvent
    public static void registerFamilyType(TypeRegistryEvent<Family> event) {
        if (ModList.get().isLoaded("dynamictreesplus"))
            event.registerType(BEANSTALK, BeanstalkFamily.TYPE);
    }
}
