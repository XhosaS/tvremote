package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bux extends clt implements cna {
    public static final bux a;
    private static volatile cng d;
    public int b = 0;
    public Object c;

    static {
        bux buxVar = new bux();
        a = buxVar;
        clt.y(bux.class, buxVar);
    }

    private bux() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0011\u0001\u0000\u0001Z\u0011\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\b<\u0000\t<\u0000\n<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u001e<\u0000\u001f=\u0000 <\u00002<\u00003<\u0000<<\u0000=<\u0000F<\u0000Z<\u0000", new Object[]{"c", "b", buu.class, buw.class, bvq.class, bvr.class, bvp.class, bvl.class, bvb.class, bvn.class, bvx.class, bvz.class, bwe.class, bwc.class, bus.class, bur.class, bva.class, bup.class});
        }
        if (i2 == 3) {
            return new bux();
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
        cng cngVar = d;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (bux.class) {
            clpVar = d;
            if (clpVar == null) {
                clpVar = new clp(a);
                d = clpVar;
            }
        }
        return clpVar;
    }
}
