/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smiteapiwrapper.models;

import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class Ability {

    private int id;
    private String name;
    private String slot;
    private String icon;
    private String ability_type;
    private String description;
    private ArrayList<String> stats;
    private NamedAPIResource god;

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getAbilityType() {
        return ability_type;
    }

    public void setAbilityType(String ability_type) {
        this.ability_type = ability_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getStats() {
        return stats;
    }

    public void setStats(ArrayList<String> stats) {
        this.stats = stats;
    }

    public NamedAPIResource getGod() {
        return god;
    }

    public void setGod(NamedAPIResource god) {
        this.god = god;
    }

    @Override
    public String toString() {
        return "Ability{" + "id=" + id + ", name=" + name + ", slot=" + slot + ", icon=" + icon + ", ability_type=" + ability_type + ", description=" + description + ", stats=" + stats + ", god=" + god + '}';
    }

}
