package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgi extends clt implements cna {
    public static final cgi a;
    private static volatile cng g;
    public int b;
    public long e;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public cme f = cnj.a;

    static {
        cgi cgiVar = new cgi();
        a = cgiVar;
        clt.y(cgi.class, cgiVar);
    }

    private cgi() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004б", new Object[]{"b", "c", "d", "e", "f", cgh.class});
        }
        if (i2 == 3) {
            return new cgi();
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
        synchronized (cgi.class) {
            clpVar = g;
            if (clpVar == null) {
                clpVar = new clp(a);
                g = clpVar;
            }
        }
        return clpVar;
    }
}
