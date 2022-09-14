package com.saroka.advancedvillagemod.containers;

import com.saroka.advancedvillagemod.AdvancedVillageMod;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainersBase {

    public static DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, AdvancedVillageMod.MOD_ID);

    public static final RegistryObject<ContainerType<MillContainer>> MILL_CONTAINER = CONTAINERS.register("mill_container", () -> IForgeContainerType.create(((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        World world = inv.player.getEntityWorld();
        return new MillContainer(windowId,world,pos,inv, inv.player);
    })));

    public static void init(IEventBus eventBus){
        CONTAINERS.register(eventBus);
    }
}
