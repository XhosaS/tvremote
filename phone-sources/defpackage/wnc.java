package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnc extends vuc implements vvk {
    public static final wnc a;
    private static volatile vvq g;
    public int b;
    public wls c;
    public wlx d;
    public String e = "";
    public String f = "";

    static {
        wnc wncVar = new wnc();
        a = wncVar;
        vuc.y(wnc.class, wncVar);
    }

    private wnc() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0002\b\u0004\u0000\u0000\u0000\u0002ဉ\u0000\u0004ဉ\u0002\u0007Ȉ\bȈ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new wnc();
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
        synchronized (wnc.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
