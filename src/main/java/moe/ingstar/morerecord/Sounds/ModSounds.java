package moe.ingstar.morerecord.Sounds;


import moe.ingstar.morerecord.MoreRecord;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;

import net.minecraft.util.Identifier;

public class ModSounds {
    public static SoundEvent SUN_WHITE_HOUSE;
    public static SoundEvent CHIPI;

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MoreRecord.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        SUN_WHITE_HOUSE = registerSoundEvent("xiaobaima");
        CHIPI = registerSoundEvent("chipi");
    }
}
