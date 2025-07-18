package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwr extends vuc implements vvk {
    public static final uwr a;
    private static volatile vvq j;
    public int b;
    public uws c;
    public long d;
    public int e;
    public vib f;
    public String g = "";
    public String h = "";
    public vsz i = vsz.b;

    static {
        uwr uwrVar = new uwr();
        a = uwrVar;
        vuc.y(uwr.class, uwrVar);
    }

    private uwr() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0007\u0000\u0001\u0002\b\u0007\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bည\u0007", new Object[]{"b", "c", "d", "e", uvj.m, "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new uwr();
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
        vvq vvqVar = j;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uwr.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
