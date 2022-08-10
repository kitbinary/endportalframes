package net.kitbinary.endportalcraft;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CoreItem extends Item {
 
    public CoreItem(Settings settings) {
        super(settings);
    }
    
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}