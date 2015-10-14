package net.GravityNetwork.Essentials.Essentials.Commands.StaffCmds;

/**
 * Created by Jesse on 6-7-2015.
 */
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Speed implements CommandExecutor
{
    public boolean onCommand(CommandSender sender, Command cmd, String commandLable, String[] args)
    {
        if (cmd.getName().equalsIgnoreCase("speed")) {
            if ((sender instanceof Player))
            {
                Player p = (Player)sender;
                if (args.length == 0) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e&lSPEED&7: &fPlease specify a speed you would like to travel at."));
                } else if (args.length == 1) {
                    try
                    {
                        double speed = Double.parseDouble(args[0]) / 10.0D;
                        if (sender.hasPermission("gravitynetwork.command.speed." + speed))
                        {
                            if (speed <= 10.0D)
                            {
                                if (p.isFlying())
                                {
                                    p.setFlySpeed((float)speed);
                                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e&lSPEED&7: &fNew fly speed: " + args[0] + "!"));
                                }
                                else
                                {
                                    p.setWalkSpeed((float)speed);
                                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e&lSPEED&7: &fNew walk speed: " + args[0] + "!"));
                                }
                            }
                            else {
                                p.setFlySpeed(10.0F);
                            }
                        }
                        else {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lSPEED&7: &fYou can not use a fly speed as high as that."));
                        }
                    }
                    catch (NumberFormatException e)
                    {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e&lSPEED&7: &fThat's not a valid number."));
                    }
                    catch (IndexOutOfBoundsException e)
                    {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e&lSPEED&7: &fThat's not a valid number."));
                    }
                    catch (IllegalArgumentException e)
                    {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e&lSPEED&7: &fThat's not a valid number."));
                    }
                }
            }
            else
            {
                sender.sendMessage(ChatColor.DARK_RED + "You can not use /speed from console.");
            }
        }
        return true;
    }
}

