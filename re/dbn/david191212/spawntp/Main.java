package re.dbn.david191212.spawntp;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin 
{
  static Main main;
  public Location spawn;
  public String ignoretag;
  public Permission ignorepermission;
  public GameMode gamemode;
  private PluginListener plistener = new PluginListener(this);
  
  public void onEnable()
  {
	// Init default config values
    getConfig().addDefault("gamemode", "ADVENTURE");
    getConfig().addDefault("ignore.tag", "noforcespawn");
    getConfig().addDefault("ignore.permission", "spawntp.bypass");
    getConfig().addDefault("spawn.world", "world");
    getConfig().addDefault("spawn.x", Integer.valueOf(0));
    getConfig().addDefault("spawn.y", Integer.valueOf(0));
    getConfig().addDefault("spawn.z", Integer.valueOf(0));
    getConfig().options().copyDefaults(true);
    saveConfig();
    
    this.spawn = new Location(
		Bukkit.getWorld(getConfig().getString("spawn.world")), 
		Integer.valueOf(getConfig().getInt("spawn.x"))+0.5, 
		Integer.valueOf(getConfig().getInt("spawn.y")), 
		Integer.valueOf(getConfig().getInt("spawn.z"))+0.5
	);
    this.ignoretag = getConfig().getString("ignore.tag");
    this.ignorepermission = new Permission(getConfig().getString("ignore.permission"));
    this.gamemode = GameMode.valueOf(getConfig().getString("gamemode"));
    
    getServer().getPluginManager().registerEvents(this.plistener, this);
  }
}
