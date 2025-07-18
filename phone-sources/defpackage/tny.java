package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tny extends vuc implements vvk {
    public static final tny a;
    private static volatile vvq h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    private int i;

    static {
        tny tnyVar = new tny();
        a = tnyVar;
        vuc.y(tny.class, tnyVar);
    }

    private tny() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0004᠌\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bဇ\u0007", new Object[]{"i", "b", "c", kzn.r, "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new tny();
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
        synchronized (tny.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
