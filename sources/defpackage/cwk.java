package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwk extends clt implements cna {
    public static final cwk a;
    private static volatile cng m;
    public int b;
    public int c;
    public long d;
    public cww g;
    public int h;
    public long i;
    public cwt j;
    public long k;
    public long l;
    private byte n = 2;
    public String e = "";
    public String f = "";

    static {
        cwk cwkVar = new cwk();
        a = cwkVar;
        clt.y(cwk.class, cwkVar);
    }

    private cwk() {
        cnj cnjVar = cnj.a;
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            cly clyVar = awv.u;
            return new cnk(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001᠌\u0000\u0002᠌\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004\fဂ\t", new Object[]{"b", "c", clyVar, "h", clyVar, "i", "j", "k", "d", "e", "f", "g", "l"});
        }
        if (i2 == 3) {
            return new cwk();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.n = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = m;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cwk.class) {
            clpVar = m;
            if (clpVar == null) {
                clpVar = new clp(a);
                m = clpVar;
            }
        }
        return clpVar;
    }
}
