package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wlu extends vuc implements vvk {
    public static final wlu a;
    private static volatile vvq d;
    public String b = "";
    public float c;

    static {
        wlu wluVar = new wlu();
        a = wluVar;
        vuc.y(wlu.class, wluVar);
    }

    private wlu() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001Ȉ\u0003\u0001", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new wlu();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wlu.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
