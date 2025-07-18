package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrf extends vuc implements vvk {
    public static final wrf a;
    private static volatile vvq b;

    static {
        wrf wrfVar = new wrf();
        a = wrfVar;
        vuc.y(wrf.class, wrfVar);
    }

    private wrf() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new wrf();
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
        vvq vvqVar = b;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wrf.class) {
            vtxVar = b;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                b = vtxVar;
            }
        }
        return vtxVar;
    }
}
