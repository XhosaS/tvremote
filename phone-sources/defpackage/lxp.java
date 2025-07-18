package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxp {
    private static final idf c = new lxq(1);
    public final idf a;
    public final idf b;
    private final lfn d;
    private final ieh e;
    private final xbw f;
    private final idf g;
    private final boolean h;
    private final lyz i;
    private final lys j;
    private final kta k;
    private final lfx l;

    public lxp(lfn lfnVar, lyz lyzVar, ieh iehVar, lys lysVar, xbw xbwVar, kta ktaVar, lfx lfxVar, boolean z, idf idfVar) {
        this.d = lfnVar;
        this.i = lyzVar;
        this.j = lysVar;
        this.e = iehVar;
        this.f = xbwVar;
        this.k = ktaVar;
        this.l = lfxVar;
        this.h = z;
        this.b = idfVar;
        this.a = new lye(h(iehVar, lfnVar.aq()), b(), a(), g());
        long jAq = lfnVar.aq();
        icw icwVar = icz.a;
        this.g = new lye(i(iehVar, jAq, icwVar), b(), new icy(Collections.EMPTY_LIST), icwVar);
    }

    private final lyg i(ieh iehVar, long j, idf idfVar) {
        return new lyg(this.j, this.d, new idm(iehVar, 0), idfVar, j);
    }

    public final idf a() {
        if (this.h ? this.d.cU() : this.d.cT()) {
            return new lff(this, new lyi(lyd.a), 3);
        }
        lbj lbjVar = new lbj(new kdh(this.k), 7);
        idh idhVarD = idh.d();
        idhVarD.e(new lyi(lyd.a));
        return idhVarD.b(new luq((idf) this.f.b(), lbjVar, this.l, 4));
    }

    public final idf b() {
        return this.d.ds() ? new lbj(this.i, 8) : new icy(Collections.EMPTY_LIST);
    }

    public final idf c(Class cls) {
        idh idhVarD = idh.d();
        idhVarD.e(idn.b);
        idhVarD.e(this.a);
        idhVarD.f(lbj.a(cls));
        idhVarD.e(new kro(2));
        return idhVarD.b(new jxt(ieg.a, 6));
    }

    public final idf d(Class cls) {
        idh idhVarD = idh.d();
        idhVarD.e(idn.b);
        idhVarD.e(this.a);
        idhVarD.f(new lbj(new lbj(cls, 0), 9));
        idhVarD.e(new kro(2));
        return idhVarD.b(new jxt(ieg.a, 6));
    }

    public final idf e(Class cls) {
        idh idhVarD = idh.d();
        idhVarD.e(this.a);
        idhVarD.f(lbj.a(cls));
        return idhVarD.b(new kro(0));
    }

    public final idf f(Class cls) {
        idh idhVarD = idh.d();
        idhVarD.e(c);
        idhVarD.e(this.g);
        idhVarD.f(lbj.a(cls));
        idhVarD.e(new kro(2));
        return idhVarD.b(new jxt(ieg.a, 6));
    }

    public final idy g() {
        return this.d.ds() ? new lyl(this.i, 0) : icz.a;
    }

    public final lyg h(ieh iehVar, long j) {
        return i(iehVar, j, lya.a);
    }
}
