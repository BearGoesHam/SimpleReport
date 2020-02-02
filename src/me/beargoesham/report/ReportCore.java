package me.beargoesham.report;

import org.bukkit.plugin.java.JavaPlugin;

public class ReportCore extends JavaPlugin
{
    private ReportCore instance;

    public ReportCore getInstance()
    {
        return this.instance;
    }

    public void onEnable()
    {
        instance = this;


        registerCommands();

        System.out.println("-----------------------------");
        System.out.println("    Simple Report Started    ");
        System.out.println("       By: BearGoesHam       ");
        System.out.println("-----------------------------");
    }

    public void onDisable()
    {
        instance = null;
    }


    public void registerCommands()
    {
        getCommand("report").setExecutor(new ReportCmd());
    }





}
