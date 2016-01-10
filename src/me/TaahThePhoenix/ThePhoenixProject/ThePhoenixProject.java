package me.TaahThePhoenix.ThePhoenixProject;

import java.util.logging.Logger;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class ThePhoenixProject extends JavaPlugin {
    
    @Override
    public void onEnable() {
        PluginDescriptionFile pdfFile = getDescription();
        Logger logger = Logger.getLogger("Minecraft");
        
        logger.info(pdfFile.getName() + " has been enabled (V." + pdfFile.getVersion() + ")");
    }
    
    @Override
    public void onDisable() {
        PluginDescriptionFile pdfFile = getDescription();
        Logger logger = Logger.getLogger("Minecraft");
        
        logger.info(pdfFile.getName() + " has been disabled (V." + pdfFile.getVersion() + ")");
    }
    }
