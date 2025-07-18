package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aagj extends vuc implements vvk {
    public static final aagj a;
    private static volatile vvq f;
    public int b;
    public int c;
    public aagm d;
    public aagl e;

    static {
        aagj aagjVar = new aagj();
        a = aagjVar;
        vuc.y(aagj.class, aagjVar);
    }

    private aagj() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004ဉ\u0003", new Object[]{"b", "c", aagk.c, "d", "e"});
        }
        if (i2 == 3) {
            return new aagj();
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
        synchronized (aagj.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
