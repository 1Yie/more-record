package moe.ingstar.morerecord;

import moe.ingstar.morerecord.Items.ModGroup;
import moe.ingstar.morerecord.Items.ModItems;
import moe.ingstar.morerecord.Sounds.ModSounds;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreRecord implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("more_record");

	public static final String MOD_ID = "more_record";
	@Override
	public void onInitialize() {
		ModSounds.registerSounds();
		ModItems.registerItems();
		ModGroup.registerGroup();
	}
}