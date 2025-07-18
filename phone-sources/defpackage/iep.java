package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iep implements idp {
    private final idf a;

    public iep(idf idfVar) {
        this.a = idfVar;
    }

    @Override // defpackage.idp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ieg c(SQLiteDatabase sQLiteDatabase, ier ierVar) {
        ieg iegVarF;
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery(ierVar.b, ierVar.a);
            try {
                int count = cursorRawQuery.getCount();
                if (count == 0) {
                    iegVarF = ieg.f(Collections.EMPTY_LIST);
                } else {
                    ArrayList arrayList = new ArrayList(count);
                    while (cursorRawQuery.moveToNext()) {
                        arrayList.add(this.a.b(cursorRawQuery));
                    }
                    iegVarF = ieg.f(arrayList);
                }
                return iegVarF;
            } finally {
                cursorRawQuery.close();
            }
        } catch (SQLException e) {
            return ieg.b(e);
        }
    }
}
