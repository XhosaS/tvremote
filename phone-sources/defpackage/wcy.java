package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wcy extends vuc implements vvk {
    public static final wcy a;
    private static volatile vvq h;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public wda f;
    public int g;

    static {
        wcy wcyVar = new wcy();
        a = wcyVar;
        vuc.y(wcy.class, wcyVar);
    }

    private wcy() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"d", "c", "b", "e", vnk.n, "f", wdf.class, "g", vnk.p, wdk.class, wdg.class});
        }
        if (i2 == 3) {
            return new wcy();
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
        vvq vvqVar = h;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wcy.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
