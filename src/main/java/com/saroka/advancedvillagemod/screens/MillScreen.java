package com.saroka.advancedvillagemod.screens;

import com.mojang.blaze3d.systems.RenderSystem;
import com.saroka.advancedvillagemod.AdvancedVillageMod;
import com.saroka.advancedvillagemod.containers.MillContainer;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class MillScreen extends ContainerScreen<MillContainer> {
    private final ResourceLocation GUI = new ResourceLocation(AdvancedVillageMod.MOD_ID, "textures/gui/mill_gui.png");
    public MillScreen(MillContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
    }

    @Override
    public void render(int p_render_1_, int p_render_2_, float p_render_3_) {
        this.renderBackground();
        super.render(p_render_1_,p_render_2_,p_render_3_);
        this.renderHoveredToolTip(p_render_1_,p_render_2_);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        RenderSystem.color4f(1f,1f,1f,1f);
        this.minecraft.getTextureManager().bindTexture(GUI);
        int i = this.guiLeft;
        int j = this.guiTop;
        this.blit(i, j, 0, 0, this.xSize, this.ySize);
    }
}
