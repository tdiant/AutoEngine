package tdiant.bukkit.autoengine;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class AutoEngine extends JavaPlugin {

    private static AutoEngine instance;

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        getLogger().info(ChatColor.GREEN + "AutoEngine is enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.RED + "AutoEngine is disabled!");
    }
}
