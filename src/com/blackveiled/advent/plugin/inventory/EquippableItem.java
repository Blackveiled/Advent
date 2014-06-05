package com.blackveiled.advent.plugin.inventory;

import com.blackveiled.advent.plugin.interfaces.Attributable;
import com.blackveiled.advent.plugin.interfaces.Inscription;
import com.blackveiled.advent.plugin.interfaces.Item;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.inventory.ItemStack;

/**
 *
 * @author Blackveiled
 */
public enum EquippableItem implements Attributable, Item {

    WOOD_AXE(ItemMaterial.WOOD, ItemType.AXE),
    STONE_AXE(ItemMaterial.STONE, ItemType.AXE),
    IRON_AXE(ItemMaterial.IRON, ItemType.AXE),
    GOLD_AXE(ItemMaterial.GOLD, ItemType.AXE),
    DIAMOND_AXE(ItemMaterial.DIAMOND, ItemType.AXE),
    WOOD_SWORD(ItemMaterial.WOOD, ItemType.SWORD),
    STONE_SWORD(ItemMaterial.STONE, ItemType.SWORD),
    IRON_SWORD(ItemMaterial.IRON, ItemType.SWORD),
    GOLD_SWORD(ItemMaterial.GOLD, ItemType.SWORD),
    DIAMOND_SWORD(ItemMaterial.DIAMOND, ItemType.SWORD),
    WOOD_HOE(ItemMaterial.WOOD, ItemType.HOE),
    STONE_HOE(ItemMaterial.STONE, ItemType.HOE),
    IRON_HOE(ItemMaterial.IRON, ItemType.HOE),
    GOLD_HOE(ItemMaterial.GOLD, ItemType.HOE),
    DIAMOND_HOE(ItemMaterial.DIAMOND, ItemType.HOE),
    WOOD_SPADE(ItemMaterial.WOOD, ItemType.SPADE),
    STONE_SPADE(ItemMaterial.STONE, ItemType.SPADE),
    IRON_SPADE(ItemMaterial.IRON, ItemType.SPADE),
    GOLD_SPADE(ItemMaterial.GOLD, ItemType.SPADE),
    DIAMOND_SPADE(ItemMaterial.DIAMOND, ItemType.SPADE),
    WOOD_PICKAXE(ItemMaterial.WOOD, ItemType.PICKAXE),
    STONE_PICKAXE(ItemMaterial.STONE, ItemType.PICKAXE),
    IRON_PICKAXE(ItemMaterial.IRON, ItemType.PICKAXE),
    GOLD_PICKAXE(ItemMaterial.GOLD, ItemType.PICKAXE),
    DIAMOND_PICKAXE(ItemMaterial.DIAMOND, ItemType.PICKAXE),
    LEATHER_HELMET(ItemMaterial.LEATHER, ItemType.HELMET),
    LEATHER_CHESTPLATE(ItemMaterial.LEATHER, ItemType.CHESTPLATE),
    LEATHER_LEGGINGS(ItemMaterial.LEATHER, ItemType.LEGGINGS),
    LEATHER_BOOTS(ItemMaterial.LEATHER, ItemType.BOOTS),
    IRON_HELMET(ItemMaterial.IRON, ItemType.HELMET),
    IRON_CHESTPLATE(ItemMaterial.IRON, ItemType.CHESTPLATE),
    IRON_LEGGINGS(ItemMaterial.IRON, ItemType.LEGGINGS),
    IRON_BOOTS(ItemMaterial.IRON, ItemType.BOOTS),
    GOLD_HELMET(ItemMaterial.GOLD, ItemType.HELMET),
    GOLD_CHESTPLATE(ItemMaterial.GOLD, ItemType.CHESTPLATE),
    GOLD_LEGGINGS(ItemMaterial.GOLD, ItemType.LEGGINGS),
    GOLD_BOOTS(ItemMaterial.GOLD, ItemType.BOOTS),
    DIAMOND_HELMET(ItemMaterial.DIAMOND, ItemType.HELMET),
    DIAMOND_CHESTPLATE(ItemMaterial.DIAMOND, ItemType.CHESTPLATE),
    DIAMOND_LEGGINGS(ItemMaterial.DIAMOND, ItemType.LEGGINGS),
    DIAMOND_BOOTS(ItemMaterial.DIAMOND, ItemType.BOOTS),
    CHAIN_HELMET(ItemMaterial.CHAIN, ItemType.HELMET),
    CHAIN_CHESTPLATE(ItemMaterial.CHAIN, ItemType.CHESTPLATE),
    CHAIN_LEGGINGS(ItemMaterial.CHAIN, ItemType.LEGGINGS),
    CHAIN_BOOTS(ItemMaterial.CHAIN, ItemType.BOOTS);

    // Item Constructor Information
    private final ItemMaterial material;
    private final ItemType type;
    private Class<? extends Enchantment> enchantment;

    // Item Strings
    private String name;
    private Inscription inscription;

    // Item Statistics
    private int minDamage;
    private int maxDamage;
    private List<Stat> stats;

    // Item Conditionals
    private boolean durable = false;

    private EquippableItem(ItemMaterial material, ItemType type) {
        this.material = material;
        this.type = type;
    }

    private EquippableItem(ItemMaterial material, ItemType type, Class<? extends Enchantment> enchantment) {
        this.material = material;
        this.type = type;
        this.enchantment = enchantment;
    }

    // Internal Methods
    public Inscription getInscriptions() {
        return this.inscription;
    }

    public Class<? extends Enchantment> getEnchantment() {
        return this.enchantment;
    }

    // Abstract Methods
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return type.getType();
    }

    @Override
    public ItemMaterial getMaterial() {
        return this.material;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setIndestructible(boolean durable) {
        this.durable = durable;
    }

    @Override
    public boolean isIndestructible() {
        return this.durable;
    }

    @Override
    public double getDamage() {
        return (Math.random()) * (this.maxDamage - this.minDamage) + this.minDamage;
    }

    @Override
    public ItemStack getItemStack() {
        return null;
    }

    @Override
    public Stat getStat(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void newStat(Stat stat) {
        if (!hasStats()) {
            this.stats = new ArrayList<>();
        }
    }

    @Override
    public void setStat(Stat stat, Stat to) {
        for (int i = 0; i < stats.size(); i++) {
            if (stats.get(i).sameType(stat)) {
                int index = stats.indexOf(stat);
                stats.remove(stat);
                stats.add(index, to);
            }

        }
    }

    @Override
    public boolean hasStats() {
        return this.stats != null;
    }

    @Override
    public boolean containsStat(Stat stat) {
        return stats.contains(stat);
    }

    @Override
    public boolean compareStat(Stat stat, Stat to) {
        return stat.equals(to);
    }

    @Override
    public Stat getStat(Stat stat) {
        for (int i = 0; i < stats.size(); i++) {
            if (stats.get(i).sameType(stat)) {
                return stats.get(i);
            }
        }
        return null;
    }

    public static EquippableItem fromString(String string) {
        String[] s = string.split("_");
        if (s[0].equalsIgnoreCase("WOOD")) {
            if (s[1].equalsIgnoreCase("AXE")) {
                return EquippableItem.WOOD_AXE;
            } else if (s[1].equalsIgnoreCase("SWORD")) {
                return EquippableItem.WOOD_SWORD;
            } else if (s[1].equalsIgnoreCase("SPADE")) {
                return EquippableItem.WOOD_SPADE;
            } else if (s[1].equalsIgnoreCase("HOE")) {
                return EquippableItem.WOOD_HOE;
            } else if (s[1].equalsIgnoreCase("PICKAXE")) {
                return EquippableItem.WOOD_PICKAXE;
            }
        } else if (s[0].equalsIgnoreCase("STONE")) {
            if (s[1].equalsIgnoreCase("AXE")) {
                return EquippableItem.STONE_AXE;
            } else if (s[1].equalsIgnoreCase("SWORD")) {
                return EquippableItem.STONE_SWORD;
            } else if (s[1].equalsIgnoreCase("SPADE")) {
                return EquippableItem.STONE_SPADE;
            } else if (s[1].equalsIgnoreCase("HOE")) {
                return EquippableItem.STONE_HOE;
            } else if (s[1].equalsIgnoreCase("PICKAXE")) {
                return EquippableItem.STONE_PICKAXE;
            }
        } else if (s[0].equalsIgnoreCase("IRON")) {
            if (s[1].equalsIgnoreCase("AXE")) {
                return EquippableItem.IRON_AXE;
            } else if (s[1].equalsIgnoreCase("SWORD")) {
                return EquippableItem.IRON_SWORD;
            } else if (s[1].equalsIgnoreCase("SPADE")) {
                return EquippableItem.IRON_SPADE;
            } else if (s[1].equalsIgnoreCase("HOE")) {
                return EquippableItem.IRON_HOE;
            } else if (s[1].equalsIgnoreCase("PICKAXE")) {
                return EquippableItem.IRON_PICKAXE;
            } else if (s[1].equalsIgnoreCase("HELMET")) {
                return EquippableItem.IRON_HELMET;
            } else if (s[1].equalsIgnoreCase("CHESTPLATE")) {
                return EquippableItem.IRON_CHESTPLATE;
            } else if (s[1].equalsIgnoreCase("LEGGINGS")) {
                return EquippableItem.IRON_LEGGINGS;
            } else if (s[1].equalsIgnoreCase("BOOTS")) {
                return EquippableItem.IRON_BOOTS;
            }
        } else if (s[0].equalsIgnoreCase("GOLD")) {
            if (s[1].equalsIgnoreCase("AXE")) {
                return EquippableItem.GOLD_AXE;
            } else if (s[1].equalsIgnoreCase("SWORD")) {
                return EquippableItem.GOLD_SWORD;
            } else if (s[1].equalsIgnoreCase("SPADE")) {
                return EquippableItem.GOLD_SPADE;
            } else if (s[1].equalsIgnoreCase("HOE")) {
                return EquippableItem.GOLD_HOE;
            } else if (s[1].equalsIgnoreCase("PICKAXE")) {
                return EquippableItem.GOLD_PICKAXE;
            } else if (s[1].equalsIgnoreCase("HELMET")) {
                return EquippableItem.GOLD_HELMET;
            } else if (s[1].equalsIgnoreCase("CHESTPLATE")) {
                return EquippableItem.GOLD_CHESTPLATE;
            } else if (s[1].equalsIgnoreCase("LEGGINGS")) {
                return EquippableItem.GOLD_LEGGINGS;
            } else if (s[1].equalsIgnoreCase("BOOTS")) {
                return EquippableItem.GOLD_BOOTS;
            }
        } else if (s[0].equalsIgnoreCase("DIAMOND")) {
            if (s[1].equalsIgnoreCase("AXE")) {
                return EquippableItem.DIAMOND_AXE;
            } else if (s[1].equalsIgnoreCase("SWORD")) {
                return EquippableItem.DIAMOND_SWORD;
            } else if (s[1].equalsIgnoreCase("SPADE")) {
                return EquippableItem.DIAMOND_SPADE;
            } else if (s[1].equalsIgnoreCase("HOE")) {
                return EquippableItem.DIAMOND_HOE;
            } else if (s[1].equalsIgnoreCase("PICKAXE")) {
                return EquippableItem.DIAMOND_PICKAXE;
            } else if (s[1].equalsIgnoreCase("HELMET")) {
                return EquippableItem.DIAMOND_HELMET;
            } else if (s[1].equalsIgnoreCase("CHESTPLATE")) {
                return EquippableItem.DIAMOND_CHESTPLATE;
            } else if (s[1].equalsIgnoreCase("LEGGINGS")) {
                return EquippableItem.DIAMOND_LEGGINGS;
            } else if (s[1].equalsIgnoreCase("BOOTS")) {
                return EquippableItem.DIAMOND_BOOTS;
            }
        } else if (s[0].equalsIgnoreCase("LEATHER")) {
            if (s[1].equalsIgnoreCase("HELMET")) {
                return EquippableItem.LEATHER_HELMET;
            } else if (s[1].equalsIgnoreCase("CHESTPLATE")) {
                return EquippableItem.LEATHER_CHESTPLATE;
            } else if (s[1].equalsIgnoreCase("LEGGINGS")) {
                return EquippableItem.LEATHER_LEGGINGS;
            } else if (s[1].equalsIgnoreCase("BOOTS")) {
                return EquippableItem.LEATHER_BOOTS;
            }
        } else if (s[0].equalsIgnoreCase("CHAIN")) {
            if (s[1].equalsIgnoreCase("HELMET")) {
                return EquippableItem.CHAIN_HELMET;
            } else if (s[1].equalsIgnoreCase("CHESTPLATE")) {
                return EquippableItem.CHAIN_CHESTPLATE;
            } else if (s[1].equalsIgnoreCase("LEGGINGS")) {
                return EquippableItem.CHAIN_LEGGINGS;
            } else if (s[1].equalsIgnoreCase("BOOTS")) {
                return EquippableItem.CHAIN_BOOTS;
            }
        }
        return null;
    }

}
