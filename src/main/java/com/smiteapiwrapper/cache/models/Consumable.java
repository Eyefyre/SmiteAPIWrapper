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
public class Consumable {

    private int id;
    private String name;
    private String picture;
    private int cost;
    private String effect;
    private int carry_limit;

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

    public String getEffect() {
        return effect;
    }

    public int getCarryLimit() {
        return carry_limit;
    }

    @Override
    public String toString() {
        return "Consumable{" + "id=" + id + ", name=" + name + ", picture=" + picture + ", cost=" + cost + ", effect=" + effect + ", carry_limit=" + carry_limit + '}';
    }

}
