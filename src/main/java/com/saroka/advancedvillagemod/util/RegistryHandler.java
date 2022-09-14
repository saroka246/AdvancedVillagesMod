package com.saroka.advancedvillagemod.util;

import com.saroka.advancedvillagemod.AdvancedVillageMod;
import com.saroka.advancedvillagemod.armor.ArmorMaterialBase;
import com.saroka.advancedvillagemod.armor.GuardArmor;
import com.saroka.advancedvillagemod.armor.HauberkArmor;
import com.saroka.advancedvillagemod.blocks.*;
import com.saroka.advancedvillagemod.blocks.decorations.SealedBarrelBlock;
import com.saroka.advancedvillagemod.blocks.decorations.TrapBlock;
import com.saroka.advancedvillagemod.blocks.pointsofinterest.AlchemyTable;
import com.saroka.advancedvillagemod.blocks.pointsofinterest.ChoppingBlock;
import com.saroka.advancedvillagemod.blocks.pointsofinterest.GlassBlowerTable;
import com.saroka.advancedvillagemod.blocks.pointsofinterest.MillBlock;
import com.saroka.advancedvillagemod.entities.GuardEntity;
import com.saroka.advancedvillagemod.items.ItemBase;

import com.saroka.advancedvillagemod.tools.AdvancedVillageItemTier;
import com.saroka.advancedvillagemod.weapons.BattleAxeItem;
import com.saroka.advancedvillagemod.weapons.OneHandedSwordItem;
import com.saroka.advancedvillagemod.weapons.TwoHandedBattleAxeItem;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, AdvancedVillageMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,AdvancedVillageMod.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES,AdvancedVillageMod.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    //Items

    public static final RegistryObject<Item> LORD_MARK = ITEMS.register("lord_mark", ItemBase::new);

    //Materials

    public static final RegistryObject<Item> CAST_IRON_BAR = ITEMS.register("cast_iron_bar", ItemBase::new);
    public static final RegistryObject<Item> CAST_IRON_INGOT = ITEMS.register("cast_iron_ingot", ItemBase::new);
    public static final RegistryObject<Item> CAST_IRON_NUGGET = ITEMS.register("cast_iron_nugget", ItemBase::new);
    public static final RegistryObject<Item> CAST_IRON_CHAIN_BAR = ITEMS.register("cast_iron_chain_bar", ItemBase::new);

    //Tools

    public static final RegistryObject<OneHandedSwordItem> FALCHION = ITEMS.register("falchion",
            () -> new OneHandedSwordItem(AdvancedVillageItemTier.CAST_IRON, 2, -2.4F));
    public static final RegistryObject<BattleAxeItem> HATCHET = ITEMS.register("hatchet",
            () -> new BattleAxeItem(AdvancedVillageItemTier.CAST_IRON, 2, -2.4F));
    public static final RegistryObject<TwoHandedBattleAxeItem> GREATAXE = ITEMS.register("greataxe",
            () -> new TwoHandedBattleAxeItem(AdvancedVillageItemTier.CAST_IRON, 2, -2.4F));

    //Armor

    public static final RegistryObject<ArmorItem> GUARD_HELMET = ITEMS.register("guard_helmet",
            () -> new GuardArmor(ArmorMaterialBase.CAST_IRON_CHAIN,EquipmentSlotType.HEAD));
    public static final RegistryObject<ArmorItem> GUARD_ARMOR = ITEMS.register("guard_chestplate",
            () -> new GuardArmor(ArmorMaterialBase.CAST_IRON_CHAIN,EquipmentSlotType.CHEST));
    public static final RegistryObject<ArmorItem> GUARD_LEGGINGS = ITEMS.register("guard_leggings",
            () -> new GuardArmor(ArmorMaterialBase.CAST_IRON_CHAIN,EquipmentSlotType.LEGS));
    public static final RegistryObject<ArmorItem> GUARD_BOOTS = ITEMS.register("guard_boots",
            () -> new GuardArmor(ArmorMaterialBase.CAST_IRON_CHAIN,EquipmentSlotType.FEET));


    public static final RegistryObject<ArmorItem> HAUBERK_HELMET = ITEMS.register("nasal_helmet",
            () -> new HauberkArmor(ArmorMaterialBase.CAST_IRON_CHAIN,EquipmentSlotType.HEAD));
    public static final RegistryObject<ArmorItem> HAUBERK_ARMOR = ITEMS.register("hauberk_chestplate",
            () -> new HauberkArmor(ArmorMaterialBase.CAST_IRON_CHAIN,EquipmentSlotType.CHEST));

    //Blocks

    public static final RegistryObject<Block> TRAP_BLOCK = BLOCKS.register("trap_block", TrapBlock::new);
    public static final RegistryObject<Block> CHOPPING_BLOCK = BLOCKS.register("chopping_block", ChoppingBlock::new);
    public static final RegistryObject<Block> SEALED_BARREL_BLOCK = BLOCKS.register("sealed_barrel_block", SealedBarrelBlock::new);
    public static final RegistryObject<Block> ALCHEMY_TABLE = BLOCKS.register("alchemy_table", AlchemyTable::new);
    public static final RegistryObject<Block> MILL_BLOCK = BLOCKS.register("mill_block", MillBlock::new);
    public static final RegistryObject<Block> GLASS_BLOWER_TABLE = BLOCKS.register("glass_blower_table", GlassBlowerTable::new);

    //Block Items

    public static final RegistryObject<BlockItem> TRAP_BLOCK_ITEM = ITEMS.register("trap_block", () -> new BlockItemBase(TRAP_BLOCK.get()));
    public static final RegistryObject<BlockItem> CHOPPING_BLOCK_ITEM = ITEMS.register("chopping_block", () -> new BlockItemBase(CHOPPING_BLOCK.get()));
    public static final RegistryObject<BlockItem> SEALED_BARREL_BLOCK_ITEM = ITEMS.register("sealed_barrel_block", () -> new BlockItemBase(SEALED_BARREL_BLOCK.get()));
    public static final RegistryObject<BlockItem> ALCHEMY_TABLE_ITEM = ITEMS.register("alchemy_table", () -> new BlockItemBase(ALCHEMY_TABLE.get()));
    public static final RegistryObject<BlockItem> MILL_BLOCK_ITEM = ITEMS.register("mill_block", () -> new BlockItemBase(MILL_BLOCK.get()));
    public static final RegistryObject<BlockItem> GLASS_BLOWER_TABLE_ITEM = ITEMS.register("glass_blower_table", () -> new BlockItemBase(GLASS_BLOWER_TABLE.get()));

    //Entities

    public static final RegistryObject<EntityType<GuardEntity>> GUARD = ENTITY_TYPES.register("guard",
            () -> EntityType.Builder
                    .create(GuardEntity::new, EntityClassification.CREATURE)
                    .size(0.6f,1.95f)
                    .build(new ResourceLocation(AdvancedVillageMod.MOD_ID, "guard").toString()));
}

