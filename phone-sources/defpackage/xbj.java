package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xbj extends vuc implements vvk {
    public static final xbj a;
    private static volatile vvq h;
    public int b;
    public xaz c;
    public int d;
    public int e;
    public long f;
    public String g = "";

    static {
        xbj xbjVar = new xbj();
        a = xbjVar;
        vuc.y(xbj.class, xbjVar);
    }

    private xbj() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", xal.n, "e", xal.m, "f", "g"});
        }
        if (i2 == 3) {
            return new xbj();
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
        vvq vvqVar = h;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (xbj.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
