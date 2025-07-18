package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzs extends vuc implements vvk {
    public static final vzs a;
    private static volatile vvq f;
    public vun b = vvt.a;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        vzs vzsVar = new vzs();
        a = vzsVar;
        vuc.y(vzs.class, vzsVar);
    }

    private vzs() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0004\u0000\u0000\u0003\b\u0004\u0000\u0001\u0000\u0003\u0007\u0004\u0007\u0007\u001b\b\u0007", new Object[]{"c", "d", "b", vzv.class, "e"});
        }
        if (i2 == 3) {
            return new vzs();
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
        synchronized (vzs.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
