package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aagl extends vuc implements vvk {
    public static final aagl a;
    private static volatile vvq f;
    public int b;
    public int c;
    public long d;
    public int e;

    static {
        aagl aaglVar = new aagl();
        a = aaglVar;
        vuc.y(aagl.class, aaglVar);
    }

    private aagl() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003᠌\u0002", new Object[]{"b", "c", aagk.d, "d", "e", yyv.u});
        }
        if (i2 == 3) {
            return new aagl();
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
        synchronized (aagl.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
