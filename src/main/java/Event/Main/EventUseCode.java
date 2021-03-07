//패키지
package Event.Main;

//임포트

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventUseCode implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        //접속 메세지
        Bukkit.broadcastMessage(ChatColor.YELLOW + "안녕하세요!" + event.getPlayer().getName() + ChatColor.BLUE + "님!");
        //접속 메세지 2
        event.setJoinMessage("Quick Mc was already running");
        //플레이어 정보 표시로 최소한의 치트 예방
        int viewdis = event.getPlayer().getClientViewDistance();
        String viewdisst = Integer.toString(viewdis);
        String pclinetbr = event.getPlayer().getClientBrandName();
        System.out.println(ChatColor.RED + "플레이어 시야범위" + viewdisst + "플레이어 클라이언트 브랜드" + pclinetbr + "바닐라와 다르며 안티치트 감지시 의심 가능");
    }
}

