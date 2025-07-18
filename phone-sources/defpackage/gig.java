package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gig extends gih {
    private final int a;

    public gig(ghk ghkVar, String str, int i) {
        super(ghkVar, str);
        this.a = i;
    }

    @Override // defpackage.ghi
    public final int a() {
        o();
        return 0;
    }

    @Override // defpackage.ghi
    public final long b(int i) {
        o();
        gez.u(21, "no row");
        throw new yfs();
    }

    @Override // defpackage.ghi
    public final String c(int i) {
        o();
        gez.u(21, "no row");
        throw new yfs();
    }

    @Override // defpackage.ghi, java.lang.AutoCloseable
    public final void close() {
        p();
    }

    @Override // defpackage.ghi
    public final String d(int i) {
        o();
        gez.u(21, "no row");
        throw new yfs();
    }

    @Override // defpackage.ghi
    public final void e(int i, byte[] bArr) {
        bArr.getClass();
        o();
        gez.u(25, "column index out of range");
        throw new yfs();
    }

    @Override // defpackage.ghi
    public final void f(int i, double d) {
        o();
        gez.u(25, "column index out of range");
        throw new yfs();
    }

    @Override // defpackage.ghi
    public final void g(int i, long j) {
        o();
        gez.u(25, "column index out of range");
        throw new yfs();
    }

    @Override // defpackage.ghi
    public final void h(int i) {
        o();
        gez.u(25, "column index out of range");
        throw new yfs();
    }

    @Override // defpackage.ghi
    public final void i(int i, String str) {
        str.getClass();
        o();
        gez.u(25, "column index out of range");
        throw new yfs();
    }

    @Override // defpackage.ghi
    public final void j() {
        o();
    }

    @Override // defpackage.ghi
    public final boolean k(int i) {
        o();
        gez.u(21, "no row");
        throw new yfs();
    }

    @Override // defpackage.ghi
    public final boolean l() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = this.a - 1;
        if (i == 0) {
            ghk ghkVar = this.f;
            ghkVar.g();
            ghkVar.e();
        } else if (i == 1) {
            this.f.e();
        } else if (i == 2) {
            this.f.c();
        } else if (i != 3) {
            ghk ghkVar2 = this.f;
            if (gli.r() == null || gli.s() == null) {
                ((ghu) ghkVar2).c();
            } else {
                Method methodR = gli.r();
                methodR.getClass();
                Method methodS = gli.s();
                methodS.getClass();
                Object objInvoke = methodS.invoke(((ghu) ghkVar2).d, null);
                if (objInvoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                methodR.invoke(objInvoke, 0, null, 0, null);
            }
        } else {
            this.f.d();
        }
        return false;
    }

    @Override // defpackage.ghi
    public final byte[] m(int i) {
        o();
        gez.u(21, "no row");
        throw new yfs();
    }
}
