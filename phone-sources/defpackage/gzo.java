package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzo {
    public final yot a;
    public final yot b;
    public final yot c;
    public final yot d;
    public final han e;
    public final Bitmap.Config f;
    public final gzn g;
    public final gzn h;
    public final gzn i;
    public final int j;
    private final boolean k;
    private final boolean l;
    private final Drawable m;
    private final Drawable n;
    private final Drawable o;

    public gzo() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzo)) {
            return false;
        }
        gzo gzoVar = (gzo) obj;
        if (!yks.e(this.a, gzoVar.a) || !yks.e(this.b, gzoVar.b) || !yks.e(this.c, gzoVar.c) || !yks.e(this.d, gzoVar.d) || !yks.e(this.e, gzoVar.e)) {
            return false;
        }
        int i = gzoVar.j;
        if (this.f != gzoVar.f) {
            return false;
        }
        boolean z = gzoVar.k;
        boolean z2 = gzoVar.l;
        Drawable drawable = gzoVar.m;
        if (!yks.e(null, null)) {
            return false;
        }
        Drawable drawable2 = gzoVar.n;
        if (!yks.e(null, null)) {
            return false;
        }
        Drawable drawable3 = gzoVar.o;
        return yks.e(null, null) && this.g == gzoVar.g && this.h == gzoVar.h && this.i == gzoVar.i;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        a.bw(3);
        return (((((((((((((iHashCode * 31) + 3) * 31) + this.f.hashCode()) * 31) + a.q(true)) * 31) + a.q(false)) * 923521) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public /* synthetic */ gzo(byte[] bArr) {
        yot yotVar = ypk.a;
        yqp yqpVarI = yxi.a.i();
        yya yyaVar = yya.a;
        han hanVar = han.a;
        Bitmap.Config config = hat.a;
        gzn gznVar = gzn.a;
        yqpVarI.getClass();
        config.getClass();
        gznVar.getClass();
        gznVar.getClass();
        gznVar.getClass();
        this.a = yqpVarI;
        this.b = yyaVar;
        this.c = yyaVar;
        this.d = yyaVar;
        this.e = hanVar;
        this.j = 3;
        this.f = config;
        this.k = true;
        this.l = false;
        this.m = null;
        this.n = null;
        this.o = null;
        this.g = gznVar;
        this.h = gznVar;
        this.i = gznVar;
    }
}
