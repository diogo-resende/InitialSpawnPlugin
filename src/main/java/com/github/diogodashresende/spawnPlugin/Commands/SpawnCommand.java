package com.github.diogodashresende.spawnPlugin.Commands;

import com.github.diogodashresende.spawnPlugin.SpawnPlugin;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {
    private final SpawnPlugin plugin;
    public SpawnCommand(SpawnPlugin plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player p){
            Location location = plugin.getConfig().getLocation("spawn");

            if(location != null){

                p.teleport(location);
                p.sendMessage(ChatColor.GOLD + "You teleported to spawn!");
            }else {
                p.sendMessage(ChatColor.RED + "there's no spawn point set. Use /spawn setspawn");
            }
        }
        return true;
    }
}
