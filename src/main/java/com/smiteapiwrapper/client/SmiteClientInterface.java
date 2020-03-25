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
public interface SmiteClientInterface {

    void clearCache();

    void changeCacheTimeAmount(long seconds);

    long getCacheTime();

    NamedAPIResourceList getAchievementList();

    NamedAPIResourceList getPantheonList();

    NamedAPIResourceList getRelicList();

    NamedAPIResourceList getPassiveList();

    NamedAPIResourceList getConsumableList();

    Pantheon getPantheon(int id);

    Pantheon getPantheon(String name);

    Achievement getAchievement(int id);

    Achievement getAchievement(String name);

    Relic getRelic(int id);

    Relic getRelic(String name);

    Passive getPassive(int id);

    Passive getPassive(String name);

    Consumable getConsumable(int id);

    Consumable getConsumable(String name);
}
