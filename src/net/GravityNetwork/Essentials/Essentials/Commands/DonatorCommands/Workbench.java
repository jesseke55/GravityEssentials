package net.GravityNetwork.Essentials.Essentials.Commands.DonatorCommands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by jesse.
 * Created at: 11-10-15, 19:52.
 */
public class Workbench implements CommandExecutor {


        private String prefix = ChatColor.translateAlternateColorCodes('&', "&4[Gravity Network] ");

    public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args){
        if (!(sender instanceof Player)) {
            sender.sendMessage(prefix + "Sorry friend but i cant run this in the console ;(");
            return true;
        }
        Player p = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("workbench")){
            if (!p.hasPermission("gravitynetwork.commands.workbench")){
                p.openWorkbench(null, true);

            }
        }

        return false;
    }
}
