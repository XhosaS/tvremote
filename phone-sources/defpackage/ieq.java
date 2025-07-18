package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ieq extends SQLiteOpenHelper implements ieh {
    public ieq(Context context) {
        super(context, "purchase_store.db", (SQLiteDatabase.CursorFactory) null, 97);
    }

    @Override // defpackage.ieh
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized ieg a() {
        try {
        } catch (SQLException e) {
            return ieg.b(e);
        }
        return ieg.a(getWritableDatabase());
    }
}
