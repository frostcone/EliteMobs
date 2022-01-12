package com.magmaguy.elitemobs.config.wormholes.premade;

import com.magmaguy.elitemobs.config.wormholes.WormholeConfigFields;
import wormhole.Wormhole;

public class AGOasisWormholeConfig extends WormholeConfigFields {
    public AGOasisWormholeConfig() {
        super("ag_oasis_wormhole",
                true,
                "em_adventurers_guild,290.5,97.5,293.5,54,0",
                "oasis_adventure.yml",
                Wormhole.WormholeStyle.CUBE);
        setBlindPlayer(true);
        setLocation1Text("&2『Oasis Adventure』 &aLvls 5-50");
        setParticleColor(0xFFFF00);
    }
}
