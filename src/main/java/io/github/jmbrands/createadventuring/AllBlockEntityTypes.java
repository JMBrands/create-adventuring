package io.github.jmbrands.createadventuring;

import static io.github.jmbrands.createadventuring.CreateAdventuring.REGISTRATE;

import com.simibubi.create.content.contraptions.bearing.BearingInstance;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

import io.github.jmbrands.createadventuring.roastingjack.RoastingJackBlockEntity;

public class AllBlockEntityTypes {
    public static final BlockEntityEntry<RoastingJackBlockEntity> ROASTING_JACK = REGISTRATE
        .blockEntity("roasting_jack", RoastingJackBlockEntity::new)
        .instance(() -> BearingInstance::new)
        .validBlock()

}
