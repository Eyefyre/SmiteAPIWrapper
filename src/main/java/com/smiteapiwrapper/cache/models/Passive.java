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
public class Passive {

    private int id;
    private String name;
    private String picture;
    private ArrayList<String> item_types;
    private int item_tier;
    private int cost;
    private int total_cost;
    private ArrayList<String> passives;
    private ArrayList<String> stat_changes;
    private ArrayList<NamedAPIResource> previous_tiers;
    private ArrayList<NamedAPIResource> next_tiers;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPicture() {
        return picture;
    }

    public ArrayList<String> getItemTypes() {
        return item_types;
    }

    public int getItemTier() {
        return item_tier;
    }

    public int getCost() {
        return cost;
    }

    public int getTotalCost() {
        return total_cost;
    }

    public ArrayList<String> getPassives() {
        return passives;
    }

    public ArrayList<String> getStatChanges() {
        return stat_changes;
    }

    public ArrayList<NamedAPIResource> getPreviousTiers() {
        return previous_tiers;
    }

    public ArrayList<NamedAPIResource> getNextTier() {
        return next_tiers;
    }

    @Override
    public String toString() {
        return "Passive{" + "id=" + id + ", name=" + name + ", picture=" + picture + ", item_types=" + item_types + ", item_tier=" + item_tier + ", cost=" + cost + ", total_cost=" + total_cost + ", passives=" + passives + ", stat_changes=" + stat_changes + ", previous_tiers=" + previous_tiers + ", next_tiers=" + next_tiers + '}';
    }

}
