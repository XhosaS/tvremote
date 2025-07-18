package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgj extends clt implements cna {
    public static final cgj a;
    private static volatile cng c;
    private byte d = 2;
    public cme b = cnj.a;

    static {
        cgj cgjVar = new cgj();
        a = cgjVar;
        clt.y(cgj.class, cgjVar);
    }

    private cgj() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", cgk.class});
        }
        if (i2 == 3) {
            return new cgj();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.d = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = c;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cgj.class) {
            clpVar = c;
            if (clpVar == null) {
                clpVar = new clp(a);
                c = clpVar;
            }
        }
        return clpVar;
    }

    public final void b() {
        cme cmeVar = this.b;
        if (cmeVar.c()) {
            return;
        }
        this.b = clt.t(cmeVar);
    }
}
