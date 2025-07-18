package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zp implements zr {
    private final String a;
    private final bcb b;

    public zp(yp ypVar, String str) {
        this.a = str;
        this.b = new bci(ypVar, bcz.c);
    }

    @Override // defpackage.zr
    public final int a(clx clxVar) {
        return e().d;
    }

    @Override // defpackage.zr
    public final int b(clx clxVar, cmi cmiVar) {
        return e().a;
    }

    @Override // defpackage.zr
    public final int c(clx clxVar, cmi cmiVar) {
        return e().c;
    }

    @Override // defpackage.zr
    public final int d(clx clxVar) {
        return e().b;
    }

    public final yp e() {
        return (yp) this.b.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zp) {
            return yks.e(e(), ((zp) obj).e());
        }
        return false;
    }

    public final void f(yp ypVar) {
        this.b.b(ypVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + "(left=" + e().a + ", top=" + e().b + ", right=" + e().c + ", bottom=" + e().d + ')';
    }
}
