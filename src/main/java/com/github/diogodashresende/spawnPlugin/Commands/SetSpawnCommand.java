package com.github.diogodashresende.spawnPlugin.Commands;

import com.github.diogodashresende.spawnPlugin.SpawnPlugin;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawnCommand implements CommandExecutor {
    private SpawnPlugin plugin;
    public SetSpawnCommand(SpawnPlugin plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player p){
            Location l = p.getLocation();

            //1.salvar pelas cordenadas x , y , z e etc
            //plugin.getConfig().set("spawn.x", l.getBlockX());
            //plugin.getConfig().set("spawn.y", l.getBlockY());
            //plugin.getConfig().set("spawn.z", l.getBlockZ());
            //plugin.getConfig().set("spawn.world", l.getWorld().getName());


            //2.salvar o objeto Location diretamente
            plugin.getConfig().set("spawn", l);
            plugin.saveConfig();
            p.sendMessage(ChatColor.GREEN + "Spawn has been set!");
        }else{
            System.out.println("You are not a player!");
        }

        return true;
    }
}
