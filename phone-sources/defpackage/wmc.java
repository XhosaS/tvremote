package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmc extends vuc implements vvk {
    public static final wmc a;
    private static volatile vvq e;
    public String b = "";
    public int c;
    public ubt d;
    private int f;

    static {
        wmc wmcVar = new wmc();
        a = wmcVar;
        vuc.y(wmc.class, wmcVar);
    }

    private wmc() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003ဉ\u0000", new Object[]{"f", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new wmc();
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
        synchronized (wmc.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
