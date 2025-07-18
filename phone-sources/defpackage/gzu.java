package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzu {
    public final Context a;
    public final Object b;
    public final hal c;
    public final Bitmap.Config d;
    public final List e;
    public final han f;
    public final zcc g;
    public final had h;
    public final boolean j;
    public final gzn m;
    public final gzn n;
    public final gzn o;
    public final yot p;
    public final yot q;
    public final yot r;
    public final yot s;
    public final dve t;
    public final hak u;
    public final haa v;
    public final gzp w;
    public final gzo x;
    public final int y;
    public final int z;
    private final gzt A = null;
    private final gza B = null;
    private final String C = null;
    private final ColorSpace D = null;
    private final yfw E = null;
    private final gxm M = null;
    public final boolean i = true;
    public final boolean k = false;
    public final boolean l = true;
    private final gza F = null;
    private final Integer G = null;
    private final Drawable H = null;
    private final Integer I = null;
    private final Drawable J = null;
    private final Integer K = null;
    private final Drawable L = null;

    public gzu(Context context, Object obj, hal halVar, Bitmap.Config config, int i, List list, han hanVar, zcc zccVar, had hadVar, boolean z, gzn gznVar, gzn gznVar2, gzn gznVar3, yot yotVar, yot yotVar2, yot yotVar3, yot yotVar4, dve dveVar, hak hakVar, int i2, haa haaVar, gzp gzpVar, gzo gzoVar) {
        this.a = context;
        this.b = obj;
        this.c = halVar;
        this.d = config;
        this.y = i;
        this.e = list;
        this.f = hanVar;
        this.g = zccVar;
        this.h = hadVar;
        this.j = z;
        this.m = gznVar;
        this.n = gznVar2;
        this.o = gznVar3;
        this.p = yotVar;
        this.q = yotVar2;
        this.r = yotVar3;
        this.s = yotVar4;
        this.t = dveVar;
        this.u = hakVar;
        this.z = i2;
        this.v = haaVar;
        this.w = gzpVar;
        this.x = gzoVar;
    }

    public static /* synthetic */ gzs a(gzu gzuVar) {
        return new gzs(gzuVar, gzuVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzu)) {
            return false;
        }
        gzu gzuVar = (gzu) obj;
        if (!yks.e(this.a, gzuVar.a) || !yks.e(this.b, gzuVar.b) || !yks.e(this.c, gzuVar.c)) {
            return false;
        }
        gzt gztVar = gzuVar.A;
        if (!yks.e(null, null)) {
            return false;
        }
        gza gzaVar = gzuVar.B;
        if (!yks.e(null, null)) {
            return false;
        }
        String str = gzuVar.C;
        if (!yks.e(null, null) || this.d != gzuVar.d) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ColorSpace colorSpace = gzuVar.D;
            if (!yks.e(null, null)) {
                return false;
            }
        }
        if (this.y != gzuVar.y) {
            return false;
        }
        yfw yfwVar = gzuVar.E;
        if (!yks.e(null, null)) {
            return false;
        }
        gxm gxmVar = gzuVar.M;
        if (!yks.e(null, null) || !yks.e(this.e, gzuVar.e) || !yks.e(this.f, gzuVar.f) || !yks.e(this.g, gzuVar.g) || !yks.e(this.h, gzuVar.h)) {
            return false;
        }
        boolean z = gzuVar.i;
        if (this.j != gzuVar.j) {
            return false;
        }
        boolean z2 = gzuVar.k;
        boolean z3 = gzuVar.l;
        if (this.m != gzuVar.m || this.n != gzuVar.n || this.o != gzuVar.o || !yks.e(this.p, gzuVar.p) || !yks.e(this.q, gzuVar.q) || !yks.e(this.r, gzuVar.r) || !yks.e(this.s, gzuVar.s)) {
            return false;
        }
        gza gzaVar2 = gzuVar.F;
        if (!yks.e(null, null)) {
            return false;
        }
        Integer num = gzuVar.G;
        if (!yks.e(null, null)) {
            return false;
        }
        Drawable drawable = gzuVar.H;
        if (!yks.e(null, null)) {
            return false;
        }
        Integer num2 = gzuVar.I;
        if (!yks.e(null, null)) {
            return false;
        }
        Drawable drawable2 = gzuVar.J;
        if (!yks.e(null, null)) {
            return false;
        }
        Integer num3 = gzuVar.K;
        if (!yks.e(null, null)) {
            return false;
        }
        Drawable drawable3 = gzuVar.L;
        return yks.e(null, null) && yks.e(this.t, gzuVar.t) && yks.e(this.u, gzuVar.u) && this.z == gzuVar.z && yks.e(this.v, gzuVar.v) && yks.e(this.w, gzuVar.w) && yks.e(this.x, gzuVar.x);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        hal halVar = this.c;
        int iHashCode2 = ((((iHashCode * 31) + (halVar != null ? halVar.hashCode() : 0)) * 923521) + this.d.hashCode()) * 961;
        int i = this.y;
        a.bw(i);
        int iHashCode3 = (((((((((((((((((((((((((((((((((((iHashCode2 + i) * 29791) + 1) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + a.q(true)) * 31) + a.q(this.j)) * 31) + a.q(false)) * 31) + a.q(true)) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t.hashCode()) * 31) + this.u.hashCode()) * 31;
        int i2 = this.z;
        a.bw(i2);
        return ((((((iHashCode3 + i2) * 31) + this.v.hashCode()) * (-1807454463)) + this.w.hashCode()) * 31) + this.x.hashCode();
    }
}
