package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brp extends brx {
    public final String a;
    public final List b;
    public final int c;
    public final bnn d;
    public final float e;
    public final bnn f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;

    public brp(String str, List list, int i, bnn bnnVar, float f, bnn bnnVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = bnnVar;
        this.e = f;
        this.f = bnnVar2;
        this.g = f2;
        this.h = f3;
        this.i = i2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            brp brpVar = (brp) obj;
            return yks.e(this.a, brpVar.a) && yks.e(this.d, brpVar.d) && this.e == brpVar.e && yks.e(this.f, brpVar.f) && this.g == brpVar.g && this.h == brpVar.h && a.r(this.i, brpVar.i) && a.r(this.j, brpVar.j) && this.k == brpVar.k && this.l == brpVar.l && this.m == brpVar.m && this.n == brpVar.n && a.r(this.c, brpVar.c) && yks.e(this.b, brpVar.b);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        bnn bnnVar = this.d;
        int iHashCode2 = ((((iHashCode * 31) + (bnnVar != null ? bnnVar.hashCode() : 0)) * 31) + Float.floatToIntBits(this.e)) * 31;
        bnn bnnVar2 = this.f;
        return ((((((((((((((((((iHashCode2 + (bnnVar2 != null ? bnnVar2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + this.i) * 31) + this.j) * 31) + Float.floatToIntBits(this.k)) * 31) + Float.floatToIntBits(this.l)) * 31) + Float.floatToIntBits(this.m)) * 31) + Float.floatToIntBits(this.n)) * 31) + this.c;
    }
}
