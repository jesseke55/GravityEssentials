package net.GravityNetwork.Essentials.Essentials.Commands.AboutServerCmds;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by jesse.
 * Created at: 11-10-15, 18:34.
 */
public class About implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args){

        if (cmd.getName().equalsIgnoreCase("about")){
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Gravity Network is a space themed minecraft network"));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6with custom-made gamemodes  and normal gamemodes"));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', ""));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aDo '/staff' to see our current server staffs. (Except the helpers will be listed {SORRY}) "));



        }



        return true;
    }
}
