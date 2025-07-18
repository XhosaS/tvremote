package defpackage;

import com.google.android.libraries.notifications.internal.storage.impl.room.ChimePerAccountRoomDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qaw extends gfa {
    final /* synthetic */ ChimePerAccountRoomDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qaw(ChimePerAccountRoomDatabase_Impl chimePerAccountRoomDatabase_Impl) {
        super(2, "4dff45f02f3e689be0f6f1524b0cca0c", "557f59ae5db83868cf5aa3ce16101df1");
        this.d = chimePerAccountRoomDatabase_Impl;
    }

    @Override // defpackage.gfa
    public final void a(gic gicVar) {
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `chime_thread_states` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `thread_id` TEXT NOT NULL, `last_updated_version` INTEGER NOT NULL, `read_state` INTEGER NOT NULL, `deletion_status` INTEGER NOT NULL, `count_behavior` INTEGER NOT NULL, `system_tray_behavior` INTEGER NOT NULL, `modified_timestamp` INTEGER NOT NULL)");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        gez.t(gicVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4dff45f02f3e689be0f6f1524b0cca0c')");
    }

    @Override // defpackage.gfa
    public final void b(gic gicVar) {
        gez.t(gicVar, "DROP TABLE IF EXISTS `chime_thread_states`");
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
        HashMap map = new HashMap(8);
        map.put("id", new ggt("id", "INTEGER", true, 1, null, 1));
        map.put("thread_id", new ggt("thread_id", "TEXT", true, 0, null, 1));
        map.put("last_updated_version", new ggt("last_updated_version", "INTEGER", true, 0, null, 1));
        map.put("read_state", new ggt("read_state", "INTEGER", true, 0, null, 1));
        map.put("deletion_status", new ggt("deletion_status", "INTEGER", true, 0, null, 1));
        map.put("count_behavior", new ggt("count_behavior", "INTEGER", true, 0, null, 1));
        map.put("system_tray_behavior", new ggt("system_tray_behavior", "INTEGER", true, 0, null, 1));
        map.put("modified_timestamp", new ggt("modified_timestamp", "INTEGER", true, 0, null, 1));
        ggw ggwVar = new ggw("chime_thread_states", map, new HashSet(0), new HashSet(0));
        ggw ggwVarB = ggs.b(gicVar, "chime_thread_states");
        return !gez.F(ggwVar, ggwVarB) ? new xqr(false, hhh.b(ggwVarB, ggwVar, "chime_thread_states(com.google.android.libraries.notifications.internal.storage.impl.room.ChimeThreadState).\n Expected:\n")) : new xqr(true, (String) null);
    }

    @Override // defpackage.gfa
    public final void e() {
    }

    @Override // defpackage.gfa
    public final void f() {
    }
}
