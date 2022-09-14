package com.saroka.advancedvillagemod;



import com.saroka.advancedvillagemod.containers.ContainersBase;
import com.saroka.advancedvillagemod.containers.MillContainer;
import com.saroka.advancedvillagemod.screens.MillScreen;
import com.saroka.advancedvillagemod.tileentities.TileEntitiesBase;
import com.saroka.advancedvillagemod.util.ForgeEventBusSubscriber;
import com.saroka.advancedvillagemod.util.RegistryHandler;
import com.saroka.advancedvillagemod.util.StartupClientOnly;
import com.saroka.advancedvillagemod.villagers.POITypes;
import com.saroka.advancedvillagemod.villagers.VillagerUtil;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



@Mod("avm")
@Mod.EventBusSubscriber(modid = AdvancedVillageMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AdvancedVillageMod
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "avm";

    public AdvancedVillageMod() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        RegistryHandler.init();
        TileEntitiesBase.init(modEventBus);
        ContainersBase.init(modEventBus);

        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
        modEventBus.register(StartupClientOnly.class);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(ForgeEventBusSubscriber.get());
    }

    private void setup(final FMLCommonSetupEvent event)

    {

        VillagerUtil.fixPOITypeBlockStates(POITypes.SLAYER);
        VillagerUtil.fixPOITypeBlockStates(POITypes.ALCHEMIST);
        VillagerUtil.fixPOITypeBlockStates(POITypes.MILLER);
        VillagerUtil.fixPOITypeBlockStates(POITypes.GLASS_BLOWER);
    }


    private void doClientStuff(final FMLClientSetupEvent event) {
        ScreenManager.registerFactory(ContainersBase.MILL_CONTAINER.get(), MillScreen::new);
    }

    public static final ItemGroup BLOCKS_TAB = new ItemGroup("blocks_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.ALCHEMY_TABLE.get());
        }
    };
    public static final ItemGroup MATERIALS_TAB = new ItemGroup("materials_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.CAST_IRON_INGOT.get());
        }
    };
    public static final ItemGroup ARMOR_TAB = new ItemGroup("armor_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.GUARD_ARMOR.get());
        }
    };
    public static final ItemGroup WEAPONS_TAB = new ItemGroup("weapons_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.FALCHION.get());
        }
    };
}
