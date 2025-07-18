package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;

/* compiled from: PG */
/* loaded from: classes.dex */
class kzr extends koa {
    final /* synthetic */ kzt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzr(kzt kztVar, Context context) {
        super(context, "google_app_measurement_local.db");
        this.a = kztVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            lbk lbkVar = this.a.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            kzz kzzVar = labVar.c;
            kzzVar.a("Opening the local database failed, dropping and recreating it");
            ktx ktxVar = lbkVar.d;
            if (!lbkVar.a.getDatabasePath("google_app_measurement_local.db").delete()) {
                lbkVar.o(labVar);
                kzzVar.b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                lbk lbkVar2 = this.a.y;
                lab labVar2 = lbkVar2.f;
                lbkVar2.o(labVar2);
                labVar2.c.b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        lbk lbkVar = this.a.y;
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        kuh.b(labVar, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        lbk lbkVar = this.a.y;
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        kuh.a(labVar, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", kzt.a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
