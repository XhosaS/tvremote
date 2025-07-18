package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wls extends vuc implements vvk {
    public static final wls a;
    private static volatile vvq f;
    public boolean c;
    public boolean d;
    public String b = "";
    public String e = "";

    static {
        wls wlsVar = new wls();
        a = wlsVar;
        vuc.y(wls.class, wlsVar);
    }

    private wls() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new wls();
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
        synchronized (wls.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
