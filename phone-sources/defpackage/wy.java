package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class wy implements zr {
    private final zr a;
    private final zr b;

    public wy(zr zrVar, zr zrVar2) {
        this.a = zrVar;
        this.b = zrVar2;
    }

    @Override // defpackage.zr
    public final int a(clx clxVar) {
        return this.a.a(clxVar) + this.b.a(clxVar);
    }

    @Override // defpackage.zr
    public final int b(clx clxVar, cmi cmiVar) {
        return this.a.b(clxVar, cmiVar) + this.b.b(clxVar, cmiVar);
    }

    @Override // defpackage.zr
    public final int c(clx clxVar, cmi cmiVar) {
        return this.a.c(clxVar, cmiVar) + this.b.c(clxVar, cmiVar);
    }

    @Override // defpackage.zr
    public final int d(clx clxVar) {
        return this.a.d(clxVar) + this.b.d(clxVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy)) {
            return false;
        }
        wy wyVar = (wy) obj;
        return yks.e(wyVar.a, this.a) && yks.e(wyVar.b, this.b);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " + " + this.b + ')';
    }
}
