package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bss extends clt implements cna {
    public static final bss a;
    private static volatile cng m;
    public int b;
    public long c;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public String d = "";
    public String l = "";

    static {
        bss bssVar = new bss();
        a = bssVar;
        clt.y(bss.class, bssVar);
    }

    private bss() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\n\u0000\u0001\u0001\u0010\n\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\nင\u0003\u000bင\u0004\fင\u0005\rင\u0006\u000eင\u0007\u000fင\b\u0010ဈ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        }
        if (i2 == 3) {
            return new bss();
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
        cng cngVar = m;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (bss.class) {
            clpVar = m;
            if (clpVar == null) {
                clpVar = new clp(a);
                m = clpVar;
            }
        }
        return clpVar;
    }
}
