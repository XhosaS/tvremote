package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xbq extends vuc implements vvk {
    public static final xbq a;
    private static volatile vvq h;
    public int b;
    public xax d;
    public xbp f;
    public vun c = vvt.a;
    public String e = "";
    public String g = "";

    static {
        xbq xbqVar = new xbq();
        a = xbqVar;
        vuc.y(xbq.class, xbqVar);
    }

    private xbq() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0002\n\u0005\u0000\u0001\u0000\u0002\u001b\u0006ဉ\u0003\bဈ\u0005\tဉ\u0006\nဈ\u0007", new Object[]{"b", "c", xbq.class, "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new xbq();
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
        synchronized (xbq.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
