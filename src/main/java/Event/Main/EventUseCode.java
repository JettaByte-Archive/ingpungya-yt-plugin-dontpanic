package Event.Main;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class EventUseCode implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Bukkit.broadcastMessage(ChatColor.YELLOW + "안녕하세요!" + event.getPlayer().getName() + ChatColor.BLUE + "님!");
        //플레이어 정보 가져오기
        event.setJoinMessage("Quick Mc was already running");
        int viewdis = event.getPlayer().getClientViewDistance();
        String viewdisst = Integer.toString(viewdis);
        String pclinetbr = event.getPlayer().getClientBrandName();
        System.out.println(ChatColor.RED + "플레이어 시야범위" + viewdisst + "플레이어 클라이언트 브랜드" + pclinetbr + "바닐라와 다르며 안티치트 감지시 의심 가능");
    }
}

