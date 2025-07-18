package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ngu extends vuc implements vvk {
    public static final ngu a;
    private static volatile vvq g;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public vun f = vvt.a;

    static {
        ngu nguVar = new ngu();
        a = nguVar;
        vuc.y(ngu.class, nguVar);
    }

    private ngu() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004\u001b", new Object[]{"b", "c", "d", "e", "f", ngr.class});
        }
        if (i2 == 3) {
            return new ngu();
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
        synchronized (ngu.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
