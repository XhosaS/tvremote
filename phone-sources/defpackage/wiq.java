package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wiq extends vuc implements vvk {
    public static final wiq a;
    private static volatile vvq i;
    public int b;
    public long c;
    public long d;
    public vwe e;
    public int f;
    public int g;
    public int h;

    static {
        wiq wiqVar = new wiq();
        a = wiqVar;
        vuc.y(wiq.class, wiqVar);
    }

    private wiq() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006င\u0005", new Object[]{"b", "c", "d", "e", "f", wia.k, "g", wia.j, "h"});
        }
        if (i3 == 3) {
            return new wiq();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        vvq vvqVar = i;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wiq.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
