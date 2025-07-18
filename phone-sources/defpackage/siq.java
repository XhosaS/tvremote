package defpackage;

import com.google.android.libraries.social.populous.storage.room.RoomDatabaseManager_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class siq extends gfa {
    final /* synthetic */ RoomDatabaseManager_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public siq(RoomDatabaseManager_Impl roomDatabaseManager_Impl) {
        super(11, "fcf64a8975f16b0fae88623e444eb418", "0bd3bd5867354f1b7e76c6638a45817c");
        this.d = roomDatabaseManager_Impl;
    }

    @Override // defpackage.gfa
    public final void a(gic gicVar) {
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `CacheInfo` (`rowid` INTEGER NOT NULL, `last_updated` INTEGER NOT NULL, `num_contacts` INTEGER NOT NULL DEFAULT 0, `affinity_response_context` BLOB, PRIMARY KEY(`rowid`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `Contacts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `affinity` REAL NOT NULL, `rank` INTEGER, `type` TEXT NOT NULL DEFAULT 'PERSON', `proto_bytes` BLOB)");
        gez.t(gicVar, "CREATE INDEX IF NOT EXISTS `index_Contacts_type` ON `Contacts` (`type`)");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `ContextualCandidateContexts` (`candidate_id` TEXT NOT NULL, `context_id` TEXT NOT NULL, PRIMARY KEY(`candidate_id`, `context_id`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `ContextualCandidates` (`id` TEXT NOT NULL, `proto_bytes` BLOB NOT NULL, PRIMARY KEY(`id`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `ContextualCandidateInfo` (`candidate_id` TEXT NOT NULL, `last_updated` INTEGER NOT NULL, `last_accessed` INTEGER NOT NULL, PRIMARY KEY(`candidate_id`))");
        gez.t(gicVar, "CREATE VIRTUAL TABLE IF NOT EXISTS `ContextualCandidateTokens` USING FTS4(`candidate_id` TEXT NOT NULL, `value` TEXT NOT NULL, `source_type` TEXT NOT NULL, tokenize=unicode61 `tokenchars=@.-`, notindexed=`candidate_id`, notindexed=`source_type`, prefix=`1`)");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `RpcCache` (`type` TEXT NOT NULL, `key` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `proto_bytes` BLOB, PRIMARY KEY(`type`, `key`))");
        gez.t(gicVar, "CREATE INDEX IF NOT EXISTS `index_RpcCache_type_key_timestamp` ON `RpcCache` (`type`, `key`, `timestamp`)");
        gez.t(gicVar, "CREATE VIRTUAL TABLE IF NOT EXISTS `Tokens` USING FTS4(`contact_id` INTEGER NOT NULL, `value` TEXT, `affinity` REAL NOT NULL, `field_type` TEXT, tokenize=unicode61 `tokenchars=@.-`, notindexed=`contact_id`, notindexed=`affinity`, notindexed=`field_type`, prefix=`1`)");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        gez.t(gicVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fcf64a8975f16b0fae88623e444eb418')");
    }

    @Override // defpackage.gfa
    public final void b(gic gicVar) {
        gez.t(gicVar, "DROP TABLE IF EXISTS `CacheInfo`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `Contacts`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `ContextualCandidateContexts`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `ContextualCandidates`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `ContextualCandidateInfo`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `ContextualCandidateTokens`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `RpcCache`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `Tokens`");
    }

    @Override // defpackage.gfa
    public final void c(gic gicVar) throws Exception {
        this.d.v(gicVar);
    }

    @Override // defpackage.gfa
    public final void d(gic gicVar) throws Exception {
        gez.m(gicVar);
    }

    @Override // defpackage.gfa
    public final xqr g(gic gicVar) throws Exception {
        HashMap map = new HashMap(4);
        map.put("rowid", new ggt("rowid", "INTEGER", true, 1, null, 1));
        map.put("last_updated", new ggt("last_updated", "INTEGER", true, 0, null, 1));
        map.put("num_contacts", new ggt("num_contacts", "INTEGER", true, 0, "0", 1));
        map.put("affinity_response_context", new ggt("affinity_response_context", "BLOB", false, 0, null, 1));
        ggw ggwVar = new ggw("CacheInfo", map, new HashSet(0), new HashSet(0));
        ggw ggwVarB = ggs.b(gicVar, "CacheInfo");
        if (!gez.F(ggwVar, ggwVarB)) {
            return new xqr(false, hhh.b(ggwVarB, ggwVar, "CacheInfo(com.google.android.libraries.social.populous.storage.room.RoomCacheInfoEntity).\n Expected:\n"));
        }
        HashMap map2 = new HashMap(5);
        map2.put("id", new ggt("id", "INTEGER", true, 1, null, 1));
        map2.put("affinity", new ggt("affinity", "REAL", true, 0, null, 1));
        map2.put("rank", new ggt("rank", "INTEGER", false, 0, null, 1));
        map2.put("type", new ggt("type", "TEXT", true, 0, "'PERSON'", 1));
        map2.put("proto_bytes", new ggt("proto_bytes", "BLOB", false, 0, null, 1));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new ggv("index_Contacts_type", false, Arrays.asList("type"), Arrays.asList("ASC")));
        ggw ggwVar2 = new ggw("Contacts", map2, hashSet, hashSet2);
        ggw ggwVarB2 = ggs.b(gicVar, "Contacts");
        if (!gez.F(ggwVar2, ggwVarB2)) {
            return new xqr(false, hhh.b(ggwVarB2, ggwVar2, "Contacts(com.google.android.libraries.social.populous.storage.room.RoomContactEntity).\n Expected:\n"));
        }
        HashMap map3 = new HashMap(2);
        map3.put("candidate_id", new ggt("candidate_id", "TEXT", true, 1, null, 1));
        map3.put("context_id", new ggt("context_id", "TEXT", true, 2, null, 1));
        ggw ggwVar3 = new ggw("ContextualCandidateContexts", map3, new HashSet(0), new HashSet(0));
        ggw ggwVarB3 = ggs.b(gicVar, "ContextualCandidateContexts");
        if (!gez.F(ggwVar3, ggwVarB3)) {
            return new xqr(false, hhh.b(ggwVarB3, ggwVar3, "ContextualCandidateContexts(com.google.android.libraries.social.populous.storage.room.RoomContextualCandidateContextEntity).\n Expected:\n"));
        }
        HashMap map4 = new HashMap(2);
        map4.put("id", new ggt("id", "TEXT", true, 1, null, 1));
        map4.put("proto_bytes", new ggt("proto_bytes", "BLOB", true, 0, null, 1));
        ggw ggwVar4 = new ggw("ContextualCandidates", map4, new HashSet(0), new HashSet(0));
        ggw ggwVarB4 = ggs.b(gicVar, "ContextualCandidates");
        if (!gez.F(ggwVar4, ggwVarB4)) {
            return new xqr(false, hhh.b(ggwVarB4, ggwVar4, "ContextualCandidates(com.google.android.libraries.social.populous.storage.room.RoomContextualCandidateEntity).\n Expected:\n"));
        }
        HashMap map5 = new HashMap(3);
        map5.put("candidate_id", new ggt("candidate_id", "TEXT", true, 1, null, 1));
        map5.put("last_updated", new ggt("last_updated", "INTEGER", true, 0, null, 1));
        map5.put("last_accessed", new ggt("last_accessed", "INTEGER", true, 0, null, 1));
        ggw ggwVar5 = new ggw("ContextualCandidateInfo", map5, new HashSet(0), new HashSet(0));
        ggw ggwVarB5 = ggs.b(gicVar, "ContextualCandidateInfo");
        if (!gez.F(ggwVar5, ggwVarB5)) {
            return new xqr(false, hhh.b(ggwVarB5, ggwVar5, "ContextualCandidateInfo(com.google.android.libraries.social.populous.storage.room.RoomContextualCandidateInfoEntity).\n Expected:\n"));
        }
        HashSet hashSet3 = new HashSet(3);
        hashSet3.add("candidate_id");
        hashSet3.add("value");
        hashSet3.add("source_type");
        ggr ggrVar = new ggr("ContextualCandidateTokens", hashSet3, "CREATE VIRTUAL TABLE IF NOT EXISTS `ContextualCandidateTokens` USING FTS4(`candidate_id` TEXT NOT NULL, `value` TEXT NOT NULL, `source_type` TEXT NOT NULL, tokenize=unicode61 `tokenchars=@.-`, notindexed=`candidate_id`, notindexed=`source_type`, prefix=`1`)");
        ggr ggrVarA = ggr.a(gicVar, "ContextualCandidateTokens");
        if (!gez.h(ggrVar, ggrVarA)) {
            return new xqr(false, "ContextualCandidateTokens(com.google.android.libraries.social.populous.storage.room.RoomContextualCandidateTokenEntity).\n Expected:\n" + gez.g(ggrVar) + "\n Found:\n" + gez.g(ggrVarA));
        }
        HashMap map6 = new HashMap(4);
        map6.put("type", new ggt("type", "TEXT", true, 1, null, 1));
        map6.put("key", new ggt("key", "TEXT", true, 2, null, 1));
        map6.put("timestamp", new ggt("timestamp", "INTEGER", true, 0, null, 1));
        map6.put("proto_bytes", new ggt("proto_bytes", "BLOB", false, 0, null, 1));
        HashSet hashSet4 = new HashSet(0);
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new ggv("index_RpcCache_type_key_timestamp", false, Arrays.asList("type", "key", "timestamp"), Arrays.asList("ASC", "ASC", "ASC")));
        ggw ggwVar6 = new ggw("RpcCache", map6, hashSet4, hashSet5);
        ggw ggwVarB6 = ggs.b(gicVar, "RpcCache");
        if (!gez.F(ggwVar6, ggwVarB6)) {
            return new xqr(false, hhh.b(ggwVarB6, ggwVar6, "RpcCache(com.google.android.libraries.social.populous.storage.room.RoomRpcCacheEntity).\n Expected:\n"));
        }
        HashSet hashSet6 = new HashSet(4);
        hashSet6.add("contact_id");
        hashSet6.add("value");
        hashSet6.add("affinity");
        hashSet6.add("field_type");
        ggr ggrVar2 = new ggr("Tokens", hashSet6, "CREATE VIRTUAL TABLE IF NOT EXISTS `Tokens` USING FTS4(`contact_id` INTEGER NOT NULL, `value` TEXT, `affinity` REAL NOT NULL, `field_type` TEXT, tokenize=unicode61 `tokenchars=@.-`, notindexed=`contact_id`, notindexed=`affinity`, notindexed=`field_type`, prefix=`1`)");
        ggr ggrVarA2 = ggr.a(gicVar, "Tokens");
        if (gez.h(ggrVar2, ggrVarA2)) {
            return new xqr(true, (String) null);
        }
        return new xqr(false, "Tokens(com.google.android.libraries.social.populous.storage.room.RoomTokenEntity).\n Expected:\n" + gez.g(ggrVar2) + "\n Found:\n" + gez.g(ggrVarA2));
    }

    @Override // defpackage.gfa
    public final void e() {
    }

    @Override // defpackage.gfa
    public final void f() {
    }
}
