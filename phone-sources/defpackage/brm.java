package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brm extends brx implements Iterable, yli {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;
    public final List j;

    public brm(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = list;
        this.j = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof brm)) {
            brm brmVar = (brm) obj;
            return yks.e(this.a, brmVar.a) && this.b == brmVar.b && this.c == brmVar.c && this.d == brmVar.d && this.e == brmVar.e && this.f == brmVar.f && this.g == brmVar.g && this.h == brmVar.h && yks.e(this.i, brmVar.i) && yks.e(this.j, brmVar.j);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<brx> iterator() {
        return new brl(this, 0);
    }

    public brm() {
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, brn.a, yhb.a);
    }
}
