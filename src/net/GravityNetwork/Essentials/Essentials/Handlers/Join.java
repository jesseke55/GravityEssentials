package net.GravityNetwork.Essentials.Essentials.Handlers;

import net.GravityNetwork.Essentials.Main.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by Jesse Geerts on 15-7-2015.
 * YOU MAY NOT COPY/STEAL THE CODE WITHOUT ANY PERMISSION!
 */
public class Join implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();

        e.setJoinMessage(ChatColor.translateAlternateColorCodes('&', "&6&l" + p.getName() + " Has joined &4&lGravity Network"));
    }
}
