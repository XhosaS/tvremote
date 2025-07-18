package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wha extends vuc implements vvk {
    public static final wha a;
    private static volatile vvq p;
    public int b;
    public long c;
    public int d;
    public int f;
    public int g;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public vuj e = vud.a;
    public vun h = vvt.a;

    static {
        wha whaVar = new wha();
        a = whaVar;
        vuc.y(wha.class, whaVar);
    }

    private wha() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0002\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ࠞ\u0004င\u0002\u0005င\u0003\u0006\u001b\u0007င\u0004\bင\u0005\tင\u0006\nင\u0007\u000bင\b\fင\t\rင\n", new Object[]{"b", "c", "d", "e", wdp.o, "f", "g", "h", wgz.class, "i", "j", "k", "l", "m", "n", "o"});
        }
        if (i2 == 3) {
            return new wha();
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
        vvq vvqVar = p;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wha.class) {
            vtxVar = p;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                p = vtxVar;
            }
        }
        return vtxVar;
    }
}
