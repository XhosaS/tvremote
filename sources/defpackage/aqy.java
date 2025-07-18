package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqy extends clt implements cna {
    public static final aqy a;
    private static volatile cng f;
    public int b;
    public long c;
    public cnv d;
    private byte g = 2;
    public cme e = cnj.a;

    static {
        aqy aqyVar = new aqy();
        a = aqyVar;
        clt.y(aqy.class, aqyVar);
    }

    private aqy() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ဂ\u0000\u0002ဉ\u0001\u0004Л", new Object[]{"b", "c", "d", "e", aqu.class});
        }
        if (i2 == 3) {
            return new aqy();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = f;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (aqy.class) {
            clpVar = f;
            if (clpVar == null) {
                clpVar = new clp(a);
                f = clpVar;
            }
        }
        return clpVar;
    }

    public final void b() {
        cme cmeVar = this.e;
        if (cmeVar.c()) {
            return;
        }
        this.e = clt.t(cmeVar);
    }
}
