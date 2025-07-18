package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tnh extends vuc implements vvk {
    public static final tnh a;
    private static volatile vvq e;
    public int b;
    public boolean c;
    public int d;

    static {
        tnh tnhVar = new tnh();
        a = tnhVar;
        vuc.y(tnh.class, tnhVar);
    }

    private tnh() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new tnh();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (tnh.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
