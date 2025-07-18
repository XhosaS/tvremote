package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wpl extends vuc implements vvk {
    public static final wpl a;
    private static volatile vvq g;
    public int b;
    public wni c;
    public wni d;
    public wni e;
    public String f = "";

    static {
        wpl wplVar = new wpl();
        a = wplVar;
        vuc.y(wpl.class, wplVar);
    }

    private wpl() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new wpl();
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
        synchronized (wpl.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
