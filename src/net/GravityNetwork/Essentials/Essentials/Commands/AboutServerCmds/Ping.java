package net.GravityNetwork.Essentials.Essentials.Commands.AboutServerCmds;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

/**
 * Created by Jesse on 6-7-2015.
 */
public class Ping implements CommandExecutor {

    public int getPing(Player p)
    {
        return ((CraftPlayer)p).getHandle().ping;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLable, String[] args)
    {
        if ((cmd.getName().equalsIgnoreCase("ping")) &&
                ((sender instanceof Player))) {
            if (args.length == 0)
            {
                Player p = (Player)sender;
                int ping = ((CraftPlayer)p).getHandle().ping;
                if (ping < 50)
                {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lPING&7: &fYour current ping to 'GravityNetwork' is &a&l" + ping + "&fms!"));
                    p.playSound(p.getLocation(), Sound.NOTE_PLING, 10.0F, 10.0F);
                    return true;
                }
                if ((ping >= 51) && (ping < 100))
                {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lPING&7: &fYour current ping to 'GravityNetwork' is &6&l" + ping + "&fms!"));
                    p.playSound(p.getLocation(), Sound.NOTE_PLING, 10.0F, 5.0F);
                    return true;
                }
                if ((ping >= 101) && (ping < 349))
                {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&lPING&7: &fYour current ping to 'GravityNetwork' is &c&l" + ping + "&fms!"));
                    p.playSound(p.getLocation(), Sound.NOTE_BASS, 10.0F, 10.0F);
                    return true;
                }
                if (ping >= 350)
                {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&lPING&7: &fYour current ping to 'GravityNetwork' is &4&l" + ping + "&fms!"));
                    p.playSound(p.getLocation(), Sound.NOTE_BASS, 10.0F, 4.0F);
                    return true;
                }
            }
            else if (args.length == 1)
            {
                Player target = Bukkit.getPlayer(args[0]);
                if (target != null)
                {
                    int ping = ((CraftPlayer)target).getHandle().ping;
                    if (ping <= 50)
                    {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lPING&7: &f" + target.getName() + "'s current ping to 'GravityNetwork' is &a&l" + ping + "&fms!"));
                        return true;
                    }
                    if ((ping >= 51) && (ping < 100))
                    {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lPING&7: &f" + target.getName() + "'s current ping to 'GravityNetwork' is &6&l" + ping + "&fms!"));
                        return true;
                    }
                    if ((ping >= 101) && (ping < 349))
                    {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&lPING&7: &f" + target.getName() + "'s current ping to 'GravityNetwork' is &c&l" + ping + "&fms!"));
                        return true;
                    }
                    if (ping >= 350)
                    {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&lPING&7: &f" + target.getName() + "'s current ping to 'GravityNetwork' is &4&l" + ping + "&fms!"));
                        return true;
                    }
                }
            }
        }
        return true;
    }
}

