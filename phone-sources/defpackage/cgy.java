package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgy {
    public final cfy a;
    public final chc b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final clx g;
    public final cmi h;
    public final long i;
    public final esn j;

    public cgy(cfy cfyVar, chc chcVar, List list, int i, boolean z, int i2, clx clxVar, cmi cmiVar, esn esnVar, long j) {
        this.a = cfyVar;
        this.b = chcVar;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = clxVar;
        this.h = cmiVar;
        this.j = esnVar;
        this.i = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgy)) {
            return false;
        }
        cgy cgyVar = (cgy) obj;
        return yks.e(this.a, cgyVar.a) && yks.e(this.b, cgyVar.b) && yks.e(this.c, cgyVar.c) && this.d == cgyVar.d && this.e == cgyVar.e && a.r(this.f, cgyVar.f) && yks.e(this.g, cgyVar.g) && this.h == cgyVar.h && yks.e(this.j, cgyVar.j) && a.s(this.i, cgyVar.i);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        clx clxVar = this.g;
        return (((((((((((((iHashCode * 31) + this.d) * 31) + a.q(this.e)) * 31) + this.f) * 31) + clxVar.hashCode()) * 31) + this.h.hashCode()) * 31) + this.j.hashCode()) * 31) + a.k(this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        sb.append(this.e);
        sb.append(", overflow=");
        int i = this.f;
        sb.append((Object) (a.r(i, 1) ? "Clip" : a.r(i, 2) ? "Ellipsis" : a.r(i, 5) ? "MiddleEllipsis" : a.r(i, 3) ? "Visible" : a.r(i, 4) ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.j);
        sb.append(", constraints=");
        sb.append((Object) clv.e(this.i));
        sb.append(')');
        return sb.toString();
    }
}
