package com.maxisociety.AC;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class ACMain extends JavaPlugin {
	public void onEnable() {
		// Diamond Horse Armor
		loadConfig();
		if (getConfig().getBoolean("enable.horsearmorcrafting")) {

			ShapedRecipe diamondHorse = new ShapedRecipe(new ItemStack(
					Material.DIAMOND_BARDING));

			diamondHorse.shape("!!#", "#%#", "###");
			diamondHorse.setIngredient('#', Material.DIAMOND);
			diamondHorse.setIngredient('%', Material.WOOL);
			// Iron Horse Armor

			ShapedRecipe ironHorse = new ShapedRecipe(new ItemStack(
					Material.IRON_BARDING));

			ironHorse.shape("!!#", "#%#", "###");
			ironHorse.setIngredient('#', Material.IRON_INGOT);
			ironHorse.setIngredient('%', Material.WOOL);
			// Gold Horse Armor

			ShapedRecipe goldHorse = new ShapedRecipe(new ItemStack(
					Material.GOLD_BARDING));

			goldHorse.shape("!!#", "#%#", "###");
			goldHorse.setIngredient('#', Material.GOLD_INGOT);
			goldHorse.setIngredient('%', Material.WOOL);

			Bukkit.getServer().addRecipe(goldHorse);
			Bukkit.getServer().addRecipe(ironHorse);
			Bukkit.getServer().addRecipe(diamondHorse);
		}
		if (getConfig().getBoolean("enable.nametagcrafting")) {
			// Nametag Crafting

			ShapedRecipe nametagslot1 = new ShapedRecipe(new ItemStack(
					Material.NAME_TAG));

			nametagslot1.shape("PIS", "!!!", "!!!");
			nametagslot1.setIngredient('P', Material.PAPER);
			nametagslot1.setIngredient('I', Material.IRON_INGOT);
			nametagslot1.setIngredient('S', Material.STRING);

			ShapedRecipe nametagslot2 = new ShapedRecipe(new ItemStack(
					Material.NAME_TAG));

			nametagslot2.shape("!!!", "PIS", "!!!");
			nametagslot2.setIngredient('P', Material.PAPER);
			nametagslot2.setIngredient('I', Material.IRON_INGOT);
			nametagslot2.setIngredient('S', Material.STRING);

			ShapedRecipe nametagslot3 = new ShapedRecipe(new ItemStack(
					Material.NAME_TAG));

			nametagslot3.shape("!!!", "!!!", "PIS");
			nametagslot3.setIngredient('P', Material.PAPER);
			nametagslot3.setIngredient('I', Material.IRON_INGOT);
			nametagslot3.setIngredient('S', Material.STRING);

			Bukkit.getServer().addRecipe(nametagslot1);
			Bukkit.getServer().addRecipe(nametagslot2);
			Bukkit.getServer().addRecipe(nametagslot3);
		}

		if (getConfig().getBoolean("enable.saddlecrafting")) {
			ShapedRecipe saddle = new ShapedRecipe(new ItemStack(
					Material.SADDLE));

			saddle.shape("!!!", "LIL", "!L!");
			saddle.setIngredient('I', Material.IRON_INGOT);
			saddle.setIngredient('L', Material.LEATHER);
			Bukkit.getServer().addRecipe(saddle);
		}

	}

	public void onDisable() {

	}

	public void loadConfig() {
		getConfig().options().copyDefaults(true);
		getConfig().addDefault("enable.horsearmorcrafting", true);
		getConfig().addDefault("enable.nametagcrafting", true);
		getConfig().addDefault("enable.saddlecrafting", false);
		saveConfig();
	}
}
