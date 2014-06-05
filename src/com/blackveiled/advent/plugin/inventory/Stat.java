package com.blackveiled.advent.plugin.inventory;

import com.blackveiled.advent.plugin.interfaces.Levellable;

/**
 *
 * @author Blackveiled
 */
public class Stat implements Levellable {

    public enum PresetStat {

        LEVEL("Level"),
        STRENGTH("Strength"),
        AGILITY("Agility"),
        INTELLIGENCE("Intelligence"),
        VITALITY("Vitality"),
        RESILIENCE("Resilience");

        private String name;

        private PresetStat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

    }

    private final String name;
    private int level;
    private int experience;
    private int maxExperience;

    /**
     * Creates a stat object which is based off of one of the built-in preset
     * stat enumerators.
     *
     * @param preset PresetStat (internal)
     */
    public Stat(PresetStat preset) {
        this.name = preset.getName();
        this.level = 1;
        this.experience = 0;
        this.maxExperience = 0;
    }

    /**
     * Creates a stat object which is named after the string that you provide in
     * the parameters. If you wish to use a built-in stat, you can use the
     * PresetStat enumerator.
     *
     * @param name String
     */
    public Stat(String name) {
        this.name = name;
        this.level = 1;
        this.experience = 0;
        this.maxExperience = 0;
    }

    // Abstract Methods
    @Override
    public void levelUp() {
        this.level++;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public int getExperience() {
        return this.experience;
    }

    @Override
    public void setMaxExperience(int maxExperience) {
        this.maxExperience = maxExperience;
    }

    @Override
    public int getMaxExperience() {
        return this.maxExperience;
    }

    @Override
    public void addExperience(int e) {
        this.experience = experience + e;
    }

    @Override
    public void subtractExperience(int e) {
        this.experience = experience - e;
    }

    @Override
    public void multiplyExperience(int x) {
        this.experience = experience * x;
    }

    @Override
    public void divideExperience(int d) {
        this.experience = experience / d;
    }

    @Override
    public boolean maxExperienceReached() {
        return this.experience >= this.maxExperience;
    }

    public boolean sameType(Stat stat) {
        return stat.getName().equalsIgnoreCase(this.name);
    }

}
