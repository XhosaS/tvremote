package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yo implements yy {
    private final zr a;
    private final clx b;

    public yo(zr zrVar, clx clxVar) {
        this.a = zrVar;
        this.b = clxVar;
    }

    @Override // defpackage.yy
    public final float a() {
        zr zrVar = this.a;
        clx clxVar = this.b;
        return clxVar.cp(zrVar.a(clxVar));
    }

    @Override // defpackage.yy
    public final float b(cmi cmiVar) {
        zr zrVar = this.a;
        clx clxVar = this.b;
        return clxVar.cp(zrVar.b(clxVar, cmiVar));
    }

    @Override // defpackage.yy
    public final float c(cmi cmiVar) {
        zr zrVar = this.a;
        clx clxVar = this.b;
        return clxVar.cp(zrVar.c(clxVar, cmiVar));
    }

    @Override // defpackage.yy
    public final float d() {
        zr zrVar = this.a;
        clx clxVar = this.b;
        return clxVar.cp(zrVar.d(clxVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo)) {
            return false;
        }
        yo yoVar = (yo) obj;
        return yks.e(this.a, yoVar.a) && yks.e(this.b, yoVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
