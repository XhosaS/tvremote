package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzs {
    public static final dzs a = new dzs(new dzr());
    public static final String b = edt.Z(0);
    public static final String c = edt.Z(1);
    public static final String d = edt.Z(2);
    public static final String e = edt.Z(3);
    public static final String f = edt.Z(4);
    public final long g;
    public final long h;
    public final long i;
    public final float j;
    public final float k;

    public dzs(dzr dzrVar) {
        long j = dzrVar.a;
        long j2 = dzrVar.b;
        long j3 = dzrVar.c;
        float f2 = dzrVar.d;
        float f3 = dzrVar.e;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = f2;
        this.k = f3;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        dzs dzsVar = a;
        long j = dzsVar.g;
        long j2 = this.g;
        if (j2 != j) {
            bundle.putLong(b, j2);
        }
        long j3 = this.h;
        if (j3 != dzsVar.h) {
            bundle.putLong(c, j3);
        }
        long j4 = this.i;
        if (j4 != dzsVar.i) {
            bundle.putLong(d, j4);
        }
        float f2 = this.j;
        if (f2 != dzsVar.j) {
            bundle.putFloat(e, f2);
        }
        float f3 = this.k;
        if (f3 != dzsVar.k) {
            bundle.putFloat(f, f3);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzs)) {
            return false;
        }
        dzs dzsVar = (dzs) obj;
        return this.g == dzsVar.g && this.h == dzsVar.h && this.i == dzsVar.i && this.j == dzsVar.j && this.k == dzsVar.k;
    }

    public final int hashCode() {
        float f2 = this.j;
        int iFloatToIntBits = f2 != 0.0f ? Float.floatToIntBits(f2) : 0;
        long j = this.g;
        long j2 = this.h;
        long j3 = this.i;
        float f3 = this.k;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + iFloatToIntBits) * 31) + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }
}
