package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class whi extends vuc implements vvk {
    public static final whi a;
    private static volatile vvq g;
    public int b;
    public int c;
    public vuj d = vud.a;
    public boolean e;
    public whh f;

    static {
        whi whiVar = new whi();
        a = whiVar;
        vuc.y(whi.class, whiVar);
    }

    private whi() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0004\u0016\u0007ဇ\u0005\bဉ\u0006", new Object[]{"b", "c", wdp.p, "d", "e", "f"});
        }
        if (i2 == 3) {
            return new whi();
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
        synchronized (whi.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
