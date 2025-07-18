package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xaj extends vuc implements vvk {
    public static final xaj a;
    private static volatile vvq d;
    public String b;
    public String c;
    private int e;

    static {
        xaj xajVar = new xaj();
        a = xajVar;
        vuc.y(xaj.class, xajVar);
    }

    private xaj() {
        vvt vvtVar = vvt.a;
        this.b = "";
        this.c = "";
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new xaj();
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
        synchronized (xaj.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
