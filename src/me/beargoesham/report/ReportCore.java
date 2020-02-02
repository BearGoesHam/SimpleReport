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

        System.out.println("-----------------------------");
        System.out.println("    Simple Report Started    ");
        System.out.println("       By: BearGoesHam       ");
        System.out.println("-----------------------------");


    }





}
