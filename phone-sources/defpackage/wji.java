package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wji extends vuc implements vvk {
    public static final wji a;
    private static volatile vvq f;
    public int b;
    public wik c;
    public vun d = vvt.a;
    public wjg e;

    static {
        wji wjiVar = new wji();
        a = wjiVar;
        vuc.y(wji.class, wjiVar);
    }

    private wji() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0005\u001b\u0006ဉ\u0002", new Object[]{"b", "c", "d", wjh.class, "e"});
        }
        if (i2 == 3) {
            return new wji();
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
        synchronized (wji.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
