package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class waa extends vuc implements vvk {
    public static final waa a;
    private static volatile vvq f;
    public val b;
    public String c = "";
    public vun d;
    public vun e;
    private int g;

    static {
        waa waaVar = new waa();
        a = waaVar;
        vuc.y(waa.class, waaVar);
    }

    private waa() {
        vvt vvtVar = vvt.a;
        this.d = vvtVar;
        this.e = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\u001b\u0004\u001b", new Object[]{"g", "b", "c", "d", val.class, "e", val.class});
        }
        if (i2 == 3) {
            return new waa();
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
        synchronized (waa.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
