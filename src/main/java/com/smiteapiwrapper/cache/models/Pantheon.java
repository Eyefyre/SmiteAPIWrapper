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
public class Pantheon {

    private int id;
    private String name;
    private String icon;
    private String banner;
    private String lore;
    private ArrayList<NamedAPIResource> gods;

    public Pantheon(int id, String name, String icon, String banner, String lore, ArrayList<NamedAPIResource> gods) {
        this.id = id;
        this.name = name;
        this.icon = icon;
        this.banner = banner;
        this.lore = lore;
        this.gods = gods;
    }

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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public ArrayList<NamedAPIResource> getGods() {
        return gods;
    }

    public void setGods(ArrayList<NamedAPIResource> gods) {
        this.gods = gods;
    }

    @Override
    public String toString() {
        return "Pantheon{" + "id=" + id + ", name=" + name + ", icon=" + icon + ", banner=" + banner + ", lore=" + lore + ", gods=" + gods + '}';
    }

}
