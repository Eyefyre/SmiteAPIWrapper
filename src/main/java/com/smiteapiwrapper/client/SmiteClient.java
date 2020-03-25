/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smiteapiwrapper.client;

import com.smiteapiwrapper.models.Achievement;
import com.smiteapiwrapper.models.Consumable;
import com.smiteapiwrapper.models.NamedAPIResourceList;
import com.smiteapiwrapper.models.Pantheon;
import com.smiteapiwrapper.models.Passive;
import com.smiteapiwrapper.models.Relic;

/**
 *
 * @author Adam
 */
public class SmiteClient implements SmiteClientInterface {

    private final SmiteService smiteService = new SmiteService();

    @Override
    public void changeCacheTimeAmount(long seconds) {
        this.smiteService.changeCacheTime(seconds);
    }

    @Override
    public long getCacheTime() {
        return this.smiteService.getCacheTime();
    }

    @Override
    public void clearCache() {
        this.smiteService.getCache().clear();
    }

    private Object useService(String path, String objectName) {
        if (smiteService.getCache().contains(path)) {
            System.out.println("CACHE");
            return smiteService.getCache().get(path);
        }
        System.out.println("API");
        return smiteService.getResource(path, path, objectName);
    }

    private Object getObject(String path, String name, String objectName) {
        String fullpath = path + "/" + name;
        return this.useService(fullpath, objectName);
    }

    private Object getObject(String path, int id, String objectName) {
        String fullpath = path + "/" + id;
        return this.useService(fullpath, objectName);
    }

    private Object getObject(String path, String objectName) {
        String fullpath = path;
        return this.useService(fullpath, objectName);
    }

    @Override
    public NamedAPIResourceList getAchievementList() {
        return (NamedAPIResourceList) this.getObject("achievements", "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getPantheonList() {
        return (NamedAPIResourceList) this.getObject("pantheons", "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getConsumableList() {
        return (NamedAPIResourceList) this.getObject("consumables", "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getRelicList() {
        return (NamedAPIResourceList) this.getObject("relics", "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getPassiveList() {
        return (NamedAPIResourceList) this.getObject("passives", "NamedAPIResourceList");
    }

    @Override
    public Pantheon getPantheon(int id) {
        return (Pantheon) this.getObject("pantheons", id, "Pantheon");
    }

    @Override
    public Pantheon getPantheon(String name) {
        return (Pantheon) this.getObject("pantheons", name, "Pantheon");
    }

    @Override
    public Achievement getAchievement(int id) {
        return (Achievement) this.getObject("achievements", id, "Achievement");
    }

    @Override
    public Achievement getAchievement(String name) {
        return (Achievement) this.getObject("achievements", name, "Achievement");
    }

    @Override
    public Relic getRelic(int id) {
        return (Relic) this.getObject("relics", id, "Relic");
    }

    @Override
    public Relic getRelic(String name) {
        return (Relic) this.getObject("relics", name, "Relic");
    }

    @Override
    public Passive getPassive(int id) {
        return (Passive) this.getObject("passives", id, "Passive");
    }

    @Override
    public Passive getPassive(String name) {
        return (Passive) this.getObject("passives", name, "Passive");
    }

    @Override
    public Consumable getConsumable(int id) {
        return (Consumable) this.getObject("consumables", id, "Consumable");
    }

    @Override
    public Consumable getConsumable(String name) {
        return (Consumable) this.getObject("consumables", name, "Consumable");
    }
}
