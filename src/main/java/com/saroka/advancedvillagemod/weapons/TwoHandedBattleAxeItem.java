package com.saroka.advancedvillagemod.weapons;

import com.saroka.advancedvillagemod.AdvancedVillageMod;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;


public class TwoHandedBattleAxeItem extends TwoHandedWeapon {

    public TwoHandedBattleAxeItem(IItemTier tier, int attackDamageIn, float attackSpeedIn) {
        super(tier, attackDamageIn, attackSpeedIn, new Item.Properties().group(AdvancedVillageMod.WEAPONS_TAB));
    }

}
