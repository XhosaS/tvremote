package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wep extends vuc implements vvk {
    public static final wep a;
    private static volatile vvq d;
    private vve e = vve.a;
    public String b = "";
    public String c = "";

    static {
        wep wepVar = new wep();
        a = wepVar;
        vuc.y(wep.class, wepVar);
    }

    private wep() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032", new Object[]{"b", "c", "e", weo.a});
        }
        if (i2 == 3) {
            return new wep();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wep.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
