package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwg extends clt implements cna {
    public static final cwg a;
    private static volatile cng p;
    public int b;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public cwf l;
    public cww m;
    public cyo n;
    public cyr o;
    private byte q = 2;
    public String c = "";

    static {
        cwg cwgVar = new cwg();
        a = cwgVar;
        clt.y(cwg.class, cwgVar);
    }

    private cwg() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.q);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0002\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005ဂ\u0004\u0006ဂ\u0006\u0007ဂ\u0007\bဇ\b\tဉ\t\nဂ\u0005\u000bᐉ\n\fᐉ\u000b\rဉ\f", new Object[]{"b", "c", "d", awv.t, "e", "f", awv.s, "g", "i", "j", "k", "l", "h", "m", "n", "o"});
        }
        if (i2 == 3) {
            return new cwg();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.q = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = p;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cwg.class) {
            clpVar = p;
            if (clpVar == null) {
                clpVar = new clp(a);
                p = clpVar;
            }
        }
        return clpVar;
    }
}
