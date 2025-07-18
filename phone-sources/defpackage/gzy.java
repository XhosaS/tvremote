package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzy {
    public final Context a;
    public final Bitmap.Config b;
    public final ColorSpace c;
    public final haj d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final zcc i;
    public final had j;
    public final haa k;
    public final gzn l;
    public final gzn m;
    public final gzn n;
    public final int o;

    public gzy(Context context, Bitmap.Config config, haj hajVar, int i, boolean z, zcc zccVar, had hadVar, haa haaVar, gzn gznVar, gzn gznVar2, gzn gznVar3) {
        config.getClass();
        if (i == 0) {
            throw null;
        }
        zccVar.getClass();
        gznVar3.getClass();
        this.a = context;
        this.b = config;
        this.c = null;
        this.d = hajVar;
        this.o = i;
        this.e = z;
        this.f = false;
        this.g = true;
        this.h = null;
        this.i = zccVar;
        this.j = hadVar;
        this.k = haaVar;
        this.l = gznVar;
        this.m = gznVar2;
        this.n = gznVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzy)) {
            return false;
        }
        gzy gzyVar = (gzy) obj;
        if (!yks.e(this.a, gzyVar.a) || this.b != gzyVar.b) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ColorSpace colorSpace = gzyVar.c;
            if (!yks.e(null, null)) {
                return false;
            }
        }
        if (!yks.e(this.d, gzyVar.d) || this.o != gzyVar.o || this.e != gzyVar.e) {
            return false;
        }
        boolean z = gzyVar.f;
        boolean z2 = gzyVar.g;
        String str = gzyVar.h;
        return yks.e(null, null) && yks.e(this.i, gzyVar.i) && yks.e(this.j, gzyVar.j) && yks.e(this.k, gzyVar.k) && this.l == gzyVar.l && this.m == gzyVar.m && this.n == gzyVar.n;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + this.d.hashCode();
        int i = this.o;
        a.bw(i);
        return (((((((((((((((((((iHashCode * 31) + i) * 31) + a.q(this.e)) * 31) + a.q(false)) * 31) + a.q(true)) * 961) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode();
    }
}
