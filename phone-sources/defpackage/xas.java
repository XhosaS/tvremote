package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xas extends vuc implements vvk {
    public static final xas a;
    private static volatile vvq c;
    public xbi b;
    private int d;

    static {
        xas xasVar = new xas();
        a = xasVar;
        vuc.y(xas.class, xasVar);
    }

    private xas() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0003", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new xas();
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
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (xas.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
