# SmiteAPIWrapper
 Java Wrapper for https://smiteapi.adammackle.com
 
 Maintained by [Eyefyre](https://github.com/Eyefyre)
 
## Example
 An example of how to info on a Pantheon
 ```
        SmiteClient client = new SmiteClient();
        Pantheon chinese = client.getPantheon("Chinese");
 ```
A cache is used to speed up calls. Users are able to set the amount of time an object is stored in the cache
 ```
        SmiteClient client = new SmiteClient();
        client.changeCacheTimeAmount(60); //60 seconds
 ```
## Usable Methods
 Here are all the usable methods in this wrapper.
 ```
    void clearCache();
    long getCacheTime();
    void changeCacheTimeAmount(long seconds);
    NamedAPIResourceList getAchievementList(int offset, int limit);
    NamedAPIResourceList getPantheonList(int offset, int limit);
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
    
 ```
