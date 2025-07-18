package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjj extends vuc implements vvk {
    public static final wjj a;
    private static volatile vvq g;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public win f;

    static {
        wjj wjjVar = new wjj();
        a = wjjVar;
        vuc.y(wjj.class, wjjVar);
    }

    private wjj() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new wjj();
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
        synchronized (wjj.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
