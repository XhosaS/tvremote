package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzb extends vuc implements vvk {
    public static final vzb a;
    private static volatile vvq d;
    public int b = 0;
    public Object c;

    static {
        vzb vzbVar = new vzb();
        a = vzbVar;
        vuc.y(vzb.class, vzbVar);
    }

    private vzb() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0004\u0001\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002?\u0000\u0003?\u0000\u0004?\u0000\u0005?\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new vzb();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vzb.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
