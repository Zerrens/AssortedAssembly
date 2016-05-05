package com.velleth.aa.handler;

import com.velleth.aa.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Zerren on 4/24/2016.
 */
public class ConfigHandler {

    public static Configuration config;

    public static boolean devDebug = false;

    public static void init(File configFile){

        if (config == null) {
            config = new Configuration(configFile);
            loadConfigValues();
            if (config.hasChanged())
                config.save();
        }
    }

    private static void loadConfigValues() {
        //tweaks
        devDebug = config.getBoolean("devDebug", "general", false, "System print for debugging--leave false unless you have a log spam fetish");
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.ModInfo.MOD_ID)) {
            loadConfigValues();
        }
    }
}
