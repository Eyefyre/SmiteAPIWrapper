/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smiteapiwrapper.client;

import com.smiteapiwrapper.models.Achievement;
import com.smiteapiwrapper.models.NamedAPIResourceList;
import com.smiteapiwrapper.models.Pantheon;

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

    Pantheon getPantheon(int id);

    Pantheon getPantheon(String name);

    Achievement getAchievement(int id);

    Achievement getAchievement(String name);
}
