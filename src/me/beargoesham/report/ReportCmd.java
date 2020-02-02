package me.beargoesham.report;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReportCmd implements CommandExecutor
{

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        Player p = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("report"))
        {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cWorks."));
        }

        return false;
    }

}
