package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ghs implements ykb {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ghs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ghq, java.lang.Object] */
    @Override // defpackage.ykb
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        if (this.b == 0) {
            SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
            String[] strArr = ghu.a;
            sQLiteQuery.getClass();
            this.a.g(new gia(sQLiteQuery));
            return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
        }
        int i = ((cje) obj3).a;
        cku ckuVar = (cku) this.a;
        bdy bdyVarB = ckuVar.g.b((ciy) obj, (cji) obj2, i);
        if (bdyVarB instanceof cjt) {
            Object obj5 = ((cjt) bdyVarB).a;
            obj5.getClass();
            return (Typeface) obj5;
        }
        cvi cviVar = new cvi(bdyVarB, ckuVar.f);
        ckuVar.f = cviVar;
        Object obj6 = cviVar.c;
        obj6.getClass();
        return (Typeface) obj6;
    }
}
