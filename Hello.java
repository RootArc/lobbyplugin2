package azisaba.lobbyplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

class Welcome implements Listener {
}



public class Hello implements Listener {
    @EventHandler
    public void Welcome(PlayerLoginEvent event) {
        Player player = event.getPlayer();
        player.sendMessage("アジ鯖へようこそ！");
    }
}