package net.GravityNetwork.Essentials.Extra;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 * Created by Jesse on 7-7-2015.
 */
public class Chat implements Listener {

    @EventHandler(priority= EventPriority.HIGHEST)
    public void onChat(AsyncPlayerChatEvent event){
        Player p = event.getPlayer();
        {
            event.setFormat(ChatColor.translateAlternateColorCodes('&', "&6%s &3>> &6%s"));
        }
        if (p.hasPermission("gravitynetwork.chat.gravity")){
            event.setFormat(ChatColor.translateAlternateColorCodes('&', "&8&l[&9Gravity&8&l] &6&l%s &3>> &6%s"));
        }
        if (p.hasPermission("gravitynetwork.chat.gravityvip")){{
            event.setFormat(ChatColor.translateAlternateColorCodes('&', "&8&l[&9Gravity &6&lVIP&8&l] &6&l%s &3>> &6%s"));
        }
        if (p.hasPermission("gravitynetwork.chat.gravityhero")){{
            event.setFormat(ChatColor.translateAlternateColorCodes('&', "&8&l[&9Gravity &6&lHERO&8&l] &6&l%s &3>> &6%s"));
        }
        if (p.hasPermission("gravitynetwork.chat.gravityelite")){{
            event.setFormat(ChatColor.translateAlternateColorCodes('&', "&8&l[&9Gravity &6&lELTIE&8&l] &6&l%s &3>> &6%s"));
        }
        if (p.hasPermission("gravitynetwork.chat.builder")){{
            event.setFormat(ChatColor.translateAlternateColorCodes('&', "&8&l[&9Builder&8&l] &6&l%s &3>> &6%s"));
        }
        if (p.hasPermission("gravitynetwork.chat.helper")){{
            event.setFormat(ChatColor.translateAlternateColorCodes('&', "&8&l[&6Helper&8&l] &6&l%s &3>> &6%s"));
        }
        if (p.hasPermission("gravitynetwork.chat.mod")){
            {
                event.setFormat(ChatColor.translateAlternateColorCodes('&', "&8&l[&bMod&8&l] &6&l%s &3>> &6%s"));
            }
            if (p.hasPermission("gravitynetwork.chat.admin")){
                {
                    event.setFormat(ChatColor.translateAlternateColorCodes('&', "&8&l[&4Admin&8&l] &6&l%s &3>> &6%s"));
                }
                if (p.hasPermission("gravitynetwork.chat.owner")) {
                    {
                        event.setFormat(ChatColor.translateAlternateColorCodes('&', "&8&l[&a&lOwner&8&l] &6&l%s &3>> &6%s"));
                    }


                }
            }
        }
        }
        }
        }
        }
        }
    }
}