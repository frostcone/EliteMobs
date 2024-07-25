package com.magmaguy.elitemobs.commands;

import com.magmaguy.magmacore.command.AdvancedCommand;
import com.magmaguy.magmacore.command.SenderType;

import java.util.ArrayList;
import java.util.List;

public class ArenaCommand extends AdvancedCommand {
    public ArenaCommand() {
        super(List.of("arena"));
        addArgument("arenaID", new ArrayList<>());
        setUsage("/em arena <arenaID>");
        setDescription("Brings up the arena menu for the specified arena.");
        setSenderType(SenderType.PLAYER);
        setPermission("elitemobs.arena.menu");
    }

    @Override
    public void execute() {
        ArenaCommands.openArenaMenu(getCurrentPlayerSender(), getStringArgument("arenaID"));
    }
}
