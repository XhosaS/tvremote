package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwa extends vuc implements vvk {
    public static final rwa a;
    public static final vvd j;
    private static volatile vvq k;
    public int b;
    public boolean d;
    public boolean h;
    public String c = "";
    public String e = "";
    public String f = "";
    public vuj g = vud.a;
    public vun i = vvt.a;

    static {
        rwa rwaVar = new rwa();
        a = rwaVar;
        vuc.y(rwa.class, rwaVar);
        j = vuc.C(rvv.a, rwaVar, rwaVar, 334728578, vwo.MESSAGE);
    }

    private rwa() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0003ဇ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006'\u0007ဇ\u0004\b\u001a", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new rwa();
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
        vvq vvqVar = k;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (rwa.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
