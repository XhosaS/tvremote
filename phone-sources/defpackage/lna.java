package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lna implements lmz {
    private static final String[] a = {"account", "last_playback_start_timestamp", "last_watched_timestamp", "resume_timestamp", "asset_type", "asset_id"};
    private final ldv b;
    private final idr c;
    private final lyz d;
    private final ltw e;

    public lna(ldv ldvVar, lyz lyzVar, ltw ltwVar, idr idrVar) {
        this.b = ldvVar;
        this.d = lyzVar;
        this.e = ltwVar;
        this.c = idrVar;
    }

    @Override // defpackage.lmz
    public final boolean a() {
        lyz lyzVar = this.d;
        Cursor cursorQuery = lyzVar.b().query("purchased_assets", a, "last_playback_is_dirty AND asset_type IN (6,20)", null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                ksn ksnVarB = ksn.b(cursorQuery.getString(0));
                int i = cursorQuery.getInt(4);
                String string = cursorQuery.getString(5);
                long j = cursorQuery.getLong(1);
                long j2 = cursorQuery.getLong(2);
                long j3 = cursorQuery.getLong(3);
                if (!TextUtils.isEmpty(string) && this.b.s(ksnVarB)) {
                    Object objB = this.e.b(luj.a(ksnVarB, ksy.c(i, string), j, j2, new lui(false, j3)));
                    if (!((ieg) objB).m()) {
                        krd.b("Failed to upload last playback with failure " + String.valueOf(((ieg) objB).i()));
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return false;
                    }
                    String str = ksnVarB.a;
                    SQLiteDatabase sQLiteDatabaseA = lyzVar.a();
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("last_playback_is_dirty", (Boolean) false);
                        sQLiteDatabaseA.update("purchased_assets", contentValues, "account = ? AND asset_type IN (6,20) AND asset_id = ?", new String[]{str, string});
                        lyzVar.d(sQLiteDatabaseA);
                    } catch (Throwable th) {
                        lyzVar.d(sQLiteDatabaseA);
                        throw th;
                    }
                }
            } finally {
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        krd.e("Last playback uploaded success");
        this.c.c(Long.valueOf(System.currentTimeMillis()));
        return true;
    }
}
