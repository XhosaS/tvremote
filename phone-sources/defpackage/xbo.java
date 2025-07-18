package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xbo extends vuc implements vvk {
    public static final xbo a;
    private static volatile vvq e;
    public int b;
    public int c;
    public xbl d;
    private int f;

    static {
        xbo xboVar = new xbo();
        a = xboVar;
        vuc.y(xbo.class, xboVar);
    }

    private xbo() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"f", "b", xal.p, "c", xal.o, "d"});
        }
        if (i2 == 3) {
            return new xbo();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (xbo.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
