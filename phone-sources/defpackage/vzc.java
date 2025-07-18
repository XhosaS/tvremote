package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzc extends vuc implements vvk {
    public static final vzc a;
    private static volatile vvq c;
    public vsz b = vsz.b;

    static {
        vzc vzcVar = new vzc();
        a = vzcVar;
        vuc.y(vzc.class, vzcVar);
    }

    private vzc() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new vzc();
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
        synchronized (vzc.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
