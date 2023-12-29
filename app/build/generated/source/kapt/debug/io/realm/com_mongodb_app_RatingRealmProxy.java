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
public class com_mongodb_app_RatingRealmProxy extends com.mongodb.app.Rating
    implements RealmObjectProxy, com_mongodb_app_RatingRealmProxyInterface {

    static final class RatingColumnInfo extends ColumnInfo {
        long _idColKey;
        long organizerColKey;
        long ratingColKey;
        long descriptionColKey;

        RatingColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Rating");
            this._idColKey = addColumnDetails("_id", "_id", objectSchemaInfo);
            this.organizerColKey = addColumnDetails("organizer", "organizer", objectSchemaInfo);
            this.ratingColKey = addColumnDetails("rating", "rating", objectSchemaInfo);
            this.descriptionColKey = addColumnDetails("description", "description", objectSchemaInfo);
        }

        RatingColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RatingColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RatingColumnInfo src = (RatingColumnInfo) rawSrc;
            final RatingColumnInfo dst = (RatingColumnInfo) rawDst;
            dst._idColKey = src._idColKey;
            dst.organizerColKey = src.organizerColKey;
            dst.ratingColKey = src.ratingColKey;
            dst.descriptionColKey = src.descriptionColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RatingColumnInfo columnInfo;
    private ProxyState<com.mongodb.app.Rating> proxyState;

    com_mongodb_app_RatingRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RatingColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.mongodb.app.Rating>(this);
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
    public String realmGet$organizer() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.organizerColKey);
    }

    @Override
    public void realmSet$organizer(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'organizer' to null.");
            }
            row.getTable().setString(columnInfo.organizerColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'organizer' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.organizerColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$rating() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.ratingColKey);
    }

    @Override
    public void realmSet$rating(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.ratingColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.ratingColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$description() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.descriptionColKey);
    }

    @Override
    public void realmSet$description(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'description' to null.");
            }
            row.getTable().setString(columnInfo.descriptionColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'description' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.descriptionColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Rating", false, 4, 0);
        builder.addPersistedProperty("_id", RealmFieldType.OBJECT_ID, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("organizer", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("rating", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("description", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RatingColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RatingColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Rating";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Rating";
    }

    @SuppressWarnings("cast")
    public static com.mongodb.app.Rating createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.mongodb.app.Rating obj = null;
        if (update) {
            Table table = realm.getTable(com.mongodb.app.Rating.class);
            RatingColumnInfo columnInfo = (RatingColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Rating.class);
            long pkColumnKey = columnInfo._idColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("_id")) {
                objKey = table.findFirstObjectId(pkColumnKey, (org.bson.types.ObjectId)json.get("_id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.mongodb.app.Rating.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_mongodb_app_RatingRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("_id")) {
                if (json.isNull("_id")) {
                    obj = (io.realm.com_mongodb_app_RatingRealmProxy) realm.createObjectInternal(com.mongodb.app.Rating.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_mongodb_app_RatingRealmProxy) realm.createObjectInternal(com.mongodb.app.Rating.class, json.get("_id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field '_id'.");
            }
        }

        final com_mongodb_app_RatingRealmProxyInterface objProxy = (com_mongodb_app_RatingRealmProxyInterface) obj;
        if (json.has("organizer")) {
            if (json.isNull("organizer")) {
                objProxy.realmSet$organizer(null);
            } else {
                objProxy.realmSet$organizer((String) json.getString("organizer"));
            }
        }
        if (json.has("rating")) {
            if (json.isNull("rating")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'rating' to null.");
            } else {
                objProxy.realmSet$rating((float) json.getDouble("rating"));
            }
        }
        if (json.has("description")) {
            if (json.isNull("description")) {
                objProxy.realmSet$description(null);
            } else {
                objProxy.realmSet$description((String) json.getString("description"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.mongodb.app.Rating createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.mongodb.app.Rating obj = new com.mongodb.app.Rating();
        final com_mongodb_app_RatingRealmProxyInterface objProxy = (com_mongodb_app_RatingRealmProxyInterface) obj;
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
            } else if (name.equals("organizer")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$organizer((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$organizer(null);
                }
            } else if (name.equals("rating")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$rating((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'rating' to null.");
                }
            } else if (name.equals("description")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$description((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$description(null);
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

    static com_mongodb_app_RatingRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.mongodb.app.Rating.class), false, Collections.<String>emptyList());
        io.realm.com_mongodb_app_RatingRealmProxy obj = new io.realm.com_mongodb_app_RatingRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.mongodb.app.Rating copyOrUpdate(Realm realm, RatingColumnInfo columnInfo, com.mongodb.app.Rating object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.mongodb.app.Rating) cachedRealmObject;
        }

        com.mongodb.app.Rating realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.mongodb.app.Rating.class);
            long pkColumnKey = columnInfo._idColKey;
            long objKey = table.findFirstObjectId(pkColumnKey, ((com_mongodb_app_RatingRealmProxyInterface) object).realmGet$_id());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_mongodb_app_RatingRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.mongodb.app.Rating copy(Realm realm, RatingColumnInfo columnInfo, com.mongodb.app.Rating newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.mongodb.app.Rating) cachedRealmObject;
        }

        com_mongodb_app_RatingRealmProxyInterface unmanagedSource = (com_mongodb_app_RatingRealmProxyInterface) newObject;

        Table table = realm.getTable(com.mongodb.app.Rating.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addObjectId(columnInfo._idColKey, unmanagedSource.realmGet$_id());
        builder.addString(columnInfo.organizerColKey, unmanagedSource.realmGet$organizer());
        builder.addFloat(columnInfo.ratingColKey, unmanagedSource.realmGet$rating());
        builder.addString(columnInfo.descriptionColKey, unmanagedSource.realmGet$description());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_mongodb_app_RatingRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.mongodb.app.Rating object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.mongodb.app.Rating.class);
        long tableNativePtr = table.getNativePtr();
        RatingColumnInfo columnInfo = (RatingColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Rating.class);
        long pkColumnKey = columnInfo._idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_mongodb_app_RatingRealmProxyInterface) object).realmGet$_id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstObjectId(tableNativePtr, pkColumnKey, ((org.bson.types.ObjectId)primaryKeyValue).toString());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$organizer = ((com_mongodb_app_RatingRealmProxyInterface) object).realmGet$organizer();
        if (realmGet$organizer != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.organizerColKey, objKey, realmGet$organizer, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.ratingColKey, objKey, ((com_mongodb_app_RatingRealmProxyInterface) object).realmGet$rating(), false);
        String realmGet$description = ((com_mongodb_app_RatingRealmProxyInterface) object).realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descriptionColKey, objKey, realmGet$description, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.app.Rating.class);
        long tableNativePtr = table.getNativePtr();
        RatingColumnInfo columnInfo = (RatingColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Rating.class);
        long pkColumnKey = columnInfo._idColKey;
        com.mongodb.app.Rating object = null;
        while (objects.hasNext()) {
            object = (com.mongodb.app.Rating) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_mongodb_app_RatingRealmProxyInterface) object).realmGet$_id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstObjectId(tableNativePtr, pkColumnKey, ((org.bson.types.ObjectId)primaryKeyValue).toString());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$organizer = ((com_mongodb_app_RatingRealmProxyInterface) object).realmGet$organizer();
            if (realmGet$organizer != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.organizerColKey, objKey, realmGet$organizer, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.ratingColKey, objKey, ((com_mongodb_app_RatingRealmProxyInterface) object).realmGet$rating(), false);
            String realmGet$description = ((com_mongodb_app_RatingRealmProxyInterface) object).realmGet$description();
            if (realmGet$description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descriptionColKey, objKey, realmGet$description, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.mongodb.app.Rating object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.mongodb.app.Rating.class);
        long tableNativePtr = table.getNativePtr();
        RatingColumnInfo columnInfo = (RatingColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Rating.class);
        long pkColumnKey = columnInfo._idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_mongodb_app_RatingRealmProxyInterface) object).realmGet$_id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstObjectId(tableNativePtr, pkColumnKey, ((org.bson.types.ObjectId)primaryKeyValue).toString());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$organizer = ((com_mongodb_app_RatingRealmProxyInterface) object).realmGet$organizer();
        if (realmGet$organizer != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.organizerColKey, objKey, realmGet$organizer, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.organizerColKey, objKey, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.ratingColKey, objKey, ((com_mongodb_app_RatingRealmProxyInterface) object).realmGet$rating(), false);
        String realmGet$description = ((com_mongodb_app_RatingRealmProxyInterface) object).realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descriptionColKey, objKey, realmGet$description, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.descriptionColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.app.Rating.class);
        long tableNativePtr = table.getNativePtr();
        RatingColumnInfo columnInfo = (RatingColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Rating.class);
        long pkColumnKey = columnInfo._idColKey;
        com.mongodb.app.Rating object = null;
        while (objects.hasNext()) {
            object = (com.mongodb.app.Rating) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_mongodb_app_RatingRealmProxyInterface) object).realmGet$_id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstObjectId(tableNativePtr, pkColumnKey, ((org.bson.types.ObjectId)primaryKeyValue).toString());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$organizer = ((com_mongodb_app_RatingRealmProxyInterface) object).realmGet$organizer();
            if (realmGet$organizer != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.organizerColKey, objKey, realmGet$organizer, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.organizerColKey, objKey, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.ratingColKey, objKey, ((com_mongodb_app_RatingRealmProxyInterface) object).realmGet$rating(), false);
            String realmGet$description = ((com_mongodb_app_RatingRealmProxyInterface) object).realmGet$description();
            if (realmGet$description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descriptionColKey, objKey, realmGet$description, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.descriptionColKey, objKey, false);
            }
        }
    }

    public static com.mongodb.app.Rating createDetachedCopy(com.mongodb.app.Rating realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.mongodb.app.Rating unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.mongodb.app.Rating();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.mongodb.app.Rating) cachedObject.object;
            }
            unmanagedObject = (com.mongodb.app.Rating) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_mongodb_app_RatingRealmProxyInterface unmanagedCopy = (com_mongodb_app_RatingRealmProxyInterface) unmanagedObject;
        com_mongodb_app_RatingRealmProxyInterface realmSource = (com_mongodb_app_RatingRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$_id(realmSource.realmGet$_id());
        unmanagedCopy.realmSet$organizer(realmSource.realmGet$organizer());
        unmanagedCopy.realmSet$rating(realmSource.realmGet$rating());
        unmanagedCopy.realmSet$description(realmSource.realmGet$description());

        return unmanagedObject;
    }

    static com.mongodb.app.Rating update(Realm realm, RatingColumnInfo columnInfo, com.mongodb.app.Rating realmObject, com.mongodb.app.Rating newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_mongodb_app_RatingRealmProxyInterface realmObjectTarget = (com_mongodb_app_RatingRealmProxyInterface) realmObject;
        com_mongodb_app_RatingRealmProxyInterface realmObjectSource = (com_mongodb_app_RatingRealmProxyInterface) newObject;
        Table table = realm.getTable(com.mongodb.app.Rating.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addObjectId(columnInfo._idColKey, realmObjectSource.realmGet$_id());
        builder.addString(columnInfo.organizerColKey, realmObjectSource.realmGet$organizer());
        builder.addFloat(columnInfo.ratingColKey, realmObjectSource.realmGet$rating());
        builder.addString(columnInfo.descriptionColKey, realmObjectSource.realmGet$description());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Rating = proxy[");
        stringBuilder.append("{_id:");
        stringBuilder.append(realmGet$_id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{organizer:");
        stringBuilder.append(realmGet$organizer());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{rating:");
        stringBuilder.append(realmGet$rating());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{description:");
        stringBuilder.append(realmGet$description());
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
        com_mongodb_app_RatingRealmProxy aRating = (com_mongodb_app_RatingRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRating.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRating.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRating.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
