package me.alzen.bundleitem;

import me.alzen.bundleitem.bstats.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class BundleItemPlugin extends JavaPlugin {

    private String line = "=============================";
    @Override
    public void onEnable() {
        // Plugin startup logic
        int pluginID = 19631;
        Metrics metrics = new Metrics(this, pluginID);

        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(this, "bundle"), new ItemStack(Material.BUNDLE, 1));
        recipe.shape("ABA","B B", "BBB");
        recipe.setIngredient('A', Material.STRING);
        recipe.setIngredient('B', Material.RABBIT_HIDE);
        Bukkit.addRecipe(recipe);

        getLogger().info(line);
        getLogger().info("Bundle Plugin Enabled!");
        getLogger().info(line);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info(line);
        getLogger().info("Bundle Plugin Disabled!");
        getLogger().info(line);
    }
}
