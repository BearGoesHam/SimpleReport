package me.beargoesham.report;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReportCmd implements CommandExecutor
{
    String reason;
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        Player p = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("report"))
        {
            if(args.length >= 2)
            {
                Player target = Bukkit.getPlayer(args[0]);
                if(target != null)
                {
                    for(int i = 1; i < args.length; i++)
                    {
                        reason = args[i] + " ";
                    }
                    for(Player players : Bukkit.getServer().getOnlinePlayers())
                    {
                        if(players.hasPermission("simplereport.notify"))
                        {
                            players.sendMessage(ChatColor.translateAlternateColorCodes('&',
                                    ReportCore.getInstance().getConfig().getString("messages.format").replaceAll("%player_name%", p.getName())
                                            .replaceAll("%target_name%", target.getName())
                                            .replaceAll("%reason%", reason)));
                        }
                    }
                }else
                {
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&',
                            ReportCore.getInstance().getConfig().getString("messages.error_player_invalid")));
                }

            }else
            {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&',
                        ReportCore.getInstance().getConfig().getString("messages.error_arguments")));
            }
            p.sendMessage(ChatColor.translateAlternateColorCodes('&',
                    ReportCore.getInstance().getConfig().getString("messages.sent")));
        }

        return false;
    }

}
