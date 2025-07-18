package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpd extends vuc implements vvk {
    public static final tpd a;
    private static volatile vvq i;
    public int b;
    public int f;
    public tpa g;
    public String c = "";
    public String d = "";
    public String e = "";
    public vsz h = vsz.b;

    static {
        tpd tpdVar = new tpd();
        a = tpdVar;
        vuc.y(tpd.class, tpdVar);
    }

    private tpd() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဈ\u0004\u0006င\u0005\u0007ဉ\u0006\bည\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new tpd();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        vvq vvqVar = i;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (tpd.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
