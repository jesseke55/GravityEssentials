package net.GravityNetwork.Essentials.Essentials.Commands.EssentialCmdss;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

/**
 * Created by Jesse Geerts on 16-7-2015.
 * YOU MAY NOT COPY/STEAL THE CODE WITHOUT ANY PERMISSION!
 */
public class Clear implements CommandExecutor {


    public boolean onCommand(CommandSender sender, Command cmd, String commandLable, String[] args){

        Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("clear")){
            PlayerInventory pi = p.getInventory();
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&5&lYour inventory has been cleared by: " + ((Player) sender).getDisplayName() ));


            pi.clear();
        }

        return true;
    }
}
