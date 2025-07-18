package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acu extends clt implements cna {
    public static final acu a;
    private static volatile cng n;
    public Object c;
    public int e;
    public cma g;
    public cma h;
    public cma i;
    public cmd j;
    public clz k;
    public clw l;
    public clv m;
    public int b = 0;
    public String d = "";
    public cme f = cnj.a;

    static {
        acu acuVar = new acu();
        a = acuVar;
        clt.y(acu.class, acuVar);
    }

    private acu() {
        clu cluVar = clu.a;
        this.g = cluVar;
        this.h = cluVar;
        this.i = cluVar;
        this.j = cmp.a;
        this.k = clm.a;
        this.l = cle.a;
        this.m = ckm.a;
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0000\u0012\u0001\u0000\u0001\u0012\u0012\u0000\b\u0000\u0001Ȉ\u0002\f\u0003Ȼ\u0000\u00047\u0000\u00057\u0000\u00067\u0000\u00075\u0000\b4\u0000\t3\u0000\n:\u0000\u000bȚ\f'\r'\u000e'\u000f%\u0010$\u0011#\u0012*", new Object[]{"c", "b", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        }
        if (i2 == 3) {
            return new acu();
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
        cng cngVar = n;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (acu.class) {
            clpVar = n;
            if (clpVar == null) {
                clpVar = new clp(a);
                n = clpVar;
            }
        }
        return clpVar;
    }
}
