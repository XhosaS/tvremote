package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class all {
    public clx a;
    public cgz b;
    private cfy c;
    private int d;
    private boolean e;
    private int f;
    private List g;
    private chc i;
    private cgi j;
    private cmi k;
    private long n;
    private esn o;
    private long h = alk.a;
    private int l = -1;
    private int m = -1;

    public /* synthetic */ all(cfy cfyVar, chc chcVar, esn esnVar, int i, boolean z, int i2, List list) {
        this.c = cfyVar;
        this.o = esnVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = list;
        this.i = chcVar;
    }

    private final void i() {
        this.j = null;
        this.b = null;
        this.m = -1;
        this.l = -1;
    }

    public final int a(int i, cmi cmiVar) {
        int i2 = this.l;
        int i3 = this.m;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jD = clw.d(0, i, 0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        float f = b(jD, cmiVar).e;
        int iJ = ykn.j(hq.p(f), clv.c(jD));
        this.l = i;
        this.m = iJ;
        return iJ;
    }

    public final cgh b(long j, cmi cmiVar) {
        cgi cgiVarC = c(cmiVar);
        long jC = hw.C(j, this.e, this.d, cgiVarC.a());
        boolean z = this.e;
        int i = this.d;
        return new cgh(cgiVarC, jC, hw.B(z, i, this.f), i);
    }

    public final cgi c(cmi cmiVar) {
        cgi cgiVar = this.j;
        if (cgiVar == null || cmiVar != this.k || cgiVar.c()) {
            this.k = cmiVar;
            cfy cfyVar = this.c;
            chc chcVarM = ccf.M(this.i, cmiVar);
            clx clxVar = this.a;
            clxVar.getClass();
            esn esnVar = this.o;
            List list = this.g;
            if (list == null) {
                list = yhb.a;
            }
            cgiVar = new cgi(cfyVar, chcVarM, list, clxVar, esnVar);
        }
        this.j = cgiVar;
        return cgiVar;
    }

    public final cgz d() {
        cgz cgzVar = this.b;
        if (cgzVar != null) {
            return cgzVar;
        }
        toString();
        throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ".concat(toString()));
    }

    public final cgz e(cmi cmiVar, long j, cgh cghVar) {
        float fMin = Math.min(cghVar.a.a(), cghVar.d);
        cfy cfyVar = this.c;
        chc chcVar = this.i;
        List list = this.g;
        if (list == null) {
            list = yhb.a;
        }
        int i = this.f;
        boolean z = this.e;
        int i2 = this.d;
        clx clxVar = this.a;
        clxVar.getClass();
        return new cgz(new cgy(cfyVar, chcVar, list, i, z, i2, clxVar, cmiVar, this.o, j), cghVar, clw.e(j, (hq.p(fMin) << 32) | (hq.p(cghVar.e) & 4294967295L)));
    }

    public final void f(long j) {
        this.n = j | (this.n << 2);
    }

    public final void g(clx clxVar) {
        clx clxVar2 = this.a;
        long jA = clxVar != null ? alk.a(clxVar) : alk.a;
        if (clxVar2 == null) {
            this.a = clxVar;
            this.h = jA;
        } else if (clxVar == null || !a.s(this.h, jA)) {
            this.a = clxVar;
            this.h = jA;
            f(1L);
            i();
        }
    }

    public final void h(cfy cfyVar, chc chcVar, esn esnVar, int i, boolean z, int i2, List list) {
        this.c = cfyVar;
        boolean zU = chcVar.u(this.i);
        this.i = chcVar;
        if (!zU) {
            f(0L);
            this.j = null;
            this.b = null;
            this.m = -1;
            this.l = -1;
        }
        this.o = esnVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = list;
        f(2L);
        i();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        sb.append(this.b != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) alk.b(this.h));
        sb.append(", history=");
        sb.append(this.n);
        sb.append(", constraints=");
        cgz cgzVar = this.b;
        sb.append(cgzVar != null ? new clv(cgzVar.a.i) : "null");
        sb.append(')');
        return sb.toString();
    }
}
