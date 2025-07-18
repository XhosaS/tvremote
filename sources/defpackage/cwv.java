package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwv extends clt implements cna {
    public static final cwv a;
    public static final cmt d;
    private static volatile cng e;
    public cmd b;
    public cmd c;

    static {
        cwv cwvVar = new cwv();
        a = cwvVar;
        clt.y(cwv.class, cwvVar);
        d = clt.C(cyf.a, cwvVar, cwvVar, 100, cog.MESSAGE);
    }

    private cwv() {
        cmp cmpVar = cmp.a;
        this.b = cmpVar;
        this.c = cmpVar;
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001%\u0002%", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new cwv();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        cng cngVar = e;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cwv.class) {
            clpVar = e;
            if (clpVar == null) {
                clpVar = new clp(a);
                e = clpVar;
            }
        }
        return clpVar;
    }

    public final void h() {
        cmd cmdVar = this.b;
        if (cmdVar.c()) {
            return;
        }
        this.b = clt.s(cmdVar);
    }

    public final void i() {
        cmd cmdVar = this.c;
        if (cmdVar.c()) {
            return;
        }
        this.c = clt.s(cmdVar);
    }
}
