package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjr extends vuc implements vvk {
    public static final wjr a;
    private static volatile vvq f;
    public int b;
    public long c;
    public wjq d;
    public int e;

    static {
        wjr wjrVar = new wjr();
        a = wjrVar;
        vuc.y(wjr.class, wjrVar);
    }

    private wjr() {
        vvt vvtVar = vvt.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဉ\u0001\u0006᠌\u0003", new Object[]{"b", "c", "d", "e", wjk.c});
        }
        if (i2 == 3) {
            return new wjr();
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
        synchronized (wjr.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
