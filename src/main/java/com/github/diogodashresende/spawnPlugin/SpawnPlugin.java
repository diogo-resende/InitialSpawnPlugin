package com.github.diogodashresende.spawnPlugin;

import com.github.diogodashresende.spawnPlugin.Commands.SetSpawnCommand;
import com.github.diogodashresende.spawnPlugin.Commands.SpawnCommand;
import com.github.diogodashresende.spawnPlugin.Listeners.SpawnListener;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpawnPlugin extends JavaPlugin {



    @Override
    public void onEnable() {
        //config.yml
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getCommand("setspawn").setExecutor(new SetSpawnCommand(this));
        getCommand( "spawn").setExecutor(new SpawnCommand(this));
        getServer().getPluginManager().registerEvents(new SpawnListener(this), this);
    }
}
