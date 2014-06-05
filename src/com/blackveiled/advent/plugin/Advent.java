package com.blackveiled.advent.plugin;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Blackveiled
 */
public class Advent extends JavaPlugin {

    private List<Integer> users = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Advent has been initiated.");
    }

    @Override
    public void onEnable() {

        // Adjust later// // // // //
        this.getServer().getServicesManager().register(null, this, this, ServicePriority.Normal);
        // // // // // // // // // //
        this.getLogger().log(Level.INFO, "Advent has been loaded!");
    }

}
