package moe.ingstar.morerecord.Items;

import moe.ingstar.morerecord.MoreRecord;
import moe.ingstar.morerecord.Sounds.ModSounds;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static Item XIAOBAIMA_MUSIC_DISC = new MusicDiscItem(7, ModSounds.SUN_WHITE_HOUSE,
            new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 226);
    public static Item CHIPI_MUSIC_DISC = new MusicDiscItem(7, ModSounds.CHIPI,
            new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 226);
    public static void registerItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(XIAOBAIMA_MUSIC_DISC);
            content.add(CHIPI_MUSIC_DISC);
        });

        Registry.register(Registries.ITEM, new Identifier(MoreRecord.MOD_ID, "xiaobaima_music_disc"), XIAOBAIMA_MUSIC_DISC);
        Registry.register(Registries.ITEM, new Identifier(MoreRecord.MOD_ID, "chipi_music_disc"), CHIPI_MUSIC_DISC);
    }

}
