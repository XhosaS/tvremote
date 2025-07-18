package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wz implements zr {
    private final int a;
    private final String b;
    private final bcb c;
    private final bcb d;

    public wz(int i, String str) {
        this.a = i;
        this.b = str;
        csr csrVar = csr.a;
        bcz bczVar = bcz.c;
        this.c = new bci(csrVar, bczVar);
        this.d = new bci(true, bczVar);
    }

    @Override // defpackage.zr
    public final int a(clx clxVar) {
        return e().e;
    }

    @Override // defpackage.zr
    public final int b(clx clxVar, cmi cmiVar) {
        return e().b;
    }

    @Override // defpackage.zr
    public final int c(clx clxVar, cmi cmiVar) {
        return e().d;
    }

    @Override // defpackage.zr
    public final int d(clx clxVar) {
        return e().c;
    }

    public final csr e() {
        return (csr) this.c.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wz) && this.a == ((wz) obj).a;
    }

    public final void f(cyh cyhVar) {
        int i = this.a;
        this.c.b(cyhVar.f(i));
        this.d.b(Boolean.valueOf(cyhVar.v(i)));
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.b + '(' + e().b + ", " + e().c + ", " + e().d + ", " + e().e + ')';
    }
}
