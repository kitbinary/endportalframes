package net.kitbinary.endportalcraft.registry;

import net.kitbinary.endportalcraft.CoreItem;
import net.kitbinary.endportalcraft.EndPortalCraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class Register {

    //Items
    public static final CoreItem WARDENCORE = new CoreItem(new Item.Settings().group(ItemGroup.MATERIALS).rarity(Rarity.UNCOMMON).maxCount(16));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(EndPortalCraft.MOD_ID, "wardencore"), WARDENCORE);
    }
    
}
