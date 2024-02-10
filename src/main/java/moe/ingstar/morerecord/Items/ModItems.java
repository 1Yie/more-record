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

    public static Item XIAOBAIMA_MUSIC_DISC;
    public static Item CHIPI_MUSIC_DISC;
    public static Item UNDER_BRIGHT_LIGHTS_MUSIC_DISC;

    private static Item registerDiscItem(String name, SoundEvent soundEvent, int outPut, int lengthInSeconds) {
        Identifier id = new Identifier(MoreRecord.MOD_ID, name);
        FabricItemSettings settings = new FabricItemSettings().maxCount(1).rarity(Rarity.RARE);
        MusicDiscItem musicDisc = new MusicDiscItem(outPut, soundEvent, settings, lengthInSeconds);

        Registry.register(Registries.ITEM, id, musicDisc);
        return musicDisc;
    }

    public static void registerItems() {
        XIAOBAIMA_MUSIC_DISC = registerDiscItem("xiaobaima_music_disc", ModSounds.SUN_WHITE_HOUSE, 3, 226);
        CHIPI_MUSIC_DISC = registerDiscItem("chipi_music_disc", ModSounds.CHIPI, 5, 226);
        UNDER_BRIGHT_LIGHTS_MUSIC_DISC = registerDiscItem("under_bright_lights_music_disc", ModSounds.UNDER_BRIGHT_LIGHTS, 7, 227);
    }
}
