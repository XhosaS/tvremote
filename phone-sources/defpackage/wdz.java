package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wdz extends vuc implements vvk {
    public static final wdz a;
    private static volatile vvq f;
    public int b;
    public long d;
    public String c = "";
    public String e = "";

    static {
        wdz wdzVar = new wdz();
        a = wdzVar;
        vuc.y(wdz.class, wdzVar);
    }

    private wdz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0001\u0002ဈ\u0002\u0003ဈ\u0000", new Object[]{"b", "d", "e", "c"});
        }
        if (i2 == 3) {
            return new wdz();
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
        synchronized (wdz.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
