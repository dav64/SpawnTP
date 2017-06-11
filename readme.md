SpawnTP 1.0
===========

This Minecraft bukkit plugin will force the players to be teleported on specific location at connect.
Perfect to use in hubs / spawn servers !

Work with 1.11.* Bukkit / Spigot servers

The config is stored in config.yml (default file created after first run)

Here is the default config file for explanation:
```
gamemode: ADVENTURE
ignore:
    tag: noforcespawn
spawn:
    world: world
    x: 0
    y: 0
    z: 0?
```

`gamemode` is the gamemode set to the players at connect. It can be one of: ADVENTURE, CREATIVE, SURVIVAL or SPECTATOR

`ignore` let you some players bypass the plugin and connect at their last location / gamemode by satisfying some conditions.
Currently only player's tag is implemented ie. players with the tag noforcespawn will bypass the plugin.
(you can set the player's tags using the command /scoreboard)

`spawn` let you the spawn world and location.

Feel free to ask if you have any questions :)

