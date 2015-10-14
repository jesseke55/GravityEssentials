package net.GravityNetwork.Essentials.Main;

/**
 * Gravity Network imports (VERY ESSENTIAL FOR TO RUN THE PLUGIN FOR NO PROBLEMS AND EVEN USING THE MASSIVE * IMPORT)
 */
import net.GravityNetwork.Essentials.Essentials.Commands.AboutServerCmds.*;
import net.GravityNetwork.Essentials.Essentials.Commands.DonatorCommands.*;
import net.GravityNetwork.Essentials.Essentials.Commands.EssentialCmdss.*;
import net.GravityNetwork.Essentials.Essentials.Commands.ListsCMD.*;
import net.GravityNetwork.Essentials.Essentials.Commands.StaffCmds.*;
import net.GravityNetwork.Essentials.Essentials.Handlers.*;
import net.GravityNetwork.Essentials.Extra.*;
/**
 * End of Gravity Network imports
 */




/**
 * Bukkit imports
 */
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
/**
 * End of bukkit imports
 */


/**
 * Created by Jesse on 6-7-2015.
 */
public class Main extends JavaPlugin implements Listener {

    public static Plugin plugin;


    public void onEnable(){
        plugin = this;



        getLogger().info("");
        getLogger().info("");
        getLogger().info("Loading " + getDescription().getName());
        getLogger().info("Loading all classes and commands!");
        getLogger().info("");
        getLogger().info("");
        getLogger().info("Loading messengers and registers");
        getLogger().info("");
        getLogger().info("");


        Bukkit.getPluginManager().registerEvents(this, this);


        Bukkit.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");

        getLogger().info("");
        getLogger().info("");
        getLogger().info("Loading classes");
        getLogger().info("");
        getLogger().info("");
        Bukkit.getServer().getPluginManager().registerEvents(new Chat(), this);

        Bukkit.getServer().getPluginManager().registerEvents(new Join(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new Leave(), this);


        getLogger().info("");
        getLogger().info("");
        getLogger().info("Classes have been loaded");
        getLogger().info("");
        getLogger().info("");





        getLogger().info("");
        getLogger().info("");
        getLogger().info("");
        getLogger().info("");
        getLogger().info("----------- [ Plugin information ] -----------");
        getLogger().info("");
        getLogger().info("Name: " + getDescription().getName() );
        getLogger().info("");
        getLogger().info("Version: " + getDescription().getVersion() );
        getLogger().info("");
        getLogger().info("Authors: " + getDescription().getAuthors() );
        getLogger().info("");
        getLogger().info("Website: " + getDescription().getWebsite());
        getLogger().info("");
        getLogger().info("----------- [ Plugin information ] -----------");
        getLogger().info("");
        getLogger().info("");
        getLogger().info("");






        // Essentials cmd`s
        getLogger().info("");
        getLogger().info("");
        getLogger().info("Injecting Essentials commands");
        getLogger().info("");
        getLogger().info("");

        /**
         * basic essentials cmds
         */
        getCommand("ping").setExecutor(new Ping() );
        getCommand("rules").setExecutor(new Rules() );
        getCommand("serverip").setExecutor(new ServerIP() );
        getCommand("website").setExecutor(new Website() );

        getCommand("enchanttable").setExecutor(new Enchant() );
        getCommand("enderchest").setExecutor(new Enderchest() );
        getCommand("workbench").setExecutor(new Workbench() );
        /**
         * end of basic essentials cmds
         */

        /**
         * List commands for bungee using the plugin messager inside bukkit/spigot instance
         */

        getCommand("getfactions").setExecutor(new getFactions() );

        getCommand("gethub").setExecutor(new getHub() );

        getCommand("getopfactions").setExecutor(new getOPFactions() );

        getCommand("getopprison").setExecutor(new getOPPrison() );

        getCommand("list").setExecutor(new List() );

        /**
         * end of List commands for bungee using the plugin messager inside bukkit/spigot instance
         */


        /**
         * Staff cmds
         */
        getCommand("clear").setExecutor(new Clear() );

        getCommand("fly").setExecutor(new Fly() );

        getCommand("gamemode").setExecutor(new GameModeCommand() );

        getCommand("gereload").setExecutor(new ReloadPlugin() );

        getCommand("speed").setExecutor(new Speed() );
        /**
         * end staff cmds
         */


// end of essentials cmd`s
        getLogger().info("");
        getLogger().info("");
        getLogger().info("Essentials commands are injected!");
        getLogger().info("");
        getLogger().info("");
        getLogger().info("Thanks for waiting!");
        getLogger().info("");
        getLogger().info("");
        getLogger().info("Has been enabled and loaded!");
        getLogger().info("");
        getLogger().info("");
    }





        @EventHandler
        public void onPlayerLogin(final PlayerLoginEvent e) {
        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            public void run() {
                if (e.getPlayer().hasPlayedBefore()) return;

                Bukkit.getServer().broadcastMessage((ChatColor.translateAlternateColorCodes('&', "&5Welcome &8" + e.getPlayer().getName() + " &5On &4&lGravity Network&5&l!")));



                e.getPlayer().chat(ChatColor.translateAlternateColorCodes('&', "&a&l&nHey i am new here!"));


                e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&5&lHello, " + e.getPlayer().getDisplayName() + " and welcome on"));
                e.getPlayer().sendMessage("");
                e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lGravity Network!"));
                e.getPlayer().sendMessage("");
                e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&bWe hope that you enjoy the server "));
                e.getPlayer().sendMessage("");
                e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&9And stay here"));
                e.getPlayer().sendMessage("");
                e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&9You can always ask your questions to our staff!"));
                e.getPlayer().sendMessage("");
                e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&aFriendly regards,"));

                e.getPlayer().sendMessage("");

                e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lGravity Network &7Staff"));




                Firework f = (Firework) e.getPlayer().getWorld().spawn(e.getPlayer().getLocation(), Firework.class);

                FireworkMeta fm = f.getFireworkMeta();
                fm.addEffect(FireworkEffect.builder()
                        .flicker(false)
                        .trail(true)
                        .with(FireworkEffect.Type.CREEPER)
                        .withColor(Color.GREEN)
                        .withFade(Color.BLUE)
                        .build());
                fm.setPower(3);
                f.setFireworkMeta(fm);
            }
        }, 20);
    }











    @EventHandler
    public void onPlayerCommmandPreprocess(PlayerCommandPreprocessEvent e) {
        Player p = e.getPlayer();
        Player P = e.getPlayer();

        if (e.getMessage().startsWith("/gmc") || e.getMessage().startsWith("gmc")) {
            e.setCancelled(true);
            p.performCommand("/gamemode 1");
        }
        if (e.getMessage().startsWith("/gms") || e.getMessage().startsWith("gms")) {
            e.setCancelled(true);
            p.performCommand("/gamemode 0");
        }
        if (e.getMessage().startsWith("/gma") || e.getMessage().startsWith("gma")) {
            e.setCancelled(true);
            p.performCommand("/gamemode 2");
        }
        if (e.getMessage().startsWith("/gmss") || e.getMessage().startsWith("gmss")) {
            e.setCancelled(true);
            P.performCommand("/gamemode 3");
        }

    }





    }