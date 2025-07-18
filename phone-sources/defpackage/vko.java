package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vko extends vuc implements vvk {
    public static final vko a;
    private static volatile vvq g;
    public int b;
    public long d;
    public long e;
    public String c = "";
    public vsz f = vsz.b;

    static {
        vko vkoVar = new vko();
        a = vkoVar;
        vuc.y(vko.class, vkoVar);
    }

    private vko() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0000\u0003ဂ\u0001\u0004ဈ\u0000\u0005ဂ\u0002\u0006ည\u0003", new Object[]{"b", "d", "c", "e", "f"});
        }
        if (i2 == 3) {
            return new vko();
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
        synchronized (vko.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
