package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbr extends clt implements cna {
    public static final cmb a = new bbs(1);
    public static final bbr b;
    private static volatile cng n;
    public int c;
    public boolean e;
    public long g;
    public cme h;
    public cme i;
    public cma j;
    public bbu k;
    public boolean l;
    public boolean m;
    public ckv d = ckv.b;
    public String f = "";

    static {
        bbr bbrVar = new bbr();
        b = bbrVar;
        clt.y(bbr.class, bbrVar);
    }

    private bbr() {
        cnj cnjVar = cnj.a;
        this.h = cnjVar;
        this.i = cnjVar;
        this.j = clu.a;
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(b, "\u0004\n\u0000\u0001\u0001\u000b\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", awv.q, "k", "l", "m"});
        }
        if (i2 == 3) {
            return new bbr();
        }
        if (i2 == 4) {
            return new clo(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        cng cngVar = n;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (bbr.class) {
            clpVar = n;
            if (clpVar == null) {
                clpVar = new clp(b);
                n = clpVar;
            }
        }
        return clpVar;
    }
}
