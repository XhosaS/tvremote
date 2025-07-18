package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ean {
    public final Object e;
    public final int f;
    public final dzy g;
    public final Object h;
    public final int i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    static final String a = edt.Z(0);
    private static final String n = edt.Z(1);
    static final String b = edt.Z(2);
    static final String c = edt.Z(3);
    static final String d = edt.Z(4);
    private static final String o = edt.Z(5);
    private static final String p = edt.Z(6);

    public ean(Object obj, int i, dzy dzyVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.e = obj;
        this.f = i;
        this.g = dzyVar;
        this.h = obj2;
        this.i = i2;
        this.j = j;
        this.k = j2;
        this.l = i3;
        this.m = i4;
    }

    public final Bundle a(int i) {
        Bundle bundle = new Bundle();
        if (i < 3 || this.f != 0) {
            bundle.putInt(a, this.f);
        }
        dzy dzyVar = this.g;
        if (dzyVar != null) {
            bundle.putBundle(n, dzyVar.a());
        }
        if (i < 3 || this.i != 0) {
            bundle.putInt(b, this.i);
        }
        if (i < 3 || this.j != 0) {
            bundle.putLong(c, this.j);
        }
        if (i < 3 || this.k != 0) {
            bundle.putLong(d, this.k);
        }
        int i2 = this.l;
        if (i2 != -1) {
            bundle.putInt(o, i2);
        }
        int i3 = this.m;
        if (i3 != -1) {
            bundle.putInt(p, i3);
        }
        return bundle;
    }

    public final ean b(boolean z, boolean z2) {
        if (z && z2) {
            return this;
        }
        return new ean(this.e, z2 ? this.f : 0, z ? this.g : null, this.h, z2 ? this.i : 0, z ? this.j : 0L, z ? this.k : 0L, z ? this.l : -1, z ? this.m : -1);
    }

    public final boolean c(ean eanVar) {
        return this.f == eanVar.f && this.i == eanVar.i && this.j == eanVar.j && this.k == eanVar.k && this.l == eanVar.l && this.m == eanVar.m && Objects.equals(this.g, eanVar.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ean eanVar = (ean) obj;
            if (c(eanVar) && Objects.equals(this.e, eanVar.e) && Objects.equals(this.h, eanVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.e, Integer.valueOf(this.f), this.g, this.h, Integer.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(this.m));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f + ", period=" + this.i + ", pos=" + this.j;
        int i = this.l;
        if (i == -1) {
            return str;
        }
        return str + ", contentPos=" + this.k + ", adGroup=" + i + ", ad=" + this.m;
    }
}
