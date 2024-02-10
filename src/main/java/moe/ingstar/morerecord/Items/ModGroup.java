package moe.ingstar.morerecord.Items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class ModGroup {
    public static void registerGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(ModItems.XIAOBAIMA_MUSIC_DISC);
            content.add(ModItems.CHIPI_MUSIC_DISC);
            content.add(ModItems.UNDER_BRIGHT_LIGHTS_MUSIC_DISC);
        });
    }
}
