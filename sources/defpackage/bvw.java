package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvw extends clt implements cna {
    public static final bvw a;
    private static volatile cng d;
    public int b = 0;
    public Object c;

    static {
        bvw bvwVar = new bvw();
        a = bvwVar;
        clt.y(bvw.class, bvwVar);
    }

    private bvw() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0011\u0001\u0000\u0001F\u0011\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\b<\u0000\t<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000\u0018<\u0000\u001d<\u0000\u001e<\u0000\u001f<\u0000(<\u00002<\u0000<<\u0000F<\u0000", new Object[]{"c", "b", bvu.class, bvv.class, bvt.class, bvq.class, bvr.class, bvo.class, bvn.class, bvk.class, bvm.class, clg.class, bvg.class, bwb.class, bvy.class, bvs.class, bwd.class, buq.class, buz.class});
        }
        if (i2 == 3) {
            return new bvw();
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
        synchronized (bvw.class) {
            clpVar = d;
            if (clpVar == null) {
                clpVar = new clp(a);
                d = clpVar;
            }
        }
        return clpVar;
    }
}
