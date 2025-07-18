package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uio extends vuc implements vvk {
    public static final uio a;
    private static volatile vvq c;
    public long b = -1;
    private int d;

    static {
        uio uioVar = new uio();
        a = uioVar;
        vuc.y(uio.class, uioVar);
    }

    private uio() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဂ\u0003", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new uio();
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
        synchronized (uio.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
