package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uce extends vuc implements vvk {
    public static final uce a;
    private static volatile vvq d;
    public int b;
    public int c;

    static {
        uce uceVar = new uce();
        a = uceVar;
        vuc.y(uce.class, uceVar);
    }

    private uce() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", ubu.e});
        }
        if (i2 == 3) {
            return new uce();
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
        synchronized (uce.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
