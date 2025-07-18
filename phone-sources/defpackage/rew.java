package defpackage;

import com.google.android.libraries.onegoogle.accountmenu.cards.db.CardsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rew extends gfa {
    final /* synthetic */ CardsDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rew(CardsDatabase_Impl cardsDatabase_Impl) {
        super(4, "cf66d89d29f160a56452e1ec819be807", "c5e7d25a0e7030289897dda2ecd46001");
        this.d = cardsDatabase_Impl;
    }

    @Override // defpackage.gfa
    public final void a(gic gicVar) {
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `StorageCardDecorationState` (`accountIdentifier` TEXT NOT NULL, `storageState` TEXT NOT NULL, `lastDecorationConsumedTime` INTEGER NOT NULL, `totalTimesConsumed` INTEGER NOT NULL, PRIMARY KEY(`accountIdentifier`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `BackupSyncCardDecorationState` (`accountIdentifier` TEXT NOT NULL, `backupSyncState` TEXT NOT NULL, `lastDecorationConsumedTime` INTEGER NOT NULL, `totalTimesConsumed` INTEGER NOT NULL, PRIMARY KEY(`accountIdentifier`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        gez.t(gicVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cf66d89d29f160a56452e1ec819be807')");
    }

    @Override // defpackage.gfa
    public final void b(gic gicVar) {
        gez.t(gicVar, "DROP TABLE IF EXISTS `StorageCardDecorationState`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `BackupSyncCardDecorationState`");
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
        map.put("accountIdentifier", new ggt("accountIdentifier", "TEXT", true, 1, null, 1));
        map.put("storageState", new ggt("storageState", "TEXT", true, 0, null, 1));
        map.put("lastDecorationConsumedTime", new ggt("lastDecorationConsumedTime", "INTEGER", true, 0, null, 1));
        map.put("totalTimesConsumed", new ggt("totalTimesConsumed", "INTEGER", true, 0, null, 1));
        ggw ggwVar = new ggw("StorageCardDecorationState", map, new HashSet(0), new HashSet(0));
        ggw ggwVarB = ggs.b(gicVar, "StorageCardDecorationState");
        if (!gez.F(ggwVar, ggwVarB)) {
            return new xqr(false, hhh.b(ggwVarB, ggwVar, "StorageCardDecorationState(com.google.android.libraries.onegoogle.accountmenu.cards.db.StorageCardDecorationState).\n Expected:\n"));
        }
        HashMap map2 = new HashMap(4);
        map2.put("accountIdentifier", new ggt("accountIdentifier", "TEXT", true, 1, null, 1));
        map2.put("backupSyncState", new ggt("backupSyncState", "TEXT", true, 0, null, 1));
        map2.put("lastDecorationConsumedTime", new ggt("lastDecorationConsumedTime", "INTEGER", true, 0, null, 1));
        map2.put("totalTimesConsumed", new ggt("totalTimesConsumed", "INTEGER", true, 0, null, 1));
        ggw ggwVar2 = new ggw("BackupSyncCardDecorationState", map2, new HashSet(0), new HashSet(0));
        ggw ggwVarB2 = ggs.b(gicVar, "BackupSyncCardDecorationState");
        return !gez.F(ggwVar2, ggwVarB2) ? new xqr(false, hhh.b(ggwVarB2, ggwVar2, "BackupSyncCardDecorationState(com.google.android.libraries.onegoogle.accountmenu.cards.db.BackupSyncCardDecorationState).\n Expected:\n")) : new xqr(true, (String) null);
    }

    @Override // defpackage.gfa
    public final void e() {
    }

    @Override // defpackage.gfa
    public final void f() {
    }
}
