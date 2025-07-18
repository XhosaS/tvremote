package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ofe extends vuc implements vvk {
    public static final ofe a;
    private static volatile vvq c;
    public uzo b;
    private int d;

    static {
        ofe ofeVar = new ofe();
        a = ofeVar;
        vuc.y(ofe.class, ofeVar);
    }

    private ofe() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new ofe();
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
        synchronized (ofe.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
