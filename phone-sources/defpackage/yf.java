package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yf implements zr {
    private final zr a;
    private final zr b;

    public yf(zr zrVar, zr zrVar2) {
        this.a = zrVar;
        this.b = zrVar2;
    }

    @Override // defpackage.zr
    public final int a(clx clxVar) {
        return ykn.j(this.a.a(clxVar) - this.b.a(clxVar), 0);
    }

    @Override // defpackage.zr
    public final int b(clx clxVar, cmi cmiVar) {
        return ykn.j(this.a.b(clxVar, cmiVar) - this.b.b(clxVar, cmiVar), 0);
    }

    @Override // defpackage.zr
    public final int c(clx clxVar, cmi cmiVar) {
        return ykn.j(this.a.c(clxVar, cmiVar) - this.b.c(clxVar, cmiVar), 0);
    }

    @Override // defpackage.zr
    public final int d(clx clxVar) {
        return ykn.j(this.a.d(clxVar) - this.b.d(clxVar), 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf)) {
            return false;
        }
        yf yfVar = (yf) obj;
        return yks.e(yfVar.a, this.a) && yks.e(yfVar.b, this.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
