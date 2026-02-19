package com.github.diogodashresende.spawnPlugin.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.plugin.Plugin;

public class SpawnListener implements Listener {
    private Plugin plugin;
    public SpawnListener(Plugin plugin) {
        this.plugin = plugin;
    }
    Location location = plugin.getConfig().getLocation("spawn");

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        if(!e.getPlayer().hasPlayedBefore()) {

            Player p = e.getPlayer();

            if(location != null){
                p.teleport(location);
                p.sendMessage(ChatColor.GOLD + "You teleported to spawn!");
            }
        }
    }
    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent e) {
        //quando player morrer volta o player para o spawn(se o spawn estiver setado)
        Location l = plugin.getConfig().getLocation("spawn");
        if(location!=null){
            e.setRespawnLocation(location);
        }
    }
}
