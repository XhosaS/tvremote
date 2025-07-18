package defpackage;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mcz implements Runnable {
    final /* synthetic */ mda a;
    private final ksn b;
    private final String c;
    private final String d;
    private final xay e;
    private final boolean f;
    private final int g;

    public mcz(mda mdaVar, ksn ksnVar, String str, xay xayVar, boolean z, int i, String str2) {
        this.a = mdaVar;
        this.b = ksnVar;
        this.c = str;
        this.e = xayVar;
        this.f = z;
        this.g = i;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mda mdaVar;
        mda mdaVar2 = this.a;
        lie lieVar = mdaVar2.a;
        String str = this.c;
        xay xayVar = this.e;
        boolean z = this.f;
        lieVar.ao(str, xayVar, z, this.g, this.d);
        SQLiteDatabase sQLiteDatabaseA = mdaVar2.d.a();
        boolean z2 = false;
        try {
            ContentValues contentValues = new ContentValues();
            String str2 = this.b.a;
            contentValues.put("wishlist_account", str2);
            int i = xayVar.s;
            contentValues.put("wishlist_item_type", Integer.valueOf(i));
            contentValues.put("wishlist_item_id", str);
            if (z) {
                contentValues.put("wishlist_item_state", (Integer) 2);
                boolean z3 = sQLiteDatabaseA.update("wishlist", contentValues, "wishlist_account = ? AND wishlist_item_id = ? AND wishlist_item_type = ? AND wishlist_item_state == 3", new String[]{str2, str, Integer.toString(i)}) > 0;
                if (!z3) {
                    try {
                        contentValues.put("wishlist_item_order", Long.valueOf(-System.currentTimeMillis()));
                        sQLiteDatabaseA.insertOrThrow("wishlist", null, contentValues);
                        z2 = true;
                    } catch (SQLException unused) {
                    }
                }
                z2 = z3;
            } else {
                contentValues.put("wishlist_item_state", (Integer) 3);
                if (sQLiteDatabaseA.update("wishlist", contentValues, "wishlist_account = ? AND wishlist_item_id = ? AND wishlist_item_type = ? AND wishlist_item_state != 3", new String[]{this.b.a, this.c, Integer.toString(this.e.s)}) > 0) {
                    z2 = true;
                }
            }
            if (z2) {
                mdaVar.c.execute(mdaVar.b);
            }
        } finally {
            this.a.d.f(sQLiteDatabaseA, false, 1);
        }
    }
}
