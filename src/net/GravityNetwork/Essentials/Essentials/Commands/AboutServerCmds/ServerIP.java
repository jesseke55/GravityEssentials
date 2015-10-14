package net.GravityNetwork.Essentials.Essentials.Commands.AboutServerCmds;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by jesse.
 * Created at: 11-10-15, 18:14.
 */
public class ServerIP implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args){
        if (cmd.getName().equalsIgnoreCase("")){
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&5&lOur server IP is: Play.GravityNetwork.Net or use GravityNetwork.Net"));
        }
        return true;
    }
}
