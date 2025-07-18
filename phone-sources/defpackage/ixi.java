package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ixi extends sbt implements ixh {
    public final String a;
    public final Object b;
    public final wmc c;
    private final wkw d;

    public ixi(wkx wkxVar, vvd vvdVar) {
        String str = wkxVar.c;
        str.getClass();
        this.a = str;
        wkxVar.i(vvdVar);
        Object objK = wkxVar.l.k((vub) vvdVar.c);
        if (objK == null) {
            objK = vvdVar.b;
        } else {
            vvdVar.c(objK);
        }
        this.b = objK;
        wmc wmcVar = wkxVar.e;
        wmcVar = wmcVar == null ? wmc.a : wmcVar;
        wmcVar.getClass();
        this.c = wmcVar;
        wkw wkwVar = wkw.TYPE_UNSPECIFIED;
        if (wjk.f.a(vvdVar.a())) {
            wkw wkwVarB = wkw.b(vvdVar.a());
            wkwVarB.getClass();
            this.d = wkwVarB;
        } else {
            throw new IllegalArgumentException("Missing component type enum for extension number: " + vvdVar.a());
        }
    }

    @Override // defpackage.ixh
    public final wmc b() {
        return this.c;
    }

    @Override // defpackage.ixh
    public final Object c() {
        return this.b;
    }

    @Override // defpackage.ixh
    public final String d() {
        return this.a;
    }

    @Override // defpackage.ixh
    public final wkw dQ() {
        return this.d;
    }

    public final wkg f() {
        wkg wkgVar = ((wtv) this.b).e;
        if (wkgVar == null) {
            wkgVar = wkg.a;
        }
        wkgVar.getClass();
        return wkgVar;
    }

    public final wlx g() {
        wlx wlxVar = ((wtv) this.b).c;
        if (wlxVar == null) {
            wlxVar = wlx.a;
        }
        wlxVar.getClass();
        return wlxVar;
    }

    public final boolean h() {
        return ((wtv) this.b).f;
    }

    @Override // defpackage.sbt
    protected void e() {
    }
}
