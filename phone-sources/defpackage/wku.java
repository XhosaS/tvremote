package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wku extends vuc implements vvk {
    public static final wku a;
    private static volatile vvq f;
    public int b = 0;
    public Object c;
    public int d;
    public int e;

    static {
        wku wkuVar = new wku();
        a = wkuVar;
        vuc.y(wku.class, wkuVar);
    }

    private wku() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0001\u0000\u0002\u0007\u0005\u0000\u0000\u0000\u0002\u0004\u0003\u0004\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"c", "b", "d", "e", wkr.class, wks.class, wkt.class});
        }
        if (i2 == 3) {
            return new wku();
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
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wku.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
