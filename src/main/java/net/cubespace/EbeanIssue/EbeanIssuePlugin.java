package net.cubespace.EbeanIssue;

import net.cubespace.EbeanIssue.Database.Entity.TableA;
import net.cubespace.EbeanIssue.Database.Entity.TableB;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

/**
 * @author geNAZt (fabian.fassbender42@googlemail.com)
 * @date Last changed: 31.10.13 13:09
 */
public class EbeanIssuePlugin extends JavaPlugin {
    public void onEnable() {
        getLogger().info("Loaded Database: " + getDatabase().getName());


        installDDL();
    }

    public List<Class<?>> getDatabaseClasses() {
        ArrayList<Class<?>> classes = new ArrayList<Class<?>>();
        classes.add(TableA.class);
        classes.add(TableB.class);

        return classes;
    }
}
