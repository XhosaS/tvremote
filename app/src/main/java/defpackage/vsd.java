package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vsd {
    public static final yyk a(Cursor cursor, agux aguxVar) {
        int i = yyk.e;
        yyf yyfVar = new yyf(4);
        if (cursor.moveToFirst()) {
            do {
                yyfVar.g(aguxVar.a(new vsx(cursor)));
            } while (cursor.moveToNext());
        }
        yyk yykVarF = yyfVar.f();
        yykVarF.getClass();
        return yykVarF;
    }

    public static final Object b(agte agteVar, agux aguxVar, agsw agswVar) {
        return ahbu.a(new vsc(agteVar, aguxVar, null), agswVar);
    }
}
