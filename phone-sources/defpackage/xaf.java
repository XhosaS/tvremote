package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xaf extends vuc implements vvk {
    public static final xaf a;
    private static volatile vvq i;
    public int b;
    public int c;
    public long d;
    public xab e;
    public xae f;
    public xab g;
    public wzz h;

    static {
        xaf xafVar = new xaf();
        a = xafVar;
        vuc.y(xaf.class, xafVar);
    }

    private xaf() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0003ဂ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\tဉ\b", new Object[]{"b", "c", wjk.q, "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new xaf();
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
        synchronized (xaf.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
