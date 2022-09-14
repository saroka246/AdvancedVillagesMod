package com.saroka.advancedvillagemod.villagers;

import com.saroka.advancedvillagemod.AdvancedVillageMod;
import net.minecraft.item.Items;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AdvancedVillageMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)

public class TradesRegistration {

    @SubscribeEvent
    public static void registerTrades(VillagerTradesEvent event){

        if (event.getType() == VillagerProfessions.SLAYER)
        {
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setPrice(Items.OAK_LOG, 8,16).setForSale(Items.EMERALD, 1, 4).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setPrice(Items.APPLE, 4,8).setForSale(Items.EMERALD, 1, 2).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,16).setForSale(Items.SWEET_BERRIES, 1,4).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,4).setForSale(Items.WHEAT_SEEDS, 2,8).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,2).setForSale(Items.APPLE, 4,8).build()));

            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setPrice(Items.ROTTEN_FLESH, 16,32).setForSale(Items.EMERALD, 1, 3).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(2,8).setForSale(Items.DIRT, 2,8).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,8).setForSale(Items.COAL, 1, 8).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.ICE, 1, 8).build()));

            event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.IRON_INGOT, 1, 2).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.GOLD_INGOT, 1, 2).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setPrice(Items.OAK_SAPLING, 16,32).setForSale(Items.EMERALD, 1, 2).build()));


            event.getTrades().get(4).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.REDSTONE, 1, 16).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.LAPIS_LAZULI, 1, 8).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 30, 0.05F).setPrice(Items.DIRT, 1,1).setPrice2(Items.WHEAT_SEEDS, 4,8).setForSale(Items.GRASS_BLOCK, 1, 1).build()));

            event.getTrades().get(5).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.QUARTZ, 1, 4).build()));
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(8,16).setForSale(Items.DIAMOND, 1, 3).build()));
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(8,16).setForSale(Items.DIAMOND_PICKAXE, 1,1).build()));
        }
        if (event.getType() == VillagerProfessions.ALCHEMIST)
        {
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setPrice(Items.OAK_LOG, 8,16).setForSale(Items.EMERALD, 1, 4).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setPrice(Items.APPLE, 4,8).setForSale(Items.EMERALD, 1, 2).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,16).setForSale(Items.SWEET_BERRIES, 1,4).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,4).setForSale(Items.WHEAT_SEEDS, 2,8).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,2).setForSale(Items.APPLE, 4,8).build()));

            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setPrice(Items.ROTTEN_FLESH, 16,32).setForSale(Items.EMERALD, 1, 3).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(2,8).setForSale(Items.DIRT, 2,8).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,8).setForSale(Items.COAL, 1, 8).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.ICE, 1, 8).build()));

            event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.IRON_INGOT, 1, 2).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.GOLD_INGOT, 1, 2).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setPrice(Items.OAK_SAPLING, 16,32).setForSale(Items.EMERALD, 1, 2).build()));


            event.getTrades().get(4).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.REDSTONE, 1, 16).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.LAPIS_LAZULI, 1, 8).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 30, 0.05F).setPrice(Items.DIRT, 1,1).setPrice2(Items.WHEAT_SEEDS, 4,8).setForSale(Items.GRASS_BLOCK, 1, 1).build()));

            event.getTrades().get(5).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.QUARTZ, 1, 4).build()));
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(8,16).setForSale(Items.DIAMOND, 1, 3).build()));
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(8,16).setForSale(Items.DIAMOND_PICKAXE, 1,1).build()));
        }
        if (event.getType() == VillagerProfessions.MILLER)
        {
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setPrice(Items.OAK_LOG, 8,16).setForSale(Items.EMERALD, 1, 4).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setPrice(Items.APPLE, 4,8).setForSale(Items.EMERALD, 1, 2).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,16).setForSale(Items.SWEET_BERRIES, 1,4).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,4).setForSale(Items.WHEAT_SEEDS, 2,8).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,2).setForSale(Items.APPLE, 4,8).build()));

            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setPrice(Items.ROTTEN_FLESH, 16,32).setForSale(Items.EMERALD, 1, 3).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(2,8).setForSale(Items.DIRT, 2,8).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,8).setForSale(Items.COAL, 1, 8).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.ICE, 1, 8).build()));

            event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.IRON_INGOT, 1, 2).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.GOLD_INGOT, 1, 2).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setPrice(Items.OAK_SAPLING, 16,32).setForSale(Items.EMERALD, 1, 2).build()));


            event.getTrades().get(4).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.REDSTONE, 1, 16).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.LAPIS_LAZULI, 1, 8).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 30, 0.05F).setPrice(Items.DIRT, 1,1).setPrice2(Items.WHEAT_SEEDS, 4,8).setForSale(Items.GRASS_BLOCK, 1, 1).build()));

            event.getTrades().get(5).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.QUARTZ, 1, 4).build()));
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(8,16).setForSale(Items.DIAMOND, 1, 3).build()));
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(8,16).setForSale(Items.DIAMOND_PICKAXE, 1,1).build()));
        }
        if (event.getType() == VillagerProfessions.GLASS_BLOWER)
        {
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setPrice(Items.OAK_LOG, 8,16).setForSale(Items.EMERALD, 1, 4).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setPrice(Items.APPLE, 4,8).setForSale(Items.EMERALD, 1, 2).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,16).setForSale(Items.SWEET_BERRIES, 1,4).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,4).setForSale(Items.WHEAT_SEEDS, 2,8).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,2).setForSale(Items.APPLE, 4,8).build()));

            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setPrice(Items.ROTTEN_FLESH, 16,32).setForSale(Items.EMERALD, 1, 3).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(2,8).setForSale(Items.DIRT, 2,8).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,8).setForSale(Items.COAL, 1, 8).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.ICE, 1, 8).build()));

            event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.IRON_INGOT, 1, 2).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.GOLD_INGOT, 1, 2).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setPrice(Items.OAK_SAPLING, 16,32).setForSale(Items.EMERALD, 1, 2).build()));


            event.getTrades().get(4).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.REDSTONE, 1, 16).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.LAPIS_LAZULI, 1, 8).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 30, 0.05F).setPrice(Items.DIRT, 1,1).setPrice2(Items.WHEAT_SEEDS, 4,8).setForSale(Items.GRASS_BLOCK, 1, 1).build()));

            event.getTrades().get(5).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.QUARTZ, 1, 4).build()));
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(8,16).setForSale(Items.DIAMOND, 1, 3).build()));
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(8,16).setForSale(Items.DIAMOND_PICKAXE, 1,1).build()));
        }


    }
}
