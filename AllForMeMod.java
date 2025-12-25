package com.chris.allforme;

import net.minecraftforge.fml.common.Mod;

@Mod(AllForMeMod.MOD_ID)
public class AllForMeMod {

    public static final String MOD_ID = "allforme";

    public AllForMeMod() {
        // This is called when the mod is loaded.
        // Register items, blocks, events etc. here (later).
        System.out.println("All For Me mod loaded!");
    }
}
