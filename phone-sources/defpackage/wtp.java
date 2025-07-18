package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wtp extends vuc implements vvk {
    public static final wtp a;
    private static volatile vvq e;
    public wls b;
    public wls c;
    public wls d;
    private int f;

    static {
        wtp wtpVar = new wtp();
        a = wtpVar;
        vuc.y(wtp.class, wtpVar);
    }

    private wtp() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new wtp();
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
        synchronized (wtp.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
