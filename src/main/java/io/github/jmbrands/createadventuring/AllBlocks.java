package io.github.jmbrands.createadventuring;

import static io.github.jmbrands.createadventuring.CreateAdventuring.REGISTRATE;

import com.tterrag.registrate.util.entry.BlockEntry;

import io.github.jmbrands.createadventuring.roastingjack.RoastingJackBlock;

public class AllBlocks {
    static {
		REGISTRATE.creativeModeTab(() -> AllCreativeModeTabs.BASE_CREATIVE_TAB);
	}
    
    public static final BlockEntry<RoastingJackBlock> ROASTING_JACK = REGISTRATE
        .block(null)
}
