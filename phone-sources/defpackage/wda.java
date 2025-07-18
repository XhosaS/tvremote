package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wda extends vuc implements vvk {
    public static final wda a;
    private static volatile vvq h;
    public int b;
    public int c;
    public int e;
    public int g;
    public String d = "";
    public String f = "";

    static {
        wda wdaVar = new wda();
        a = wdaVar;
        vuc.y(wda.class, wdaVar);
    }

    private wda() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004", new Object[]{"b", "c", "d", "e", vnk.o, "f", "g"});
        }
        if (i2 == 3) {
            return new wda();
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
        synchronized (wda.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
