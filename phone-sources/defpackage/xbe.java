package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xbe extends vuc implements vvk {
    public static final xbe a;
    private static volatile vvq i;
    public int b;
    public long d;
    public boolean g;
    public boolean h;
    public String c = "";
    public String e = "";
    public String f = "";

    static {
        xbe xbeVar = new xbe();
        a = xbeVar;
        vuc.y(xbe.class, xbeVar);
    }

    private xbe() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0007ဇ\u0006\tဇ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new xbe();
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
        synchronized (xbe.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
