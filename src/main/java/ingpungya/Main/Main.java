package ingpungya.Main;

import Event.Main.EventUseCode;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(ChatColor.GREEN + "Don't Panic");
        getServer().getPluginManager().registerEvents(new EventUseCode(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println(ChatColor.GREEN + "Panic Now");
    }
}
