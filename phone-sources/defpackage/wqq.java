package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqq extends vuc implements vvk {
    public static final wqq a;
    public static final vvd f;
    private static volatile vvq g;
    public int b;
    public wlx c;
    public String d = "";
    public String e = "";

    static {
        wqq wqqVar = new wqq();
        a = wqqVar;
        vuc.y(wqq.class, wqqVar);
        f = vuc.C(wkx.a, wqqVar, wqqVar, 525000011, vwo.MESSAGE);
    }

    private wqq() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ለ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new wqq();
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
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wqq.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
