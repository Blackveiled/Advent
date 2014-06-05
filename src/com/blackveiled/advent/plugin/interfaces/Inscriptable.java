package com.blackveiled.advent.plugin.interfaces;

/**
 *
 * @author Blackveiled
 */
public interface Inscriptable {

    /**
     * Returns the object itself.
     *
     * @return this
     */
    public Inscription getInscription();

    /**
     * Adds a line of text to the first line. If your inscription type is a
     * tooltip, every 25 characters will be added to the next line.
     *
     * @param line
     */
    public void inscribeLine(String line);

    /**
     * Deletes the line of text at the index you typed.
     *
     * @param i index of the line you wish to remove.
     * @return The line you removed.
     */
    public String removeLine(int i);
}
