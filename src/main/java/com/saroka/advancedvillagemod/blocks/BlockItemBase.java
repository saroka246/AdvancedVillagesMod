package com.saroka.advancedvillagemod.blocks;

import com.saroka.advancedvillagemod.AdvancedVillageMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block blockIn) {
        super(blockIn, new Item.Properties().group(AdvancedVillageMod.BLOCKS_TAB));
    }
}
