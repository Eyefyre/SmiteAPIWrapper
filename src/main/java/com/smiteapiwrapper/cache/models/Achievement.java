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
public class Achievement {

    private int id;
    private String name;
    private String icon;
    private String category;
    private String description;

    public Achievement(int id, String name, String icon, String category, String description) {
        this.id = id;
        this.name = name;
        this.icon = icon;
        this.category = category;
        this.description = description;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Achievement{" + "id=" + id + ", name=" + name + ", icon=" + icon + ", category=" + category + ", description=" + description + '}';
    }

}
