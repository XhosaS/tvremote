package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxg implements xr {
    public final gxa a;
    private final xr b;
    private final String c;
    private final bkd d;
    private final buo e;
    private final float f;
    private final bnr g;

    public gxg(xr xrVar, gxa gxaVar, bkd bkdVar, buo buoVar, float f) {
        gxaVar.getClass();
        bkdVar.getClass();
        buoVar.getClass();
        this.b = xrVar;
        this.a = gxaVar;
        this.c = null;
        this.d = bkdVar;
        this.e = buoVar;
        this.f = f;
        this.g = null;
    }

    @Override // defpackage.xr
    public final bkp a(bkp bkpVar, bkd bkdVar) {
        bkpVar.getClass();
        return this.b.a(bkpVar, bkdVar);
    }

    @Override // defpackage.xr
    public final bkp b(bkp bkpVar) {
        bkpVar.getClass();
        return this.b.b(bkpVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxg)) {
            return false;
        }
        gxg gxgVar = (gxg) obj;
        if (!yks.e(this.b, gxgVar.b) || !yks.e(this.a, gxgVar.a)) {
            return false;
        }
        String str = gxgVar.c;
        if (!yks.e(null, null) || !yks.e(this.d, gxgVar.d) || !yks.e(this.e, gxgVar.e) || Float.compare(this.f, gxgVar.f) != 0) {
            return false;
        }
        bnr bnrVar = gxgVar.g;
        return yks.e(null, null);
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() * 31) + this.a.hashCode()) * 961) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Float.floatToIntBits(this.f)) * 31;
    }

    public final String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.b + ", painter=" + this.a + ", contentDescription=null, alignment=" + this.d + ", contentScale=" + this.e + ", alpha=" + this.f + ", colorFilter=null)";
    }
}
