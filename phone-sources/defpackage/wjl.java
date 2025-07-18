package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjl extends vuc implements vvk {
    public static final wjl a;
    private static volatile vvq f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        wjl wjlVar = new wjl();
        a = wjlVar;
        vuc.y(wjl.class, wjlVar);
    }

    private wjl() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"b", "c", wjk.b, "d", wjk.a, "e"});
        }
        if (i2 == 3) {
            return new wjl();
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
        synchronized (wjl.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
