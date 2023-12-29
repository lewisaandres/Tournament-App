package io.realm;


public interface com_mongodb_app_UserRealmProxyInterface {
    public String realmGet$id();
    public void realmSet$id(String value);
    public String realmGet$_partition();
    public void realmSet$_partition(String value);
    public String realmGet$name();
    public void realmSet$name(String value);
    public RealmList<org.bson.types.ObjectId> realmGet$tournamentIn();
    public void realmSet$tournamentIn(RealmList<org.bson.types.ObjectId> value);
    public RealmList<org.bson.types.ObjectId> realmGet$tournamentOwn();
    public void realmSet$tournamentOwn(RealmList<org.bson.types.ObjectId> value);
    public RealmList<String> realmGet$followers();
    public void realmSet$followers(RealmList<String> value);
    public RealmList<String> realmGet$following();
    public void realmSet$following(RealmList<String> value);
}
