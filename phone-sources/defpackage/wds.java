package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wds extends vuc implements vvk {
    public static final wds a;
    private static volatile vvq h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g = "";

    static {
        wds wdsVar = new wds();
        a = wdsVar;
        vuc.y(wds.class, wdsVar);
    }

    private wds() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004᠌\u0003\u0006᠌\u0005\u0007ဈ\u0006", new Object[]{"b", "c", wdp.g, "d", wdp.e, "e", wdp.f, "f", wdp.d, "g"});
        }
        if (i2 == 3) {
            return new wds();
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
        vvq vvqVar = h;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wds.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
