package net.GravityNetwork.Essentials.Essentials.Commands.EssentialCmdss;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Jesse on 7-7-2015.
 */
public class GameModeCommand implements CommandExecutor{



    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
        if (!sender.hasPermission("gravitynetwork.command.gamemode"))
        {
            sender.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "FAULT" + ChatColor.GRAY + ": You do not have permission to use this command!");
        }
        else
        {
            Player player = (Player)sender;
            if (cmd.getName().equalsIgnoreCase("gamemode"))
            {
                if (args.length == 0)
                {
                    player.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "FAULT" + ChatColor.GRAY + ": Please use the correct format! /gamemode <c><s><a><ss>");
                    return true;
                }
                if (args.length == 1)
                {
                    if (args[0].equalsIgnoreCase("c"))
                    {
                        sender.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "SUCCESS" + ChatColor.GRAY + ": Your gamemode has been updated to 'Creative!'");
                        player.setGameMode(GameMode.CREATIVE);
                    }

                    if (args[0].equalsIgnoreCase("1"))
                    {
                        sender.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "SUCCESS" + ChatColor.GRAY + ": Your gamemode has been updated to 'Creative!'");
                        player.setGameMode(GameMode.CREATIVE);
                    }

                    else if (args[0].equalsIgnoreCase("s"))
                    {
                        sender.sendMessage(ChatColor.GREEN + "" +ChatColor.BOLD + "SUCCESS" + ChatColor.GRAY + ": Your gamemode has been updated to 'Survival!'");
                        player.setGameMode(GameMode.SURVIVAL);
                    }

                    else if (args[0].equalsIgnoreCase("0"))
                    {
                        sender.sendMessage(ChatColor.GREEN + "" +ChatColor.BOLD + "SUCCESS" + ChatColor.GRAY + ": Your gamemode has been updated to 'Survival!'");
                        player.setGameMode(GameMode.SURVIVAL);
                    }

                    else if (args[0].equalsIgnoreCase("a"))
                    {
                        sender.sendMessage(ChatColor.GREEN + "" +ChatColor.BOLD + "SUCCESS" + ChatColor.GRAY + ": Your gamemode has been updated to 'Adventure!'");
                        player.setGameMode(GameMode.ADVENTURE);
                    }

                    else if (args[0].equalsIgnoreCase("2"))
                    {
                        sender.sendMessage(ChatColor.GREEN + "" +ChatColor.BOLD + "SUCCESS" + ChatColor.GRAY + ": Your gamemode has been updated to 'Adventure!'");
                        player.setGameMode(GameMode.ADVENTURE);
                    }

                    else if (args[0].equalsIgnoreCase("ss"))
                    {
                        sender.sendMessage(ChatColor.GREEN + "" +ChatColor.BOLD + "SUCCESS" + ChatColor.GRAY + ": Your gamemode has been updated to 'Spectator!'");
                        player.setGameMode(GameMode.SPECTATOR);
                    }

                    else if (args[0].equalsIgnoreCase("3"))
                    {
                        sender.sendMessage(ChatColor.GREEN + "" +ChatColor.BOLD + "SUCCESS" + ChatColor.GRAY + ": Your gamemode has been updated to 'Spectator!'");
                        player.setGameMode(GameMode.SPECTATOR);
                    }

                    if (args.length == 2)
                    {

                        if (args[0].equalsIgnoreCase("c"))
                        {
                            sender.sendMessage(ChatColor.GREEN + "" +ChatColor.BOLD + "SUCCESS" + ChatColor.GRAY + ": Your gamemode has been updated to 'Creative!'");
                            player.setGameMode(GameMode.CREATIVE);
                        }

                        if (args[0].equalsIgnoreCase("1"))
                        {
                            sender.sendMessage(ChatColor.GREEN + "" +ChatColor.BOLD + "SUCCESS" + ChatColor.GRAY + ": Your gamemode has been updated to 'Creative!'");
                            player.setGameMode(GameMode.CREATIVE);
                        }

                        else if (args[0].equalsIgnoreCase("s"))
                        {
                            sender.sendMessage(ChatColor.GREEN + "" +ChatColor.BOLD + "SUCCESS" + ChatColor.GRAY + ": Your gamemode has been updated to 'Survival!'");
                            player.setGameMode(GameMode.SURVIVAL);
                        }

                        else if (args[0].equalsIgnoreCase("0"))
                        {
                            sender.sendMessage(ChatColor.GREEN + "" +ChatColor.BOLD + "SUCCESS" + ChatColor.GRAY + ": Your gamemode has been updated to 'Survival!'");
                            player.setGameMode(GameMode.SURVIVAL);
                        }

                        else if (args[0].equalsIgnoreCase("a"))
                        {
                            sender.sendMessage(ChatColor.GREEN + "" +ChatColor.BOLD + "SUCCESS" + ChatColor.GRAY + ": Your gamemode has been updated to 'Adventure!'");
                            player.setGameMode(GameMode.ADVENTURE);
                        }

                        else if (args[0].equalsIgnoreCase("2"))
                        {
                            sender.sendMessage(ChatColor.GREEN + "" +ChatColor.BOLD + "SUCCESS" + ChatColor.GRAY + ": Your gamemode has been updated to 'Adventure!'");
                            player.setGameMode(GameMode.ADVENTURE);
                        }


                        else if (args[0].equalsIgnoreCase("ss"))
                        {
                            sender.sendMessage(ChatColor.GREEN + "" +ChatColor.BOLD + "SUCCESS" + ChatColor.GRAY + ": Your gamemode has been updated to 'Spectator!'");
                            player.setGameMode(GameMode.SPECTATOR);
                        }


                        else if (args[0].equalsIgnoreCase("3"))
                        {
                            sender.sendMessage(ChatColor.GREEN + "" +ChatColor.BOLD + "SUCCESS" + ChatColor.GRAY + ": Your gamemode has been updated to 'Spectator!'");
                            player.setGameMode(GameMode.SPECTATOR);
                        }


                        Player localPlayer1 = Bukkit.getPlayer(args[1]);
                    }
                }
            }
        }
        return true;
    }
}
