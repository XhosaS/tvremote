package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wiy extends vuc implements vvk {
    public static final wiy a;
    private static volatile vvq x;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public vuj j = vud.a;
    public vun r = vvt.a;

    static {
        wiy wiyVar = new wiy();
        a = wiyVar;
        vuc.y(wiy.class, wiyVar);
    }

    private wiy() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0015\u0000\u0001\u0001\u0016\u0015\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\b\u0016\tင\u0007\nင\b\u000bင\t\fင\n\rင\u000b\u000eင\f\u000fင\r\u0010\u001b\u0011င\u000e\u0013င\u000f\u0014င\u0010\u0015င\u0011\u0016င\u0012", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", ucg.class, "s", "t", "u", "v", "w"});
        }
        if (i2 == 3) {
            return new wiy();
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
        synchronized (wiy.class) {
            vtxVar = x;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                x = vtxVar;
            }
        }
        return vtxVar;
    }
}
