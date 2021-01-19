package org.imanity.bukkit.starterproject;

import org.imanity.framework.ClasspathScan;
import org.imanity.framework.bukkit.plugin.BukkitPlugin;
import org.imanity.framework.plugin.Plugin;
import org.imanity.framework.plugin.PluginLoadOrder;
import org.imanity.framework.plugin.PluginType;

@Plugin(
        name = "example",                                     // Plugin Name
        version = "1.0.0",                                    // Version
        description = "The example description",              // Descriptions
        load = PluginLoadOrder.POSTWORLD,                     // Plugin Load Order
        authors = "LeeGod",                                   // Authors
//      depends = @PluginDependency("MyDependency")           // Dependency
//      @PluginDependency("MySoftDependency", soft = true)    // For Soft Dependency
//      loadBefore = "SomePlugin",
        type = PluginType.BUKKIT                              // Type
)
@ClasspathScan("org.imanity.bukkit.starterproject") // Replace it with your package name
public class Starter extends BukkitPlugin {

    @Override
    public void onPreEnable() {
        // Before Imanity Framework initalize this plugin
    }

    @Override
    public void onPluginEnable() {
        // After Imanity Framework initalize to this plugin
    }

    @Override
    public void onPluginDisable() {
        // Plugin shutdown, and Before Imanity Framework shut down
    }

    @Override
    public void onFrameworkFullyDisable() {
        // After Imanity Framework fully shut down
    }

}
