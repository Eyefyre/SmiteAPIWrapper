/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smiteapiwrapper.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.smiteapiwrapper.cache.InMemoryCache;
import com.smiteapiwrapper.models.Achievement;
import com.smiteapiwrapper.models.Consumable;
import com.smiteapiwrapper.models.NamedAPIResourceList;
import com.smiteapiwrapper.models.Pantheon;
import com.smiteapiwrapper.models.Passive;
import com.smiteapiwrapper.models.Relic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author Adam
 */
public class SmiteService implements SmiteServiceInterface {

    private final InMemoryCache CACHE = new InMemoryCache();
    private final String BASEURL = "https://smiteapi.adammackle.com/";
    private String JSONSTRING = "";
    private final GsonBuilder BUILDER = new GsonBuilder();
    private final Gson gson = BUILDER.create();
    private long cacheTimeInSeconds = 600;

    @Override
    public Object getResource(String cacheID, String path, String objectName) {
        Object list = queryAPI(path, objectName);
        CACHE.add(cacheID, list, cacheTimeInSeconds * 1000);
        return list;
    }

    @Override
    public Object queryAPI(String path, String ObjectName) {
        try {
            JSONSTRING = "";
            URL url = new URL(BASEURL + path);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.connect();
            StringBuilder content = new StringBuilder();
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()))) {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
            }
            JSONSTRING = content.toString();
            conn.disconnect();
        } catch (MalformedURLException ex) {
            Logger.getLogger(SmiteService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ProtocolException ex) {
            Logger.getLogger(SmiteService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SmiteService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return parseJSONtoObject(JSONSTRING, ObjectName);
    }

    @Override
    public Object parseJSONtoObject(String jsonString, String Objectname) {
        Object resource = null;
        if (!jsonString.equals("")) {
            JsonElement jsonelement = JsonParser.parseString(jsonString);
            if (jsonelement.isJsonObject()) {
                JsonObject jsonObject = jsonelement.getAsJsonObject();
                switch (Objectname) {
                    case "NamedAPIResourceList":
                        resource = gson.fromJson(jsonObject.toString(), NamedAPIResourceList.class);
                        break;
                    case "Achievement":
                        resource = gson.fromJson(jsonObject.toString(), Achievement.class);
                        break;
                    case "Pantheon":
                        resource = gson.fromJson(jsonObject.toString(), Pantheon.class);
                        break;
                    case "Relic":
                        resource = gson.fromJson(jsonObject.toString(), Relic.class);
                        break;
                    case "Passive":
                        resource = gson.fromJson(jsonObject.toString(), Passive.class);
                        break;
                    case "Consumable":
                        resource = gson.fromJson(jsonObject.toString(), Consumable.class);
                        break;
                }
            }
        }
        return resource;
    }

    @Override
    public InMemoryCache getCache() {
        return CACHE;
    }

    @Override
    public void changeCacheTime(long seconds) {
        this.cacheTimeInSeconds = seconds;
    }

    @Override
    public long getCacheTime() {
        return this.cacheTimeInSeconds;
    }

}
