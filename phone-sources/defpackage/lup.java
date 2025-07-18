package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lup implements idf {
    private final iea a;
    private final ieg b;
    private final int c;
    private final long d;
    private final lyz e;

    public lup(iea ieaVar, lyz lyzVar, int i, Drawable drawable, long j) {
        this.a = ieaVar;
        this.e = lyzVar;
        this.c = i;
        this.b = ieg.f(drawable);
        this.d = j;
    }

    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) {
        List list;
        String str = (String) obj;
        ldy ldyVar = (ldy) this.a;
        if (ldyVar.a().k()) {
            return Collections.EMPTY_LIST;
        }
        String strBuildQueryString = SQLiteQueryBuilder.buildQueryString(true, "search_history", luo.b, luo.a, null, null, "timestamp DESC", String.valueOf(this.c));
        String strE = mei.e(str);
        Cursor cursorRawQuery = this.e.b().rawQuery(strBuildQueryString, new String[]{ksn.c(ldyVar.a()), strE.concat("%"), "% " + strE + "%", Long.toString(System.currentTimeMillis() - (this.d * 1000))});
        try {
            int count = cursorRawQuery.getCount();
            if (count == 0) {
                list = Collections.EMPTY_LIST;
                if (cursorRawQuery == null) {
                    return list;
                }
            } else {
                ArrayList arrayList = new ArrayList(count);
                while (cursorRawQuery.moveToNext()) {
                    arrayList.add(tha.b(cursorRawQuery.getString(0), this.b));
                }
                if (cursorRawQuery == null) {
                    return arrayList;
                }
                list = arrayList;
            }
            cursorRawQuery.close();
            return list;
        } finally {
        }
    }
}
