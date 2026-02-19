![Java](https://img.shields.io/badge/Java-17-blue)
![Spigot](https://img.shields.io/badge/Spigot-API-orange)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![Status](https://img.shields.io/badge/status-active-success)

# InitialSpawnPlugin

A lightweight and simple spawn management plugin for Spigot servers.

## ✨ Features

- Set a custom server spawn location
- Teleport players to spawn using a command
- Automatically teleport first-time players to spawn
- Set respawn location to the configured spawn point

---

## 📌 Commands

### `/setspawn`
Sets the server spawn location to the player's current position.

- Saves the full `Location` object directly into the config file
- Automatically creates the `spawn` section in `config.yml`

### `/spawn`
Teleports the player to the configured spawn location.

- If no spawn is set, the player is notified

---

## 🔄 Automatic Behavior

### 🆕 First Join
If a player joins the server for the first time:
- They are automatically teleported to the configured spawn.

### 💀 Player Respawn
If a player dies:
- Their respawn location is set to the configured spawn (if available).

---

## ⚙ Configuration

The spawn location is stored in `config.yml` as a serialized `Location` object:

```yaml
spawn:
  world: world
  x: 100.5
  y: 64.0
  z: -30.5
  yaw: 90.0
  pitch: 0.0
```
##🛠 Built With

Java

Spigot API

Maven

##📂 Project Structure
com.github.diogodashresende.spawnPlugin
 ├── Commands
 │    ├── SpawnCommand
 │    └── SetSpawnCommand
 ├── Listeners
 │    └── SpawnListener
 └── SpawnPlugin (main class)

 ###🚀 Installation
1.Build the project using Maven:
Maven - LifeCycle - run [package]

2.Move the generated .jar file from the /target folder into your server's /plugins directory.

3. Restart the server.

 📖 Future Improvements

Permission system support

Configurable join messages

Multi-world spawn support

Delayed teleport with countdown

Sound and particle effects on teleport
 
