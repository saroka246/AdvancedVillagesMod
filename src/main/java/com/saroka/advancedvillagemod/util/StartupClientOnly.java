package com.saroka.advancedvillagemod.util;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class StartupClientOnly
{
    @SubscribeEvent
    public static void onClientSetupEvent(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(RegistryHandler.ALCHEMY_TABLE.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.GLASS_BLOWER_TABLE.get(), RenderType.getTranslucent());
    }
}
