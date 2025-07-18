package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzp {
    public final hak a;
    public final Boolean b;
    public final int c;
    public final int d;
    private final dve e = null;
    private final yot f = null;
    private final yot g = null;
    private final yot h = null;
    private final yot i = null;
    private final han j = null;
    private final Bitmap.Config k = null;
    private final Boolean l = null;
    private final gzn m = null;
    private final gzn n = null;
    private final gzn o = null;

    public gzp(hak hakVar, int i, int i2, Boolean bool) {
        this.a = hakVar;
        this.c = i;
        this.d = i2;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzp)) {
            return false;
        }
        gzp gzpVar = (gzp) obj;
        dve dveVar = gzpVar.e;
        if (!yks.e(null, null) || !yks.e(this.a, gzpVar.a) || this.c != gzpVar.c) {
            return false;
        }
        yot yotVar = gzpVar.f;
        if (!yks.e(null, null)) {
            return false;
        }
        yot yotVar2 = gzpVar.g;
        if (!yks.e(null, null)) {
            return false;
        }
        yot yotVar3 = gzpVar.h;
        if (!yks.e(null, null)) {
            return false;
        }
        yot yotVar4 = gzpVar.i;
        if (!yks.e(null, null)) {
            return false;
        }
        han hanVar = gzpVar.j;
        if (!yks.e(null, null) || this.d != gzpVar.d) {
            return false;
        }
        Bitmap.Config config = gzpVar.k;
        if (!yks.e(this.b, gzpVar.b)) {
            return false;
        }
        Boolean bool = gzpVar.l;
        if (!yks.e(null, null)) {
            return false;
        }
        gzn gznVar = gzpVar.m;
        gzn gznVar2 = gzpVar.n;
        gzn gznVar3 = gzpVar.o;
        return true;
    }

    public final int hashCode() {
        hak hakVar = this.a;
        int iHashCode = hakVar != null ? hakVar.hashCode() : 0;
        int i = this.c;
        if (i != 0) {
            a.bw(i);
        } else {
            i = 0;
        }
        int i2 = iHashCode * 31;
        int i3 = this.d;
        if (i3 != 0) {
            a.bw(i3);
        } else {
            i3 = 0;
        }
        int i4 = i2 + i;
        Boolean bool = this.b;
        return ((((i4 * 887503681) + i3) * 961) + (bool != null ? bool.hashCode() : 0)) * 923521;
    }
}
