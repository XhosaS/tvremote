package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjw extends vuc implements vvk {
    public static final wjw a;
    private static volatile vvq d;
    public int b;
    public boolean c;

    static {
        wjw wjwVar = new wjw();
        a = wjwVar;
        vuc.y(wjw.class, wjwVar);
    }

    private wjw() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0017\u0017\u0001\u0000\u0000\u0000\u0017ဇ\r", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new wjw();
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
        synchronized (wjw.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
