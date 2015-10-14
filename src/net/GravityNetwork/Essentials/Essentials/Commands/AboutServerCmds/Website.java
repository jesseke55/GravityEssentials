package net.GravityNetwork.Essentials.Essentials.Commands.AboutServerCmds;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by jesse.
 * Created at: 11-10-15, 18:03.
 */
public class Website implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String CommandLable, String[] args){
        if (cmd.getName().equalsIgnoreCase("website")){
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&5&lOur website is: https://Www.GravityNetwork.Net"));
        }
        return true;
    }
}
