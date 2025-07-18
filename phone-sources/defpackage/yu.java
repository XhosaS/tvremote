package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yu implements zr {
    private final zr a;
    private final int b;

    public yu(zr zrVar, int i) {
        this.a = zrVar;
        this.b = i;
    }

    @Override // defpackage.zr
    public final int a(clx clxVar) {
        if (zv.b(this.b, 32)) {
            return this.a.a(clxVar);
        }
        return 0;
    }

    @Override // defpackage.zr
    public final int b(clx clxVar, cmi cmiVar) {
        if (zv.b(this.b, cmiVar == cmi.a ? 8 : 2)) {
            return this.a.b(clxVar, cmiVar);
        }
        return 0;
    }

    @Override // defpackage.zr
    public final int c(clx clxVar, cmi cmiVar) {
        if (zv.b(this.b, cmiVar == cmi.a ? 4 : 1)) {
            return this.a.c(clxVar, cmiVar);
        }
        return 0;
    }

    @Override // defpackage.zr
    public final int d(clx clxVar) {
        if (zv.b(this.b, 16)) {
            return this.a.d(clxVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu)) {
            return false;
        }
        yu yuVar = (yu) obj;
        return yks.e(this.a, yuVar.a) && a.r(this.b, yuVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.b;
        if ((i & 9) == 9) {
            zv.a(sb3, "Start");
        }
        if ((i & 10) == 10) {
            zv.a(sb3, "Left");
        }
        if ((i & 16) == 16) {
            zv.a(sb3, "Top");
        }
        if ((i & 6) == 6) {
            zv.a(sb3, "End");
        }
        if ((i & 5) == 5) {
            zv.a(sb3, "Right");
        }
        if ((i & 32) == 32) {
            zv.a(sb3, "Bottom");
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
