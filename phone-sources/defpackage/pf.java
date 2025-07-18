package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pf {
    public final String a;
    public final bcb b;
    public final bje c;
    public final bje d;
    public long e;
    private final pj f;
    private final pf g;
    private final bcb h;
    private final bcb i;
    private final bcb j;
    private final bdy k;
    private final bdp l;
    private final bdp m;

    public pf(pj pjVar, pf pfVar, String str) {
        this.f = pjVar;
        this.g = pfVar;
        this.a = str;
        Object objF = f();
        bcz bczVar = bcz.c;
        this.h = new bci(objF, bczVar);
        this.i = new bci(new pc(f(), f()), bczVar);
        this.l = new bcg(0L);
        this.m = new bcg(Long.MIN_VALUE);
        this.b = new bci(false, bczVar);
        this.c = new bje();
        this.d = new bje();
        this.j = new bci(false, bczVar);
        fg fgVar = new fg(this, 10);
        ivx ivxVar = bdt.a;
        this.k = new bbh(fgVar, null);
        pjVar.d(this);
    }

    private final void D(pb pbVar) {
        this.i.b(pbVar);
    }

    public final boolean A() {
        return ((Boolean) this.j.a()).booleanValue();
    }

    public final void B(pd pdVar) {
        this.c.add(pdVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(Object obj, Object obj2) {
        t(Long.MIN_VALUE);
        pj pjVar = this.f;
        pjVar.t(false);
        if (!A() || !yks.e(f(), obj) || !yks.e(g(), obj2)) {
            if (!yks.e(f(), obj) && (pjVar instanceof od)) {
                ((od) pjVar).c(obj);
            }
            u(obj2);
            s(true);
            D(new pc(obj, obj2));
        }
        bje bjeVar = this.d;
        int iA = bjeVar.a();
        for (int i = 0; i < iA; i++) {
            pf pfVar = (pf) bjeVar.get(i);
            pfVar.getClass();
            if (pfVar.A()) {
                pfVar.C(pfVar.f(), pfVar.g());
            }
        }
        bje bjeVar2 = this.c;
        int iA2 = bjeVar2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            ((pd) bjeVar2.get(i2)).f(0L);
        }
        this.e = 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a() {
        bje bjeVar = this.c;
        int iA = bjeVar.a();
        long jMax = 0;
        for (int i = 0; i < iA; i++) {
            jMax = Math.max(jMax, ((pd) bjeVar.get(i)).c());
        }
        bje bjeVar2 = this.d;
        int iA2 = bjeVar2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            jMax = Math.max(jMax, ((pf) bjeVar2.get(i2)).a());
        }
        return jMax;
    }

    public final long b() {
        pf pfVar = this.g;
        return pfVar != null ? pfVar.b() : this.l.e();
    }

    public final long c() {
        return this.m.e();
    }

    public final long d() {
        return ((Number) this.k.a()).longValue();
    }

    public final pb e() {
        return (pb) this.i.a();
    }

    public final Object f() {
        return this.f.a();
    }

    public final Object g() {
        return this.h.a();
    }

    public final void h(Object obj, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1493585151);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(obj) : baoVarD.H(obj)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(this) ? 16 : 32;
        }
        if (!baoVarD.L((i2 & 19) != 18, i2 & 1)) {
            baoVarD.t();
        } else if (A()) {
            baoVarD.x(467781377);
            ((bas) baoVarD).aa();
        } else {
            baoVarD.x(466120769);
            x(obj);
            int i5 = i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (i5 == 32 || objT == ban.a) {
                fg fgVar = new fg(this, 9);
                ivx ivxVar = bdt.a;
                bbh bbhVar = new bbh(fgVar, null);
                basVar.ae(bbhVar);
                objT = bbhVar;
            }
            if (((Boolean) ((bdy) objT).a()).booleanValue()) {
                baoVarD.x(466528884);
                Object objT2 = basVar.T();
                Object obj2 = ban.a;
                if (objT2 == obj2) {
                    objT2 = bbn.a(yim.a, baoVarD);
                    basVar.ae(objT2);
                }
                yow yowVar = (yow) objT2;
                boolean zH = baoVarD.H(yowVar) | (i5 == 32);
                Object objT3 = basVar.T();
                if (zH || objT3 == obj2) {
                    objT3 = new ox(yowVar, this, i4);
                    basVar.ae(objT3);
                }
                bbn.b(yowVar, this, (yjv) objT3, baoVarD);
                basVar.aa();
            } else {
                baoVarD.x(467771457);
                basVar.aa();
            }
            basVar.aa();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new qt(this, obj, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        bje bjeVar = this.c;
        int iA = bjeVar.a();
        for (int i = 0; i < iA; i++) {
            pd pdVar = (pd) bjeVar.get(i);
            pdVar.b = null;
            pdVar.a = null;
            pdVar.c = false;
        }
        bje bjeVar2 = this.d;
        int iA2 = bjeVar2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            ((pf) bjeVar2.get(i2)).i();
        }
    }

    public final void j() {
        l();
        this.f.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(long j, boolean z) {
        if (c() == Long.MIN_VALUE) {
            m(j);
        } else {
            pj pjVar = this.f;
            if (!((Boolean) pjVar.m.a()).booleanValue()) {
                pjVar.t(true);
            }
        }
        v(false);
        bje bjeVar = this.c;
        int iA = bjeVar.a();
        boolean zE = true;
        for (int i = 0; i < iA; i++) {
            pd pdVar = (pd) bjeVar.get(i);
            if (!pdVar.n()) {
                long jA = z ? pdVar.e().a() : j;
                pdVar.k(pdVar.e().c(jA));
                pdVar.d = pdVar.e().b(jA);
                if (fh.j(pdVar.e(), jA)) {
                    pdVar.i(true);
                }
            }
            zE &= pdVar.n();
        }
        bje bjeVar2 = this.d;
        int iA2 = bjeVar2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            pf pfVar = (pf) bjeVar2.get(i2);
            if (!yks.e(pfVar.g(), pfVar.f())) {
                pfVar.k(j, z);
            }
            zE &= yks.e(pfVar.g(), pfVar.f());
        }
        if (zE) {
            l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        t(Long.MIN_VALUE);
        pj pjVar = this.f;
        if (pjVar instanceof od) {
            ((od) pjVar).c(g());
        }
        r(0L);
        pjVar.t(false);
        bje bjeVar = this.d;
        int iA = bjeVar.a();
        for (int i = 0; i < iA; i++) {
            ((pf) bjeVar.get(i)).l();
        }
    }

    public final void m(long j) {
        t(j);
        this.f.t(true);
    }

    public final void n(pd pdVar) {
        this.c.remove(pdVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(float f) {
        bje bjeVar = this.c;
        int iA = bjeVar.a();
        for (int i = 0; i < iA; i++) {
            pd pdVar = (pd) bjeVar.get(i);
            if (f == -4.0f || f == -5.0f) {
                oz ozVar = pdVar.b;
                if (ozVar != null) {
                    pdVar.e().h(ozVar.a);
                    pdVar.a = null;
                    pdVar.b = null;
                }
                Object obj = f == -4.0f ? pdVar.e().b : pdVar.e().a;
                pdVar.e().h(obj);
                pdVar.e().i(obj);
                pdVar.k(obj);
                pdVar.h(pdVar.e().a());
            } else {
                pdVar.j(f);
            }
        }
        bje bjeVar2 = this.d;
        int iA2 = bjeVar2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            ((pf) bjeVar2.get(i2)).o(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(long j) {
        if (c() == Long.MIN_VALUE) {
            t(j);
        }
        r(j);
        v(false);
        bje bjeVar = this.c;
        int iA = bjeVar.a();
        for (int i = 0; i < iA; i++) {
            ((pd) bjeVar.get(i)).f(j);
        }
        bje bjeVar2 = this.d;
        int iA2 = bjeVar2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            pf pfVar = (pf) bjeVar2.get(i2);
            if (!yks.e(pfVar.g(), pfVar.f())) {
                pfVar.p(j);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(oh ohVar) {
        bje bjeVar = this.c;
        int iA = bjeVar.a();
        for (int i = 0; i < iA; i++) {
            pd pdVar = (pd) bjeVar.get(i);
            if (!yks.e(pdVar.e().a, pdVar.e().b)) {
                pdVar.b = pdVar.e();
                pdVar.a = ohVar;
            }
            pdVar.g(new oz(pdVar.e, pdVar.g, pdVar.a(), pdVar.a(), pdVar.d.c()));
            pdVar.h(pdVar.e().a());
            pdVar.c = true;
        }
        bje bjeVar2 = this.d;
        int iA2 = bjeVar2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            ((pf) bjeVar2.get(i2)).q(ohVar);
        }
    }

    public final void r(long j) {
        if (this.g == null) {
            this.l.h(j);
        }
    }

    public final void s(boolean z) {
        this.j.b(Boolean.valueOf(z));
    }

    public final void t(long j) {
        this.m.h(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        bje bjeVar = this.c;
        int iA = bjeVar.a();
        String str = "Transition animation values: ";
        for (int i = 0; i < iA; i++) {
            str = str + ((pd) bjeVar.get(i)) + ", ";
        }
        return str;
    }

    public final void u(Object obj) {
        this.h.b(obj);
    }

    public final void v(boolean z) {
        this.b.b(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w() {
        oz ozVar;
        bje bjeVar = this.c;
        int iA = bjeVar.a();
        for (int i = 0; i < iA; i++) {
            pd pdVar = (pd) bjeVar.get(i);
            oh ohVar = pdVar.a;
            if (ohVar != null && (ozVar = pdVar.b) != null) {
                long jW = yln.w(ohVar.g * ohVar.d);
                Object objC = ozVar.c(jW);
                if (pdVar.c) {
                    pdVar.e().i(objC);
                }
                pdVar.e().h(objC);
                pdVar.h(pdVar.e().a());
                if (pdVar.b() == -2.0f || pdVar.c) {
                    pdVar.k(objC);
                } else {
                    pdVar.f(pdVar.f.b());
                }
                if (jW >= ohVar.g) {
                    pdVar.a = null;
                    pdVar.b = null;
                } else {
                    ohVar.c = false;
                }
            }
        }
        bje bjeVar2 = this.d;
        int iA2 = bjeVar2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            ((pf) bjeVar2.get(i2)).w();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(Object obj) {
        if (yks.e(g(), obj)) {
            return;
        }
        D(new pc(g(), obj));
        if (!yks.e(f(), g())) {
            this.f.c(g());
        }
        u(obj);
        if (!z()) {
            v(true);
        }
        bje bjeVar = this.c;
        int iA = bjeVar.a();
        for (int i = 0; i < iA; i++) {
            ((pd) bjeVar.get(i)).j(-2.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean y() {
        bje bjeVar = this.c;
        int iA = bjeVar.a();
        for (int i = 0; i < iA; i++) {
            if (((pd) bjeVar.get(i)).a != null) {
                return true;
            }
        }
        bje bjeVar2 = this.d;
        int iA2 = bjeVar2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            if (((pf) bjeVar2.get(i2)).y()) {
                return true;
            }
        }
        return false;
    }

    public final boolean z() {
        return c() != Long.MIN_VALUE;
    }
}
