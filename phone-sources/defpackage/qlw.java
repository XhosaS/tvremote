package defpackage;

import com.google.android.libraries.notifications.platform.internal.room.GnpPerAccountRoomDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qlw extends gfa {
    final /* synthetic */ GnpPerAccountRoomDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlw(GnpPerAccountRoomDatabase_Impl gnpPerAccountRoomDatabase_Impl) {
        super(1, "448fa2df507764c816e7bbb286fadc75", "d44e4be256518704d4e3ee4b6b089c9f");
        this.d = gnpPerAccountRoomDatabase_Impl;
    }

    @Override // defpackage.gfa
    public final void a(gic gicVar) {
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `threads` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `thread_id` TEXT NOT NULL, `read_state` INTEGER NOT NULL, `deletion_status` INTEGER NOT NULL, `count_behavior` INTEGER NOT NULL, `system_tray_behavior` INTEGER NOT NULL, `last_updated_version` INTEGER NOT NULL, `last_notification_version` INTEGER NOT NULL, `creation_id` INTEGER NOT NULL, `payload_type` TEXT, `payload` BLOB, `insertion_time_ms` INTEGER NOT NULL, `storage_mode` INTEGER NOT NULL, `opaque_backend_data` BLOB NOT NULL, `thread_type` INTEGER NOT NULL, `type_specific_data` BLOB NOT NULL, `external_experiment_ids` TEXT NOT NULL)");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        gez.t(gicVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '448fa2df507764c816e7bbb286fadc75')");
    }

    @Override // defpackage.gfa
    public final void b(gic gicVar) {
        gez.t(gicVar, "DROP TABLE IF EXISTS `threads`");
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
        HashMap map = new HashMap(17);
        map.put("id", new ggt("id", "INTEGER", true, 1, null, 1));
        map.put("thread_id", new ggt("thread_id", "TEXT", true, 0, null, 1));
        map.put("read_state", new ggt("read_state", "INTEGER", true, 0, null, 1));
        map.put("deletion_status", new ggt("deletion_status", "INTEGER", true, 0, null, 1));
        map.put("count_behavior", new ggt("count_behavior", "INTEGER", true, 0, null, 1));
        map.put("system_tray_behavior", new ggt("system_tray_behavior", "INTEGER", true, 0, null, 1));
        map.put("last_updated_version", new ggt("last_updated_version", "INTEGER", true, 0, null, 1));
        map.put("last_notification_version", new ggt("last_notification_version", "INTEGER", true, 0, null, 1));
        map.put("creation_id", new ggt("creation_id", "INTEGER", true, 0, null, 1));
        map.put("payload_type", new ggt("payload_type", "TEXT", false, 0, null, 1));
        map.put("payload", new ggt("payload", "BLOB", false, 0, null, 1));
        map.put("insertion_time_ms", new ggt("insertion_time_ms", "INTEGER", true, 0, null, 1));
        map.put("storage_mode", new ggt("storage_mode", "INTEGER", true, 0, null, 1));
        map.put("opaque_backend_data", new ggt("opaque_backend_data", "BLOB", true, 0, null, 1));
        map.put("thread_type", new ggt("thread_type", "INTEGER", true, 0, null, 1));
        map.put("type_specific_data", new ggt("type_specific_data", "BLOB", true, 0, null, 1));
        map.put("external_experiment_ids", new ggt("external_experiment_ids", "TEXT", true, 0, null, 1));
        ggw ggwVar = new ggw("threads", map, new HashSet(0), new HashSet(0));
        ggw ggwVarB = ggs.b(gicVar, "threads");
        return !gez.F(ggwVar, ggwVarB) ? new xqr(false, hhh.b(ggwVarB, ggwVar, "threads(com.google.android.libraries.notifications.platform.internal.room.ChimeThreadEntity).\n Expected:\n")) : new xqr(true, (String) null);
    }

    @Override // defpackage.gfa
    public final void e() {
    }

    @Override // defpackage.gfa
    public final void f() {
    }
}
