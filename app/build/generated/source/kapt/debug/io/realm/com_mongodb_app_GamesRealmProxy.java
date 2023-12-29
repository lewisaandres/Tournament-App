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
public class com_mongodb_app_GamesRealmProxy extends com.mongodb.app.Games
    implements RealmObjectProxy, com_mongodb_app_GamesRealmProxyInterface {

    static final class GamesColumnInfo extends ColumnInfo {
        long idColKey;
        long genreColKey;
        long titleColKey;

        GamesColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Games");
            this.idColKey = addColumnDetails("id", "_id", objectSchemaInfo);
            this.genreColKey = addColumnDetails("genre", "genre", objectSchemaInfo);
            this.titleColKey = addColumnDetails("title", "title", objectSchemaInfo);
        }

        GamesColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new GamesColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final GamesColumnInfo src = (GamesColumnInfo) rawSrc;
            final GamesColumnInfo dst = (GamesColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.genreColKey = src.genreColKey;
            dst.titleColKey = src.titleColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private GamesColumnInfo columnInfo;
    private ProxyState<com.mongodb.app.Games> proxyState;

    com_mongodb_app_GamesRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (GamesColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.mongodb.app.Games>(this);
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
    public String realmGet$genre() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.genreColKey);
    }

    @Override
    public void realmSet$genre(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'genre' to null.");
            }
            row.getTable().setString(columnInfo.genreColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'genre' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.genreColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$title() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.titleColKey);
    }

    @Override
    public void realmSet$title(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
            }
            row.getTable().setString(columnInfo.titleColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.titleColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Games", false, 3, 0);
        builder.addPersistedProperty("_id", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("genre", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("title", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static GamesColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new GamesColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Games";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Games";
    }

    @SuppressWarnings("cast")
    public static com.mongodb.app.Games createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.mongodb.app.Games obj = null;
        if (update) {
            Table table = realm.getTable(com.mongodb.app.Games.class);
            GamesColumnInfo columnInfo = (GamesColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Games.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                objKey = table.findFirstString(pkColumnKey, json.getString("id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.mongodb.app.Games.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_mongodb_app_GamesRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_mongodb_app_GamesRealmProxy) realm.createObjectInternal(com.mongodb.app.Games.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_mongodb_app_GamesRealmProxy) realm.createObjectInternal(com.mongodb.app.Games.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_mongodb_app_GamesRealmProxyInterface objProxy = (com_mongodb_app_GamesRealmProxyInterface) obj;
        if (json.has("genre")) {
            if (json.isNull("genre")) {
                objProxy.realmSet$genre(null);
            } else {
                objProxy.realmSet$genre((String) json.getString("genre"));
            }
        }
        if (json.has("title")) {
            if (json.isNull("title")) {
                objProxy.realmSet$title(null);
            } else {
                objProxy.realmSet$title((String) json.getString("title"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.mongodb.app.Games createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.mongodb.app.Games obj = new com.mongodb.app.Games();
        final com_mongodb_app_GamesRealmProxyInterface objProxy = (com_mongodb_app_GamesRealmProxyInterface) obj;
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
            } else if (name.equals("genre")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$genre((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$genre(null);
                }
            } else if (name.equals("title")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$title((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$title(null);
                }
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

    static com_mongodb_app_GamesRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.mongodb.app.Games.class), false, Collections.<String>emptyList());
        io.realm.com_mongodb_app_GamesRealmProxy obj = new io.realm.com_mongodb_app_GamesRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.mongodb.app.Games copyOrUpdate(Realm realm, GamesColumnInfo columnInfo, com.mongodb.app.Games object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.mongodb.app.Games) cachedRealmObject;
        }

        com.mongodb.app.Games realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.mongodb.app.Games.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = table.findFirstString(pkColumnKey, ((com_mongodb_app_GamesRealmProxyInterface) object).realmGet$id());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_mongodb_app_GamesRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.mongodb.app.Games copy(Realm realm, GamesColumnInfo columnInfo, com.mongodb.app.Games newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.mongodb.app.Games) cachedRealmObject;
        }

        com_mongodb_app_GamesRealmProxyInterface unmanagedSource = (com_mongodb_app_GamesRealmProxyInterface) newObject;

        Table table = realm.getTable(com.mongodb.app.Games.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addString(columnInfo.genreColKey, unmanagedSource.realmGet$genre());
        builder.addString(columnInfo.titleColKey, unmanagedSource.realmGet$title());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_mongodb_app_GamesRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.mongodb.app.Games object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.mongodb.app.Games.class);
        long tableNativePtr = table.getNativePtr();
        GamesColumnInfo columnInfo = (GamesColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Games.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_mongodb_app_GamesRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, (String)primaryKeyValue);
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$genre = ((com_mongodb_app_GamesRealmProxyInterface) object).realmGet$genre();
        if (realmGet$genre != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.genreColKey, objKey, realmGet$genre, false);
        }
        String realmGet$title = ((com_mongodb_app_GamesRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleColKey, objKey, realmGet$title, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.app.Games.class);
        long tableNativePtr = table.getNativePtr();
        GamesColumnInfo columnInfo = (GamesColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Games.class);
        long pkColumnKey = columnInfo.idColKey;
        com.mongodb.app.Games object = null;
        while (objects.hasNext()) {
            object = (com.mongodb.app.Games) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_mongodb_app_GamesRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, (String)primaryKeyValue);
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$genre = ((com_mongodb_app_GamesRealmProxyInterface) object).realmGet$genre();
            if (realmGet$genre != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.genreColKey, objKey, realmGet$genre, false);
            }
            String realmGet$title = ((com_mongodb_app_GamesRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleColKey, objKey, realmGet$title, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.mongodb.app.Games object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.mongodb.app.Games.class);
        long tableNativePtr = table.getNativePtr();
        GamesColumnInfo columnInfo = (GamesColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Games.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_mongodb_app_GamesRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, (String)primaryKeyValue);
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$genre = ((com_mongodb_app_GamesRealmProxyInterface) object).realmGet$genre();
        if (realmGet$genre != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.genreColKey, objKey, realmGet$genre, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.genreColKey, objKey, false);
        }
        String realmGet$title = ((com_mongodb_app_GamesRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleColKey, objKey, realmGet$title, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.titleColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.app.Games.class);
        long tableNativePtr = table.getNativePtr();
        GamesColumnInfo columnInfo = (GamesColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Games.class);
        long pkColumnKey = columnInfo.idColKey;
        com.mongodb.app.Games object = null;
        while (objects.hasNext()) {
            object = (com.mongodb.app.Games) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_mongodb_app_GamesRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, (String)primaryKeyValue);
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$genre = ((com_mongodb_app_GamesRealmProxyInterface) object).realmGet$genre();
            if (realmGet$genre != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.genreColKey, objKey, realmGet$genre, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.genreColKey, objKey, false);
            }
            String realmGet$title = ((com_mongodb_app_GamesRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleColKey, objKey, realmGet$title, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.titleColKey, objKey, false);
            }
        }
    }

    public static com.mongodb.app.Games createDetachedCopy(com.mongodb.app.Games realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.mongodb.app.Games unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.mongodb.app.Games();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.mongodb.app.Games) cachedObject.object;
            }
            unmanagedObject = (com.mongodb.app.Games) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_mongodb_app_GamesRealmProxyInterface unmanagedCopy = (com_mongodb_app_GamesRealmProxyInterface) unmanagedObject;
        com_mongodb_app_GamesRealmProxyInterface realmSource = (com_mongodb_app_GamesRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$genre(realmSource.realmGet$genre());
        unmanagedCopy.realmSet$title(realmSource.realmGet$title());

        return unmanagedObject;
    }

    static com.mongodb.app.Games update(Realm realm, GamesColumnInfo columnInfo, com.mongodb.app.Games realmObject, com.mongodb.app.Games newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_mongodb_app_GamesRealmProxyInterface realmObjectTarget = (com_mongodb_app_GamesRealmProxyInterface) realmObject;
        com_mongodb_app_GamesRealmProxyInterface realmObjectSource = (com_mongodb_app_GamesRealmProxyInterface) newObject;
        Table table = realm.getTable(com.mongodb.app.Games.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.genreColKey, realmObjectSource.realmGet$genre());
        builder.addString(columnInfo.titleColKey, realmObjectSource.realmGet$title());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Games = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{genre:");
        stringBuilder.append(realmGet$genre());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{title:");
        stringBuilder.append(realmGet$title());
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
        com_mongodb_app_GamesRealmProxy aGames = (com_mongodb_app_GamesRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aGames.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aGames.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aGames.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
