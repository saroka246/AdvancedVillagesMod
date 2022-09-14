package com.saroka.advancedvillagemod.client.render;

import com.saroka.advancedvillagemod.AdvancedVillageMod;
import com.saroka.advancedvillagemod.client.model.enitites.GuardModel;
import com.saroka.advancedvillagemod.entities.GuardEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GuardRenderer extends MobRenderer<GuardEntity, GuardModel<GuardEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(AdvancedVillageMod.MOD_ID,"textures/entity/guard/guard.png");

    public GuardRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GuardModel<>(),1.95F);
    }

    @Override
    public ResourceLocation getEntityTexture(GuardEntity entity) {
        return TEXTURE;
    }
}
