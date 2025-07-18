package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyt extends clt implements cna {
    public static final cyt a;
    private static volatile cng d;
    public cnv c;
    private int e;
    private byte f = 2;
    public cme b = cnj.a;

    static {
        cyt cytVar = new cyt();
        a = cytVar;
        clt.y(cyt.class, cytVar);
    }

    private cyt() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0001\u0003Л\u0004ဉ\u0001", new Object[]{"e", "b", cys.class, "c"});
        }
        if (i2 == 3) {
            return new cyt();
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
        cng cngVar = d;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cyt.class) {
            clpVar = d;
            if (clpVar == null) {
                clpVar = new clp(a);
                d = clpVar;
            }
        }
        return clpVar;
    }
}
