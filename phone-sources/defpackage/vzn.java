package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzn extends vuc implements vvk {
    public static final vuk a = new vzp(1);
    public static final vzn b;
    private static volatile vvq g;
    public int d;
    public int e;
    public String c = "";
    public vuj f = vud.a;

    static {
        vzn vznVar = new vzn();
        b = vznVar;
        vuc.y(vzn.class, vznVar);
    }

    private vzn() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(b, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003,\u0004\f", new Object[]{"c", "d", "f", "e"});
        }
        if (i2 == 3) {
            return new vzn();
        }
        if (i2 == 4) {
            return new vtw(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vzn.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(b);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
