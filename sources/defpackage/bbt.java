package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbt extends clt implements cna {
    public static final cmb a = new bbs(0);
    public static final bbt b;
    private static volatile cng m;
    public int c;
    public boolean e;
    public cme g;
    public cme h;
    public cma i;
    public bbu j;
    public boolean k;
    public boolean l;
    public ckv d = ckv.b;
    public String f = "";

    static {
        bbt bbtVar = new bbt();
        b = bbtVar;
        clt.y(bbt.class, bbtVar);
    }

    private bbt() {
        cnj cnjVar = cnj.a;
        this.g = cnjVar;
        this.h = cnjVar;
        this.i = clu.a;
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(b, "\u0004\t\u0000\u0001\u0001\u000b\t\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i", awv.q, "j", "k", "l"});
        }
        if (i2 == 3) {
            return new bbt();
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
        cng cngVar = m;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (bbt.class) {
            clpVar = m;
            if (clpVar == null) {
                clpVar = new clp(b);
                m = clpVar;
            }
        }
        return clpVar;
    }
}
