/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blackveiled.advent.plugin.inventory;

/**
 *
 * @author Blackveiled
 */
public enum ItemType {

    AXE("Axe"), SWORD("Sword"), SPADE("Shovel"), HOE("Hoe"), PICKAXE("Pickaxe"), HELMET("Helmet"), CHESTPLATE("Chestplate"), LEGGINGS("Leggings"), BOOTS("Boots"), BLOCK("Block"), POTION("Potion"), EGG("Egg"), DISC("Disc"), GEM("Gem"), INGOT("Ingot"), ORE("Ore"), PLANT("Plant"), CROP("Crop"), FOOD("Food"), ENCHANTMENT("Enchantment"), EXPLOSIVE("Explosive"), NOTE("Note"), BOOK("Book"), TOOL("Tool"), OBJECT("Object");

    private String type;

    private ItemType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return this.type;
    }

}
