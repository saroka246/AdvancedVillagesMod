package com.saroka.advancedvillagemod.blocks.decorations;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TrapBlock extends Block {
    public TrapBlock() {
        super(Block.Properties.create(Material.WOOD)
                .hardnessAndResistance(2.0f,15.0f)
                .harvestTool(ToolType.AXE)
                .sound(SoundType.WOOD)
                .harvestLevel(0)
        );
    }

}
