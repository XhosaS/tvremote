package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwl extends vuc implements vvk {
    public static final uwl a;
    private static volatile vvq f;
    public int b;
    public vun c = vvt.a;
    public vtl d;
    public boolean e;

    static {
        uwl uwlVar = new uwl();
        a = uwlVar;
        vuc.y(uwl.class, uwlVar);
    }

    private uwl() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဇ\u0001", new Object[]{"b", "c", uwk.class, "d", "e"});
        }
        if (i2 == 3) {
            return new uwl();
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
        synchronized (uwl.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
