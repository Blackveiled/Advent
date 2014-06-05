package com.blackveiled.advent.plugin.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Blackveiled
 */
public enum Inscription implements Inscriptable {

    TOOLTIP("Tooltip"), COMMAND_MENU("Command Menu");

    private final String type;
    private List<String> inscription = new ArrayList<>();

    private Inscription(String type) {
        this.type = type;
    }

    /**
     * Returns true if this inscription is a Tooltip.
     *
     * @return true/false
     */
    public boolean isTooltip() {
        return this.type.equalsIgnoreCase(Inscription.TOOLTIP.toString());
    }

    /**
     * Returns true if this inscription is a Command Menu.
     *
     * @return
     */
    public boolean isCommandMenu() {
        return this.type.equalsIgnoreCase(Inscription.COMMAND_MENU.toString());
    }

    @Override
    public Inscription getInscription() {
        return this;
    }

    @Override
    public void inscribeLine(String line) {
        inscription.add(line);
    }

    @Override
    public String removeLine(int i) {
        return inscription.remove(i);
    }

    @Override
    public String toString() {
        return this.type;
    }

}
