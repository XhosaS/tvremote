package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzz extends vuc implements vvk {
    public static final yzz a;
    private static volatile vvq x;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public int s;
    public boolean t;
    public yzx u;
    public yzx v;
    public vve w = vve.a;

    static {
        yzz yzzVar = new yzz();
        a = yzzVar;
        vuc.y(yzz.class, yzzVar);
    }

    private yzz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0015\u0000\u0001\u0001\u0019\u0015\u0001\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0004\u0004ဂ\u0007\u0005ဂ\t\tဂ\n\nဂ\u000f\u000bဇ\u0010\fဉ\u0013\rဉ\u0014\u000eဂ\u0001\u000fဂ\u0002\u00102\u0011ဂ\u0005\u0012ဂ\b\u0013ဂ\u0006\u0014ဂ\u000b\u0015ဂ\f\u0016᠌\u0011\u0017ဂ\r\u0018ဂ\u000e\u0019ဇ\u0012", new Object[]{"b", "c", "f", "i", "k", "l", "q", "r", "u", "v", "d", "e", "w", yzy.a, "g", "j", "h", "m", "n", "s", yyv.n, "o", "p", "t"});
        }
        if (i2 == 3) {
            return new yzz();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = x;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (yzz.class) {
            vtxVar = x;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                x = vtxVar;
            }
        }
        return vtxVar;
    }
}
