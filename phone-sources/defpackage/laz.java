package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class laz extends vuc implements vvk {
    public static final laz a;
    private static volatile vvq g;
    public int b;
    public boolean c;
    public lay d;
    public long e;
    public long f;

    static {
        laz lazVar = new laz();
        a = lazVar;
        vuc.y(laz.class, lazVar);
    }

    private laz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002ဉ\u0000\u0003\u0002\u0004\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new laz();
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
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (laz.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
