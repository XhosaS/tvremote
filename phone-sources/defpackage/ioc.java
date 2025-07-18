package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ioc extends vuc implements vvk {
    public static final ioc a;
    private static volatile vvq h;
    public int b;
    public vwe c;
    public int d;
    public vwe e;
    public int f;
    public vwe g;

    static {
        ioc iocVar = new ioc();
        a = iocVar;
        vuc.y(ioc.class, iocVar);
    }

    private ioc() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004\u0003ဉ\u0001\u0004\u0004\u0005ဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new ioc();
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
        vvq vvqVar = h;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (ioc.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
