package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wut extends vuc implements vvk {
    public static final wut a;
    public static final vvd f;
    private static volatile vvq g;
    public wlx b;
    public String c = "";
    public wls d;
    public wla e;
    private int h;

    static {
        wut wutVar = new wut();
        a = wutVar;
        vuc.y(wut.class, wutVar);
        f = vuc.C(wkx.a, wutVar, wutVar, 353709078, vwo.MESSAGE);
    }

    private wut() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0000\u0002ဉ\u0001\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"h", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new wut();
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
        synchronized (wut.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
