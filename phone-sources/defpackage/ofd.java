package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ofd extends vuc implements vvk {
    public static final ofd a;
    private static volatile vvq c;
    public vve b;
    private vve d;

    static {
        ofd ofdVar = new ofd();
        a = ofdVar;
        vuc.y(ofd.class, ofdVar);
    }

    private ofd() {
        vve vveVar = vve.a;
        this.b = vveVar;
        this.d = vveVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0002\u0000\u0000\u00012\u00032", new Object[]{"b", ofc.a, "d", ofb.a});
        }
        if (i2 == 3) {
            return new ofd();
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
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (ofd.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
