package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmh extends clt implements cna {
    public static final bmh a;
    private static volatile cng g;
    public int b;
    public Object d;
    public int e;
    public int c = 0;
    private byte h = 2;
    public int f = 200;

    static {
        bmh bmhVar = new bmh();
        a = bmhVar;
        clt.y(bmh.class, bmhVar);
    }

    private bmh() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\t\u0001\u0001\u0001)\t\u0000\u0000\u0007\u0001ᔄ\u0000\u0002ᴌ\u0001\nм\u0000\u000b<\u0000\u0014м\u0000\u001eм\u0000\u001f<\u0000(м\u0000)м\u0000", new Object[]{"d", "c", "b", "e", "f", awv.e, bmi.class, bmj.class, bmg.class, bmd.class, bme.class, bmk.class, bml.class});
        }
        if (i2 == 3) {
            return new bmh();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = g;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (bmh.class) {
            clpVar = g;
            if (clpVar == null) {
                clpVar = new clp(a);
                g = clpVar;
            }
        }
        return clpVar;
    }
}
