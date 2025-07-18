package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wtu extends vuc implements vvk {
    public static final wtu a;
    private static volatile vvq f;
    public int b;
    public String c = "";
    public String d = "";
    public wtt e;

    static {
        wtu wtuVar = new wtu();
        a = wtuVar;
        vuc.y(wtu.class, wtuVar);
    }

    private wtu() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new wtu();
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
        synchronized (wtu.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
