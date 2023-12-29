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
public class com_mongodb_app_TaskRealmProxy extends com.mongodb.app.Task
    implements RealmObjectProxy, com_mongodb_app_TaskRealmProxyInterface {

    static final class TaskColumnInfo extends ColumnInfo {
        long idColKey;
        long _partitionColKey;
        long isCompleteColKey;
        long summaryColKey;

        TaskColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Task");
            this.idColKey = addColumnDetails("id", "_id", objectSchemaInfo);
            this._partitionColKey = addColumnDetails("_partition", "_partition", objectSchemaInfo);
            this.isCompleteColKey = addColumnDetails("isComplete", "isComplete", objectSchemaInfo);
            this.summaryColKey = addColumnDetails("summary", "summary", objectSchemaInfo);
        }

        TaskColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new TaskColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final TaskColumnInfo src = (TaskColumnInfo) rawSrc;
            final TaskColumnInfo dst = (TaskColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst._partitionColKey = src._partitionColKey;
            dst.isCompleteColKey = src.isCompleteColKey;
            dst.summaryColKey = src.summaryColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private TaskColumnInfo columnInfo;
    private ProxyState<com.mongodb.app.Task> proxyState;

    com_mongodb_app_TaskRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (TaskColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.mongodb.app.Task>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public org.bson.types.ObjectId realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (org.bson.types.ObjectId) proxyState.getRow$realm().getObjectId(columnInfo.idColKey);
    }

    @Override
    public void realmSet$id(org.bson.types.ObjectId value) {
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
    public boolean realmGet$isComplete() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isCompleteColKey);
    }

    @Override
    public void realmSet$isComplete(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isCompleteColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isCompleteColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$summary() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.summaryColKey);
    }

    @Override
    public void realmSet$summary(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'summary' to null.");
            }
            row.getTable().setString(columnInfo.summaryColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'summary' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.summaryColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Task", false, 4, 0);
        builder.addPersistedProperty("_id", RealmFieldType.OBJECT_ID, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("_partition", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("isComplete", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("summary", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TaskColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new TaskColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Task";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Task";
    }

    @SuppressWarnings("cast")
    public static com.mongodb.app.Task createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.mongodb.app.Task obj = null;
        if (update) {
            Table table = realm.getTable(com.mongodb.app.Task.class);
            TaskColumnInfo columnInfo = (TaskColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Task.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                objKey = table.findFirstObjectId(pkColumnKey, (org.bson.types.ObjectId)json.get("id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.mongodb.app.Task.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_mongodb_app_TaskRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_mongodb_app_TaskRealmProxy) realm.createObjectInternal(com.mongodb.app.Task.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_mongodb_app_TaskRealmProxy) realm.createObjectInternal(com.mongodb.app.Task.class, json.get("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_mongodb_app_TaskRealmProxyInterface objProxy = (com_mongodb_app_TaskRealmProxyInterface) obj;
        if (json.has("_partition")) {
            if (json.isNull("_partition")) {
                objProxy.realmSet$_partition(null);
            } else {
                objProxy.realmSet$_partition((String) json.getString("_partition"));
            }
        }
        if (json.has("isComplete")) {
            if (json.isNull("isComplete")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isComplete' to null.");
            } else {
                objProxy.realmSet$isComplete((boolean) json.getBoolean("isComplete"));
            }
        }
        if (json.has("summary")) {
            if (json.isNull("summary")) {
                objProxy.realmSet$summary(null);
            } else {
                objProxy.realmSet$summary((String) json.getString("summary"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.mongodb.app.Task createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.mongodb.app.Task obj = new com.mongodb.app.Task();
        final com_mongodb_app_TaskRealmProxyInterface objProxy = (com_mongodb_app_TaskRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                } else {
                    objProxy.realmSet$id(new org.bson.types.ObjectId(reader.nextString()));
                }
            } else if (name.equals("_partition")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$_partition((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$_partition(null);
                }
            } else if (name.equals("isComplete")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isComplete((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isComplete' to null.");
                }
            } else if (name.equals("summary")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$summary((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$summary(null);
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

    static com_mongodb_app_TaskRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.mongodb.app.Task.class), false, Collections.<String>emptyList());
        io.realm.com_mongodb_app_TaskRealmProxy obj = new io.realm.com_mongodb_app_TaskRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.mongodb.app.Task copyOrUpdate(Realm realm, TaskColumnInfo columnInfo, com.mongodb.app.Task object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.mongodb.app.Task) cachedRealmObject;
        }

        com.mongodb.app.Task realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.mongodb.app.Task.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = table.findFirstObjectId(pkColumnKey, ((com_mongodb_app_TaskRealmProxyInterface) object).realmGet$id());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_mongodb_app_TaskRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.mongodb.app.Task copy(Realm realm, TaskColumnInfo columnInfo, com.mongodb.app.Task newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.mongodb.app.Task) cachedRealmObject;
        }

        com_mongodb_app_TaskRealmProxyInterface unmanagedSource = (com_mongodb_app_TaskRealmProxyInterface) newObject;

        Table table = realm.getTable(com.mongodb.app.Task.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addObjectId(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addString(columnInfo._partitionColKey, unmanagedSource.realmGet$_partition());
        builder.addBoolean(columnInfo.isCompleteColKey, unmanagedSource.realmGet$isComplete());
        builder.addString(columnInfo.summaryColKey, unmanagedSource.realmGet$summary());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_mongodb_app_TaskRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.mongodb.app.Task object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.mongodb.app.Task.class);
        long tableNativePtr = table.getNativePtr();
        TaskColumnInfo columnInfo = (TaskColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Task.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_mongodb_app_TaskRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstObjectId(tableNativePtr, pkColumnKey, ((org.bson.types.ObjectId)primaryKeyValue).toString());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$_partition = ((com_mongodb_app_TaskRealmProxyInterface) object).realmGet$_partition();
        if (realmGet$_partition != null) {
            Table.nativeSetString(tableNativePtr, columnInfo._partitionColKey, objKey, realmGet$_partition, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isCompleteColKey, objKey, ((com_mongodb_app_TaskRealmProxyInterface) object).realmGet$isComplete(), false);
        String realmGet$summary = ((com_mongodb_app_TaskRealmProxyInterface) object).realmGet$summary();
        if (realmGet$summary != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.summaryColKey, objKey, realmGet$summary, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.app.Task.class);
        long tableNativePtr = table.getNativePtr();
        TaskColumnInfo columnInfo = (TaskColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Task.class);
        long pkColumnKey = columnInfo.idColKey;
        com.mongodb.app.Task object = null;
        while (objects.hasNext()) {
            object = (com.mongodb.app.Task) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_mongodb_app_TaskRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstObjectId(tableNativePtr, pkColumnKey, ((org.bson.types.ObjectId)primaryKeyValue).toString());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$_partition = ((com_mongodb_app_TaskRealmProxyInterface) object).realmGet$_partition();
            if (realmGet$_partition != null) {
                Table.nativeSetString(tableNativePtr, columnInfo._partitionColKey, objKey, realmGet$_partition, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isCompleteColKey, objKey, ((com_mongodb_app_TaskRealmProxyInterface) object).realmGet$isComplete(), false);
            String realmGet$summary = ((com_mongodb_app_TaskRealmProxyInterface) object).realmGet$summary();
            if (realmGet$summary != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.summaryColKey, objKey, realmGet$summary, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.mongodb.app.Task object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.mongodb.app.Task.class);
        long tableNativePtr = table.getNativePtr();
        TaskColumnInfo columnInfo = (TaskColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Task.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_mongodb_app_TaskRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstObjectId(tableNativePtr, pkColumnKey, ((org.bson.types.ObjectId)primaryKeyValue).toString());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$_partition = ((com_mongodb_app_TaskRealmProxyInterface) object).realmGet$_partition();
        if (realmGet$_partition != null) {
            Table.nativeSetString(tableNativePtr, columnInfo._partitionColKey, objKey, realmGet$_partition, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo._partitionColKey, objKey, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isCompleteColKey, objKey, ((com_mongodb_app_TaskRealmProxyInterface) object).realmGet$isComplete(), false);
        String realmGet$summary = ((com_mongodb_app_TaskRealmProxyInterface) object).realmGet$summary();
        if (realmGet$summary != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.summaryColKey, objKey, realmGet$summary, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.summaryColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.app.Task.class);
        long tableNativePtr = table.getNativePtr();
        TaskColumnInfo columnInfo = (TaskColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Task.class);
        long pkColumnKey = columnInfo.idColKey;
        com.mongodb.app.Task object = null;
        while (objects.hasNext()) {
            object = (com.mongodb.app.Task) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_mongodb_app_TaskRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstObjectId(tableNativePtr, pkColumnKey, ((org.bson.types.ObjectId)primaryKeyValue).toString());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$_partition = ((com_mongodb_app_TaskRealmProxyInterface) object).realmGet$_partition();
            if (realmGet$_partition != null) {
                Table.nativeSetString(tableNativePtr, columnInfo._partitionColKey, objKey, realmGet$_partition, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo._partitionColKey, objKey, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isCompleteColKey, objKey, ((com_mongodb_app_TaskRealmProxyInterface) object).realmGet$isComplete(), false);
            String realmGet$summary = ((com_mongodb_app_TaskRealmProxyInterface) object).realmGet$summary();
            if (realmGet$summary != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.summaryColKey, objKey, realmGet$summary, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.summaryColKey, objKey, false);
            }
        }
    }

    public static com.mongodb.app.Task createDetachedCopy(com.mongodb.app.Task realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.mongodb.app.Task unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.mongodb.app.Task();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.mongodb.app.Task) cachedObject.object;
            }
            unmanagedObject = (com.mongodb.app.Task) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_mongodb_app_TaskRealmProxyInterface unmanagedCopy = (com_mongodb_app_TaskRealmProxyInterface) unmanagedObject;
        com_mongodb_app_TaskRealmProxyInterface realmSource = (com_mongodb_app_TaskRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$_partition(realmSource.realmGet$_partition());
        unmanagedCopy.realmSet$isComplete(realmSource.realmGet$isComplete());
        unmanagedCopy.realmSet$summary(realmSource.realmGet$summary());

        return unmanagedObject;
    }

    static com.mongodb.app.Task update(Realm realm, TaskColumnInfo columnInfo, com.mongodb.app.Task realmObject, com.mongodb.app.Task newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_mongodb_app_TaskRealmProxyInterface realmObjectTarget = (com_mongodb_app_TaskRealmProxyInterface) realmObject;
        com_mongodb_app_TaskRealmProxyInterface realmObjectSource = (com_mongodb_app_TaskRealmProxyInterface) newObject;
        Table table = realm.getTable(com.mongodb.app.Task.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addObjectId(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo._partitionColKey, realmObjectSource.realmGet$_partition());
        builder.addBoolean(columnInfo.isCompleteColKey, realmObjectSource.realmGet$isComplete());
        builder.addString(columnInfo.summaryColKey, realmObjectSource.realmGet$summary());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Task = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{_partition:");
        stringBuilder.append(realmGet$_partition());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isComplete:");
        stringBuilder.append(realmGet$isComplete());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{summary:");
        stringBuilder.append(realmGet$summary());
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
        com_mongodb_app_TaskRealmProxy aTask = (com_mongodb_app_TaskRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aTask.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aTask.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aTask.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
