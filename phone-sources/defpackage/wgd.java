package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgd extends vuc implements vvk {
    public static final wgd a;
    private static volatile vvq d;
    public int b;
    public vsz c = vsz.b;

    static {
        wgd wgdVar = new wgd();
        a = wgdVar;
        vuc.y(wgd.class, wgdVar);
    }

    private wgd() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ည\u0003", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new wgd();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wgd.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
