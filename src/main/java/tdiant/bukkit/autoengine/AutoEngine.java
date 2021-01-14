package tdiant.bukkit.autoengine;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import tdiant.bukkit.autoengine.command.MainCommand;

public class AutoEngine extends JavaPlugin {

    private static AutoEngine instance;

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        //listeners

        //commands
        this.getServer().getPluginCommand("autoengine").setExecutor(new MainCommand());

        getLogger().info(ChatColor.GREEN + "AutoEngine is enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.RED + "AutoEngine is disabled!");
    }
}
