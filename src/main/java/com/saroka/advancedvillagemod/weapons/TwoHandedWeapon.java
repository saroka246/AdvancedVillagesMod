package com.saroka.advancedvillagemod.weapons;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public class TwoHandedWeapon extends SwordItem {
    public TwoHandedWeapon(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
}
