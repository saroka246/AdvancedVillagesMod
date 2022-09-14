package com.saroka.advancedvillagemod.tileentities;


import com.saroka.advancedvillagemod.AdvancedVillageMod;
import com.saroka.advancedvillagemod.util.RegistryHandler;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntitiesBase {
    public static DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, AdvancedVillageMod.MOD_ID);

    public static RegistryObject<TileEntityType<MillTile>> MILL_TILE = TILE_ENTITIES.register("mill_tile", () -> TileEntityType.Builder.create(MillTile::new, RegistryHandler.MILL_BLOCK.get()).build(null));

    public static void init(IEventBus eventBus){
        TILE_ENTITIES.register(eventBus);
    }
}
