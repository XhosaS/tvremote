package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ucg extends vuc implements vvk {
    public static final ucg a;
    private static volatile vvq f;
    public int b;
    public int c;
    public String d = "";
    public boolean e;

    static {
        ucg ucgVar = new ucg();
        a = ucgVar;
        vuc.y(ucg.class, ucgVar);
    }

    private ucg() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", ubu.f, "d", "e"});
        }
        if (i2 == 3) {
            return new ucg();
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
        synchronized (ucg.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
