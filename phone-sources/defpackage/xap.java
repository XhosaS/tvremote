package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xap extends vuc implements vvk {
    public static final xap a;
    private static volatile vvq e;
    public String b = "";
    public String c = "";
    public vun d = vvt.a;
    private int f;

    static {
        xap xapVar = new xap();
        a = xapVar;
        vuc.y(xap.class, xapVar);
    }

    private xap() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004\u001b", new Object[]{"f", "b", "c", "d", xao.class});
        }
        if (i2 == 3) {
            return new xap();
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
        synchronized (xap.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
