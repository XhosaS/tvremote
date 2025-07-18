package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lyz implements ids {
    public final lyy a;
    private final idt d;
    private final idt[] e = new idt[18];
    private final List c = new ArrayList(18);
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();

    public lyz(Context context, lie lieVar, lfn lfnVar) {
        lyy lyyVar = new lyy(context, lieVar, lfnVar);
        this.a = lyyVar;
        lyyVar.setWriteAheadLoggingEnabled(true);
        this.d = new idt(null);
        for (int i = 0; i < 18; i++) {
            this.e[i] = new idt(null);
            this.c.add(new krs());
        }
    }

    private final void i(SQLiteDatabase sQLiteDatabase, boolean z, int i, ieg iegVar, String str) {
        if (z) {
            sQLiteDatabase.setTransactionSuccessful();
        }
        sQLiteDatabase.endTransaction();
        if (!z || i == -1) {
            return;
        }
        this.e[i].eb();
        iegVar.o((idy) this.c.get(i));
        this.d.eb();
        if (i == 10 && iegVar.m()) {
            ksk.j(new lke((Object) this, (Object) iegVar, (Object) str, 6, (byte[]) null));
        }
    }

    public final SQLiteDatabase a() {
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        if (writableDatabase != null) {
            writableDatabase.beginTransactionNonExclusive();
        }
        return writableDatabase;
    }

    public final SQLiteDatabase b() {
        return this.a.getReadableDatabase();
    }

    public final ids c(int... iArr) {
        ids[] idsVarArr = new ids[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            idsVarArr[i] = this.e[iArr[i]];
        }
        return hjt.d(idsVarArr);
    }

    public final void d(SQLiteDatabase sQLiteDatabase) {
        e(sQLiteDatabase, true);
    }

    public final void e(SQLiteDatabase sQLiteDatabase, boolean z) {
        f(sQLiteDatabase, z, -1);
    }

    @Override // defpackage.ids
    public final void ea(iej iejVar) {
        this.d.ea(iejVar);
    }

    @Override // defpackage.ids
    public final void ee(iej iejVar) {
        this.d.ee(iejVar);
    }

    public final void f(SQLiteDatabase sQLiteDatabase, boolean z, int i) {
        a.H(i != 10);
        i(sQLiteDatabase, z, i, ieg.a, "");
    }

    public final void g(SQLiteDatabase sQLiteDatabase, boolean z, ksn ksnVar, String str) {
        i(sQLiteDatabase, z, 10, ieg.f(ksnVar), str);
    }
}
