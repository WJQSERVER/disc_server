package com.example.musicmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MusicMod implements ModInitializer {

    public static final Item MUSIC_DISC_1 = new CustomMusicDiscItem(1, new SoundEvent(new Identifier("musicmod", "music1")), new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item MUSIC_DISC_2 = new CustomMusicDiscItem(1, new SoundEvent(new Identifier("musicmod", "music2")), new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item MUSIC_DISC_3 = new CustomMusicDiscItem(1, new SoundEvent(new Identifier("musicmod", "music3")), new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item MUSIC_DISC_4 = new CustomMusicDiscItem(1, new SoundEvent(new Identifier("musicmod", "music4")), new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item MUSIC_DISC_5 = new CustomMusicDiscItem(1, new SoundEvent(new Identifier("musicmod", "music5")), new FabricItemSettings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("musicmod", "music_disc_1"), MUSIC_DISC_1);
        Registry.register(Registry.ITEM, new Identifier("musicmod", "music_disc_2"), MUSIC_DISC_2);
        Registry.register(Registry.ITEM, new Identifier("musicmod", "music_disc_3"), MUSIC_DISC_3);
        Registry.register(Registry.ITEM, new Identifier("musicmod", "music_disc_4"), MUSIC_DISC_4);
        Registry.register(Registry.ITEM, new Identifier("musicmod", "music_disc_5"), MUSIC_DISC_5);

        Registry.register(Registry.SOUND_EVENT, new Identifier("musicmod", "music1"), new SoundEvent(new Identifier("musicmod", "music1")));
        Registry.register(Registry.SOUND_EVENT, new Identifier("musicmod", "music2"), new SoundEvent(new Identifier("musicmod", "music2")));
        Registry.register(Registry.SOUND_EVENT, new Identifier("musicmod", "music3"), new SoundEvent(new Identifier("musicmod", "music3")));
        Registry.register(Registry.SOUND_EVENT, new Identifier("musicmod", "music4"), new SoundEvent(new Identifier("musicmod", "music4")));
        Registry.register(Registry.SOUND_EVENT, new Identifier("musicmod", "music5"), new SoundEvent(new Identifier("musicmod", "music5")));
    }
}