package me.tifu.plugin;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Time implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("day")){
			if(sender.hasPermission("plugin.time")){
				World w = ((Player) sender).getWorld();
				w.setTime(12000);
			}
		}
		if(cmd.getName().equalsIgnoreCase("night")){
			if(sender.hasPermission("plugin.time")){
				World w = ((Player) sender).getWorld();
				w.setTime(14000);
			}
		}
		return false;
	}	
}