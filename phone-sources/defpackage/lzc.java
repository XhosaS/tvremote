package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lzc implements idp {
    private final lyz a;

    public lzc(lyz lyzVar) {
        this.a = lyzVar;
    }

    @Override // defpackage.idp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ieg c(ksn ksnVar, String str) {
        SQLiteDatabase sQLiteDatabaseB = this.a.b();
        String[] strArr = lzb.a;
        String[] strArr2 = {ksnVar.a, str};
        boolean z = true;
        Cursor cursorQuery = sQLiteDatabaseB.query("purchased_assets, assets ON asset_type = 6 AND assets_type = 6 AND assets_id = asset_id", strArr, "account = ? AND title_eidr_id = ?", strArr2, null, null, null, Integer.toString(1));
        try {
            if (!cursorQuery.moveToFirst()) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return ieg.b(new mfj());
            }
            String string = cursorQuery.getString(0);
            if (cursorQuery.getInt(1) == 6) {
                z = false;
            }
            ieg iegVarB = TextUtils.isEmpty(string) ? ieg.b(new mfj()) : ieg.f(new lzd(ksy.i(string), z));
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return iegVarB;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            try {
                cursorQuery.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
