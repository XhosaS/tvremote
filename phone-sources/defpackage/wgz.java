package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgz extends vuc implements vvk {
    public static final wgz a;
    private static volatile vvq k;
    public int b;
    public long c;
    public vuj d;
    public vuj e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    static {
        wgz wgzVar = new wgz();
        a = wgzVar;
        vuc.y(wgz.class, wgzVar);
    }

    private wgz() {
        vud vudVar = vud.a;
        this.d = vudVar;
        this.e = vudVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဂ\u0000\u0002ࠞ\u0003ࠞ\u0004င\u0001\u0005င\u0002\u0006င\u0003\u0007င\u0004\b᠌\u0005", new Object[]{"b", "c", "d", wdp.n, "e", wdp.m, "f", "g", "h", "i", "j", wdp.l});
        }
        if (i2 == 3) {
            return new wgz();
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
        vvq vvqVar = k;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wgz.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
