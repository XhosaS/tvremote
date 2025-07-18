package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmd extends clt implements cna {
    public static final bmd a;
    private static volatile cng e;
    public int b;
    public bmf c;
    public int d;
    private byte f = 2;

    static {
        bmd bmdVar = new bmd();
        a = bmdVar;
        clt.y(bmd.class, bmdVar);
    }

    private bmd() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔉ\u0000\u0002ᴌ\u0001", new Object[]{"b", "c", "d", awv.d});
        }
        if (i2 == 3) {
            return new bmd();
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
        cng cngVar = e;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (bmd.class) {
            clpVar = e;
            if (clpVar == null) {
                clpVar = new clp(a);
                e = clpVar;
            }
        }
        return clpVar;
    }
}
