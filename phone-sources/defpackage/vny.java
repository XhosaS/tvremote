package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vny extends vuc implements vvk {
    public static final vny a;
    private static volatile vvq f;
    public int b;
    public vno c;
    public int d;
    public boolean e;

    static {
        vny vnyVar = new vny();
        a = vnyVar;
        vuc.y(vny.class, vnyVar);
    }

    private vny() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", vnk.f, "e"});
        }
        if (i2 == 3) {
            return new vny();
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
        synchronized (vny.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
