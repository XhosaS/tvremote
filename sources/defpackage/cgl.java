package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgl extends clt implements cna {
    public static final cgl a;
    private static volatile cng g;
    public int b;
    public Object d;
    public cgi e;
    public int c = 0;
    private byte h = 2;
    public cme f = cnj.a;

    static {
        cgl cglVar = new cgl();
        a = cglVar;
        clt.y(cgl.class, cglVar);
    }

    private cgl() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᔉ\u0000\u0002Л\u0004м\u0000", new Object[]{"d", "c", "b", "e", "f", cgi.class, cgj.class});
        }
        if (i2 == 3) {
            return new cgl();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = g;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cgl.class) {
            clpVar = g;
            if (clpVar == null) {
                clpVar = new clp(a);
                g = clpVar;
            }
        }
        return clpVar;
    }

    public final void b() {
        cme cmeVar = this.f;
        if (cmeVar.c()) {
            return;
        }
        this.f = clt.t(cmeVar);
    }
}
