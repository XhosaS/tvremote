package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wdk extends vuc implements vvk {
    public static final wdk a;
    private static volatile vvq g;
    public int b;
    public boolean c;
    public long d;
    public boolean e;
    public int f;

    static {
        wdk wdkVar = new wdk();
        a = wdkVar;
        vuc.y(wdk.class, wdkVar);
    }

    private wdk() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new wdk();
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
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wdk.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
