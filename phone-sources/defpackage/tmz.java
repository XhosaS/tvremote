package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmz extends vuc implements vvk {
    public static final tmz a;
    private static volatile vvq f;
    public long b;
    public int c;
    public String d = "";
    public String e = "";
    private int g;

    static {
        tmz tmzVar = new tmz();
        a = tmzVar;
        vuc.y(tmz.class, tmzVar);
    }

    private tmz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new tmz();
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
        synchronized (tmz.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
