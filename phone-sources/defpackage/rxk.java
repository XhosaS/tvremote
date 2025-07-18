package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxk extends vuc implements vvk {
    public static final rxk a;
    private static volatile vvq g;
    public long e;
    private int h;
    public vve f = vve.a;
    public String b = "";
    public vsz c = vsz.b;
    public String d = "";

    static {
        rxk rxkVar = new rxk();
        a = rxkVar;
        vuc.y(rxk.class, rxkVar);
    }

    private rxk() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"h", "b", "c", "d", "e", "f", rxj.a});
        }
        if (i2 == 3) {
            return new rxk();
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
        synchronized (rxk.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
