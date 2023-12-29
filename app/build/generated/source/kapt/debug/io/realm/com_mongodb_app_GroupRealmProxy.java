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
public class com_mongodb_app_GroupRealmProxy extends com.mongodb.app.Group
    implements RealmObjectProxy, com_mongodb_app_GroupRealmProxyInterface {

    static final class GroupColumnInfo extends ColumnInfo {
        long _idColKey;
        long nameColKey;
        long member1ColKey;
        long member2ColKey;
        long member3ColKey;
        long member4ColKey;

        GroupColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Group");
            this._idColKey = addColumnDetails("_id", "_id", objectSchemaInfo);
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
            this.member1ColKey = addColumnDetails("member1", "member1", objectSchemaInfo);
            this.member2ColKey = addColumnDetails("member2", "member2", objectSchemaInfo);
            this.member3ColKey = addColumnDetails("member3", "member3", objectSchemaInfo);
            this.member4ColKey = addColumnDetails("member4", "member4", objectSchemaInfo);
        }

        GroupColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new GroupColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final GroupColumnInfo src = (GroupColumnInfo) rawSrc;
            final GroupColumnInfo dst = (GroupColumnInfo) rawDst;
            dst._idColKey = src._idColKey;
            dst.nameColKey = src.nameColKey;
            dst.member1ColKey = src.member1ColKey;
            dst.member2ColKey = src.member2ColKey;
            dst.member3ColKey = src.member3ColKey;
            dst.member4ColKey = src.member4ColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private GroupColumnInfo columnInfo;
    private ProxyState<com.mongodb.app.Group> proxyState;

    com_mongodb_app_GroupRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (GroupColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.mongodb.app.Group>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public org.bson.types.ObjectId realmGet$_id() {
        proxyState.getRealm$realm().checkIfValid();
        return (org.bson.types.ObjectId) proxyState.getRow$realm().getObjectId(columnInfo._idColKey);
    }

    @Override
    public void realmSet$_id(org.bson.types.ObjectId value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field '_id' cannot be changed after object was created.");
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
    @SuppressWarnings("cast")
    public String realmGet$member1() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.member1ColKey);
    }

    @Override
    public void realmSet$member1(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'member1' to null.");
            }
            row.getTable().setString(columnInfo.member1ColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'member1' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.member1ColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$member2() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.member2ColKey);
    }

    @Override
    public void realmSet$member2(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'member2' to null.");
            }
            row.getTable().setString(columnInfo.member2ColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'member2' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.member2ColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$member3() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.member3ColKey);
    }

    @Override
    public void realmSet$member3(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'member3' to null.");
            }
            row.getTable().setString(columnInfo.member3ColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'member3' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.member3ColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$member4() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.member4ColKey);
    }

    @Override
    public void realmSet$member4(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'member4' to null.");
            }
            row.getTable().setString(columnInfo.member4ColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'member4' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.member4ColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Group", false, 6, 0);
        builder.addPersistedProperty("_id", RealmFieldType.OBJECT_ID, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("member1", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("member2", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("member3", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("member4", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static GroupColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new GroupColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Group";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Group";
    }

    @SuppressWarnings("cast")
    public static com.mongodb.app.Group createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.mongodb.app.Group obj = null;
        if (update) {
            Table table = realm.getTable(com.mongodb.app.Group.class);
            GroupColumnInfo columnInfo = (GroupColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Group.class);
            long pkColumnKey = columnInfo._idColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("_id")) {
                objKey = table.findFirstObjectId(pkColumnKey, (org.bson.types.ObjectId)json.get("_id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.mongodb.app.Group.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_mongodb_app_GroupRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("_id")) {
                if (json.isNull("_id")) {
                    obj = (io.realm.com_mongodb_app_GroupRealmProxy) realm.createObjectInternal(com.mongodb.app.Group.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_mongodb_app_GroupRealmProxy) realm.createObjectInternal(com.mongodb.app.Group.class, json.get("_id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field '_id'.");
            }
        }

        final com_mongodb_app_GroupRealmProxyInterface objProxy = (com_mongodb_app_GroupRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("member1")) {
            if (json.isNull("member1")) {
                objProxy.realmSet$member1(null);
            } else {
                objProxy.realmSet$member1((String) json.getString("member1"));
            }
        }
        if (json.has("member2")) {
            if (json.isNull("member2")) {
                objProxy.realmSet$member2(null);
            } else {
                objProxy.realmSet$member2((String) json.getString("member2"));
            }
        }
        if (json.has("member3")) {
            if (json.isNull("member3")) {
                objProxy.realmSet$member3(null);
            } else {
                objProxy.realmSet$member3((String) json.getString("member3"));
            }
        }
        if (json.has("member4")) {
            if (json.isNull("member4")) {
                objProxy.realmSet$member4(null);
            } else {
                objProxy.realmSet$member4((String) json.getString("member4"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.mongodb.app.Group createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.mongodb.app.Group obj = new com.mongodb.app.Group();
        final com_mongodb_app_GroupRealmProxyInterface objProxy = (com_mongodb_app_GroupRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("_id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$_id(null);
                } else {
                    objProxy.realmSet$_id(new org.bson.types.ObjectId(reader.nextString()));
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("member1")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$member1((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$member1(null);
                }
            } else if (name.equals("member2")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$member2((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$member2(null);
                }
            } else if (name.equals("member3")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$member3((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$member3(null);
                }
            } else if (name.equals("member4")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$member4((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$member4(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field '_id'.");
        }
        return realm.copyToRealm(obj);
    }

    static com_mongodb_app_GroupRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.mongodb.app.Group.class), false, Collections.<String>emptyList());
        io.realm.com_mongodb_app_GroupRealmProxy obj = new io.realm.com_mongodb_app_GroupRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.mongodb.app.Group copyOrUpdate(Realm realm, GroupColumnInfo columnInfo, com.mongodb.app.Group object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.mongodb.app.Group) cachedRealmObject;
        }

        com.mongodb.app.Group realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.mongodb.app.Group.class);
            long pkColumnKey = columnInfo._idColKey;
            long objKey = table.findFirstObjectId(pkColumnKey, ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$_id());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_mongodb_app_GroupRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.mongodb.app.Group copy(Realm realm, GroupColumnInfo columnInfo, com.mongodb.app.Group newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.mongodb.app.Group) cachedRealmObject;
        }

        com_mongodb_app_GroupRealmProxyInterface unmanagedSource = (com_mongodb_app_GroupRealmProxyInterface) newObject;

        Table table = realm.getTable(com.mongodb.app.Group.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addObjectId(columnInfo._idColKey, unmanagedSource.realmGet$_id());
        builder.addString(columnInfo.nameColKey, unmanagedSource.realmGet$name());
        builder.addString(columnInfo.member1ColKey, unmanagedSource.realmGet$member1());
        builder.addString(columnInfo.member2ColKey, unmanagedSource.realmGet$member2());
        builder.addString(columnInfo.member3ColKey, unmanagedSource.realmGet$member3());
        builder.addString(columnInfo.member4ColKey, unmanagedSource.realmGet$member4());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_mongodb_app_GroupRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.mongodb.app.Group object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.mongodb.app.Group.class);
        long tableNativePtr = table.getNativePtr();
        GroupColumnInfo columnInfo = (GroupColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Group.class);
        long pkColumnKey = columnInfo._idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$_id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstObjectId(tableNativePtr, pkColumnKey, ((org.bson.types.ObjectId)primaryKeyValue).toString());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$name = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        }
        String realmGet$member1 = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$member1();
        if (realmGet$member1 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.member1ColKey, objKey, realmGet$member1, false);
        }
        String realmGet$member2 = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$member2();
        if (realmGet$member2 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.member2ColKey, objKey, realmGet$member2, false);
        }
        String realmGet$member3 = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$member3();
        if (realmGet$member3 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.member3ColKey, objKey, realmGet$member3, false);
        }
        String realmGet$member4 = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$member4();
        if (realmGet$member4 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.member4ColKey, objKey, realmGet$member4, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.app.Group.class);
        long tableNativePtr = table.getNativePtr();
        GroupColumnInfo columnInfo = (GroupColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Group.class);
        long pkColumnKey = columnInfo._idColKey;
        com.mongodb.app.Group object = null;
        while (objects.hasNext()) {
            object = (com.mongodb.app.Group) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$_id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstObjectId(tableNativePtr, pkColumnKey, ((org.bson.types.ObjectId)primaryKeyValue).toString());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$name = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            }
            String realmGet$member1 = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$member1();
            if (realmGet$member1 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.member1ColKey, objKey, realmGet$member1, false);
            }
            String realmGet$member2 = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$member2();
            if (realmGet$member2 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.member2ColKey, objKey, realmGet$member2, false);
            }
            String realmGet$member3 = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$member3();
            if (realmGet$member3 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.member3ColKey, objKey, realmGet$member3, false);
            }
            String realmGet$member4 = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$member4();
            if (realmGet$member4 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.member4ColKey, objKey, realmGet$member4, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.mongodb.app.Group object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.mongodb.app.Group.class);
        long tableNativePtr = table.getNativePtr();
        GroupColumnInfo columnInfo = (GroupColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Group.class);
        long pkColumnKey = columnInfo._idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$_id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstObjectId(tableNativePtr, pkColumnKey, ((org.bson.types.ObjectId)primaryKeyValue).toString());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$name = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
        }
        String realmGet$member1 = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$member1();
        if (realmGet$member1 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.member1ColKey, objKey, realmGet$member1, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.member1ColKey, objKey, false);
        }
        String realmGet$member2 = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$member2();
        if (realmGet$member2 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.member2ColKey, objKey, realmGet$member2, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.member2ColKey, objKey, false);
        }
        String realmGet$member3 = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$member3();
        if (realmGet$member3 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.member3ColKey, objKey, realmGet$member3, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.member3ColKey, objKey, false);
        }
        String realmGet$member4 = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$member4();
        if (realmGet$member4 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.member4ColKey, objKey, realmGet$member4, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.member4ColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.app.Group.class);
        long tableNativePtr = table.getNativePtr();
        GroupColumnInfo columnInfo = (GroupColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Group.class);
        long pkColumnKey = columnInfo._idColKey;
        com.mongodb.app.Group object = null;
        while (objects.hasNext()) {
            object = (com.mongodb.app.Group) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$_id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstObjectId(tableNativePtr, pkColumnKey, ((org.bson.types.ObjectId)primaryKeyValue).toString());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$name = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
            }
            String realmGet$member1 = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$member1();
            if (realmGet$member1 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.member1ColKey, objKey, realmGet$member1, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.member1ColKey, objKey, false);
            }
            String realmGet$member2 = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$member2();
            if (realmGet$member2 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.member2ColKey, objKey, realmGet$member2, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.member2ColKey, objKey, false);
            }
            String realmGet$member3 = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$member3();
            if (realmGet$member3 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.member3ColKey, objKey, realmGet$member3, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.member3ColKey, objKey, false);
            }
            String realmGet$member4 = ((com_mongodb_app_GroupRealmProxyInterface) object).realmGet$member4();
            if (realmGet$member4 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.member4ColKey, objKey, realmGet$member4, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.member4ColKey, objKey, false);
            }
        }
    }

    public static com.mongodb.app.Group createDetachedCopy(com.mongodb.app.Group realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.mongodb.app.Group unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.mongodb.app.Group();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.mongodb.app.Group) cachedObject.object;
            }
            unmanagedObject = (com.mongodb.app.Group) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_mongodb_app_GroupRealmProxyInterface unmanagedCopy = (com_mongodb_app_GroupRealmProxyInterface) unmanagedObject;
        com_mongodb_app_GroupRealmProxyInterface realmSource = (com_mongodb_app_GroupRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$_id(realmSource.realmGet$_id());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$member1(realmSource.realmGet$member1());
        unmanagedCopy.realmSet$member2(realmSource.realmGet$member2());
        unmanagedCopy.realmSet$member3(realmSource.realmGet$member3());
        unmanagedCopy.realmSet$member4(realmSource.realmGet$member4());

        return unmanagedObject;
    }

    static com.mongodb.app.Group update(Realm realm, GroupColumnInfo columnInfo, com.mongodb.app.Group realmObject, com.mongodb.app.Group newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_mongodb_app_GroupRealmProxyInterface realmObjectTarget = (com_mongodb_app_GroupRealmProxyInterface) realmObject;
        com_mongodb_app_GroupRealmProxyInterface realmObjectSource = (com_mongodb_app_GroupRealmProxyInterface) newObject;
        Table table = realm.getTable(com.mongodb.app.Group.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addObjectId(columnInfo._idColKey, realmObjectSource.realmGet$_id());
        builder.addString(columnInfo.nameColKey, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.member1ColKey, realmObjectSource.realmGet$member1());
        builder.addString(columnInfo.member2ColKey, realmObjectSource.realmGet$member2());
        builder.addString(columnInfo.member3ColKey, realmObjectSource.realmGet$member3());
        builder.addString(columnInfo.member4ColKey, realmObjectSource.realmGet$member4());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Group = proxy[");
        stringBuilder.append("{_id:");
        stringBuilder.append(realmGet$_id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{member1:");
        stringBuilder.append(realmGet$member1());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{member2:");
        stringBuilder.append(realmGet$member2());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{member3:");
        stringBuilder.append(realmGet$member3());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{member4:");
        stringBuilder.append(realmGet$member4());
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
        com_mongodb_app_GroupRealmProxy aGroup = (com_mongodb_app_GroupRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aGroup.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aGroup.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aGroup.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
