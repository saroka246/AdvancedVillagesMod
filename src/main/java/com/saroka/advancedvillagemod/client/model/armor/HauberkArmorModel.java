package com.saroka.advancedvillagemod.client.model.armor;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mrcrayfish.obfuscate.client.model.CustomPlayerModel;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.model.ModelRenderer;

public class HauberkArmorModel extends CustomPlayerModel {
    public final ModelRenderer body;
    private final ModelRenderer body_r1;
    private final ModelRenderer body_r2;
    private final ModelRenderer body_r3;
    private final ModelRenderer body_r4;
    private final ModelRenderer body_r5;
    private final ModelRenderer body_r6;
    public final ModelRenderer left_arm;
    public final ModelRenderer right_arm;
    public final ModelRenderer helmet;

    public HauberkArmorModel(float size) {
        super(size, false);
        textureWidth = 128;
        textureHeight = 128;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(0, 0).addBox(-4.5F, 1.0F, -3.5F, 9.0F, 5.0F, 7.0F, 0.0F, false);
        body.setTextureOffset(40, 36).addBox(2.5F, -0.5F, -3.5F, 2.0F, 2.0F, 7.0F, 0.0F, false);
        body.setTextureOffset(0, 43).addBox(-4.5F, -0.5F, -3.5F, 2.0F, 2.0F, 7.0F, 0.0F, false);
        body.setTextureOffset(25, 0).addBox(-3.5F, 0.0F, 2.1F, 7.0F, 1.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(51, 36).addBox(-4.0F, 6.0F, -3.1F, 8.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(47, 32).addBox(-4.0F, 6.0F, 1.1F, 8.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(44, 0).addBox(-4.5F, 7.0F, -3.3F, 9.0F, 2.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(16, 30).addBox(-1.0F, 6.5F, -3.6F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(34, 22).addBox(-4.5F, 7.0F, 1.3F, 9.0F, 2.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(0, 12).addBox(-1.0F, 14.0F, -3.3F, 2.0F, 5.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(46, 45).addBox(-4.0F, 18.5F, -3.3F, 8.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(44, 4).addBox(-4.0F, 18.5F, 1.3F, 8.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(0, 30).addBox(0.5F, 6.75F, 2.7F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(47, 29).addBox(-4.0F, 9.0F, -3.1F, 8.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(47, 26).addBox(-4.0F, 9.0F, 1.1F, 8.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(64, 14).addBox(3.6F, 7.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(65, 25).addBox(3.3F, 18.5F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(63, 31).addBox(-4.3F, 18.5F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(58, 71).addBox(3.1F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(71, 35).addBox(3.1F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(70, 69).addBox(3.1F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(52, 70).addBox(-4.1F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(36, 70).addBox(-4.1F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(70, 16).addBox(-4.1F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(10, 30).addBox(-4.6F, 7.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);

        body_r1 = new ModelRenderer(this);
        body_r1.setRotationPoint(-3.8F, 10.0F, 0.0F);
        body.addChild(body_r1);
        setRotationAngle(body_r1, 0.0F, 0.0F, 0.0436F);
        body_r1.setTextureOffset(36, 47).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

        body_r2 = new ModelRenderer(this);
        body_r2.setRotationPoint(3.8F, 10.0F, 0.0F);
        body.addChild(body_r2);
        setRotationAngle(body_r2, 0.0F, 0.0F, -0.0436F);
        body_r2.setTextureOffset(46, 48).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);

        body_r3 = new ModelRenderer(this);
        body_r3.setRotationPoint(-2.5F, 10.0F, -2.3F);
        body.addChild(body_r3);
        setRotationAngle(body_r3, -0.0436F, 0.0F, 0.0F);
        body_r3.setTextureOffset(56, 48).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 9.0F, 2.0F, 0.0F, false);
        body_r3.setTextureOffset(24, 17).addBox(1.5F, 4.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        body_r3.setTextureOffset(24, 21).addBox(1.0F, 5.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
        body_r3.setTextureOffset(0, 0).addBox(3.0F, 4.0F, -1.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
        body_r3.setTextureOffset(0, 21).addBox(1.5F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        body_r3.setTextureOffset(54, 59).addBox(3.5F, 0.0F, -1.0F, 3.0F, 9.0F, 2.0F, 0.0F, false);

        body_r4 = new ModelRenderer(this);
        body_r4.setRotationPoint(0.0F, 10.0F, 2.3F);
        body.addChild(body_r4);
        setRotationAngle(body_r4, 0.0436F, 0.0F, 0.0F);
        body_r4.setTextureOffset(18, 35).addBox(-4.0F, 0.0F, -1.0F, 8.0F, 9.0F, 2.0F, 0.0F, false);

        body_r5 = new ModelRenderer(this);
        body_r5.setRotationPoint(-1.5F, 0.75F, -2.6F);
        body.addChild(body_r5);
        setRotationAngle(body_r5, 0.0F, 0.0F, 0.2182F);
        body_r5.setTextureOffset(25, 2).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

        body_r6 = new ModelRenderer(this);
        body_r6.setRotationPoint(1.5F, 0.75F, -2.6F);
        body.addChild(body_r6);
        setRotationAngle(body_r6, 0.0F, 0.0F, -0.2182F);
        body_r6.setTextureOffset(56, 24).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

        left_arm = new ModelRenderer(this);
        left_arm.setRotationPoint(0.0F, 24.0F, 0.0F);
        left_arm.setTextureOffset(20, 64).addBox(-1.0F, -2.0F, -2.25F, 4.0F, 8.0F, 1.0F, 0.0F, false);
        left_arm.setTextureOffset(30, 56).addBox(2.25F, -2.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
        left_arm.setTextureOffset(20, 52).addBox(-1.25F, -2.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
        left_arm.setTextureOffset(10, 64).addBox(-1.0F, -2.0F, 1.25F, 4.0F, 8.0F, 1.0F, 0.0F, false);
        left_arm.setTextureOffset(62, 55).addBox(-1.0F, -2.1F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
        left_arm.setTextureOffset(66, 47).addBox(2.5F, 6.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
        left_arm.setTextureOffset(71, 23).addBox(-1.0F, 6.0F, -2.5F, 4.0F, 4.0F, 1.0F, 0.0F, false);
        left_arm.setTextureOffset(69, 30).addBox(-1.0F, 6.0F, 1.5F, 4.0F, 4.0F, 1.0F, 0.0F, false);
        left_arm.setTextureOffset(64, 60).addBox(-1.5F, 6.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
        left_arm.setTextureOffset(62, 9).addBox(-1.0F, 9.25F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

        right_arm = new ModelRenderer(this);
        right_arm.setRotationPoint(0.0F, 24.0F, 0.0F);
        right_arm.setTextureOffset(0, 64).addBox(-3.0F, -2.0F, -2.25F, 4.0F, 8.0F, 1.0F, 0.0F, false);
        right_arm.setTextureOffset(10, 52).addBox(0.25F, -2.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
        right_arm.setTextureOffset(0, 52).addBox(-3.25F, -2.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
        right_arm.setTextureOffset(40, 61).addBox(-3.0F, -2.0F, 1.25F, 4.0F, 8.0F, 1.0F, 0.0F, false);
        right_arm.setTextureOffset(60, 4).addBox(-3.0F, -2.1F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
        right_arm.setTextureOffset(46, 66).addBox(0.5F, 6.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
        right_arm.setTextureOffset(64, 68).addBox(-3.0F, 6.0F, -2.5F, 4.0F, 4.0F, 1.0F, 0.0F, false);
        right_arm.setTextureOffset(30, 68).addBox(-3.0F, 6.0F, 1.5F, 4.0F, 4.0F, 1.0F, 0.0F, false);
        right_arm.setTextureOffset(65, 39).addBox(-3.5F, 6.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
        right_arm.setTextureOffset(52, 17).addBox(-3.0F, 9.25F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

        helmet = new ModelRenderer(this);
        helmet.setRotationPoint(0.0F, 24.0F, 0.0F);
        helmet.setTextureOffset(34, 9).addBox(3.5F, -8.0F, -4.0F, 1.0F, 5.0F, 8.0F, 0.0F, false);
        helmet.setTextureOffset(30, 38).addBox(3.75F, -4.0F, -3.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        helmet.setTextureOffset(34, 0).addBox(-4.75F, -4.0F, -3.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        helmet.setTextureOffset(24, 22).addBox(3.25F, -5.0F, -4.25F, 1.0F, 5.0F, 8.0F, 0.0F, false);
        helmet.setTextureOffset(24, 4).addBox(-4.25F, -5.0F, -4.25F, 1.0F, 5.0F, 8.0F, 0.0F, false);
        helmet.setTextureOffset(50, 61).addBox(3.5F, -7.0F, -4.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        helmet.setTextureOffset(0, 34).addBox(3.5F, -5.0F, -4.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        helmet.setTextureOffset(25, 4).addBox(3.75F, -5.0F, -4.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        helmet.setTextureOffset(10, 30).addBox(-4.75F, -5.0F, -4.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        helmet.setTextureOffset(30, 17).addBox(-4.5F, -5.0F, -4.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        helmet.setTextureOffset(72, 0).addBox(-4.5F, -7.0F, -4.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        helmet.setTextureOffset(11, 43).addBox(-4.5F, -7.0F, 3.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        helmet.setTextureOffset(0, 43).addBox(3.5F, -7.0F, 3.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        helmet.setTextureOffset(0, 30).addBox(-4.5F, -8.0F, -4.0F, 1.0F, 5.0F, 8.0F, 0.0F, false);
        helmet.setTextureOffset(51, 39).addBox(-4.0F, -8.0F, -4.5F, 8.0F, 3.0F, 1.0F, 0.0F, false);
        helmet.setTextureOffset(54, 22).addBox(-4.0F, -6.0F, -4.75F, 8.0F, 1.0F, 1.0F, 0.0F, false);
        helmet.setTextureOffset(40, 36).addBox(-0.5F, -8.0F, -5.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        helmet.setTextureOffset(37, 2).addBox(-0.5F, -8.0F, 4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        helmet.setTextureOffset(0, 21).addBox(-4.0F, -8.5F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
        helmet.setTextureOffset(0, 12).addBox(-4.0F, -0.75F, -4.25F, 8.0F, 1.0F, 8.0F, 0.0F, false);
        helmet.setTextureOffset(36, 26).addBox(-0.5F, -9.0F, -4.5F, 1.0F, 1.0F, 9.0F, 0.0F, false);
        helmet.setTextureOffset(44, 9).addBox(-4.0F, -8.0F, 3.5F, 8.0F, 5.0F, 1.0F, 0.0F, false);
        helmet.setTextureOffset(44, 15).addBox(-4.5F, -4.0F, 3.75F, 9.0F, 1.0F, 1.0F, 0.0F, false);
        helmet.setTextureOffset(18, 47).addBox(-3.75F, -3.75F, 3.25F, 8.0F, 4.0F, 1.0F, 0.0F, false);
        helmet.setTextureOffset(30, 52).addBox(-4.25F, -3.75F, 3.25F, 1.0F, 4.0F, 1.0F, 0.0F, false);

        bipedLeftArm.addChild(left_arm);
        bipedRightArm.addChild(right_arm);
        bipedBody.addChild(body);
        bipedHeadwear.addChild(helmet);
    }

    public void setRotationAngles(AbstractClientPlayerEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        super.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.helmet.copyModelAngles(this.bipedHead);
        this.body.copyModelAngles(this.bipedBody);
        this.left_arm.copyModelAngles(this.bipedLeftArm);
        this.right_arm.copyModelAngles(this.bipedRightArm);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        helmet.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
