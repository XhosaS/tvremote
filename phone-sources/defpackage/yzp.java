package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzp extends vuc implements vvk {
    public static final yzp a;
    private static volatile vvq d;
    public int b;
    public int c = -1;

    static {
        yzp yzpVar = new yzp();
        a = yzpVar;
        vuc.y(yzp.class, yzpVar);
    }

    private yzp() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", yyv.e});
        }
        if (i2 == 3) {
            return new yzp();
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
        synchronized (yzp.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
