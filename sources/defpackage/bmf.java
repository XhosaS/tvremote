package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmf extends clt implements cna {
    public static final bmf a;
    private static volatile cng e;
    public int b;
    public int c;
    public int d;
    private byte f = 2;

    static {
        bmf bmfVar = new bmf();
        a = bmfVar;
        clt.y(bmf.class, bmfVar);
    }

    private bmf() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᴌ\u0000\u0002ᔋ\u0001", new Object[]{"b", "c", awv.c, "d"});
        }
        if (i2 == 3) {
            return new bmf();
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
        synchronized (bmf.class) {
            clpVar = e;
            if (clpVar == null) {
                clpVar = new clp(a);
                e = clpVar;
            }
        }
        return clpVar;
    }
}
