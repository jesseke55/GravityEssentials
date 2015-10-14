package net.GravityNetwork.Essentials.Essentials.Commands.AboutServerCmds;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by jesse.
 * Created at: 11-10-15, 18:23.
 */
public class Rules implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args){
        if (cmd.getName().equalsIgnoreCase("rules")){
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&5&lSee /warp rules to check the rules (If availible :P)"));
        }
        return true;
    }
}
