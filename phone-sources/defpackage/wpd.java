package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wpd extends vuc implements vvk {
    public static final wpd a;
    private static volatile vvq g;
    public Object c;
    public Object e;
    public int b = 0;
    public int d = 0;
    public String f = "";

    static {
        wpd wpdVar = new wpd();
        a = wpdVar;
        vuc.y(wpd.class, wpdVar);
    }

    private wpd() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0002\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0001\u0004<\u0000\u0005<\u0001", new Object[]{"c", "b", "e", "d", "f", wll.class, wll.class, wni.class, wni.class});
        }
        if (i2 == 3) {
            return new wpd();
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
        synchronized (wpd.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
