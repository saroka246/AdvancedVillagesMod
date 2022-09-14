package com.saroka.advancedvillagemod.villagers;

import com.google.common.collect.ImmutableSet;
import com.saroka.advancedvillagemod.AdvancedVillageMod;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Author: CAS_ual_TY
 */

@EventBusSubscriber(modid = AdvancedVillageMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(AdvancedVillageMod.MOD_ID)
public class VillagerProfessions
{
    public static final VillagerProfession SLAYER = null;
    public static final VillagerProfession ALCHEMIST = null;
    public static final VillagerProfession MILLER = null;
    public static final VillagerProfession GLASS_BLOWER = null;

    @SubscribeEvent
    public static void registerVillagerProfessions(Register<VillagerProfession> event)
    {
        IForgeRegistry<VillagerProfession> registry = event.getRegistry();

        registry.register(VillagerUtil.villagerProfession("slayer", POITypes.SLAYER, ImmutableSet.of(), ImmutableSet.of(), null).setRegistryName(AdvancedVillageMod.MOD_ID, "slayer"));
        registry.register(VillagerUtil.villagerProfession("alchemist", POITypes.ALCHEMIST, ImmutableSet.of(), ImmutableSet.of(), null).setRegistryName(AdvancedVillageMod.MOD_ID, "alchemist"));
        registry.register(VillagerUtil.villagerProfession("miller", POITypes.MILLER, ImmutableSet.of(), ImmutableSet.of(), null).setRegistryName(AdvancedVillageMod.MOD_ID, "miller"));
        registry.register(VillagerUtil.villagerProfession("glass_blower", POITypes.GLASS_BLOWER, ImmutableSet.of(), ImmutableSet.of(), null).setRegistryName(AdvancedVillageMod.MOD_ID, "glass_blower"));
    }
}
