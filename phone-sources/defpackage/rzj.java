package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rzj extends vuc implements vvk {
    public static final rzj a;
    private static volatile vvq f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        rzj rzjVar = new rzj();
        a = rzjVar;
        vuc.y(rzj.class, rzjVar);
    }

    private rzj() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (i2 == 3) {
            return new rzj();
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
        synchronized (rzj.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
