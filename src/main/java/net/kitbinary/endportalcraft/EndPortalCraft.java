package net.kitbinary.endportalcraft;

import net.fabricmc.api.ModInitializer;
import net.kitbinary.endportalcraft.registry.Register;
import net.kitbinary.endportalcraft.util.LootTableModifier;

public class EndPortalCraft implements ModInitializer {

    public static final String MOD_ID = "endportalcraft";

	@Override
	public void onInitialize() {

		Register.registerItems();
		
		LootTableModifier.modifyLootTables();
	}
}
