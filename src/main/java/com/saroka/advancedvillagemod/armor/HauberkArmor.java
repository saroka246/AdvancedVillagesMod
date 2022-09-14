package com.saroka.advancedvillagemod.armor;

import com.saroka.advancedvillagemod.AdvancedVillageMod;
import com.saroka.advancedvillagemod.client.model.armor.HauberkArmorModel;
import com.saroka.advancedvillagemod.client.model.armor.as.ASHauberkArmorModel;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ArmorStandEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;

import javax.annotation.Nullable;

public class HauberkArmor extends ArmorItem {

    public HauberkArmor(IArmorMaterial materialIn, EquipmentSlotType slot) {
        super(materialIn, slot, new Item.Properties().group(AdvancedVillageMod.ARMOR_TAB));
    }

    @SuppressWarnings("unchecked")
    @Nullable
    @Override
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default)
    {
        if(entityLiving instanceof ArmorStandEntity){
            ASHauberkArmorModel armor_model = new ASHauberkArmorModel(1.0F);
            armor_model.helmet.showModel = armorSlot == EquipmentSlotType.HEAD;
            armor_model.body.showModel = armorSlot == EquipmentSlotType.CHEST;
            armor_model.left_arm.showModel = armorSlot == EquipmentSlotType.CHEST;
            armor_model.right_arm.showModel = armorSlot == EquipmentSlotType.CHEST;

            armor_model.isChild = _default.isChild;
            armor_model.isSitting = _default.isSitting;
            armor_model.isSneak = _default.isSneak;
            armor_model.rightArmPose = _default.rightArmPose;
            armor_model.leftArmPose = _default.leftArmPose;

            return (A) armor_model;
        } else {
            HauberkArmorModel armor_model = new HauberkArmorModel(1.0F);
            armor_model.helmet.showModel = armorSlot == EquipmentSlotType.HEAD;
            armor_model.body.showModel = armorSlot == EquipmentSlotType.CHEST;
            armor_model.left_arm.showModel = armorSlot == EquipmentSlotType.CHEST;
            armor_model.right_arm.showModel = armorSlot == EquipmentSlotType.CHEST;

            armor_model.isChild = _default.isChild;
            armor_model.isSitting = _default.isSitting;
            armor_model.isSneak = _default.isSneak;
            armor_model.rightArmPose = _default.rightArmPose;
            armor_model.leftArmPose = _default.leftArmPose;

            return (A) armor_model;
        }
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return "avm:textures/models/armor/hauberk_armor.png";
    }

}
