package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wps extends vuc implements vvk {
    public static final wps a;
    public static final vvd d;
    private static volatile vvq e;
    public int b;
    public wll c;

    static {
        wps wpsVar = new wps();
        a = wpsVar;
        vuc.y(wps.class, wpsVar);
        d = vuc.C(wkg.a, wpsVar, wpsVar, 525000002, vwo.MESSAGE);
    }

    private wps() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new wps();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wps.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
