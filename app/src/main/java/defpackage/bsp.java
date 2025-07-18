package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bsp extends bsq {
    private final int a;

    public bsp(brm brmVar, String str, int i) {
        super(brmVar, str);
        this.a = i;
    }

    @Override // defpackage.brj
    public final int a() {
        o();
        return 0;
    }

    @Override // defpackage.brj
    public final long b(int i) {
        o();
        bri.b(21, "no row");
        throw new agpb();
    }

    @Override // defpackage.brj
    public final String c(int i) {
        o();
        bri.b(21, "no row");
        throw new agpb();
    }

    @Override // defpackage.brj, java.lang.AutoCloseable
    public final void close() {
        this.h = true;
    }

    @Override // defpackage.brj
    public final String d(int i) {
        o();
        bri.b(21, "no row");
        throw new agpb();
    }

    @Override // defpackage.brj
    public final void e(int i, byte[] bArr) {
        bArr.getClass();
        o();
        bri.b(25, "column index out of range");
        throw new agpb();
    }

    @Override // defpackage.brj
    public final void f(int i, double d) {
        o();
        bri.b(25, "column index out of range");
        throw new agpb();
    }

    @Override // defpackage.brj
    public final void g(int i, long j) {
        o();
        bri.b(25, "column index out of range");
        throw new agpb();
    }

    @Override // defpackage.brj
    public final void h(int i) {
        o();
        bri.b(25, "column index out of range");
        throw new agpb();
    }

    @Override // defpackage.brj
    public final void i(int i, String str) {
        str.getClass();
        o();
        bri.b(25, "column index out of range");
        throw new agpb();
    }

    @Override // defpackage.brj
    public final void j() {
        o();
    }

    @Override // defpackage.brj
    public final boolean k(int i) {
        o();
        bri.b(21, "no row");
        throw new agpb();
    }

    @Override // defpackage.brj
    public final boolean l() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = this.a - 1;
        if (i == 0) {
            SQLiteDatabase sQLiteDatabase = ((brz) this.f).f;
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } else if (i == 1) {
            ((brz) this.f).f.endTransaction();
        } else if (i == 2) {
            ((brz) this.f).f.beginTransaction();
        } else if (i != 3) {
            brm brmVar = this.f;
            bry bryVar = brz.a;
            if (bryVar.a() == null || bryVar.b() == null) {
                ((brz) brmVar).f.beginTransaction();
            } else {
                Method methodA = bryVar.a();
                methodA.getClass();
                Method methodB = bryVar.b();
                methodB.getClass();
                Object objInvoke = methodB.invoke(((brz) brmVar).f, null);
                if (objInvoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                methodA.invoke(objInvoke, 0, null, 0, null);
            }
        } else {
            ((brz) this.f).f.beginTransactionNonExclusive();
        }
        return false;
    }

    @Override // defpackage.brj
    public final byte[] m(int i) {
        o();
        bri.b(21, "no row");
        throw new agpb();
    }
}
