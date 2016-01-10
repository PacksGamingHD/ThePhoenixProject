package me.TaahThePhoenix.ThePhoenixProject.Commands;

import me.TaahThePhoenix.ThePhoenixProject.ThePhoenixProject;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_tpp extends ThePhoenixProject {
    
    public boolean run(CommandSender sender, Player player, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        player.sendMessage(ChatColor.GOLD + "ThePhoenixProject made by TaahThePhoenix");
        player.sendMessage(ChatColor.RED + "Note that this is a plugin similar to a managing plugin.");
                player.sendMessage(ChatColor.RED + "By managing, I mean like commands like /cage from TFM but made from scratch.");
                player.sendMessage(ChatColor.GOLD + "Please note that this plugin is still in beta and is NOT open source.");
        
        return true;
    
}
}
