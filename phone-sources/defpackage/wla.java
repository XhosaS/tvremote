package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wla extends vuc implements vvk {
    public static final wla a;
    private static volatile vvq g;
    public Object c;
    public int b = 0;
    public String d = "";
    public String e = "";
    public vun f = vvt.a;

    static {
        wla wlaVar = new wla();
        a = wlaVar;
        vuc.y(wla.class, wlaVar);
    }

    private wla() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003Ȉ\u0004Ț\u0005Ȉ", new Object[]{"c", "b", wlx.class, "e", "f", "d"});
        }
        if (i2 == 3) {
            return new wla();
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
        synchronized (wla.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
