package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbt extends vuc implements vvk {
    public static final lbt a;
    private static volatile vvq s;
    public int b;
    public int c;
    public int d;
    public long e;
    public int f;
    public long g;
    public long h;
    public long i;
    public int k;
    public int l;
    public boolean p;
    public lcm q;
    public int r;
    public String j = "";
    public String m = "";
    public String n = "";
    public String o = "";

    static {
        lbt lbtVar = new lbt();
        a = lbtVar;
        vuc.y(lbt.class, lbtVar);
    }

    private lbt() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0002\u0004\f\u0005\u0002\u0006\u0002\u0007\u0002\bȈ\t\f\n\f\u000bȈ\fȈ\rȈ\u000e\u0007\u000fဉ\u0000\u0010\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"});
        }
        if (i2 == 3) {
            return new lbt();
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
        vvq vvqVar = s;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (lbt.class) {
            vtxVar = s;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                s = vtxVar;
            }
        }
        return vtxVar;
    }
}
