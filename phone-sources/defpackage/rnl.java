package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rnl extends vuc implements vvk {
    public static final rnl a;
    private static volatile vvq f;
    public int b;
    public vwe d;
    public int e;
    private byte g = 2;
    public vun c = vvt.a;

    static {
        rnl rnlVar = new rnl();
        a = rnlVar;
        vuc.y(rnl.class, rnlVar);
    }

    private rnl() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003᠌\u0001", new Object[]{"b", "c", zbe.class, "d", "e", kzn.g});
        }
        if (i2 == 3) {
            return new rnl();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (rnl.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
