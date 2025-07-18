package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wwf extends vuc implements vvk {
    public static final wwf a;
    private static volatile vvq c;
    public wom b;
    private int d;
    private byte e = 2;

    static {
        wwf wwfVar = new wwf();
        a = wwfVar;
        vuc.y(wwf.class, wwfVar);
    }

    private wwf() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new wwf();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wwf.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
