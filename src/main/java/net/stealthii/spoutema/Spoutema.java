package net.stealthii.spoutema;

//~--- non-JDK imports --------------------------------------------------------

import org.bukkit.plugin.java.JavaPlugin;

public class Spoutema extends JavaPlugin {
    public void onDisable() {

        // TODO: Place any custom disable code here.
        System.out.println(this + " is now disabled!");
    }

    public void onEnable() {

        // TODO: Place any custom enable code here, such as registering events
        System.out.println(this + " is now enabled!");
    }
}
