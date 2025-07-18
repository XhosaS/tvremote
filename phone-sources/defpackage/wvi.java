package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvi extends vuc implements vvk {
    public static final wvi a;
    private static volatile vvq c;
    public vun b = vvt.a;

    static {
        wvi wviVar = new wvi();
        a = wviVar;
        vuc.y(wvi.class, wviVar);
    }

    private wvi() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", wll.class});
        }
        if (i2 == 3) {
            return new wvi();
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
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wvi.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
