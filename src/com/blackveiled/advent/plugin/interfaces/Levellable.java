package com.blackveiled.advent.plugin.interfaces;

/**
 *
 * @author Blackveiled
 */
public interface Levellable {

    /**
     * Adds one level to the stat you are applying this function to.
     */
    public void levelUp();

    /**
     * Sets the level to the stat of the level parameter you have provided.
     *
     * @param level integer
     */
    public void setLevel(int level);

    /**
     * Returns the level.
     *
     * @return int Level
     */
    public int getLevel();

    /**
     * Adds the amount of experience you wish to add.
     *
     * @param e
     */
    public void addExperience(int e);

    /**
     * Subtracts the amount of experience you wish to remove.
     *
     * @param e
     */
    public void subtractExperience(int e);

    /**
     * Multiplies the amount of experience you wish to multiply by.
     *
     * @param x
     */
    public void multiplyExperience(int x);

    /**
     * Divides the experience by the amount you wish to divide by.
     *
     * @param d
     */
    public void divideExperience(int d);

    /**
     * Returns true if the experience of this has met or exceeded the maximum
     * experience.
     *
     * @return
     */
    public boolean maxExperienceReached();

    /**
     * Sets the experience to the amount you provide.
     *
     * @param experience
     */
    public void setExperience(int experience);

    /**
     * Returns the experience this has.
     *
     * @return
     */
    public int getExperience();

    /**
     * Sets the max experience of this to the amount you wish.
     *
     * @param maxExperience
     */
    public void setMaxExperience(int maxExperience);

    /**
     * Returns the max experience of this.
     *
     * @return
     */
    public int getMaxExperience();

    /**
     * Returns the name of this.
     *
     * @return
     */
    public String getName();

}
