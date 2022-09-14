package com.saroka.advancedvillagemod.util;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mrcrayfish.obfuscate.client.event.PlayerModelEvent;
import com.mrcrayfish.obfuscate.client.event.RenderItemEvent;
import com.mrcrayfish.obfuscate.common.data.SyncedPlayerData;
import com.saroka.advancedvillagemod.AdvancedVillageMod;
import com.saroka.advancedvillagemod.client.render.RenderUtil;
import com.saroka.advancedvillagemod.weapons.TwoHandedBattleAxeItem;
import com.saroka.advancedvillagemod.weapons.TwoHandedWeapon;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerModelPart;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = AdvancedVillageMod.MOD_ID, bus = Bus.FORGE)
public class ForgeEventBusSubscriber {

    private static ForgeEventBusSubscriber instance;

    public static ForgeEventBusSubscriber get()
    {
        if(instance == null)
        {
            instance = new ForgeEventBusSubscriber();
        }
        return instance;
    }

    @SubscribeEvent
    public void setupPlayerRotations(PlayerModelEvent.SetupAngles.Post event)
    {
        PlayerEntity player = event.getPlayer();
        if(player!=null&&player.getHeldItemMainhand().getItem() instanceof TwoHandedBattleAxeItem) {
            event.getModelPlayer().bipedRightArm.rotateAngleX = (float) Math.toRadians(-20f);
            event.getModelPlayer().bipedRightArm.rotateAngleY = (float) Math.toRadians(20f);
            event.getModelPlayer().bipedLeftArm.rotateAngleX = (float) Math.toRadians(-45f);

        }
    }
    @SubscribeEvent
    public void TwoHandedBattleAxe(InputEvent.RawMouseEvent event){

    }




}
