package com.saroka.advancedvillagemod.items;

import com.saroka.advancedvillagemod.AdvancedVillageMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(AdvancedVillageMod.MATERIALS_TAB));
    }
}
