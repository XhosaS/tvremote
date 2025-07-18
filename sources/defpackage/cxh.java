package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxh extends clt implements cna {
    public static final cxh a;
    private static volatile cng c;
    private int d;
    private cxk e;
    private byte f = 2;
    public cme b = cnj.a;

    static {
        cxh cxhVar = new cxh();
        a = cxhVar;
        clt.y(cxh.class, cxhVar);
    }

    private cxh() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0001\u0001\u0002Л\u0006ဉ\u0004", new Object[]{"d", "b", cxi.class, "e"});
        }
        if (i2 == 3) {
            return new cxh();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = c;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cxh.class) {
            clpVar = c;
            if (clpVar == null) {
                clpVar = new clp(a);
                c = clpVar;
            }
        }
        return clpVar;
    }
}
