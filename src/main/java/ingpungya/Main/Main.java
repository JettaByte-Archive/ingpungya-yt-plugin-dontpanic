//패키지
package ingpungya.Main;

//임포트
import Event.Main.EventUseCode;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        //실행 메세지
        System.out.println(ChatColor.GREEN + "Don't Panic");
        //이벤트 처리
        getServer().getPluginManager().registerEvents(new EventUseCode(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        //종료 메세지
        System.out.println(ChatColor.GREEN + "Panic Now");
    }
}
