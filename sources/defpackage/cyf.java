package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyf extends clr implements cna {
    public static final cyf a;
    private static volatile cng q;
    public int b;
    public int c;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public cyj k;
    public int m;
    public int n;
    public int o;
    public cyj p;
    private byte r = 2;
    public cme l = cnj.a;

    static {
        cyf cyfVar = new cyf();
        a = cyfVar;
        clt.y(cyf.class, cyfVar);
    }

    private cyf() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.r);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0006\u0005\u001b\u0006င\b\u0007င\u0002\bင\u0004\tင\u0005\nဉ\u0007\u000bင\t\fင\n\rဉ\u000b", new Object[]{"b", "c", "e", "g", "j", "l", cyd.class, "m", "f", "h", "i", "k", "n", "o", "p"});
        }
        if (i2 == 3) {
            return new cyf();
        }
        if (i2 == 4) {
            return new cye();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.r = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = q;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cyf.class) {
            clpVar = q;
            if (clpVar == null) {
                clpVar = new clp(a);
                q = clpVar;
            }
        }
        return clpVar;
    }
}
