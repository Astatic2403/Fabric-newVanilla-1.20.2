package de.astatic.newvanilla;

import de.astatic.newvanilla.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewVanilla implements ModInitializer {
	public static final String MOD_ID = "newvanilla";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}