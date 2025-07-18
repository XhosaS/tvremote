package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdi extends bmj {
    @Override // defpackage.bmj
    public final void a(brm brmVar) {
        brz brzVar = (brz) brmVar;
        SQLiteDatabase sQLiteDatabase = brzVar.f;
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - cer.a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            brzVar.f.endTransaction();
        }
    }
}
