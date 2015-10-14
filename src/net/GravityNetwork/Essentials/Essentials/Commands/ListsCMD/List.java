package net.GravityNetwork.Essentials.Essentials.Commands.ListsCMD;

import net.GravityNetwork.Essentials.Main.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

/**
 * Created by jesse.
 * Created at: 14-10-15, 17:58.
 */
public class List implements CommandExecutor {


    public void onPluginMessageReceived(String channel, Player player, byte[] message) {
        if (!channel.equals("BungeeCord")) return;

        try {
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(message));
            String command = in.readUTF();

            if (command.equals("PlayerCount")) {
                String server = in.readUTF();
                int playerCount = in.readInt();

                System.out.println("Server " + server + " has " + playerCount + " player(s) online.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (cmd.getName().equalsIgnoreCase("list")) {
            String server = "ALL";

            if (args.length > 0) {
                server = args[0];
            }

            try {
                ByteArrayOutputStream b = new ByteArrayOutputStream();
                DataOutputStream out = new DataOutputStream(b);

                out.writeUTF("PlayerCount");
                out.writeUTF(server);

                Bukkit.getServer().sendPluginMessage(Main.plugin, "BungeeCord", b.toByteArray());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return true;
    }
}
