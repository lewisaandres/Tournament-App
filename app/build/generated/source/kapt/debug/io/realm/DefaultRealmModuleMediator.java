package io.realm;


import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(6);
        modelClasses.add(com.mongodb.app.Games.class);
        modelClasses.add(com.mongodb.app.Tournament.class);
        modelClasses.add(com.mongodb.app.Task.class);
        modelClasses.add(com.mongodb.app.User.class);
        modelClasses.add(com.mongodb.app.Group.class);
        modelClasses.add(com.mongodb.app.Rating.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(6);
        infoMap.put(com.mongodb.app.Games.class, io.realm.com_mongodb_app_GamesRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.mongodb.app.Tournament.class, io.realm.com_mongodb_app_TournamentRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.mongodb.app.Task.class, io.realm.com_mongodb_app_TaskRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.mongodb.app.User.class, io.realm.com_mongodb_app_UserRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.mongodb.app.Group.class, io.realm.com_mongodb_app_GroupRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.mongodb.app.Rating.class, io.realm.com_mongodb_app_RatingRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(com.mongodb.app.Games.class)) {
            return io.realm.com_mongodb_app_GamesRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.mongodb.app.Tournament.class)) {
            return io.realm.com_mongodb_app_TournamentRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.mongodb.app.Task.class)) {
            return io.realm.com_mongodb_app_TaskRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.mongodb.app.User.class)) {
            return io.realm.com_mongodb_app_UserRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.mongodb.app.Group.class)) {
            return io.realm.com_mongodb_app_GroupRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.mongodb.app.Rating.class)) {
            return io.realm.com_mongodb_app_RatingRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.mongodb.app.Games.class)) {
            return "Games";
        }
        if (clazz.equals(com.mongodb.app.Tournament.class)) {
            return "Tournament";
        }
        if (clazz.equals(com.mongodb.app.Task.class)) {
            return "Task";
        }
        if (clazz.equals(com.mongodb.app.User.class)) {
            return "User";
        }
        if (clazz.equals(com.mongodb.app.Group.class)) {
            return "Group";
        }
        if (clazz.equals(com.mongodb.app.Rating.class)) {
            return "Rating";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(com.mongodb.app.Games.class)) {
                return clazz.cast(new io.realm.com_mongodb_app_GamesRealmProxy());
            }
            if (clazz.equals(com.mongodb.app.Tournament.class)) {
                return clazz.cast(new io.realm.com_mongodb_app_TournamentRealmProxy());
            }
            if (clazz.equals(com.mongodb.app.Task.class)) {
                return clazz.cast(new io.realm.com_mongodb_app_TaskRealmProxy());
            }
            if (clazz.equals(com.mongodb.app.User.class)) {
                return clazz.cast(new io.realm.com_mongodb_app_UserRealmProxy());
            }
            if (clazz.equals(com.mongodb.app.Group.class)) {
                return clazz.cast(new io.realm.com_mongodb_app_GroupRealmProxy());
            }
            if (clazz.equals(com.mongodb.app.Rating.class)) {
                return clazz.cast(new io.realm.com_mongodb_app_RatingRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.mongodb.app.Games.class)) {
            com_mongodb_app_GamesRealmProxy.GamesColumnInfo columnInfo = (com_mongodb_app_GamesRealmProxy.GamesColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Games.class);
            return clazz.cast(io.realm.com_mongodb_app_GamesRealmProxy.copyOrUpdate(realm, columnInfo, (com.mongodb.app.Games) obj, update, cache, flags));
        }
        if (clazz.equals(com.mongodb.app.Tournament.class)) {
            com_mongodb_app_TournamentRealmProxy.TournamentColumnInfo columnInfo = (com_mongodb_app_TournamentRealmProxy.TournamentColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Tournament.class);
            return clazz.cast(io.realm.com_mongodb_app_TournamentRealmProxy.copyOrUpdate(realm, columnInfo, (com.mongodb.app.Tournament) obj, update, cache, flags));
        }
        if (clazz.equals(com.mongodb.app.Task.class)) {
            com_mongodb_app_TaskRealmProxy.TaskColumnInfo columnInfo = (com_mongodb_app_TaskRealmProxy.TaskColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Task.class);
            return clazz.cast(io.realm.com_mongodb_app_TaskRealmProxy.copyOrUpdate(realm, columnInfo, (com.mongodb.app.Task) obj, update, cache, flags));
        }
        if (clazz.equals(com.mongodb.app.User.class)) {
            com_mongodb_app_UserRealmProxy.UserColumnInfo columnInfo = (com_mongodb_app_UserRealmProxy.UserColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.User.class);
            return clazz.cast(io.realm.com_mongodb_app_UserRealmProxy.copyOrUpdate(realm, columnInfo, (com.mongodb.app.User) obj, update, cache, flags));
        }
        if (clazz.equals(com.mongodb.app.Group.class)) {
            com_mongodb_app_GroupRealmProxy.GroupColumnInfo columnInfo = (com_mongodb_app_GroupRealmProxy.GroupColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Group.class);
            return clazz.cast(io.realm.com_mongodb_app_GroupRealmProxy.copyOrUpdate(realm, columnInfo, (com.mongodb.app.Group) obj, update, cache, flags));
        }
        if (clazz.equals(com.mongodb.app.Rating.class)) {
            com_mongodb_app_RatingRealmProxy.RatingColumnInfo columnInfo = (com_mongodb_app_RatingRealmProxy.RatingColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Rating.class);
            return clazz.cast(io.realm.com_mongodb_app_RatingRealmProxy.copyOrUpdate(realm, columnInfo, (com.mongodb.app.Rating) obj, update, cache, flags));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(com.mongodb.app.Games.class)) {
            io.realm.com_mongodb_app_GamesRealmProxy.insert(realm, (com.mongodb.app.Games) object, cache);
        } else if (clazz.equals(com.mongodb.app.Tournament.class)) {
            io.realm.com_mongodb_app_TournamentRealmProxy.insert(realm, (com.mongodb.app.Tournament) object, cache);
        } else if (clazz.equals(com.mongodb.app.Task.class)) {
            io.realm.com_mongodb_app_TaskRealmProxy.insert(realm, (com.mongodb.app.Task) object, cache);
        } else if (clazz.equals(com.mongodb.app.User.class)) {
            io.realm.com_mongodb_app_UserRealmProxy.insert(realm, (com.mongodb.app.User) object, cache);
        } else if (clazz.equals(com.mongodb.app.Group.class)) {
            io.realm.com_mongodb_app_GroupRealmProxy.insert(realm, (com.mongodb.app.Group) object, cache);
        } else if (clazz.equals(com.mongodb.app.Rating.class)) {
            io.realm.com_mongodb_app_RatingRealmProxy.insert(realm, (com.mongodb.app.Rating) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.mongodb.app.Games.class)) {
                io.realm.com_mongodb_app_GamesRealmProxy.insert(realm, (com.mongodb.app.Games) object, cache);
            } else if (clazz.equals(com.mongodb.app.Tournament.class)) {
                io.realm.com_mongodb_app_TournamentRealmProxy.insert(realm, (com.mongodb.app.Tournament) object, cache);
            } else if (clazz.equals(com.mongodb.app.Task.class)) {
                io.realm.com_mongodb_app_TaskRealmProxy.insert(realm, (com.mongodb.app.Task) object, cache);
            } else if (clazz.equals(com.mongodb.app.User.class)) {
                io.realm.com_mongodb_app_UserRealmProxy.insert(realm, (com.mongodb.app.User) object, cache);
            } else if (clazz.equals(com.mongodb.app.Group.class)) {
                io.realm.com_mongodb_app_GroupRealmProxy.insert(realm, (com.mongodb.app.Group) object, cache);
            } else if (clazz.equals(com.mongodb.app.Rating.class)) {
                io.realm.com_mongodb_app_RatingRealmProxy.insert(realm, (com.mongodb.app.Rating) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.mongodb.app.Games.class)) {
                    io.realm.com_mongodb_app_GamesRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.mongodb.app.Tournament.class)) {
                    io.realm.com_mongodb_app_TournamentRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.mongodb.app.Task.class)) {
                    io.realm.com_mongodb_app_TaskRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.mongodb.app.User.class)) {
                    io.realm.com_mongodb_app_UserRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.mongodb.app.Group.class)) {
                    io.realm.com_mongodb_app_GroupRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.mongodb.app.Rating.class)) {
                    io.realm.com_mongodb_app_RatingRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.mongodb.app.Games.class)) {
            io.realm.com_mongodb_app_GamesRealmProxy.insertOrUpdate(realm, (com.mongodb.app.Games) obj, cache);
        } else if (clazz.equals(com.mongodb.app.Tournament.class)) {
            io.realm.com_mongodb_app_TournamentRealmProxy.insertOrUpdate(realm, (com.mongodb.app.Tournament) obj, cache);
        } else if (clazz.equals(com.mongodb.app.Task.class)) {
            io.realm.com_mongodb_app_TaskRealmProxy.insertOrUpdate(realm, (com.mongodb.app.Task) obj, cache);
        } else if (clazz.equals(com.mongodb.app.User.class)) {
            io.realm.com_mongodb_app_UserRealmProxy.insertOrUpdate(realm, (com.mongodb.app.User) obj, cache);
        } else if (clazz.equals(com.mongodb.app.Group.class)) {
            io.realm.com_mongodb_app_GroupRealmProxy.insertOrUpdate(realm, (com.mongodb.app.Group) obj, cache);
        } else if (clazz.equals(com.mongodb.app.Rating.class)) {
            io.realm.com_mongodb_app_RatingRealmProxy.insertOrUpdate(realm, (com.mongodb.app.Rating) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.mongodb.app.Games.class)) {
                io.realm.com_mongodb_app_GamesRealmProxy.insertOrUpdate(realm, (com.mongodb.app.Games) object, cache);
            } else if (clazz.equals(com.mongodb.app.Tournament.class)) {
                io.realm.com_mongodb_app_TournamentRealmProxy.insertOrUpdate(realm, (com.mongodb.app.Tournament) object, cache);
            } else if (clazz.equals(com.mongodb.app.Task.class)) {
                io.realm.com_mongodb_app_TaskRealmProxy.insertOrUpdate(realm, (com.mongodb.app.Task) object, cache);
            } else if (clazz.equals(com.mongodb.app.User.class)) {
                io.realm.com_mongodb_app_UserRealmProxy.insertOrUpdate(realm, (com.mongodb.app.User) object, cache);
            } else if (clazz.equals(com.mongodb.app.Group.class)) {
                io.realm.com_mongodb_app_GroupRealmProxy.insertOrUpdate(realm, (com.mongodb.app.Group) object, cache);
            } else if (clazz.equals(com.mongodb.app.Rating.class)) {
                io.realm.com_mongodb_app_RatingRealmProxy.insertOrUpdate(realm, (com.mongodb.app.Rating) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.mongodb.app.Games.class)) {
                    io.realm.com_mongodb_app_GamesRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.mongodb.app.Tournament.class)) {
                    io.realm.com_mongodb_app_TournamentRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.mongodb.app.Task.class)) {
                    io.realm.com_mongodb_app_TaskRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.mongodb.app.User.class)) {
                    io.realm.com_mongodb_app_UserRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.mongodb.app.Group.class)) {
                    io.realm.com_mongodb_app_GroupRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.mongodb.app.Rating.class)) {
                    io.realm.com_mongodb_app_RatingRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(com.mongodb.app.Games.class)) {
            return clazz.cast(io.realm.com_mongodb_app_GamesRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.mongodb.app.Tournament.class)) {
            return clazz.cast(io.realm.com_mongodb_app_TournamentRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.mongodb.app.Task.class)) {
            return clazz.cast(io.realm.com_mongodb_app_TaskRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.mongodb.app.User.class)) {
            return clazz.cast(io.realm.com_mongodb_app_UserRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.mongodb.app.Group.class)) {
            return clazz.cast(io.realm.com_mongodb_app_GroupRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.mongodb.app.Rating.class)) {
            return clazz.cast(io.realm.com_mongodb_app_RatingRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(com.mongodb.app.Games.class)) {
            return clazz.cast(io.realm.com_mongodb_app_GamesRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.mongodb.app.Tournament.class)) {
            return clazz.cast(io.realm.com_mongodb_app_TournamentRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.mongodb.app.Task.class)) {
            return clazz.cast(io.realm.com_mongodb_app_TaskRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.mongodb.app.User.class)) {
            return clazz.cast(io.realm.com_mongodb_app_UserRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.mongodb.app.Group.class)) {
            return clazz.cast(io.realm.com_mongodb_app_GroupRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.mongodb.app.Rating.class)) {
            return clazz.cast(io.realm.com_mongodb_app_RatingRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(com.mongodb.app.Games.class)) {
            return clazz.cast(io.realm.com_mongodb_app_GamesRealmProxy.createDetachedCopy((com.mongodb.app.Games) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.mongodb.app.Tournament.class)) {
            return clazz.cast(io.realm.com_mongodb_app_TournamentRealmProxy.createDetachedCopy((com.mongodb.app.Tournament) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.mongodb.app.Task.class)) {
            return clazz.cast(io.realm.com_mongodb_app_TaskRealmProxy.createDetachedCopy((com.mongodb.app.Task) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.mongodb.app.User.class)) {
            return clazz.cast(io.realm.com_mongodb_app_UserRealmProxy.createDetachedCopy((com.mongodb.app.User) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.mongodb.app.Group.class)) {
            return clazz.cast(io.realm.com_mongodb_app_GroupRealmProxy.createDetachedCopy((com.mongodb.app.Group) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.mongodb.app.Rating.class)) {
            return clazz.cast(io.realm.com_mongodb_app_RatingRealmProxy.createDetachedCopy((com.mongodb.app.Rating) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> boolean isEmbedded(Class<E> clazz) {
        if (clazz.equals(com.mongodb.app.Games.class)) {
            return false;
        }
        if (clazz.equals(com.mongodb.app.Tournament.class)) {
            return false;
        }
        if (clazz.equals(com.mongodb.app.Task.class)) {
            return false;
        }
        if (clazz.equals(com.mongodb.app.User.class)) {
            return false;
        }
        if (clazz.equals(com.mongodb.app.Group.class)) {
            return false;
        }
        if (clazz.equals(com.mongodb.app.Rating.class)) {
            return false;
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> void updateEmbeddedObject(Realm realm, E unmanagedObject, E managedObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) managedObject.getClass().getSuperclass();

        if (clazz.equals(com.mongodb.app.Games.class)) {
            throw getNotEmbeddedClassException("com.mongodb.app.Games");
        } else if (clazz.equals(com.mongodb.app.Tournament.class)) {
            throw getNotEmbeddedClassException("com.mongodb.app.Tournament");
        } else if (clazz.equals(com.mongodb.app.Task.class)) {
            throw getNotEmbeddedClassException("com.mongodb.app.Task");
        } else if (clazz.equals(com.mongodb.app.User.class)) {
            throw getNotEmbeddedClassException("com.mongodb.app.User");
        } else if (clazz.equals(com.mongodb.app.Group.class)) {
            throw getNotEmbeddedClassException("com.mongodb.app.Group");
        } else if (clazz.equals(com.mongodb.app.Rating.class)) {
            throw getNotEmbeddedClassException("com.mongodb.app.Rating");
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

}
