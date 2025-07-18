package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wuw extends vuc implements vvk {
    public static final wuw a;
    private static volatile vvq e;
    public Object c;
    private int f;
    public int b = 0;
    public String d = "";

    static {
        wuw wuwVar = new wuw();
        a = wuwVar;
        vuc.y(wuw.class, wuwVar);
    }

    private wuw() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", "f", "d", woc.class, wla.class, wls.class});
        }
        if (i2 == 3) {
            return new wuw();
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
        synchronized (wuw.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
