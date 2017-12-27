package re.dbn.david191212.spawntp;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PluginListener implements Listener
{
	private Main plugin;
	
	public PluginListener(Main plugin)
	{
	  this.plugin = plugin;
	}
	
	@EventHandler(priority=EventPriority.HIGHEST)
	public void onPlayerJoin(PlayerJoinEvent e)
	{
		Player player = e.getPlayer();
		
		Boolean bypass = (player.getScoreboardTags().contains(plugin.ignoretag)
			|| player.hasPermission(plugin.ignorepermission));
		
		// If player does have at least one bypass permission
		if (!bypass)
		{
			player.setGameMode(plugin.gamemode);
			player.teleport(this.plugin.spawn);
		}
	}
}