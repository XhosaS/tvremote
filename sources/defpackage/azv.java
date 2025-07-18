package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azv extends clt implements cna {
    public static final azv a;
    public static final cmt j;
    private static volatile cng k;
    public int b;
    public boolean d;
    public boolean h;
    public String c = "";
    public String e = "";
    public String f = "";
    public cma g = clu.a;
    public cme i = cnj.a;

    static {
        azv azvVar = new azv();
        a = azvVar;
        clt.y(azv.class, azvVar);
        j = clt.C(azo.a, azvVar, azvVar, 334728578, cog.MESSAGE);
    }

    private azv() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0003ဇ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006'\u0007ဇ\u0004\b\u001a", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new azv();
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
        cng cngVar = k;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (azv.class) {
            clpVar = k;
            if (clpVar == null) {
                clpVar = new clp(a);
                k = clpVar;
            }
        }
        return clpVar;
    }
}
