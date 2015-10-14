package net.GravityNetwork.Essentials.Essentials.Commands.EssentialCmdss;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Jesse on 6-7-2015.
 */
public class Fly implements CommandExecutor{

    public boolean onCommand(CommandSender sender, Command cmd, String commandLable, String[] args){


    if (cmd.getName().equalsIgnoreCase("fly"))
    {
        if ((sender instanceof Player))
        {
            Player p = (Player)sender;
            if (p.hasPermission("gravitynetwork.command.fly"))
            {
                if (p.isFlying())
                {
                    p.setAllowFlight(false);
                    p.setFlying(false);
                    p.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "FLY-MODE" + ChatColor.GRAY + " You are no longer flying.");
                    return true;
                }
                p.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "FLY-MODE" + ChatColor.GRAY + " You are now flying.");
                p.setAllowFlight(true);
                p.setFlying(true);
                return true;
            }
            p.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "FAULT" + ChatColor.GRAY + ":" + ChatColor.WHITE + " You do not have permission to use this command!");
        }




        else
        {
            sender.sendMessage(ChatColor.DARK_RED + "You're console, you don't have an inventory!");
        }
    }

    return true;

}}
