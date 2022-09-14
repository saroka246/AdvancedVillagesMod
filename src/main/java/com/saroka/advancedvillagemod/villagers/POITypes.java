package com.saroka.advancedvillagemod.villagers;

import com.saroka.advancedvillagemod.AdvancedVillageMod;
import com.saroka.advancedvillagemod.util.RegistryHandler;
import net.minecraft.block.Blocks;
import net.minecraft.village.PointOfInterestType;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;



@EventBusSubscriber(modid = AdvancedVillageMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(AdvancedVillageMod.MOD_ID)
public class POITypes
{
    public static final PointOfInterestType SLAYER = null;
    public static final PointOfInterestType ALCHEMIST = null;
    public static final PointOfInterestType MILLER = null;
    public static final PointOfInterestType GLASS_BLOWER = null;

    @SubscribeEvent
    public static void registerPointOfInterestTypes(Register<PointOfInterestType> event)
    {
        IForgeRegistry<PointOfInterestType> registry = event.getRegistry();

        registry.register(VillagerUtil.pointOfInterestType("slayer", VillagerUtil.getAllStates(RegistryHandler.CHOPPING_BLOCK.get()), 1, 1).setRegistryName(AdvancedVillageMod.MOD_ID, "slayer"));
        registry.register(VillagerUtil.pointOfInterestType("alchemist", VillagerUtil.getAllStates(RegistryHandler.ALCHEMY_TABLE.get()), 1, 1).setRegistryName(AdvancedVillageMod.MOD_ID, "alchemist"));
        registry.register(VillagerUtil.pointOfInterestType("miller", VillagerUtil.getAllStates(RegistryHandler.MILL_BLOCK.get()), 1, 1).setRegistryName(AdvancedVillageMod.MOD_ID, "miller"));
        registry.register(VillagerUtil.pointOfInterestType("glass_blower", VillagerUtil.getAllStates(RegistryHandler.GLASS_BLOWER_TABLE.get()), 1, 1).setRegistryName(AdvancedVillageMod.MOD_ID, "glass_blower"));
    }
}
