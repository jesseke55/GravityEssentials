package net.GravityNetwork.Essentials.Essentials.Handlers;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * Created by Jesse Geerts on 15-7-2015.
 * YOU MAY NOT COPY/STEAL THE CODE WITHOUT ANY PERMISSION!
 */
public class Leave implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent e){
        Player p = e.getPlayer();

        e.setQuitMessage(ChatColor.translateAlternateColorCodes('&', "&c&l" + p.getName() + " &4&lHas left Gravity Network"));
    }

    @EventHandler
    public void onKick(PlayerKickEvent e){
        Player p = e.getPlayer();

        e.setLeaveMessage(ChatColor.translateAlternateColorCodes('&', "&c&l" + p.getName() + " &4&lHas left Gravity Network"));
    }
}
