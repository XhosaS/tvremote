package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zl implements zr {
    private final zr a;
    private final zr b;

    public zl(zr zrVar, zr zrVar2) {
        this.a = zrVar;
        this.b = zrVar2;
    }

    @Override // defpackage.zr
    public final int a(clx clxVar) {
        return Math.max(this.a.a(clxVar), this.b.a(clxVar));
    }

    @Override // defpackage.zr
    public final int b(clx clxVar, cmi cmiVar) {
        return Math.max(this.a.b(clxVar, cmiVar), this.b.b(clxVar, cmiVar));
    }

    @Override // defpackage.zr
    public final int c(clx clxVar, cmi cmiVar) {
        return Math.max(this.a.c(clxVar, cmiVar), this.b.c(clxVar, cmiVar));
    }

    @Override // defpackage.zr
    public final int d(clx clxVar) {
        return Math.max(this.a.d(clxVar), this.b.d(clxVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl)) {
            return false;
        }
        zl zlVar = (zl) obj;
        return yks.e(zlVar.a, this.a) && yks.e(zlVar.b, this.b);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
