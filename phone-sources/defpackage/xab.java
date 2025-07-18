package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xab extends vuc implements vvk {
    public static final xab a;
    private static volatile vvq d;
    public String b = "";
    public vun c = vvt.a;
    private int e;

    static {
        xab xabVar = new xab();
        a = xabVar;
        vuc.y(xab.class, xabVar);
    }

    private xab() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"e", "b", "c", xaa.class});
        }
        if (i2 == 3) {
            return new xab();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (xab.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
