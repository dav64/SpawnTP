SpawnTP 1.0
===========

This Minecraft bukkit plugin will force the players to be teleported on specific location at connect.
Perfect to use in hubs / lobby servers !

Work with 1.11+ Bukkit / Spigot servers

The config is stored in config.yml (default file created after first run)

Here is the default config file for explanation:
```
gamemode: ADVENTURE
ignore:
    tag: noforcespawn
    permission: spawntp.bypass
spawn:
    world: world
    x: 0
    y: 0
    z: 0
```

`gamemode` is the gamemode set to the players at connect. It can be one of: ADVENTURE, CREATIVE, SURVIVAL or SPECTATOR

`ignore` let you some players bypass the plugin and connect at their last location / gamemode by satisfying some conditions.
Currently there are 2 bypass ways :
- player's tag is implemented e.g. players with the tag noforcespawn will bypass the plugin.
(you can set the player's tags using the command /scoreboard)
- player have some permission e.g. players which have permission node spawntp.bypass will bypass the plugin

`spawn` let you choose the spawn world and location.

Feel free to ask if you have any questions :)

