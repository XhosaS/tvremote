package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uyw extends vuc implements vvk {
    public static final uyw a;
    private static volatile vvq f;
    public int b;
    public int c;
    public uxq d;
    public uye e;

    static {
        uyw uywVar = new uyw();
        a = uywVar;
        vuc.y(uyw.class, uywVar);
    }

    private uyw() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", uxz.k, "d", "e"});
        }
        if (i2 == 3) {
            return new uyw();
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
        synchronized (uyw.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
