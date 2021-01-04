package com.magmaguy.elitemobs.commands;

import com.magmaguy.elitemobs.MetadataHandler;
import org.bukkit.command.CommandSender;

public class ReloadHandler {

    public static void reload(CommandSender commandSender) {
        MetadataHandler.PLUGIN.onDisable();
        MetadataHandler.PLUGIN.onLoad();
        MetadataHandler.PLUGIN.onEnable();
        commandSender.sendMessage("[EliteMobs] Reload attempted. This may not 100% work. Restart instead if it didn't!!");
    }

}
