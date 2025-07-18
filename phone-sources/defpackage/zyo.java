package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zyo extends vuc implements vvk {
    public static final zyo a;
    private static volatile vvq c;
    public vun b = vvt.a;

    static {
        zyo zyoVar = new zyo();
        a = zyoVar;
        vuc.y(zyo.class, zyoVar);
    }

    private zyo() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"b", zyn.class});
        }
        if (i2 == 3) {
            return new zyo();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (zyo.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
