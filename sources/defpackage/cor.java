package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cor extends clr implements cna {
    public static final cor a;
    private static volatile cng m;
    public int b;
    public long c;
    public long e;
    public int f;
    public ckv g;
    public long h;
    public boolean i;
    public String j;
    public double k;
    public cos l;
    private byte n = 2;

    static {
        cor corVar = new cor();
        a = corVar;
        clt.y(cor.class, corVar);
    }

    private cor() {
        cnj cnjVar = cnj.a;
        ckv ckvVar = ckv.b;
        this.g = ckv.b;
        this.h = 180000L;
        clu cluVar = clu.a;
        this.j = "";
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\t\u0000\u0001\u0001!\t\u0000\u0000\u0001\u0001ဂ\u0000\u0006ည\u000b\u000bင\u0005\u000fတ\u0011\u0011ဂ\u0001\u0019ဇ\u0017\u001cဈ\u0018 က\u001a!ᐉ\u001c", new Object[]{"b", "c", "g", "f", "h", "e", "i", "j", "k", "l"});
        }
        if (i2 == 3) {
            return new cor();
        }
        if (i2 == 4) {
            return new clq(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.n = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = m;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cor.class) {
            clpVar = m;
            if (clpVar == null) {
                clpVar = new clp(a);
                m = clpVar;
            }
        }
        return clpVar;
    }
}
