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
		
		// If player do not have the requested tag
		if (!player.getScoreboardTags().contains(plugin.ignoretag))
		{
			player.setGameMode(plugin.gamemode);
			player.teleport(this.plugin.spawn);
		}
	}
}