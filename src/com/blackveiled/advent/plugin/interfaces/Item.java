package com.blackveiled.advent.plugin.interfaces;

import com.blackveiled.advent.plugin.inventory.ItemMaterial;
import org.bukkit.inventory.ItemStack;

/**
 *
 * @author Blackveiled
 */
public interface Item {

    public String getName();

    public void setName(String name);

    public String getType();

    public ItemMaterial getMaterial();

    public void setIndestructible(boolean durable);

    public boolean isIndestructible();

    /**
     * Returns a random value of damage between the range of your item's damage.
     *
     * @return (Math.random()) * (maxDamage - minDamage) + minDamage
     */
    public double getDamage();

    public ItemStack getItemStack();

}
