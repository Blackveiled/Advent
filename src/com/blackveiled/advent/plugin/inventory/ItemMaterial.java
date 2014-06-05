package com.blackveiled.advent.plugin.inventory;

/**
 *
 * @author Blackveiled
 */
public enum ItemMaterial {

    WOOD("WOOD", "Wood"),
    STONE("STONE", "Stone"),
    IRON("IRON", "Iron"),
    GOLD("GOLD", "Gold"),
    DIAMOND("DIAMOND", "Diamond"),
    LEATHER("LEATHER", "Leather"),
    CHAIN("CHAIN", "Chain");

    private final String material;
    private final String name;

    private ItemMaterial(String material, String name) {
        this.material = material;
        this.name = name;
    }

    public ItemMaterial getItemMaterial() {
        return this;
    }

    public String getName() {
        return this.name;
    }

    public String getMaterial() {
        return this.material;
    }

    public boolean sameMaterial(ItemMaterial material) {
        return material.getItemMaterial() != this;
    }

    // Abstract Methods
    @Override
    public String toString() {
        return this.name;
    }
}
