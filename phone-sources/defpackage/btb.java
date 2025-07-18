package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btb {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final List i;
    public final long j;
    public final long k;

    public btb(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = list;
        this.j = j5;
        this.k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btb)) {
            return false;
        }
        btb btbVar = (btb) obj;
        return a.s(this.a, btbVar.a) && this.b == btbVar.b && a.s(this.c, btbVar.c) && a.s(this.d, btbVar.d) && this.e == btbVar.e && Float.compare(this.f, btbVar.f) == 0 && a.r(this.g, btbVar.g) && this.h == btbVar.h && yks.e(this.i, btbVar.i) && a.s(this.j, btbVar.j) && a.s(this.k, btbVar.k);
    }

    public final int hashCode() {
        int iK = a.k(this.a) * 31;
        float f = this.f;
        boolean z = this.e;
        long j = this.d;
        int iK2 = ((((((((iK + a.k(this.b)) * 31) + a.k(this.c)) * 31) + a.k(j)) * 31) + a.q(z)) * 31) + Float.floatToIntBits(f);
        List list = this.i;
        return (((((((((iK2 * 31) + this.g) * 31) + a.q(this.h)) * 31) + list.hashCode()) * 31) + a.k(this.j)) * 31) + a.k(this.k);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) bsy.a(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) bmx.d(this.c)) + ", position=" + ((Object) bmx.d(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) bth.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) bmx.d(this.j)) + ", originalEventPosition=" + ((Object) bmx.d(this.k)) + ')';
    }
}
