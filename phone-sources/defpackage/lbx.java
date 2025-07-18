package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbx extends vuc implements vvk {
    public static final lbx a;
    private static volatile vvq e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        lbx lbxVar = new lbx();
        a = lbxVar;
        vuc.y(lbx.class, lbxVar);
    }

    private lbx() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u00027\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", "d", lbz.class, lcb.class});
        }
        if (i2 == 3) {
            return new lbx();
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
        synchronized (lbx.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
