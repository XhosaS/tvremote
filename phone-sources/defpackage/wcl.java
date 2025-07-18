package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wcl extends vuc implements vvk {
    public static final wcl a;
    private static volatile vvq f;
    public int b;
    public int c = 0;
    public Object d;
    public vdn e;

    static {
        wcl wclVar = new wcl();
        a = wclVar;
        vuc.y(wcl.class, wclVar);
    }

    private wcl() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"d", "c", "b", "e", wci.class, wce.class, wck.class, wcn.class, wco.class, wbd.class, wcd.class});
        }
        if (i2 == 3) {
            return new wcl();
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
        synchronized (wcl.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
