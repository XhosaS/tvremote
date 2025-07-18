package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmm extends vuc implements vvk {
    public static final tmm a;
    private static volatile vvq b;

    static {
        tmm tmmVar = new tmm();
        a = tmmVar;
        vuc.y(tmm.class, tmmVar);
    }

    private tmm() {
        vvt vvtVar = vvt.a;
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
            return new tmm();
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
        synchronized (tmm.class) {
            vtxVar = b;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                b = vtxVar;
            }
        }
        return vtxVar;
    }
}
