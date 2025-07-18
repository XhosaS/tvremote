package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class why extends vuc implements vvk {
    public static final why a;
    private static volatile vvq h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        why whyVar = new why();
        a = whyVar;
        vuc.y(why.class, whyVar);
    }

    private why() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"b", "c", wdp.u, "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new why();
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
        synchronized (why.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
