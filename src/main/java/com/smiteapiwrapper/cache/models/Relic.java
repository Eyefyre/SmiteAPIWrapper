/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smiteapiwrapper.models;

/**
 *
 * @author Adam
 */
public class Relic {

    private int id;
    private String name;
    private String picture;
    private int cost;
    private int cooldown;
    private String effect;
    private NamedAPIResource next_tier;
    private NamedAPIResource previous_tier;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPicture() {
        return picture;
    }

    public int getCost() {
        return cost;
    }

    public int getCooldown() {
        return cooldown;
    }

    public String getEffect() {
        return effect;
    }

    public NamedAPIResource getNextTier() {
        return next_tier;
    }

    public NamedAPIResource getPreviousTier() {
        return previous_tier;
    }

    @Override
    public String toString() {
        return "Relic{" + "id=" + id + ", name=" + name + ", picture=" + picture + ", cost=" + cost + ", cooldown=" + cooldown + ", effect=" + effect + ", next_tier=" + next_tier + ", previous_tier=" + previous_tier + '}';
    }

}
