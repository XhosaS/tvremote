package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wor extends vuc implements vvk {
    public static final wor a;
    private static volatile vvq g;
    public wov e;
    private int h;
    public String b = "";
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        wor worVar = new wor();
        a = worVar;
        vuc.y(wor.class, worVar);
    }

    private wor() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0006Ȉ", new Object[]{"h", "b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new wor();
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
        synchronized (wor.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
