package com.saroka.advancedvillagemod.client.model.enitites;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.saroka.advancedvillagemod.entities.GuardEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.AbstractIllagerEntity;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.MathHelper;

import javax.annotation.Nullable;

public class GuardModel<T extends GuardEntity> extends EntityModel<T> {
    private final ModelRenderer head;
    private final ModelRenderer nose;
    private final ModelRenderer body;
    private final ModelRenderer left_arm;
    private final ModelRenderer right_arm;
    private final ModelRenderer left_leg;
    private final ModelRenderer right_leg;
    private final ModelRenderer blade;

    public GuardModel() {
        textureWidth = 64;
        textureHeight = 64;

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 0.0F, 0.0F);
        head.setTextureOffset(20, 16).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);

        nose = new ModelRenderer(this);
        nose.setRotationPoint(0.0F, -2.0F, 0.0F);
        nose.setTextureOffset(0, 24).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.setTextureOffset(0, 34).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, 0.0F, false);
        body.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, 0.25F, false);

        left_arm = new ModelRenderer(this);
        left_arm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        left_arm.setTextureOffset(28, 34).addBox(9.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

        right_arm = new ModelRenderer(this);
        right_arm.setRotationPoint(5.0F, 2.0F, 0.0F);
        right_arm.setTextureOffset(28, 34).addBox(-13.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        left_leg = new ModelRenderer(this);
        left_leg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        left_leg.setTextureOffset(28, 0).addBox(2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

        right_leg = new ModelRenderer(this);
        right_leg.setRotationPoint(2.0F, 12.0F, 0.0F);
        right_leg.setTextureOffset(28, 0).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        blade = new ModelRenderer(this);
        blade.setRotationPoint(0.0F, 24.0F, 0.0F);
        blade.setTextureOffset(32, 42).addBox(-6.5F, -14.0F, -11.0F, 1.0F, 1.0F, 15.0F, 0.0F, false);
        blade.setTextureOffset(0, 57).addBox(-6.5F, -13.0F, -11.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
        blade.setTextureOffset(22, 55).addBox(-6.5F, -10.0F, -11.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);

    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.nose.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.nose.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.left_arm.rotateAngleY = 0.0F;
        this.right_arm.rotateAngleY = 0.0F;
        this.blade.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount * 0.5F;
        this.blade.rotateAngleY = 0.0F;
        this.blade.rotateAngleZ = 0.0F;
        this.right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount * 0.5F;
        this.left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount * 0.5F;
        this.right_leg.rotateAngleY = 0.0F;
        this.left_leg.rotateAngleY = 0.0F;
        GuardEntity.ArmPose guardentity$armpose = entityIn.getArmPose();
        if (guardentity$armpose == GuardEntity.ArmPose.ATTACKING) {
            float f = MathHelper.sin(this.swingProgress * (float)Math.PI);
            float f1 = MathHelper.sin((1.0F - (1.0F - this.swingProgress) * (1.0F - this.swingProgress)) * (float)Math.PI);
            this.right_arm.rotateAngleZ = 0.0F;
            this.left_arm.rotateAngleZ = 0.0F;
            this.right_arm.rotateAngleY = 0.15707964F;
            this.left_arm.rotateAngleY = -0.15707964F;
            this.right_arm.rotateAngleX = -1.8849558F + MathHelper.cos(ageInTicks * 0.09F) * 0.15F;
            this.left_arm.rotateAngleX = -0.0F + MathHelper.cos(ageInTicks * 0.19F) * 0.5F;
            this.right_arm.rotateAngleX += f * 2.2F - f1 * 0.4F;
            this.left_arm.rotateAngleX += f * 1.2F - f1 * 0.4F;
            this.right_arm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
            this.left_arm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
            this.right_arm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
            this.left_arm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        } else if (guardentity$armpose == GuardEntity.ArmPose.NEUTRAL){
            this.left_arm.rotateAngleY = 0.0F;
            this.right_arm.rotateAngleY = 0.0F;
            this.blade.rotateAngleY = 0.0F;
        }
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        nose.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        blade.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
