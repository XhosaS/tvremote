package defpackage;

import com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qmf extends gfa {
    final /* synthetic */ GnpRoomDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmf(GnpRoomDatabase_Impl gnpRoomDatabase_Impl) {
        super(9, "96ef747075977340544a7fd178d7b145", "971093f20d339fcd3f21f8ebaf20b8db");
        this.d = gnpRoomDatabase_Impl;
    }

    @Override // defpackage.gfa
    public final void a(gic gicVar) {
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `gnp_accounts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `account_specific_id` TEXT, `account_type` INTEGER, `obfuscated_gaia_id` TEXT, `actual_account_name` TEXT, `actual_account_oid` TEXT, `registration_status` INTEGER NOT NULL, `registration_id` TEXT, `sync_sources` TEXT, `representative_target_id` TEXT, `sync_version` INTEGER NOT NULL DEFAULT 0, `last_registration_time_ms` INTEGER NOT NULL DEFAULT 0, `last_registration_request_hash` INTEGER NOT NULL DEFAULT 0, `first_registration_version` INTEGER NOT NULL DEFAULT 0, `internal_target_id` TEXT, `fitbit_decoded_id` INTEGER NOT NULL DEFAULT 0)");
        gez.t(gicVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_gnp_accounts_account_specific_id` ON `gnp_accounts` (`account_specific_id`)");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        gez.t(gicVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '96ef747075977340544a7fd178d7b145')");
    }

    @Override // defpackage.gfa
    public final void b(gic gicVar) {
        gez.t(gicVar, "DROP TABLE IF EXISTS `gnp_accounts`");
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
        HashMap map = new HashMap(16);
        map.put("id", new ggt("id", "INTEGER", true, 1, null, 1));
        map.put("account_specific_id", new ggt("account_specific_id", "TEXT", false, 0, null, 1));
        map.put("account_type", new ggt("account_type", "INTEGER", false, 0, null, 1));
        map.put("obfuscated_gaia_id", new ggt("obfuscated_gaia_id", "TEXT", false, 0, null, 1));
        map.put("actual_account_name", new ggt("actual_account_name", "TEXT", false, 0, null, 1));
        map.put("actual_account_oid", new ggt("actual_account_oid", "TEXT", false, 0, null, 1));
        map.put("registration_status", new ggt("registration_status", "INTEGER", true, 0, null, 1));
        map.put("registration_id", new ggt("registration_id", "TEXT", false, 0, null, 1));
        map.put("sync_sources", new ggt("sync_sources", "TEXT", false, 0, null, 1));
        map.put("representative_target_id", new ggt("representative_target_id", "TEXT", false, 0, null, 1));
        map.put("sync_version", new ggt("sync_version", "INTEGER", true, 0, "0", 1));
        map.put("last_registration_time_ms", new ggt("last_registration_time_ms", "INTEGER", true, 0, "0", 1));
        map.put("last_registration_request_hash", new ggt("last_registration_request_hash", "INTEGER", true, 0, "0", 1));
        map.put("first_registration_version", new ggt("first_registration_version", "INTEGER", true, 0, "0", 1));
        map.put("internal_target_id", new ggt("internal_target_id", "TEXT", false, 0, null, 1));
        map.put("fitbit_decoded_id", new ggt("fitbit_decoded_id", "INTEGER", true, 0, "0", 1));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new ggv("index_gnp_accounts_account_specific_id", true, Arrays.asList("account_specific_id"), Arrays.asList("ASC")));
        ggw ggwVar = new ggw("gnp_accounts", map, hashSet, hashSet2);
        ggw ggwVarB = ggs.b(gicVar, "gnp_accounts");
        return !gez.F(ggwVar, ggwVarB) ? new xqr(false, hhh.b(ggwVarB, ggwVar, "gnp_accounts(com.google.android.libraries.notifications.platform.data.entities.GnpAccount).\n Expected:\n")) : new xqr(true, (String) null);
    }

    @Override // defpackage.gfa
    public final void e() {
    }

    @Override // defpackage.gfa
    public final void f() {
    }
}
