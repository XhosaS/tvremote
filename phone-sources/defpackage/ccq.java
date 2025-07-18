package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccq {
    public static final bcp a = new bdz(bmf.n);
    private static final bcp r = new bdz(bmf.o);
    private static final bcp s = new bdz(bmf.q);
    private static final bcp t = new bdz(bmf.p);
    private static final bcp u = new bdz(bmf.s);
    public static final bcp b = new bdz(bmf.r);
    public static final bcp c = new bdz(cco.d);
    public static final bcp d = new bdz(bmf.u);
    public static final bcp e = new bdz(cco.b);
    private static final bcp v = new bdz(cco.c);
    public static final bcp f = new bdz(cco.a);
    public static final bcp g = new bdz(cco.e);
    public static final bcp h = new bdz(cco.f);
    public static final bcp i = new bdz(cco.g);
    private static final bcp w = new bdz(cco.k);
    public static final bcp j = new bdz(cco.j);
    public static final bcp k = new bdz(cco.l);
    public static final bcp l = new bdz(cco.m);
    public static final bcp m = new bdz(cco.n);
    public static final bcp n = new bdz(cco.o);
    public static final bcp o = new bdz(cco.h);
    public static final bcp p = new bbl(bcz.c, cco.i);
    public static final bcp q = new bdz(bmf.t);

    public static final void a(String str) {
        throw new IllegalStateException(a.cg(str, "CompositionLocal ", " not present"));
    }

    public static final void b(bzz bzzVar, ccf ccfVar, yjz yjzVar, bao baoVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        bao baoVarD = baoVar.d(1925803616);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? baoVarD.F(bzzVar) : baoVarD.H(bzzVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? baoVarD.F(ccfVar) : baoVarD.H(ccfVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != baoVarD.H(yjzVar) ? 128 : 256;
        }
        if (baoVarD.L((i3 & 147) != 146, i3 & 1)) {
            cbc cbcVar = (cbc) bzzVar;
            bcm.j(new bcq[]{a.c(cbcVar.V), r.c(cbcVar.u), t.c(cbcVar.P), s.c(cbcVar.p), u.c(cbcVar.ad), b.c(cbcVar.ae), d.c(bzzVar.m()), e.c(cbcVar.K), v.d(cbcVar.S), f.d(bzzVar.C()), g.c(cbcVar.G), h.c(cbcVar.ab), i.c(bzzVar.n()), w.c(cbcVar.F), j.c(cbcVar.ac), k.c(cbcVar.R), l.c(ccfVar), m.c(cbcVar.k), n.c(cbcVar.j), o.c(cbcVar.L), c.c(cbcVar.O)}, yjzVar, baoVarD, ((i3 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ccp(bzzVar, ccfVar, yjzVar, i2, 0);
        }
    }
}
