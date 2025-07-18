package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bse {
    public final brz a(bsb bsbVar, SQLiteDatabase sQLiteDatabase) {
        bsbVar.getClass();
        brz brzVar = bsbVar.a;
        if (brzVar != null && agvy.c(brzVar.f, sQLiteDatabase)) {
            return brzVar;
        }
        brz brzVar2 = new brz(sQLiteDatabase);
        bsbVar.a = brzVar2;
        return brzVar2;
    }
}
