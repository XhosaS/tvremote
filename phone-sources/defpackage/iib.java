package defpackage;

import com.google.android.apps.googletv.app.data.room.GoogleTvCacheDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iib extends gfa {
    final /* synthetic */ GoogleTvCacheDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iib(GoogleTvCacheDatabase_Impl googleTvCacheDatabase_Impl) {
        super(5, "56f8a281802090ea702b17f6360a40d5", "627aa3c369370a598c2e61d5dde13d18");
        this.d = googleTvCacheDatabase_Impl;
    }

    @Override // defpackage.gfa
    public final void a(gic gicVar) {
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `persistent_cache` (`cache_key` BLOB NOT NULL, `account_name` TEXT NOT NULL, `cache_value` BLOB NOT NULL, `expiration_time_millis` INTEGER NOT NULL, `access_time_millis` INTEGER NOT NULL, `cache_val_bytes` INTEGER NOT NULL, `cache_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        gez.t(gicVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_persistent_cache_cache_key_account_name` ON `persistent_cache` (`cache_key`, `account_name`)");
        gez.t(gicVar, "CREATE INDEX IF NOT EXISTS `index_persistent_cache_access_time_millis` ON `persistent_cache` (`access_time_millis`)");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `cache_domain` (`cache_id` INTEGER NOT NULL, `domain` TEXT NOT NULL, PRIMARY KEY(`cache_id`, `domain`), FOREIGN KEY(`cache_id`) REFERENCES `persistent_cache`(`cache_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        gez.t(gicVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '56f8a281802090ea702b17f6360a40d5')");
    }

    @Override // defpackage.gfa
    public final void b(gic gicVar) {
        gez.t(gicVar, "DROP TABLE IF EXISTS `persistent_cache`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `cache_domain`");
    }

    @Override // defpackage.gfa
    public final void c(gic gicVar) throws Exception {
        gez.t(gicVar, "PRAGMA foreign_keys = ON");
        this.d.v(gicVar);
    }

    @Override // defpackage.gfa
    public final void d(gic gicVar) throws Exception {
        gez.m(gicVar);
    }

    @Override // defpackage.gfa
    public final xqr g(gic gicVar) throws Exception {
        HashMap map = new HashMap(7);
        map.put("cache_key", new ggt("cache_key", "BLOB", true, 0, null, 1));
        map.put("account_name", new ggt("account_name", "TEXT", true, 0, null, 1));
        map.put("cache_value", new ggt("cache_value", "BLOB", true, 0, null, 1));
        map.put("expiration_time_millis", new ggt("expiration_time_millis", "INTEGER", true, 0, null, 1));
        map.put("access_time_millis", new ggt("access_time_millis", "INTEGER", true, 0, null, 1));
        map.put("cache_val_bytes", new ggt("cache_val_bytes", "INTEGER", true, 0, null, 1));
        map.put("cache_id", new ggt("cache_id", "INTEGER", true, 1, null, 1));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new ggv("index_persistent_cache_cache_key_account_name", true, Arrays.asList("cache_key", "account_name"), Arrays.asList("ASC", "ASC")));
        hashSet2.add(new ggv("index_persistent_cache_access_time_millis", false, Arrays.asList("access_time_millis"), Arrays.asList("ASC")));
        ggw ggwVar = new ggw("persistent_cache", map, hashSet, hashSet2);
        ggw ggwVarB = ggs.b(gicVar, "persistent_cache");
        if (!gez.F(ggwVar, ggwVarB)) {
            return new xqr(false, hhh.b(ggwVarB, ggwVar, "persistent_cache(com.google.android.apps.googletv.app.data.room.entities.CacheItem).\n Expected:\n"));
        }
        HashMap map2 = new HashMap(2);
        map2.put("cache_id", new ggt("cache_id", "INTEGER", true, 1, null, 1));
        map2.put("domain", new ggt("domain", "TEXT", true, 2, null, 1));
        HashSet hashSet3 = new HashSet(1);
        hashSet3.add(new ggu("persistent_cache", "CASCADE", "NO ACTION", Arrays.asList("cache_id"), Arrays.asList("cache_id")));
        ggw ggwVar2 = new ggw("cache_domain", map2, hashSet3, new HashSet(0));
        ggw ggwVarB2 = ggs.b(gicVar, "cache_domain");
        return !gez.F(ggwVar2, ggwVarB2) ? new xqr(false, hhh.b(ggwVarB2, ggwVar2, "cache_domain(com.google.android.apps.googletv.app.data.room.entities.CacheDomain).\n Expected:\n")) : new xqr(true, (String) null);
    }

    @Override // defpackage.gfa
    public final void e() {
    }

    @Override // defpackage.gfa
    public final void f() {
    }
}
