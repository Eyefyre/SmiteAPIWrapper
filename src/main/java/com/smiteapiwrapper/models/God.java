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
public class God {

    private int id;
    private String name;
    private String title;
    private String card;
    private NamedAPIResource pantheon;
    private String power_type;
    private String attack_type;
    private String role;
    private String lore;
    private int gem_cost;
    private int favor_cost;
    private String difficulty;
    private String release_date;
    private ArrayList<StatValue> stats;
    private ArrayList<NamedAPIResource> abilities;
    private ArrayList<NamedAPIResource> related_achievements;
    private ArrayList<GodSkin> skins;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public NamedAPIResource getPantheon() {
        return pantheon;
    }

    public void setPantheon(NamedAPIResource pantheon) {
        this.pantheon = pantheon;
    }

    public String getPowerType() {
        return power_type;
    }

    public void setPowerType(String power_type) {
        this.power_type = power_type;
    }

    public String getAttackType() {
        return attack_type;
    }

    public void setAttackType(String attack_type) {
        this.attack_type = attack_type;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public int getGemCost() {
        return gem_cost;
    }

    public void setGemCost(int gem_cost) {
        this.gem_cost = gem_cost;
    }

    public int getFavorCost() {
        return favor_cost;
    }

    public void setFavorCost(int favor_cost) {
        this.favor_cost = favor_cost;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getReleaseDate() {
        return release_date;
    }

    public void setReleaseDate(String release_date) {
        this.release_date = release_date;
    }

    public ArrayList<StatValue> getStats() {
        return stats;
    }

    public void setStats(ArrayList<StatValue> stats) {
        this.stats = stats;
    }

    public ArrayList<NamedAPIResource> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<NamedAPIResource> abilities) {
        this.abilities = abilities;
    }

    public ArrayList<NamedAPIResource> getRelatedAchievements() {
        return related_achievements;
    }

    public void setRelatedAchievements(ArrayList<NamedAPIResource> related_achievements) {
        this.related_achievements = related_achievements;
    }

    public ArrayList<GodSkin> getSkins() {
        return skins;
    }

    public void setSkins(ArrayList<GodSkin> skins) {
        this.skins = skins;
    }

    @Override
    public String toString() {
        return "God{" + "id=" + id + ", name=" + name + ", title=" + title + ", card=" + card + ", pantheon=" + pantheon + ", power_type=" + power_type + ", attack_type=" + attack_type + ", role=" + role + ", lore=" + lore + ", gem_cost=" + gem_cost + ", favor_cost=" + favor_cost + ", difficulty=" + difficulty + ", release_date=" + release_date + ", stats=" + stats + ", abilities=" + abilities + ", related_achievements=" + related_achievements + ", skins=" + skins + '}';
    }

}
