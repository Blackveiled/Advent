package com.blackveiled.advent.plugin.interfaces;

import com.blackveiled.advent.plugin.inventory.Stat;

/**
 *
 * @author Blackveiled
 */
public interface Attributable {

    public Stat getStat(int i);

    public void newStat(Stat stat);

    public void setStat(Stat stat, Stat to);

    public boolean hasStats();

    public boolean containsStat(Stat stat);

    public boolean compareStat(Stat stat, Stat to);

    public Stat getStat(Stat stat);
}
