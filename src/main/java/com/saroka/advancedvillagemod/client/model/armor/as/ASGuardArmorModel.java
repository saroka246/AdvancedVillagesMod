package com.saroka.advancedvillagemod.client.model.armor.as;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class ASGuardArmorModel extends BipedModel<LivingEntity> {
    public final ModelRenderer helmet;
    public final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    public final ModelRenderer left_arm;
    public final ModelRenderer right_arm;
    public final ModelRenderer left_leg;
    public final ModelRenderer right_leg;
    public final ModelRenderer left_boot;
    public final ModelRenderer right_boot;

    public ASGuardArmorModel(float size) {
        super(size, 0, 128, 128);
        textureWidth = 128;
        textureHeight = 128;

        helmet = new ModelRenderer(this);
        helmet.setRotationPoint(0.0F, 24.0F, 0.0F);
        helmet.setTextureOffset(41, 26).addBox(3.5F, -9.0F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
        helmet.setTextureOffset(21, 10).addBox(4.0F, -7.0F, -5.5F, 3.0F, 1.0F, 11.0F, 0.0F, false);
        helmet.setTextureOffset(0, 21).addBox(-7.0F, -7.0F, -5.5F, 3.0F, 1.0F, 11.0F, 0.0F, false);
        helmet.setTextureOffset(20, 40).addBox(-4.5F, -9.0F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
        helmet.setTextureOffset(30, 31).addBox(-4.5F, -6.5F, -4.5F, 1.0F, 7.0F, 9.0F, 0.0F, false);
        helmet.setTextureOffset(19, 24).addBox(3.5F, -6.5F, -4.5F, 1.0F, 7.0F, 9.0F, 0.0F, false);
        helmet.setTextureOffset(67, 0).addBox(-4.0F, -9.0F, -4.5F, 8.0F, 2.0F, 1.0F, 0.0F, false);
        helmet.setTextureOffset(0, 56).addBox(-0.5F, -9.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        helmet.setTextureOffset(0, 33).addBox(-0.5F, -9.0F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        helmet.setTextureOffset(30, 22).addBox(-5.5F, -7.0F, -7.0F, 11.0F, 1.0F, 3.0F, 0.0F, false);
        helmet.setTextureOffset(25, 0).addBox(-5.5F, -7.0F, 4.0F, 11.0F, 1.0F, 3.0F, 0.0F, false);
        helmet.setTextureOffset(0, 12).addBox(-4.0F, -9.5F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
        helmet.setTextureOffset(38, 4).addBox(-0.5F, -10.0F, -4.5F, 1.0F, 1.0F, 9.0F, 0.0F, false);
        helmet.setTextureOffset(30, 26).addBox(-4.0F, -9.0F, 3.5F, 8.0F, 3.0F, 1.0F, 0.0F, false);
        helmet.setTextureOffset(51, 26).addBox(-3.5F, -6.5F, 3.5F, 7.0F, 7.0F, 1.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(0, 0).addBox(-4.5F, 1.0F, -3.5F, 9.0F, 5.0F, 7.0F, 0.0F, false);
        body.setTextureOffset(31, 47).addBox(3.5F, -0.5F, -3.5F, 2.0F, 2.0F, 7.0F, 0.0F, false);
        body.setTextureOffset(43, 40).addBox(-5.5F, -0.5F, -3.5F, 2.0F, 2.0F, 7.0F, 0.0F, false);
        body.setTextureOffset(54, 40).addBox(-4.0F, 0.0F, -3.1F, 8.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(66, 24).addBox(-3.5F, 0.0F, 1.5F, 7.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(0, 53).addBox(-4.0F, 6.0F, -3.1F, 8.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(41, 37).addBox(-4.0F, 6.0F, 1.1F, 8.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(0, 49).addBox(-4.5F, 7.0F, -3.3F, 9.0F, 2.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(12, 33).addBox(-1.0F, 6.5F, -3.6F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(38, 14).addBox(-4.5F, 7.0F, 1.3F, 9.0F, 2.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(76, 69).addBox(0.5F, 6.5F, 2.7F, 3.0F, 4.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(38, 18).addBox(-4.0F, 9.0F, -3.1F, 8.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(25, 4).addBox(-4.0F, 9.0F, 1.1F, 8.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(76, 45).addBox(3.6F, 7.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(81, 55).addBox(3.1F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(81, 30).addBox(3.1F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(81, 25).addBox(3.1F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(81, 0).addBox(-4.1F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(71, 80).addBox(-4.1F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(52, 80).addBox(-4.1F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(68, 17).addBox(-4.6F, 7.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(67, 27).addBox(-4.0F, 19.0F, -3.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(63, 60).addBox(-4.0F, 19.0F, 2.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(54, 43).addBox(-4.0F, 18.5F, 2.2F, 8.0F, 1.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(65, 79).addBox(3.6F, 19.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(6, 78).addBox(3.8F, 18.5F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(77, 8).addBox(-4.8F, 18.5F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(76, 75).addBox(-4.6F, 19.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(0, 0).addBox(-0.5F, 14.0F, -3.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(77, 80).addBox(-4.0F, 18.5F, -3.2F, 3.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(30, 30).addBox(1.0F, 18.5F, -3.2F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(24, 12).addBox(-1.0F, 11.0F, -3.2F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(0, 12).addBox(0.5F, 13.5F, -3.2F, 1.0F, 6.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(50, 62).addBox(-1.5F, 15.5F, -3.2F, 1.0F, 4.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(36, 56).addBox(-0.5F, 13.5F, -3.2F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(6, 56).addBox(-1.0F, 14.5F, -3.2F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-1.0F, 10.0F, -2.3F);
        body.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(20, 40).addBox(-0.5F, 1.5F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
        cube_r1.setTextureOffset(41, 30).addBox(0.0F, 1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        cube_r1.setTextureOffset(40, 8).addBox(1.5F, 1.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
        cube_r1.setTextureOffset(24, 17).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        cube_r1.setTextureOffset(20, 63).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 9.0F, 2.0F, 0.0F, false);
        cube_r1.setTextureOffset(0, 21).addBox(2.0F, 0.0F, -1.0F, 3.0F, 9.0F, 2.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 10.0F, 2.3F);
        body.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        cube_r2.setTextureOffset(0, 38).addBox(-4.0F, 0.0F, -1.0F, 8.0F, 9.0F, 2.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-3.3F, 10.0F, 0.0F);
        body.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, 0.0873F);
        cube_r3.setTextureOffset(49, 49).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 9.0F, 4.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(3.3F, 10.0F, 0.0F);
        body.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, -0.0873F);
        cube_r4.setTextureOffset(49, 0).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 9.0F, 4.0F, 0.0F, false);

        left_arm = new ModelRenderer(this);
        left_arm.setRotationPoint(0.0F, 24.0F, 0.0F);
        left_arm.setTextureOffset(71, 3).addBox(-1.0F, -2.0F, -2.25F, 4.0F, 8.0F, 1.0F, 0.0F, false);
        left_arm.setTextureOffset(61, 0).addBox(2.25F, -2.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
        left_arm.setTextureOffset(57, 58).addBox(-1.25F, -2.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
        left_arm.setTextureOffset(50, 70).addBox(-1.0F, -2.0F, 1.25F, 4.0F, 8.0F, 1.0F, 0.0F, false);
        left_arm.setTextureOffset(64, 12).addBox(-1.0F, -2.1F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
        left_arm.setTextureOffset(76, 37).addBox(2.5F, 6.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
        left_arm.setTextureOffset(46, 79).addBox(-1.0F, 6.0F, -2.5F, 4.0F, 4.0F, 1.0F, 0.0F, false);
        left_arm.setTextureOffset(36, 79).addBox(-1.0F, 6.0F, 1.5F, 4.0F, 4.0F, 1.0F, 0.0F, false);
        left_arm.setTextureOffset(76, 13).addBox(-1.5F, 6.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
        left_arm.setTextureOffset(63, 55).addBox(-1.0F, 9.25F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

        right_arm = new ModelRenderer(this);
        right_arm.setRotationPoint(0.0F, 24.0F, 0.0F);
        right_arm.setTextureOffset(40, 70).addBox(-3.0F, -2.0F, -2.25F, 4.0F, 8.0F, 1.0F, 0.0F, false);
        right_arm.setTextureOffset(40, 58).addBox(0.25F, -2.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
        right_arm.setTextureOffset(58, 14).addBox(-3.25F, -2.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
        right_arm.setTextureOffset(30, 68).addBox(-3.0F, -2.0F, 1.25F, 4.0F, 8.0F, 1.0F, 0.0F, false);
        right_arm.setTextureOffset(61, 50).addBox(-3.0F, -2.1F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
        right_arm.setTextureOffset(59, 34).addBox(-3.0F, 9.25F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
        right_arm.setTextureOffset(75, 51).addBox(0.5F, 6.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
        right_arm.setTextureOffset(59, 78).addBox(-3.0F, 6.0F, -2.5F, 4.0F, 4.0F, 1.0F, 0.0F, false);
        right_arm.setTextureOffset(77, 62).addBox(-3.0F, 6.0F, 1.5F, 4.0F, 4.0F, 1.0F, 0.0F, false);
        right_arm.setTextureOffset(16, 74).addBox(-3.5F, 6.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

        left_leg = new ModelRenderer(this);
        left_leg.setRotationPoint(0.0F, 24.0F, 0.0F);
        left_leg.setTextureOffset(10, 68).addBox(-2.0F, 0.0F, -2.1F, 4.0F, 8.0F, 1.0F, 0.0F, false);
        left_leg.setTextureOffset(0, 68).addBox(-2.0F, 0.0F, 1.1F, 4.0F, 8.0F, 1.0F, 0.0F, false);
        left_leg.setTextureOffset(30, 56).addBox(1.1F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
        left_leg.setTextureOffset(10, 56).addBox(-2.1F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

        right_leg = new ModelRenderer(this);
        right_leg.setRotationPoint(0.0F, 24.0F, 0.0F);
        right_leg.setTextureOffset(10, 68).addBox(-2.0F, 0.0F, -2.1F, 4.0F, 8.0F, 1.0F, 0.0F, false);
        right_leg.setTextureOffset(0, 68).addBox(-2.0F, 0.0F, 1.1F, 4.0F, 8.0F, 1.0F, 0.0F, false);
        right_leg.setTextureOffset(30, 56).addBox(1.1F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
        right_leg.setTextureOffset(10, 56).addBox(-2.1F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

        left_boot = new ModelRenderer(this);
        left_boot.setRotationPoint(0.0F, 24.0F, 0.0F);
        left_boot.setTextureOffset(78, 21).addBox(-2.0F, 10.0F, -2.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);
        left_boot.setTextureOffset(26, 51).addBox(-2.0F, 8.0F, -2.25F, 4.0F, 2.0F, 1.0F, 0.0F, false);
        left_boot.setTextureOffset(26, 77).addBox(-2.0F, 8.0F, 1.25F, 4.0F, 4.0F, 1.0F, 0.0F, false);
        left_boot.setTextureOffset(70, 71).addBox(1.25F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
        left_boot.setTextureOffset(71, 29).addBox(-2.25F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
        left_boot.setTextureOffset(57, 45).addBox(-2.0F, 11.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

        right_boot = new ModelRenderer(this);
        right_boot.setRotationPoint(0.0F, 24.0F, 0.0F);
        right_boot.setTextureOffset(78, 21).addBox(-2.0F, 10.0F, -2.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);
        right_boot.setTextureOffset(26, 51).addBox(-2.0F, 8.0F, -2.25F, 4.0F, 2.0F, 1.0F, 0.0F, false);
        right_boot.setTextureOffset(26, 77).addBox(-2.0F, 8.0F, 1.25F, 4.0F, 4.0F, 1.0F, 0.0F, false);
        right_boot.setTextureOffset(70, 71).addBox(1.25F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
        right_boot.setTextureOffset(71, 29).addBox(-2.25F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
        right_boot.setTextureOffset(0, 33).addBox(-2.0F, 11.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

        bipedLeftArm.addChild(left_arm);
        bipedRightArm.addChild(right_arm);
        bipedBody.addChild(body);
        bipedHeadwear.addChild(helmet);
        bipedLeftLeg.addChild(left_leg);
        bipedLeftLeg.addChild(left_boot);
        bipedRightLeg.addChild(right_leg);
        bipedRightLeg.addChild(right_boot);
    }


    public void setRotationAngles(LivingEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        netHeadYaw = 0;
        super.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.helmet.copyModelAngles(this.bipedHead);
        this.body.copyModelAngles(this.bipedBody);
        this.left_arm.copyModelAngles(this.bipedLeftArm);
        this.right_arm.copyModelAngles(this.bipedRightArm);
        this.left_leg.copyModelAngles(this.bipedLeftLeg);
        this.left_boot.copyModelAngles(this.bipedLeftLeg);
        this.right_leg.copyModelAngles(this.bipedRightLeg);
        this.right_boot.copyModelAngles(this.bipedRightLeg);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        helmet.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        right_boot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        left_boot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
