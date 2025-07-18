package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wld extends vuc implements vvk {
    public static final wld a;
    private static volatile vvq e;
    public String b = "";
    public String c = "";
    public boolean d;

    static {
        wld wldVar = new wld();
        a = wldVar;
        vuc.y(wld.class, wldVar);
    }

    private wld() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new wld();
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
        synchronized (wld.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
