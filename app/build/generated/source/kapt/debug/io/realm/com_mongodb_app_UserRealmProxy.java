package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_mongodb_app_UserRealmProxy extends com.mongodb.app.User
    implements RealmObjectProxy, com_mongodb_app_UserRealmProxyInterface {

    static final class UserColumnInfo extends ColumnInfo {
        long idColKey;
        long _partitionColKey;
        long nameColKey;
        long tournamentInColKey;
        long tournamentOwnColKey;
        long followersColKey;
        long followingColKey;

        UserColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("User");
            this.idColKey = addColumnDetails("id", "_id", objectSchemaInfo);
            this._partitionColKey = addColumnDetails("_partition", "_partition", objectSchemaInfo);
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
            this.tournamentInColKey = addColumnDetails("tournamentIn", "tournamentIn", objectSchemaInfo);
            this.tournamentOwnColKey = addColumnDetails("tournamentOwn", "tournamentOwn", objectSchemaInfo);
            this.followersColKey = addColumnDetails("followers", "followers", objectSchemaInfo);
            this.followingColKey = addColumnDetails("following", "following", objectSchemaInfo);
        }

        UserColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UserColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UserColumnInfo src = (UserColumnInfo) rawSrc;
            final UserColumnInfo dst = (UserColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst._partitionColKey = src._partitionColKey;
            dst.nameColKey = src.nameColKey;
            dst.tournamentInColKey = src.tournamentInColKey;
            dst.tournamentOwnColKey = src.tournamentOwnColKey;
            dst.followersColKey = src.followersColKey;
            dst.followingColKey = src.followingColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private UserColumnInfo columnInfo;
    private ProxyState<com.mongodb.app.User> proxyState;
    private RealmList<org.bson.types.ObjectId> tournamentInRealmList;
    private RealmList<org.bson.types.ObjectId> tournamentOwnRealmList;
    private RealmList<String> followersRealmList;
    private RealmList<String> followingRealmList;

    com_mongodb_app_UserRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UserColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.mongodb.app.User>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idColKey);
    }

    @Override
    public void realmSet$id(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$_partition() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo._partitionColKey);
    }

    @Override
    public void realmSet$_partition(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field '_partition' to null.");
            }
            row.getTable().setString(columnInfo._partitionColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field '_partition' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo._partitionColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameColKey);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
            }
            row.getTable().setString(columnInfo.nameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.nameColKey, value);
    }

    @Override
    public RealmList<org.bson.types.ObjectId> realmGet$tournamentIn() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (tournamentInRealmList != null) {
            return tournamentInRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getValueList(columnInfo.tournamentInColKey, RealmFieldType.OBJECT_ID_LIST);
            tournamentInRealmList = new RealmList<org.bson.types.ObjectId>(org.bson.types.ObjectId.class, osList, proxyState.getRealm$realm());
            return tournamentInRealmList;
        }
    }

    @Override
    public void realmSet$tournamentIn(RealmList<org.bson.types.ObjectId> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("tournamentIn")) {
                return;
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getValueList(columnInfo.tournamentInColKey, RealmFieldType.OBJECT_ID_LIST);
        osList.removeAll();
        if (value == null) {
            return;
        }
        for (org.bson.types.ObjectId item : value) {
            if (item == null) {
                throw new IllegalArgumentException("Storing 'null' into tournamentIn' is not allowed by the schema.");
            } else {
                osList.addObjectId(item);
            }
        }
    }

    @Override
    public RealmList<org.bson.types.ObjectId> realmGet$tournamentOwn() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (tournamentOwnRealmList != null) {
            return tournamentOwnRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getValueList(columnInfo.tournamentOwnColKey, RealmFieldType.OBJECT_ID_LIST);
            tournamentOwnRealmList = new RealmList<org.bson.types.ObjectId>(org.bson.types.ObjectId.class, osList, proxyState.getRealm$realm());
            return tournamentOwnRealmList;
        }
    }

    @Override
    public void realmSet$tournamentOwn(RealmList<org.bson.types.ObjectId> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("tournamentOwn")) {
                return;
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getValueList(columnInfo.tournamentOwnColKey, RealmFieldType.OBJECT_ID_LIST);
        osList.removeAll();
        if (value == null) {
            return;
        }
        for (org.bson.types.ObjectId item : value) {
            if (item == null) {
                throw new IllegalArgumentException("Storing 'null' into tournamentOwn' is not allowed by the schema.");
            } else {
                osList.addObjectId(item);
            }
        }
    }

    @Override
    public RealmList<String> realmGet$followers() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (followersRealmList != null) {
            return followersRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getValueList(columnInfo.followersColKey, RealmFieldType.STRING_LIST);
            followersRealmList = new RealmList<java.lang.String>(java.lang.String.class, osList, proxyState.getRealm$realm());
            return followersRealmList;
        }
    }

    @Override
    public void realmSet$followers(RealmList<String> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("followers")) {
                return;
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getValueList(columnInfo.followersColKey, RealmFieldType.STRING_LIST);
        osList.removeAll();
        if (value == null) {
            return;
        }
        for (java.lang.String item : value) {
            if (item == null) {
                throw new IllegalArgumentException("Storing 'null' into followers' is not allowed by the schema.");
            } else {
                osList.addString(item);
            }
        }
    }

    @Override
    public RealmList<String> realmGet$following() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (followingRealmList != null) {
            return followingRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getValueList(columnInfo.followingColKey, RealmFieldType.STRING_LIST);
            followingRealmList = new RealmList<java.lang.String>(java.lang.String.class, osList, proxyState.getRealm$realm());
            return followingRealmList;
        }
    }

    @Override
    public void realmSet$following(RealmList<String> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("following")) {
                return;
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getValueList(columnInfo.followingColKey, RealmFieldType.STRING_LIST);
        osList.removeAll();
        if (value == null) {
            return;
        }
        for (java.lang.String item : value) {
            if (item == null) {
                throw new IllegalArgumentException("Storing 'null' into following' is not allowed by the schema.");
            } else {
                osList.addString(item);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("User", false, 7, 0);
        builder.addPersistedProperty("_id", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("_partition", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedValueListProperty("tournamentIn", RealmFieldType.OBJECT_ID_LIST, Property.REQUIRED);
        builder.addPersistedValueListProperty("tournamentOwn", RealmFieldType.OBJECT_ID_LIST, Property.REQUIRED);
        builder.addPersistedValueListProperty("followers", RealmFieldType.STRING_LIST, Property.REQUIRED);
        builder.addPersistedValueListProperty("following", RealmFieldType.STRING_LIST, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UserColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "User";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "User";
    }

    @SuppressWarnings("cast")
    public static com.mongodb.app.User createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(4);
        com.mongodb.app.User obj = null;
        if (update) {
            Table table = realm.getTable(com.mongodb.app.User.class);
            UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.User.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                objKey = table.findFirstString(pkColumnKey, json.getString("id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.mongodb.app.User.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_mongodb_app_UserRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("tournamentIn")) {
                excludeFields.add("tournamentIn");
            }
            if (json.has("tournamentOwn")) {
                excludeFields.add("tournamentOwn");
            }
            if (json.has("followers")) {
                excludeFields.add("followers");
            }
            if (json.has("following")) {
                excludeFields.add("following");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_mongodb_app_UserRealmProxy) realm.createObjectInternal(com.mongodb.app.User.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_mongodb_app_UserRealmProxy) realm.createObjectInternal(com.mongodb.app.User.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_mongodb_app_UserRealmProxyInterface objProxy = (com_mongodb_app_UserRealmProxyInterface) obj;
        if (json.has("_partition")) {
            if (json.isNull("_partition")) {
                objProxy.realmSet$_partition(null);
            } else {
                objProxy.realmSet$_partition((String) json.getString("_partition"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        ProxyUtils.setRealmListWithJsonObject(objProxy.realmGet$tournamentIn(), json, "tournamentIn");
        ProxyUtils.setRealmListWithJsonObject(objProxy.realmGet$tournamentOwn(), json, "tournamentOwn");
        ProxyUtils.setRealmListWithJsonObject(objProxy.realmGet$followers(), json, "followers");
        ProxyUtils.setRealmListWithJsonObject(objProxy.realmGet$following(), json, "following");
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.mongodb.app.User createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.mongodb.app.User obj = new com.mongodb.app.User();
        final com_mongodb_app_UserRealmProxyInterface objProxy = (com_mongodb_app_UserRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("_partition")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$_partition((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$_partition(null);
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("tournamentIn")) {
                objProxy.realmSet$tournamentIn(ProxyUtils.createRealmListWithJsonStream(org.bson.types.ObjectId.class, reader));
            } else if (name.equals("tournamentOwn")) {
                objProxy.realmSet$tournamentOwn(ProxyUtils.createRealmListWithJsonStream(org.bson.types.ObjectId.class, reader));
            } else if (name.equals("followers")) {
                objProxy.realmSet$followers(ProxyUtils.createRealmListWithJsonStream(java.lang.String.class, reader));
            } else if (name.equals("following")) {
                objProxy.realmSet$following(ProxyUtils.createRealmListWithJsonStream(java.lang.String.class, reader));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    static com_mongodb_app_UserRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.mongodb.app.User.class), false, Collections.<String>emptyList());
        io.realm.com_mongodb_app_UserRealmProxy obj = new io.realm.com_mongodb_app_UserRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.mongodb.app.User copyOrUpdate(Realm realm, UserColumnInfo columnInfo, com.mongodb.app.User object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.mongodb.app.User) cachedRealmObject;
        }

        com.mongodb.app.User realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.mongodb.app.User.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = table.findFirstString(pkColumnKey, ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$id());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_mongodb_app_UserRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.mongodb.app.User copy(Realm realm, UserColumnInfo columnInfo, com.mongodb.app.User newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.mongodb.app.User) cachedRealmObject;
        }

        com_mongodb_app_UserRealmProxyInterface unmanagedSource = (com_mongodb_app_UserRealmProxyInterface) newObject;

        Table table = realm.getTable(com.mongodb.app.User.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addString(columnInfo._partitionColKey, unmanagedSource.realmGet$_partition());
        builder.addString(columnInfo.nameColKey, unmanagedSource.realmGet$name());
        builder.addObjectIdList(columnInfo.tournamentInColKey, unmanagedSource.realmGet$tournamentIn());
        builder.addObjectIdList(columnInfo.tournamentOwnColKey, unmanagedSource.realmGet$tournamentOwn());
        builder.addStringList(columnInfo.followersColKey, unmanagedSource.realmGet$followers());
        builder.addStringList(columnInfo.followingColKey, unmanagedSource.realmGet$following());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_mongodb_app_UserRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.mongodb.app.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.mongodb.app.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.User.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, (String)primaryKeyValue);
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$_partition = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$_partition();
        if (realmGet$_partition != null) {
            Table.nativeSetString(tableNativePtr, columnInfo._partitionColKey, objKey, realmGet$_partition, false);
        }
        String realmGet$name = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        }

        RealmList<org.bson.types.ObjectId> tournamentInList = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$tournamentIn();
        if (tournamentInList != null) {
            OsList tournamentInOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.tournamentInColKey);
            for (org.bson.types.ObjectId tournamentInItem : tournamentInList) {
                if (tournamentInItem == null) {
                    tournamentInOsList.addNull();
                } else {
                    tournamentInOsList.addObjectId(tournamentInItem);
                }
            }
        }

        RealmList<org.bson.types.ObjectId> tournamentOwnList = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$tournamentOwn();
        if (tournamentOwnList != null) {
            OsList tournamentOwnOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.tournamentOwnColKey);
            for (org.bson.types.ObjectId tournamentOwnItem : tournamentOwnList) {
                if (tournamentOwnItem == null) {
                    tournamentOwnOsList.addNull();
                } else {
                    tournamentOwnOsList.addObjectId(tournamentOwnItem);
                }
            }
        }

        RealmList<java.lang.String> followersList = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$followers();
        if (followersList != null) {
            OsList followersOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.followersColKey);
            for (java.lang.String followersItem : followersList) {
                if (followersItem == null) {
                    followersOsList.addNull();
                } else {
                    followersOsList.addString(followersItem);
                }
            }
        }

        RealmList<java.lang.String> followingList = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$following();
        if (followingList != null) {
            OsList followingOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.followingColKey);
            for (java.lang.String followingItem : followingList) {
                if (followingItem == null) {
                    followingOsList.addNull();
                } else {
                    followingOsList.addString(followingItem);
                }
            }
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.app.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.User.class);
        long pkColumnKey = columnInfo.idColKey;
        com.mongodb.app.User object = null;
        while (objects.hasNext()) {
            object = (com.mongodb.app.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, (String)primaryKeyValue);
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$_partition = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$_partition();
            if (realmGet$_partition != null) {
                Table.nativeSetString(tableNativePtr, columnInfo._partitionColKey, objKey, realmGet$_partition, false);
            }
            String realmGet$name = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            }

            RealmList<org.bson.types.ObjectId> tournamentInList = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$tournamentIn();
            if (tournamentInList != null) {
                OsList tournamentInOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.tournamentInColKey);
                for (org.bson.types.ObjectId tournamentInItem : tournamentInList) {
                    if (tournamentInItem == null) {
                        tournamentInOsList.addNull();
                    } else {
                        tournamentInOsList.addObjectId(tournamentInItem);
                    }
                }
            }

            RealmList<org.bson.types.ObjectId> tournamentOwnList = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$tournamentOwn();
            if (tournamentOwnList != null) {
                OsList tournamentOwnOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.tournamentOwnColKey);
                for (org.bson.types.ObjectId tournamentOwnItem : tournamentOwnList) {
                    if (tournamentOwnItem == null) {
                        tournamentOwnOsList.addNull();
                    } else {
                        tournamentOwnOsList.addObjectId(tournamentOwnItem);
                    }
                }
            }

            RealmList<java.lang.String> followersList = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$followers();
            if (followersList != null) {
                OsList followersOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.followersColKey);
                for (java.lang.String followersItem : followersList) {
                    if (followersItem == null) {
                        followersOsList.addNull();
                    } else {
                        followersOsList.addString(followersItem);
                    }
                }
            }

            RealmList<java.lang.String> followingList = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$following();
            if (followingList != null) {
                OsList followingOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.followingColKey);
                for (java.lang.String followingItem : followingList) {
                    if (followingItem == null) {
                        followingOsList.addNull();
                    } else {
                        followingOsList.addString(followingItem);
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.mongodb.app.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.mongodb.app.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.User.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, (String)primaryKeyValue);
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$_partition = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$_partition();
        if (realmGet$_partition != null) {
            Table.nativeSetString(tableNativePtr, columnInfo._partitionColKey, objKey, realmGet$_partition, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo._partitionColKey, objKey, false);
        }
        String realmGet$name = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
        }

        OsList tournamentInOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.tournamentInColKey);
        tournamentInOsList.removeAll();
        RealmList<org.bson.types.ObjectId> tournamentInList = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$tournamentIn();
        if (tournamentInList != null) {
            for (org.bson.types.ObjectId tournamentInItem : tournamentInList) {
                if (tournamentInItem == null) {
                    tournamentInOsList.addNull();
                } else {
                    tournamentInOsList.addObjectId(tournamentInItem);
                }
            }
        }


        OsList tournamentOwnOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.tournamentOwnColKey);
        tournamentOwnOsList.removeAll();
        RealmList<org.bson.types.ObjectId> tournamentOwnList = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$tournamentOwn();
        if (tournamentOwnList != null) {
            for (org.bson.types.ObjectId tournamentOwnItem : tournamentOwnList) {
                if (tournamentOwnItem == null) {
                    tournamentOwnOsList.addNull();
                } else {
                    tournamentOwnOsList.addObjectId(tournamentOwnItem);
                }
            }
        }


        OsList followersOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.followersColKey);
        followersOsList.removeAll();
        RealmList<java.lang.String> followersList = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$followers();
        if (followersList != null) {
            for (java.lang.String followersItem : followersList) {
                if (followersItem == null) {
                    followersOsList.addNull();
                } else {
                    followersOsList.addString(followersItem);
                }
            }
        }


        OsList followingOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.followingColKey);
        followingOsList.removeAll();
        RealmList<java.lang.String> followingList = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$following();
        if (followingList != null) {
            for (java.lang.String followingItem : followingList) {
                if (followingItem == null) {
                    followingOsList.addNull();
                } else {
                    followingOsList.addString(followingItem);
                }
            }
        }

        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.app.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.User.class);
        long pkColumnKey = columnInfo.idColKey;
        com.mongodb.app.User object = null;
        while (objects.hasNext()) {
            object = (com.mongodb.app.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, (String)primaryKeyValue);
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$_partition = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$_partition();
            if (realmGet$_partition != null) {
                Table.nativeSetString(tableNativePtr, columnInfo._partitionColKey, objKey, realmGet$_partition, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo._partitionColKey, objKey, false);
            }
            String realmGet$name = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
            }

            OsList tournamentInOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.tournamentInColKey);
            tournamentInOsList.removeAll();
            RealmList<org.bson.types.ObjectId> tournamentInList = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$tournamentIn();
            if (tournamentInList != null) {
                for (org.bson.types.ObjectId tournamentInItem : tournamentInList) {
                    if (tournamentInItem == null) {
                        tournamentInOsList.addNull();
                    } else {
                        tournamentInOsList.addObjectId(tournamentInItem);
                    }
                }
            }


            OsList tournamentOwnOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.tournamentOwnColKey);
            tournamentOwnOsList.removeAll();
            RealmList<org.bson.types.ObjectId> tournamentOwnList = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$tournamentOwn();
            if (tournamentOwnList != null) {
                for (org.bson.types.ObjectId tournamentOwnItem : tournamentOwnList) {
                    if (tournamentOwnItem == null) {
                        tournamentOwnOsList.addNull();
                    } else {
                        tournamentOwnOsList.addObjectId(tournamentOwnItem);
                    }
                }
            }


            OsList followersOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.followersColKey);
            followersOsList.removeAll();
            RealmList<java.lang.String> followersList = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$followers();
            if (followersList != null) {
                for (java.lang.String followersItem : followersList) {
                    if (followersItem == null) {
                        followersOsList.addNull();
                    } else {
                        followersOsList.addString(followersItem);
                    }
                }
            }


            OsList followingOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.followingColKey);
            followingOsList.removeAll();
            RealmList<java.lang.String> followingList = ((com_mongodb_app_UserRealmProxyInterface) object).realmGet$following();
            if (followingList != null) {
                for (java.lang.String followingItem : followingList) {
                    if (followingItem == null) {
                        followingOsList.addNull();
                    } else {
                        followingOsList.addString(followingItem);
                    }
                }
            }

        }
    }

    public static com.mongodb.app.User createDetachedCopy(com.mongodb.app.User realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.mongodb.app.User unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.mongodb.app.User();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.mongodb.app.User) cachedObject.object;
            }
            unmanagedObject = (com.mongodb.app.User) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_mongodb_app_UserRealmProxyInterface unmanagedCopy = (com_mongodb_app_UserRealmProxyInterface) unmanagedObject;
        com_mongodb_app_UserRealmProxyInterface realmSource = (com_mongodb_app_UserRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$_partition(realmSource.realmGet$_partition());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());

        unmanagedCopy.realmSet$tournamentIn(new RealmList<org.bson.types.ObjectId>());
        unmanagedCopy.realmGet$tournamentIn().addAll(realmSource.realmGet$tournamentIn());

        unmanagedCopy.realmSet$tournamentOwn(new RealmList<org.bson.types.ObjectId>());
        unmanagedCopy.realmGet$tournamentOwn().addAll(realmSource.realmGet$tournamentOwn());

        unmanagedCopy.realmSet$followers(new RealmList<java.lang.String>());
        unmanagedCopy.realmGet$followers().addAll(realmSource.realmGet$followers());

        unmanagedCopy.realmSet$following(new RealmList<java.lang.String>());
        unmanagedCopy.realmGet$following().addAll(realmSource.realmGet$following());

        return unmanagedObject;
    }

    static com.mongodb.app.User update(Realm realm, UserColumnInfo columnInfo, com.mongodb.app.User realmObject, com.mongodb.app.User newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_mongodb_app_UserRealmProxyInterface realmObjectTarget = (com_mongodb_app_UserRealmProxyInterface) realmObject;
        com_mongodb_app_UserRealmProxyInterface realmObjectSource = (com_mongodb_app_UserRealmProxyInterface) newObject;
        Table table = realm.getTable(com.mongodb.app.User.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo._partitionColKey, realmObjectSource.realmGet$_partition());
        builder.addString(columnInfo.nameColKey, realmObjectSource.realmGet$name());
        builder.addObjectIdList(columnInfo.tournamentInColKey, realmObjectSource.realmGet$tournamentIn());
        builder.addObjectIdList(columnInfo.tournamentOwnColKey, realmObjectSource.realmGet$tournamentOwn());
        builder.addStringList(columnInfo.followersColKey, realmObjectSource.realmGet$followers());
        builder.addStringList(columnInfo.followingColKey, realmObjectSource.realmGet$following());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("User = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{_partition:");
        stringBuilder.append(realmGet$_partition());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tournamentIn:");
        stringBuilder.append("RealmList<ObjectId>[").append(realmGet$tournamentIn().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tournamentOwn:");
        stringBuilder.append("RealmList<ObjectId>[").append(realmGet$tournamentOwn().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{followers:");
        stringBuilder.append("RealmList<String>[").append(realmGet$followers().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{following:");
        stringBuilder.append("RealmList<String>[").append(realmGet$following().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long objKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (objKey ^ (objKey >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_mongodb_app_UserRealmProxy aUser = (com_mongodb_app_UserRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aUser.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aUser.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aUser.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
