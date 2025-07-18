package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alm {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public clx e;
    public boolean f;
    public cgl h;
    public cmi i;
    public cft k;
    public esn l;
    private chc m;
    private long q;
    private long n = alk.a;
    public long g = 0;
    public long j = clw.o(0, 0);
    private int o = -1;
    private int p = -1;

    public alm(String str, chc chcVar, esn esnVar, int i, boolean z, int i2) {
        this.a = str;
        this.m = chcVar;
        this.l = esnVar;
        this.b = i;
        this.c = z;
        this.d = i2;
    }

    private final void g() {
        this.k = null;
        this.h = null;
        this.i = null;
        this.o = -1;
        this.p = -1;
        this.j = clw.o(0, 0);
        this.g = 0L;
        this.f = false;
    }

    public final int a(int i, cmi cmiVar) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jD = clw.d(0, i, 0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        int iJ = ykn.j(hq.p(e(jD, cmiVar).b()), clv.c(jD));
        this.o = i;
        this.p = iJ;
        return iJ;
    }

    public final cgl b(cmi cmiVar) {
        cgl ckuVar = this.h;
        if (ckuVar == null || cmiVar != this.i || ckuVar.c()) {
            this.i = cmiVar;
            String str = this.a;
            chc chcVarM = ccf.M(this.m, cmiVar);
            yhb yhbVar = yhb.a;
            clx clxVar = this.e;
            clxVar.getClass();
            ckuVar = new cku(str, chcVarM, yhbVar, yhbVar, this.l, clxVar);
        }
        this.h = ckuVar;
        return ckuVar;
    }

    public final void c(long j) {
        this.q = j | (this.q << 2);
    }

    public final void d(clx clxVar) {
        clx clxVar2 = this.e;
        long jA = clxVar != null ? alk.a(clxVar) : alk.a;
        if (clxVar2 == null) {
            this.e = clxVar;
            this.n = jA;
        } else if (clxVar == null || !a.s(this.n, jA)) {
            this.e = clxVar;
            this.n = jA;
            c(1L);
            g();
        }
    }

    public final cft e(long j, cmi cmiVar) {
        cgl cglVarB = b(cmiVar);
        long jC = hw.C(j, this.c, this.b, cglVarB.a());
        boolean z = this.c;
        int i = this.b;
        return new cft((cku) cglVarB, hw.B(z, i, this.d), i, jC);
    }

    public final void f(String str, chc chcVar, esn esnVar, int i, boolean z, int i2) {
        this.a = str;
        this.m = chcVar;
        this.l = esnVar;
        this.b = i;
        this.c = z;
        this.d = i2;
        c(2L);
        g();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.k != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) alk.b(this.n));
        sb.append(", history=");
        sb.append(this.q);
        sb.append(", constraints=$)");
        return sb.toString();
    }
}
